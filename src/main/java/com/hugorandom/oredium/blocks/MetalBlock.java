package com.hugorandom.oredium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class MetalBlock extends Block {

    public MetalBlock(float strength, float explosion) {
        super(Block.Properties
                .of(Material.METAL)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
                .strength(strength, explosion));
    }
}
