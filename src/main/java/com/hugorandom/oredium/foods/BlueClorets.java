package com.hugorandom.oredium.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BlueClorets extends Item {

	public BlueClorets() {
		super(new Properties()							
				.food(BLUE_CLORETS));		
	}
	
	public static final FoodProperties BLUE_CLORETS = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 1.0f)
			.nutrition(2)
			.saturationMod(0.3f)
			.alwaysEat()
			.fast()
			.build();
		
}