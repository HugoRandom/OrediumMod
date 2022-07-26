package com.hugorandom.oredium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class DeepslateOreBlock extends Block {

    public DeepslateOreBlock(float strength, float explosion) {
        super(Properties
                .of(Material.STONE)
                .sound(SoundType.DEEPSLATE)
                .requiresCorrectToolForDrops()
                .strength(strength, explosion));
    }
}
