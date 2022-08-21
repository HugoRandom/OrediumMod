package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Fraopu extends Item {

	public Fraopu() {
		super(new Properties()							
				.food(FRAOPU)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties FRAOPU = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1.0f)
			.nutrition(6)
			.saturationMod(1.2f)
			.alwaysEat()
			.build();	
}
