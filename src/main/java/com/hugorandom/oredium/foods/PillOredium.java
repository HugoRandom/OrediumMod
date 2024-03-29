package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.init.EffectsInit;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PillOredium extends Item {

    public PillOredium() {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(Unstable())
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static FoodProperties Unstable(){
        return new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(EffectsInit.UNSTABLE.get(), 1200, 0), 1.0f)
                .nutrition(2)
                .saturationMod(0.3f)
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
