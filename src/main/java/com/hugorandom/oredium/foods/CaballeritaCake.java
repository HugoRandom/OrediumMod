package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CaballeritaCake extends Item {

	public CaballeritaCake() {
		super(new Properties()							
				.food(CABALLERITA_CAKE)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties CABALLERITA_CAKE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0f)
			.nutrition(10)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();	
}