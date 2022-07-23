package com.hugorandom.oredium.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class MetalBlock extends Block {

    public MetalBlock() {
        super(Block.Properties
                .of(Material.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f));
    }
}
