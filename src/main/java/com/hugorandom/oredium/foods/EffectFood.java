package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EffectFood extends Item {

    public EffectFood(MobEffect effect, int duration, int amplifier, int nutrition, float saturation) {
        super(new Properties()
                .food(FOOD(effect, duration, amplifier, nutrition, saturation))
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static final FoodProperties FOOD(MobEffect pEffect, int duration, int amplifier, int nutricion, float saturation){
        FoodProperties build = new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(pEffect, duration, amplifier), 1.0f)
                .nutrition(nutricion)
                .saturationMod(saturation)
                .alwaysEat()
                .build();
        return build;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
    }
}
