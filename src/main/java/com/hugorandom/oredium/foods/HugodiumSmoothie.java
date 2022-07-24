package com.hugorandom.oredium.foods;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class HugodiumSmoothie extends Item {

	public HugodiumSmoothie() {
		super(new Properties()							
				.food(HUGODIUM_SMOOTHIE));		
	}
	public static final FoodProperties HUGODIUM_SMOOTHIE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1.0f)
			.nutrition(6)
			.saturationMod(0.7f)
			.alwaysEat()
			.build();

	public UseAnim getUseAnimation(ItemStack p_77661_1_) {
		return UseAnim.DRINK.DRINK;
	}

	public SoundEvent getDrinkingSound() {
		return SoundEvents.HONEY_DRINK;
	}

	public SoundEvent getEatingSound() {
		return SoundEvents.HONEY_DRINK;
	}
}