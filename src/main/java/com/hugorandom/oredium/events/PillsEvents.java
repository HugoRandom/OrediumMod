package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitaminsProvider;
import com.hugorandom.oredium.init.EffectsInit;
import com.hugorandom.oredium.util.OrediumTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import java.util.Objects;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.FORGE)
public class PillsEvents {

	@SubscribeEvent
	public static void playerConsumePill(LivingEntityUseItemEvent.Finish event) {
		LivingEntity player = event.getEntityLiving();
		if(event.getItem().is(OrediumTags.Items.OREDIUM_PILLS_TAG) ||
				event.getItem().is(OrediumTags.Items.OREDIUM_DOUBLE_PILLS_TAG))
		{
			player.getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(playerVitamins -> {
				playerVitamins.addVitamin(1);
			});
			if (player.hasEffect(EffectsInit.VITAMINIZED.get())){
				int duration = Objects.requireNonNull(player.getEffect(EffectsInit.VITAMINIZED.get())).getDuration();
				int amplifier = Objects.requireNonNull(player.getEffect(EffectsInit.VITAMINIZED.get())).getAmplifier();
				player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),
						duration + 1200, amplifier + 1));
			}
			else
			{
				player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),1200, 0));
			}
		}
	}
}
