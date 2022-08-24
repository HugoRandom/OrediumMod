package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class Coffes extends Item {

	public Coffes(int nutricion, int saturacion) {
		super(new Properties()							
				.food(COFFE_PROPERTIES(nutricion, saturacion))
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static final FoodProperties COFFE_PROPERTIES(int nutricion, int saturacion) {
		return new FoodProperties.Builder()
				.nutrition(nutricion)
				.saturationMod(saturacion)
				.build();
	}

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