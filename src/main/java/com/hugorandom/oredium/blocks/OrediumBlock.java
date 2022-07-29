package com.hugorandom.oredium.blocks;

import com.hugorandom.oredium.blocks.entitys.OrediumBlockEntity;
import com.hugorandom.oredium.inits.BlocksEntitiesInit;
import com.hugorandom.oredium.inits.BlocksInit;
import com.hugorandom.oredium.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
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
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class OrediumBlock extends BaseEntityBlock {

	public static final BooleanProperty UPGRADING = BooleanProperty.create("upgrading");

	public OrediumBlock() {
		super(Properties
				.of(Material.METAL)
				.sound(SoundType.SHROOMLIGHT)
				.requiresCorrectToolForDrops()
				.strength(8.0f, 40.0f)
				.lightLevel((state) -> state.getValue(OrediumBlock.UPGRADING) ? 10 : 0));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(UPGRADING);
	}

	@Override
	public RenderShape getRenderShape(BlockState pState) {
		return RenderShape.MODEL;
	}

	@Override
	public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
		if (pState.getBlock() != pNewState.getBlock()){
			BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
			if (blockEntity instanceof OrediumBlockEntity){
				((OrediumBlockEntity) blockEntity).drops();
			}
		}
		super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
	}

	@Override
	public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
		if(!pLevel.isClientSide()){
			if (pHand == InteractionHand.MAIN_HAND){
				BlockEntity entity = pLevel.getBlockEntity(pPos);
				if (entity instanceof OrediumBlockEntity){
					NetworkHooks.openGui(((ServerPlayer) pPlayer), (OrediumBlockEntity)entity, pPos);
				}
				else{
					throw new IllegalStateException("Pal lobby hermano");
					// pPlayer.sendMessage(new TextComponent("¡Necesita estar encendido!"), pPlayer.getUUID());
				}
			}
			else{
				pPlayer.sendMessage(new TextComponent("Mano vacia porfa..."), pPlayer.getUUID());
			}
		}
		return InteractionResult.sidedSuccess(pLevel.isClientSide);
	}

	@Nullable
	@Override
	public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
		return new OrediumBlockEntity(pPos, pState);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
		return createTickerHelper(pBlockEntityType, BlocksEntitiesInit.OREDIUM_BLOCK_ENTITY.get(), OrediumBlockEntity::tick);
	}

	@Override
	public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
		BlockState above = pLevel.getBlockState(pPos.above());
		if (above.is(ModTags.Blocks.OREDIUM_BLOCK_ENERGY)){
			boolean currentState = pState.getValue(UPGRADING);
			pLevel.setBlock(pPos, pState.setValue(UPGRADING, !currentState), 3);
		}
		super.tick(pState, pLevel, pPos, pRandom);
	}

	@Override
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
		if(!pEntity.isOnFire() || !pEntity.isCrouching()) {
			pEntity.setSecondsOnFire(1);
		}
		super.stepOn(pLevel, pPos, pState, pEntity);
	}
}