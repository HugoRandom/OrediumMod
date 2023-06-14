package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.init.EffectsInit;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PillGolden extends Item {

    public PillGolden() {
        super(new Properties()
                .rarity(Rarity.UNCOMMON)
                .food(PILLS())
                .tab(ItemGroupTabs.OREDIUM_FOODS));
    }

    public static FoodProperties PILLS(){
        return new FoodProperties.Builder()
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200, 1), 1.0f)
                .nutrition(2)
                .saturationMod(1f)
                .alwaysEat()
                .build();
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, Level pLevel,
                                              @NotNull LivingEntity pLivingEntity) {
        if (!pLevel.isClientSide) {
            pLivingEntity.removeEffect(EffectsInit.UNSTABLE.get());
        }
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
    }
}
