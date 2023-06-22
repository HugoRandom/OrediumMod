package com.hugorandom.oredium.blocks;

import com.hugorandom.oredium.blocks.entitys.UpgradingEntity;
import com.hugorandom.oredium.init.*;
import com.hugorandom.oredium.util.OrediumTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class OrediumBlock extends BaseEntityBlock {

	public static final BooleanProperty ENERGY = BooleanProperty.create("energy");

	public OrediumBlock() {
		super(Properties
				.of(Material.METAL)
				.sound(SoundType.SHROOMLIGHT)
				.requiresCorrectToolForDrops()
				.strength(8.0f, 45.0f)
				.lightLevel((state) -> state.getValue(OrediumBlock.ENERGY) ? 15 : 7));
		this.registerDefaultState(this.defaultBlockState().setValue(ENERGY, Boolean.FALSE));
	}

	@Override
	public @NotNull RenderShape getRenderShape(@NotNull BlockState pState) {
		return RenderShape.MODEL;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(ENERGY);
	}

	@Override
	public void onRemove(BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos,
						 BlockState pNewState, boolean pIsMoving) {
		if (pState.getBlock() != pNewState.getBlock()){
			BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
			if (blockEntity instanceof UpgradingEntity){
				((UpgradingEntity) blockEntity).drops();
			}
		}
		super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
	}

	@Override
	public InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos,
								 @NotNull Player pPlayer, @NotNull InteractionHand pHand,
								 @NotNull BlockHitResult pHit) {
		if(!pLevel.isClientSide()){
			if (pHand == InteractionHand.MAIN_HAND){
				if (pPlayer.getItemInHand(pHand).is(Items.AIR)){
					BlockEntity entity = pLevel.getBlockEntity(pPos);
					if (entity instanceof UpgradingEntity){
						NetworkHooks.openGui(((ServerPlayer) pPlayer), (UpgradingEntity)entity, pPos);
					}
					else{
						throw new IllegalStateException("Hugo del Futuro, cagaste xd. Att Hugo del Pasado");
					}
				} else if (pPlayer.getItemInHand(pHand).is(FoodsInit.OREDIUM_PILL.get())) {
					pPlayer.getItemInHand(pHand).shrink(1);
					pLevel.playSound(null, pPos, SoundEvents.ITEM_FRAME_REMOVE_ITEM,
							SoundSource.BLOCKS, 0.8F, 0.9F);
					if (pPlayer.getLevel().dimension() == DimensionsInit.MAPASHE_DIM_KEY){
						pLevel.addFreshEntity(new ItemEntity(pLevel,
								pPos.getX()+0.5,
								pPos.getY()+1,
								pPos.getZ()+0.5,
								new ItemStack(FoodsInit.GOLDEN_PILL.get())));
					}
				}
			}
		}
		return InteractionResult.sidedSuccess(pLevel.isClientSide);
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
		return new UpgradingEntity(pPos, pState);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level pLevel, @NotNull BlockState pState,
																  @NotNull BlockEntityType<T> pBlockEntityType) {
		return createTickerHelper(pBlockEntityType,
				BlocksEntitiesInit.OREDIUM_BLOCK_ENTITY.get(), UpgradingEntity::tick);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, Random rand) {
		if (rand.nextInt(10) == 0) {
			pLevel.addParticle(ParticlesInit.OREDIUM_PARTICLE.get(),
					(double)pPos.getX() + rand.nextDouble(),
					(double)pPos.getY() + 1.1D,
					(double)pPos.getZ() + rand.nextDouble(),
					0.0D, 0.0D, 0.0D);
		}
		super.animateTick(pState, pLevel, pPos, rand);
	}

	@Override
	public void neighborChanged(@NotNull BlockState pState, Level pLevel, BlockPos pPos,
								@NotNull Block pBlock, @NotNull BlockPos pFromPos, boolean pIsMoving) {
		if (isEnergyBlock(pLevel.getBlockState(pPos.above()))) {
			if (!pState.getValue(ENERGY)) {
				pLevel.setBlock(pPos, pState.setValue(ENERGY, Boolean.TRUE), 3);
			}
		}
		else{
			pLevel.setBlock(pPos, pState.setValue(ENERGY, Boolean.FALSE), 3);
		}
		super.neighborChanged(pState, pLevel, pPos, pBlock, pFromPos, pIsMoving);
	}

	private static boolean isEnergyBlock(BlockState state) {
		return state.is(OrediumTags.Blocks.OREDIUM_BLOCKS);
	}
}