package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Pepenne extends Item {

	public Pepenne() {
		super(new Properties()							
				.food(PEPENNE)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	
	public static final FoodProperties PEPENNE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 0.15f)
			.nutrition(12)
			.saturationMod(0.7f)
			.alwaysEat()
			.build();
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity player) {
		if (!world.isClientSide) {
	         player.removeEffect(MobEffects.POISON);
	    }
		return super.finishUsingItem(stack, world, player);
	}	
}