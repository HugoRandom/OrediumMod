package com.hugoz.oredium.blocks.alezarita;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class AlezaritaBlock extends Block {

    public AlezaritaBlock() {
        super(Block.Properties
                .of(Material.METAL)
                .requiresCorrectToolForDrops()
                .strength(5.0f, 6.0f));
    }
}
