package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Smoothie extends Item {

	public Smoothie() {
		super(new Properties()							
				.food(HALINOX_SMOOTHIE)
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static final FoodProperties HALINOX_SMOOTHIE = new FoodProperties.Builder()
			.effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0), 1.0f)
			.nutrition(6)
			.saturationMod(0.8f)
			.alwaysEat()
			.build();

	public @NotNull UseAnim getUseAnimation(@NotNull ItemStack p_77661_1_) {
		return UseAnim.DRINK;
	}

	public @NotNull SoundEvent getDrinkingSound() {
		return SoundEvents.HONEY_DRINK;
	}

	public @NotNull SoundEvent getEatingSound() {
		return SoundEvents.HONEY_DRINK;
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
								@NotNull TooltipFlag pIsAdvanced) {
		pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
	}
}