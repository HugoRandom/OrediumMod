package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowItem;

public class AlezaritaChicken extends BowItem {

	public AlezaritaChicken() {
		super(new Properties()							
				.food(ALEZARITA_CHICKEN)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties ALEZARITA_CHICKEN = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1.0f)
			.nutrition(10)
			.saturationMod(0.9f)
			.alwaysEat()
			.build();		
}