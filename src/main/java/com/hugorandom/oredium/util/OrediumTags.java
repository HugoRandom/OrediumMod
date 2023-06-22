package com.hugorandom.oredium.util;

import com.hugorandom.oredium.Oredium;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;

public class OrediumTags {

    public static class Blocks {
        public static final TagKey<Block> OREDIUM_BLOCKS = tag("blocks");

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

        public static final TagKey<Item> INGOTS_TAG = tag("ingots");
        public static final TagKey<Item> INGOTS_DISPROSIO = forgeTag("ingots/disprosio");
        public static final TagKey<Item> INGOTS_FRANITOLINA = forgeTag("ingots/franitolina");
        public static final TagKey<Item> INGOTS_MELITONILA = forgeTag("ingots/melitonila");
        public static final TagKey<Item> INGOTS_TERIUM = forgeTag("ingots/terium");
        public static final TagKey<Item> INGOTS_ALEZARITA = forgeTag("ingots/alezarita");
        public static final TagKey<Item> INGOTS_HALINOX = forgeTag("ingots/halinox");
        public static final TagKey<Item> INGOTS_MIGUELITIO = forgeTag("ingots/miguelitio");

        public static final TagKey<Item> NUGGETS_TAG = tag("nuggets");
        public static final TagKey<Item> FOODS_TAG = tag("foods");
        public static final TagKey<Item> BASIC_TAG = tag("foods/basic");
        public static final TagKey<Item> PILLS_TAG = tag("foods/pills");
        public static final TagKey<Item> DOUBLE_PILLS_TAG = tag("foods/double_pills");
        public static final TagKey<Item> COFFEES_TAG = tag("foods/coffees");
        public static final TagKey<Item> APPLES_TAG = tag("foods/apples");


    }
    public static class ConfiguredStructureFeatures {
        public static final TagKey<ConfiguredStructureFeature<?, ?>> CUSTOM_STRUCTURE_TAG = tag("custom_structure_tag");

        private static TagKey<ConfiguredStructureFeature<?, ?>> tag(String name) {
            return TagKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY, new ResourceLocation(Oredium.MOD_ID, name));
        }
    }
}
