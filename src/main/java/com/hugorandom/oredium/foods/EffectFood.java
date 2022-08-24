package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class EffectFood extends Item {

    public EffectFood(MobEffect effect, int duration, int amplifier, int nutricion, float saturation) {
        super(new Properties()
                .food(FOOD(effect, duration, amplifier, nutricion, saturation))
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static final FoodProperties FOOD(MobEffect pEffect, int duration, int amplifier, int nutricion, float saturation){
        FoodProperties build = new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(pEffect, duration, amplifier), 1.0f)
                .nutrition(nutricion)
                .saturationMod(saturation)
                .alwaysEat()
                .fast()
                .build();
        return build;
    }
}
