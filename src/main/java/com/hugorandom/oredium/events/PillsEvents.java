package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitaminsProvider;
import com.hugorandom.oredium.init.ArmorsInit;
import com.hugorandom.oredium.init.EffectsInit;
import com.hugorandom.oredium.init.FoodsInit;
import com.hugorandom.oredium.util.ModTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.FORGE)
public class PillsEvents {

	@SubscribeEvent
	public static void playerConsumePill(LivingEntityUseItemEvent.Finish event) {
		LivingEntity player = event.getEntityLiving();
		ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);

		// Aplicar solamente si consume una Pildora buena
		if(event.getItem().is(ModTags.Items.OREDIUM_PILLS_TAG) || event.getItem().is(ModTags.Items.OREDIUM_DOUBLE_PILLS_TAG))
		{
			// Se añade al conteo de pildoras
			player.getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(playerVitamins -> {
				playerVitamins.addVitamin(1);
			});
			// Al consumir una pastilla, da el efecto de Vitaminado + el acumulado anterior
			if (player.hasEffect(EffectsInit.VITAMINIZED.get())){
				int duration = player.getEffect(EffectsInit.VITAMINIZED.get()).getDuration();
				int amplifier = player.getEffect(EffectsInit.VITAMINIZED.get()).getAmplifier();
				player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),
						duration + 1200, amplifier + 1));
			}
			else
			{
				player.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),1200, 0));
			}
			// Si la pastilla concuerda con la armadura, los efectos se triplican.
			if (event.getItem().is(FoodsInit.A24_PILL.get())){
				if (helmet.getItem() == ArmorsInit.ALEZARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ALEZARITA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.ALEZARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ALEZARITA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
					player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0));
				}
			}
			if (event.getItem().is(FoodsInit.B32_PILL.get())){
				if (helmet.getItem() == ArmorsInit.AXIDITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.AXIDITA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.AXIDITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.AXIDITA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 0));
					player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
				}
			}
			if (event.getItem().is(FoodsInit.C42_PILL.get())){
				if (helmet.getItem() == ArmorsInit.CABALLERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CABALLERITA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.CABALLERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CABALLERITA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0));
					player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0));
				}
			}
			if (event.getItem().is(FoodsInit.D13_PILL.get())){
				if (helmet.getItem() == ArmorsInit.CESARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CESARITA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.CESARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CESARITA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));
					player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0));
				}
			}
			if (event.getItem().is(FoodsInit.E4_PILL.get())){
				if (helmet.getItem() == ArmorsInit.ENDERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ENDERITA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.ENDERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ENDERITA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1));
					player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0));
				}
			}
			if (event.getItem().is(FoodsInit.L7_PILL.get())){
				if (helmet.getItem() == ArmorsInit.FRANITOLINA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.FRANITOLINA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.FRANITOLINA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.FRANITOLINA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.LUCK, 10800, 1));
					player.addEffect(new MobEffectInstance(MobEffects.JUMP, 600, 0));
				}
			}
			if (event.getItem().is(FoodsInit.I12_PILL.get())){
				if (helmet.getItem() == ArmorsInit.MELUNA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MELUNA_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.MELUNA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MELUNA_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1800, 0));
					player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0));
				}
			}
			if (event.getItem().is(FoodsInit.A12_PILL.get())){
				if (helmet.getItem() == ArmorsInit.SHINE_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.SHINE_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.SHINE_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.SHINE_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1));
					player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 0));
				}
			}
			if (event.getItem().is(FoodsInit.P2_PILL.get())){
				if (helmet.getItem() == ArmorsInit.MIGUELITIO_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MIGUELITIO_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.MIGUELITIO_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MIGUELITIO_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0));
					player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 0));
				}
			}
			if (event.getItem().is(FoodsInit.F50_PILL.get())){
				if (helmet.getItem() == ArmorsInit.HUGODIUM_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.HUGODIUM_CHESTPLATE_UPGRADED.get()
						&& legs.getItem() == ArmorsInit.HUGODIUM_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.HUGODIUM_BOOTS_UPGRADED.get()) {
					player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1));
					player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0));
				}
			}
		}
	}
}
