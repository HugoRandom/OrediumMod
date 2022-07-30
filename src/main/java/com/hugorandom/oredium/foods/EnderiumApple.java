package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class EnderiumApple extends Item {

	public EnderiumApple() {
		super(new Properties()
				.rarity(Rarity.RARE)
				.food(ENDERIUM_APPLE)
				.tab(ItemGroupTabs.OREDIUM_ITEMS));
	}
	public static final FoodProperties ENDERIUM_APPLE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0f)
			.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), 1.0f)
			.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0), 1.0f)
			.effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 0), 1.0f)
			.nutrition(15)
			.saturationMod(1.0f)
			.alwaysEat()
			.build();	
}