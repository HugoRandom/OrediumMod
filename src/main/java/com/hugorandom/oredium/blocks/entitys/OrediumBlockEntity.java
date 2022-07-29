package com.hugorandom.oredium.blocks.entitys;

import com.hugorandom.oredium.inits.ArmorsInit;
import com.hugorandom.oredium.inits.BlocksEntitiesInit;
import com.hugorandom.oredium.inits.ItemsInit;
import com.hugorandom.oredium.inits.SoundsInit;
import com.hugorandom.oredium.screens.UpgradingMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Random;

public class OrediumBlockEntity extends BlockEntity implements MenuProvider {

	public static final BooleanProperty UPGRADING = BooleanProperty.create("upgrading");
	public LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

	private final ItemStackHandler itemHandler = new ItemStackHandler(3){
		@Override
		protected void onContentsChanged(int slot) {
			setChanged();
		}
	};

	public OrediumBlockEntity(BlockPos pPos, BlockState pBlockState) {
		super(BlocksEntitiesInit.OREDIUM_BLOCK_ENTITY.get(), pPos, pBlockState);
	}

	@Override
	public Component getDisplayName() {
		return new TranslatableComponent("screen.oredium.upgrading");
	}

	@Nullable
	@Override
	public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
		return new UpgradingMenu(pContainerId, pPlayerInventory, this);
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
		super.saveAdditional(pTag);
	}

	@Override
	public void load(CompoundTag nbt) {
		super.load(nbt);
		itemHandler.deserializeNBT(nbt.getCompound("inventory"));
	}

	public void drops() {
		SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
		for (int i = 0; i < itemHandler.getSlots(); i++) {
			inventory.setItem(i, itemHandler.getStackInSlot(i));
		}

		Containers.dropContents(this.level, this.worldPosition, inventory);
	}

	public static void tick(Level pLevel, BlockPos pPos, BlockState pState, OrediumBlockEntity pBlockEntity) {
		if(hasRecipe(pBlockEntity) && hasNotReachedStackLimit(pBlockEntity)) {
			craftItem(pBlockEntity);
		}
	}

	private static void craftItem(OrediumBlockEntity entity) {
		ItemStack output = new ItemStack(ArmorsInit.ALEZARITA_HELMET_UPGRADED.get());
		Map<Enchantment, Integer> enchants = EnchantmentHelper.getEnchantments(entity.itemHandler.getStackInSlot(0));
		for(Map.Entry<Enchantment, Integer> mapEntry : enchants.entrySet()){
			output.enchant(mapEntry.getKey(), mapEntry.getValue());
		}
		entity.itemHandler.extractItem(0, 1, false);
		entity.itemHandler.extractItem(1, 1, false);
		entity.itemHandler.insertItem(2, output , false);
		entity.level.playSound(null, entity.getBlockPos(), SoundsInit.UPGRADING_SOUND.get(), SoundSource.BLOCKS, 0.7f, 0.7f);
	}

	private static boolean hasRecipe(OrediumBlockEntity entity) {
		boolean hasItemInFirstSlot = entity.itemHandler.getStackInSlot(0).getItem() == ArmorsInit.ALEZARITA_HELMET.get();
		boolean hasItemInSecondSlot = entity.itemHandler.getStackInSlot(1).getItem() == ItemsInit.ALEZARITA_GEM.get();

		return hasItemInFirstSlot && hasItemInSecondSlot;
	}

	private static boolean hasNotReachedStackLimit(OrediumBlockEntity entity) {
		return entity.itemHandler.getStackInSlot(2).getCount() < entity.itemHandler.getStackInSlot(2).getMaxStackSize();
	}
}
