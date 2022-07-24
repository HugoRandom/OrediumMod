package com.hugorandom.oredium.blocks;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class OrediumBlock extends Block {
	
	public OrediumBlock() {
		super(Properties
        		.of(Material.METAL)
        		.sound(SoundType.SHROOMLIGHT)
        		.requiresCorrectToolForDrops()
        		.strength(8.0f, 40.0f)
        		.lightLevel((lightLevel) -> 10));
	}

	@Override
	public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
		if(!pEntity.isOnFire() || !pEntity.isCrouching()) pEntity.setSecondsOnFire(1);
		super.stepOn(pLevel, pPos, pState, pEntity);
	}
}
