package com.hugorandom.oredium.util;

import com.hugorandom.oredium.Oredium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> OREDIUM_BLOCK_ENERGY = tag("oredium_block_energy");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Oredium.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Oredium.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
