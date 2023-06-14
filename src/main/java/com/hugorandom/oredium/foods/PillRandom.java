package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PillRandom extends Item {

    public PillRandom() {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(PILLS())
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static FoodProperties PILLS(){
        return new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(
                        MobEffects.MOVEMENT_SPEED, 2400, 1), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.ABSORPTION, 1200, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.FIRE_RESISTANCE, 2400, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.NIGHT_VISION, 2400, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.LUCK, 4800, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.SATURATION, 1200, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.DAMAGE_RESISTANCE, 1200, 1), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.WATER_BREATHING, 2400, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.DIG_SPEED, 1200, 1), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.DOLPHINS_GRACE, 2400, 0), 0.05f)
                .effect(() -> new MobEffectInstance(
                        MobEffects.REGENERATION, 1200, 1), 0.05f)
                .nutrition(2)
                .saturationMod(1f)
                .alwaysEat()
                .fast()
                .build();
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
    }
}
