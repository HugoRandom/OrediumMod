package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Clorets extends Item {

	public Clorets() {
		super(new Properties()							
				.food(CLORETS)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties CLORETS = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 1.0f)
			.nutrition(2)
			.saturationMod(0.2f)
			.alwaysEat()
			.fast()
			.build();	
}