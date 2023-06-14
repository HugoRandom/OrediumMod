package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.init.Items1Init;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTier {

    public static final ForgeTier DISPROSIO = new ForgeTier(4, 1681, 7.5f, 3f, 20,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.DISPROSIO_INGOT.get()));
    public static final ForgeTier FRANITOLINA = new ForgeTier(4, 1699, 7.5f, 4.0f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.FRANITOLINA_INGOT.get()));
    public static final ForgeTier MELITONILA = new ForgeTier(4, 1726, 7.5f, 4.0f, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.MELITONILA_INGOT.get()));
    public static final ForgeTier TERIUM = new ForgeTier(4, 2031, 7.5f, 4f, 18,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.TERIUM_INGOT.get()));
    public static final ForgeTier ALEZARITA = new ForgeTier(4, 1761, 8.0f, 4.0f, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.ALEZARITA_INGOT.get()));
    public static final ForgeTier HALINOX = new ForgeTier(4, 1896, 8.0f, 4.0f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.HALINOX_INGOT.get()));
    public static final ForgeTier MIGUELITIO = new ForgeTier(4, 1924, 8.0f, 4.0f, 10,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items1Init.MIGUELITIO_INGOT.get()));
}
