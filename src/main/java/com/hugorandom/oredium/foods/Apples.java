package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Apples extends Item {

	public Apples(MobEffect effect, int duration, int amplifier) {
		super(new Properties()
				.rarity(Rarity.UNCOMMON)
				.food(APPLES(effect, duration, amplifier))
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static final FoodProperties APPLES(MobEffect pEffect, int duration, int amplifier){
		FoodProperties build = new FoodProperties.Builder()
				.effect(() -> new MobEffectInstance(pEffect, duration, amplifier), 1.0f)
				.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, duration, 0), 1.0f)
				.effect(() -> new MobEffectInstance(MobEffects.GLOWING, duration, 0), 1.0f)
				.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, duration, 0), 1.0f)
				.nutrition(15)
				.saturationMod(1.0f)
				.alwaysEat()
				.build();
		return build;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
	}
}