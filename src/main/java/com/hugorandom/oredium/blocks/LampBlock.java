package com.hugorandom.oredium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class LampBlock extends RedstoneLampBlock {

    public LampBlock() {
        super(Properties
                .of(Material.BUILDABLE_GLASS)
                .sound(SoundType.GLASS)
                .strength(1.0f, 1.0f)
                .lightLevel((state) -> state.getValue(LampBlock.LIT) ? 15 : 0));
    }
}
