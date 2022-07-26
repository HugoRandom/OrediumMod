package com.hugorandom.oredium.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class OrediumBlock extends Block {

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
	public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
		if(!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND){
			if(pState.getValue(UPGRADING)){

			}
			else{
				pPlayer.sendMessage(new TextComponent("¡Necesita estar encendido!"), pPlayer.getUUID());
			}
		}
		else{
			pPlayer.sendMessage(new TextComponent("Mano vacia porfa..."), pPlayer.getUUID());
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
		if(!pEntity.isOnFire() || !pEntity.isCrouching()) pEntity.setSecondsOnFire(1);
		super.stepOn(pLevel, pPos, pState, pEntity);
	}
}
