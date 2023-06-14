package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Coffees extends Item {

	public Coffees(int nutrition, float saturation) {
		super(new Properties()							
				.food(COFFEE_PROPERTIES(nutrition, saturation))
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static FoodProperties COFFEE_PROPERTIES(int nutrition, float saturation) {
		return new FoodProperties.Builder()
				.nutrition(nutrition)
				.saturationMod(saturation)
				.build();
	}

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
	public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
		pLevel.playSound(null, pLivingEntity.getOnPos(), SoundEvents.WANDERING_TRADER_DRINK_MILK,
				SoundSource.PLAYERS, 0.55f, 0.95f);
		return super.finishUsingItem(pStack, pLevel, pLivingEntity);
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
								@NotNull TooltipFlag pIsAdvanced) {
		pTooltipComponents.add(new TranslatableComponent("tooltip.oredium." + pStack.getItem().asItem()));
	}
}