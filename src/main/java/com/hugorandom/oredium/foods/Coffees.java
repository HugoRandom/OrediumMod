package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.init.FoodsInit;
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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Coffees extends Item {

	public Coffees(int nutricion, float saturacion) {
		super(new Properties()							
				.food(COFFEE_PROPERTIES(nutricion, saturacion))
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static final FoodProperties COFFEE_PROPERTIES(int nutricion, float saturacion) {
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

	@Override
	public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
		pLevel.playSound(null, pLivingEntity.getOnPos(), SoundEvents.WANDERING_TRADER_DRINK_MILK,
				SoundSource.PLAYERS, 0.55f, 0.95f);
		return super.finishUsingItem(pStack, pLevel, pLivingEntity);
	}

	@Override
	public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
		if (pStack.getItem() == FoodsInit.COFFEE_CHEMICAL.get()){
			pTooltipComponents.add(new TranslatableComponent("tooltip.oredium.coffee_chemical"));
		}
	}
}