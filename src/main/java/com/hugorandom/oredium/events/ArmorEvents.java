package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.ArmorsInit;
import com.hugorandom.oredium.init.FoodsInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.FORGE)
public class ArmorEvents {

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public static void playerConsumePill(LivingEntityUseItemEvent.Finish event) {
		LivingEntity player = event.getEntityLiving();
		ItemStack helmet = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = event.getEntityLiving().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = event.getEntityLiving().getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = event.getEntityLiving().getItemBySlot(EquipmentSlot.FEET);
		
        if (helmet.getItem() == ArmorsInit.ALEZARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ALEZARITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.ALEZARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ALEZARITA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.A24_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
				player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.AXIDITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.AXIDITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.AXIDITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.AXIDITA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.B32_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 0));
				player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
			}
		}		
		else if (helmet.getItem() == ArmorsInit.CABALLERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CABALLERITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.CABALLERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CABALLERITA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.C42_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0));
				player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0));
			}
		}	
		else if (helmet.getItem() == ArmorsInit.CESARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CESARITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.CESARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CESARITA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.D13_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));
				player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0));
			}
		}	
		else if (helmet.getItem() == ArmorsInit.ENDERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ENDERITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.ENDERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ENDERITA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.E4_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1));
				player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.FRANITOLINA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.FRANITOLINA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.FRANITOLINA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.FRANITOLINA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.L7_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.LUCK, 10800, 1));
				player.addEffect(new MobEffectInstance(MobEffects.JUMP, 600, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.MELUNA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MELUNA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.MELUNA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MELUNA_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.I12_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1800, 0));
				player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 200, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.SHINE_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.SHINE_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.SHINE_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.SHINE_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.A12_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1));
				player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 0));
			}
		}		
		else if (helmet.getItem() == ArmorsInit.MIGUELITIO_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MIGUELITIO_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.MIGUELITIO_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MIGUELITIO_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.P2_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 3600, 0));
				player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 400, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.HUGODIUM_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.HUGODIUM_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.HUGODIUM_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.HUGODIUM_BOOTS_UPGRADED.get()) {
			if (event.getItem().is(FoodsInit.F50_PILL.get())){
				player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1));
				player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0));
			}
		}
	}
}
