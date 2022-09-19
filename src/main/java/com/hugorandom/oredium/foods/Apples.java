package com.hugorandom.oredium.foods;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.Items1Init;
import com.hugorandom.oredium.util.ItemGroupTabs;
import com.hugorandom.oredium.util.OrediumTags;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Apples extends Item {

	public Apples(int duration) {
		super(new Properties()
				.rarity(Rarity.COMMON)
				.food(APPLES(duration))
				.tab(ItemGroupTabs.OREDIUM_FOODS));
	}
	public static final FoodProperties APPLES(int duration){
		FoodProperties build = new FoodProperties.Builder()
				.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, duration, 0), 1.0f)
				.effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, duration, 0), 1.0f)
				.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, duration, 0), 1.0f)
				.nutrition(15)
				.saturationMod(1.0f)
				.alwaysEat()
				.build();
		return build;
	}

	@Override
	public InteractionResult useOn(UseOnContext pContext) {
		BlockPos blockpos = pContext.getClickedPos();
		Level level = pContext.getLevel();
		Player player = pContext.getPlayer();
		ItemStack apple = pContext.getItemInHand();
		if (!level.getBlockState(blockpos).is(OrediumTags.Blocks.OREDIUM_BLOCKS)) {
			return super.useOn(pContext);
		}
		else {
			ItemStack appleU = new ItemStack(apple.getItem(), 1);
			CompoundTag nbtTag = new CompoundTag();
			nbtTag.putBoolean(Oredium.MOD_ID + ".better", true);
			appleU.setTag(nbtTag);
			if (!player.getAbilities().instabuild) apple.shrink(1);
			if (!player.getInventory().add(appleU)) player.drop(appleU, false);
			level.playSound(null, blockpos, SoundEvents.AZALEA_PLACE, SoundSource.PLAYERS, 0.9F, 0.9F);
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
	}

	@Override
	public boolean isFoil(ItemStack pStack) {
		return pStack.hasTag();
	}

	@Override
	public boolean isFireResistant() {
		return getDefaultInstance().hasTag();
	}

	@Override
	public int getUseDuration(ItemStack pStack) {
		return pStack.hasTag() ? 16 : 32;
	}

	@Override
	public Rarity getRarity(ItemStack pStack) {
		return pStack.hasTag() ? Rarity.UNCOMMON : Rarity.COMMON;
	}
}