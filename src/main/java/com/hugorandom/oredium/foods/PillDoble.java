package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class PillDoble extends Item {

    public PillDoble(MobEffect effect, int duration, int amplifier) {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(PILLS(effect, duration, amplifier))
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static final FoodProperties PILLS(MobEffect pEffect, int duration, int amplifier){
        FoodProperties build = new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(pEffect, duration, amplifier), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.GLOWING, duration, 0), 1.0f)
                .nutrition(2)
                .saturationMod(0.2f)
                .alwaysEat()
                .fast()
                .build();
        return build;
    }
}
