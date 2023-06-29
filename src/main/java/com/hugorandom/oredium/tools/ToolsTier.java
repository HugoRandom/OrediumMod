package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.init.Items1Init;
import com.hugorandom.oredium.util.OrediumTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolsTier {

    public static final ForgeTier DISPROSIO = new ForgeTier(4, 1561, 8.0f, 4.0f, 20,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_DISPROSIO));
    public static final ForgeTier FRANITOLINA = new ForgeTier(4, 1629, 8.0f, 4.0f, 12,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_FRANITOLINA));
    public static final ForgeTier MELITONILA = new ForgeTier(4, 1666, 8.0f, 4.0f, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_MELITONILA));
    public static final ForgeTier TERIUM = new ForgeTier(4, 2251, 8.0f, 4.0f, 18,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_TERIUM));
    public static final ForgeTier ALEZARITA = new ForgeTier(4, 1861, 8.5f, 4.0f, 16,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_ALEZARITA));
    public static final ForgeTier HALINOX = new ForgeTier(4, 1956, 8.5f, 4.0f, 15,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_HALINOX));
    public static final ForgeTier MIGUELITIO = new ForgeTier(4, 2024, 8.5f, 4.0f, 18,
            BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(OrediumTags.Items.INGOTS_MIGUELITIO));
}
