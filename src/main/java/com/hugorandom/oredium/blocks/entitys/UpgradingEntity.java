package com.hugorandom.oredium.blocks.entitys;

import com.hugorandom.oredium.init.BlocksEntitiesInit;
import com.hugorandom.oredium.init.SoundsInit;
import com.hugorandom.oredium.screens.slots.recipes.UpgradingRecipe;
import com.hugorandom.oredium.screens.UpgradingMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class UpgradingEntity extends BlockEntity implements MenuProvider {

	public LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

	protected final ContainerData data;
	private int progress = 0;
	private int maxProgress = 50;

	private final ItemStackHandler itemHandler = new ItemStackHandler(3){
		@Override
		protected void onContentsChanged(int slot) {
			setChanged();
		}
	};

	public UpgradingEntity(BlockPos pPos, BlockState pBlockState) {
		super(BlocksEntitiesInit.OREDIUM_BLOCK_ENTITY.get(), pPos, pBlockState);
		this.data = new ContainerData() {
			public int get(int index) {
				switch (index) {
					case 0: return UpgradingEntity.this.progress;
					case 1: return UpgradingEntity.this.maxProgress;
					default: return 0;
				}
			}

			public void set(int index, int value) {
				switch(index) {
					case 0: UpgradingEntity.this.progress = value; break;
					case 1: UpgradingEntity.this.maxProgress = value; break;
				}
			}

			public int getCount() {
				return 2;
			}
		};
	}

	@Override
	public Component getDisplayName() {
		return new TranslatableComponent("screen.oredium.upgrading");
	}

	@Nullable
	@Override
	public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
		return new UpgradingMenu(pContainerId, pPlayerInventory, this, this.data);
	}

	@NotNull
	@Override
	public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
		if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
			return lazyItemHandler.cast();
		}
		return super.getCapability(cap, side);
	}

	@Override
	public void onLoad() {
		super.onLoad();
		lazyItemHandler = LazyOptional.of(() -> itemHandler);
	}

	@Override
	public void invalidateCaps() {
		super.invalidateCaps();
		lazyItemHandler.invalidate();
	}

	@Override
	protected void saveAdditional(CompoundTag pTag) {
		pTag.put("inventory", itemHandler.serializeNBT());
		pTag.putInt("upgrading.progress", progress);
		super.saveAdditional(pTag);
	}

	@Override
	public void load(CompoundTag nbt) {
		super.load(nbt);
		itemHandler.deserializeNBT(nbt.getCompound("inventory"));
		progress = nbt.getInt("upgrading.progress");
	}

	public void drops() {
		SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
		for (int i = 0; i < itemHandler.getSlots(); i++) {
			inventory.setItem(i, itemHandler.getStackInSlot(i));
		}

		Containers.dropContents(this.level, this.worldPosition, inventory);
	}

	public static void tick(Level pLevel, BlockPos pPos, BlockState pState, UpgradingEntity pBlockEntity) {
		if(hasRecipe(pBlockEntity)) {
			pBlockEntity.progress++;
			setChanged(pLevel, pPos, pState);
			if(pBlockEntity.progress > pBlockEntity.maxProgress) {
				craftItem(pBlockEntity);
			}
		} else {
			pBlockEntity.resetProgress();
			setChanged(pLevel, pPos, pState);
		}
	}

	private static boolean hasRecipe(UpgradingEntity entity) {
		Level level = entity.level;
		SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
		for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
			inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
		}

		Optional<UpgradingRecipe> match = level.getRecipeManager()
				.getRecipeFor(UpgradingRecipe.Type.INSTANCE, inventory, level);

		return match.isPresent() && inventory.getItem(2).isEmpty();
	}

	private static void craftItem(UpgradingEntity entity) {
		Level level = entity.level;
		SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
		for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
			inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
		}

		Optional<UpgradingRecipe> match = level.getRecipeManager()
				.getRecipeFor(UpgradingRecipe.Type.INSTANCE, inventory, level);

		if(match.isPresent()) {
			ItemStack output = new ItemStack(match.get().getResultItem().getItem());
			Map<Enchantment, Integer> enchants = EnchantmentHelper.getEnchantments(entity.itemHandler.getStackInSlot(0));
			for(Map.Entry<Enchantment, Integer> mapEntry : enchants.entrySet()){
				output.enchant(mapEntry.getKey(), mapEntry.getValue());
			}
			entity.itemHandler.extractItem(0, 1, false);
			entity.itemHandler.extractItem(1, 1, false);
			entity.itemHandler.insertItem(2, output , false);
			entity.level.playSound(null, entity.getBlockPos(), SoundsInit.UPGRADING_SOUND.get(), SoundSource.BLOCKS, 0.7f, 0.7f);
			entity.resetProgress();
		}
	}

	private void resetProgress() {
		this.progress = 0;
	}
}
