package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.inits.ItemsInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTier {

    public static final ForgeTier SHINE = new ForgeTier(2, 342, 5.5f, 2.5f, 15,
            BlockTags.NEEDS_STONE_TOOL,() -> Ingredient.of(ItemsInit.SHINE_INGOT.get()));
    public static final ForgeTier CABALLERITA = new ForgeTier(2, 897, 6.0f, 3f, 30,
            BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ItemsInit.CABALLERITA_INGOT.get()));
    public static final ForgeTier AXIDITA = new ForgeTier(2, 929, 6.5f, 3f, 15,
            BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ItemsInit.AXIDITA_INGOT.get()));
    public static final ForgeTier CESARITA = new ForgeTier(2, 981, 7.0f, 3.5f, 8,
            BlockTags.NEEDS_IRON_TOOL,() -> Ingredient.of(ItemsInit.CESARITA_INGOT.get()));
    public static final ForgeTier FRANITOLINA = new ForgeTier(3, 1126, 7.5f, 4.0f, 20,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemsInit.ALEZARITA_INGOT.get()));
    public static final ForgeTier ENDERIUM = new ForgeTier(3, 2031, 9.0f, 4f, 18,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemsInit.ENDERIUM_INGOT.get()));
    public static final ForgeTier ALEZARITA = new ForgeTier(4, 1561, 8.0f, 4.5f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemsInit.ALEZARITA_INGOT.get()));
    public static final ForgeTier HUGODIUM = new ForgeTier(4, 1896, 10.0f, 4.5f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemsInit.ALEZARITA_INGOT.get()));
    public static final ForgeTier MIGUELITIO = new ForgeTier(4, 1924, 8.5f, 4.5f, 16,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(ItemsInit.ALEZARITA_INGOT.get()));
}
