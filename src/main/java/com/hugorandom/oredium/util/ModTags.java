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
        public static final TagKey<Block> ENERGY = tag("energy");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(Oredium.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> OREDIUM_INGOTS_TAG = tag("ingots");
        public static final TagKey<Item> OREDIUM_NUGGETS_TAG = tag("nuggets");
        public static final TagKey<Item> OREDIUM_FOODS_TAG = tag("foods");
        public static final TagKey<Item> OREDIUM_BASIC_TAG = tag("foods/basic");
        public static final TagKey<Item> OREDIUM_PILLS_TAG = tag("foods/pills");
        public static final TagKey<Item> OREDIUM_DOUBLE_PILLS_TAG = tag("foods/double_pills");
        public static final TagKey<Item> OREDIUM_COFFEES_TAG = tag("foods/coffees");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(Oredium.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
