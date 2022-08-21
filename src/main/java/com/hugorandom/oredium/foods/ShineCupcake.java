package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ShineCupcake extends Item {

	public ShineCupcake() {
		super(new Properties()								
				.food(SHINE_CUPCAKE)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties SHINE_CUPCAKE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600, 0), 1.0f)
			.nutrition(8)
			.saturationMod(0.5f)
			.alwaysEat()
			.build();
	
}