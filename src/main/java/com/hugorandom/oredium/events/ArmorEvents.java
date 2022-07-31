package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.inits.ArmorsInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.FORGE)
public class ArmorEvents {

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public static void onEntityHurt(LivingAttackEvent event) {
		LivingEntity player = event.getEntityLiving();
		ItemStack helmet = event.getEntityLiving().getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = event.getEntityLiving().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = event.getEntityLiving().getItemBySlot(EquipmentSlot.LEGS);
        ItemStack boots = event.getEntityLiving().getItemBySlot(EquipmentSlot.FEET);
		
        if (helmet.getItem() == ArmorsInit.ALEZARITA_HELMET.get() && chest.getItem() == ArmorsInit.ALEZARITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.ALEZARITA_LEGGINGS.get() && boots.getItem() == ArmorsInit.ALEZARITA_BOOTS.get()) {
			if (!(event.getSource() == DamageSource.FALL || event.getSource() == DamageSource.LAVA)) {
				player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.AXIDITA_HELMET.get() && chest.getItem() == ArmorsInit.AXIDITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.AXIDITA_LEGGINGS.get() && boots.getItem() == ArmorsInit.AXIDITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.CACTUS || event.getSource() == DamageSource.SWEET_BERRY_BUSH) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorsInit.CABALLERITA_HELMET.get() && chest.getItem() == ArmorsInit.CABALLERITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.CABALLERITA_LEGGINGS.get() && boots.getItem() == ArmorsInit.CABALLERITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.IN_FIRE || event.getSource() == DamageSource.ON_FIRE || event.getSource() == DamageSource.HOT_FLOOR ) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorsInit.CESARITA_HELMET.get() && chest.getItem() == ArmorsInit.CESARITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.CESARITA_LEGGINGS.get() && boots.getItem() == ArmorsInit.CESARITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.WITHER) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorsInit.ENDERIUM_HELMET.get() && chest.getItem() == ArmorsInit.ENDERIUM_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.ENDERIUM_LEGGINGS.get() && boots.getItem() == ArmorsInit.ENDERIUM_BOOTS.get()) {
			if(event.getSource() == DamageSource.DRAGON_BREATH || event.getSource() == DamageSource.FALL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorsInit.FRANITOLINA_HELMET.get() && chest.getItem() == ArmorsInit.FRANITOLINA_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.FRANITOLINA_LEGGINGS.get() && boots.getItem() == ArmorsInit.FRANITOLINA_BOOTS.get()) {
			if(event.getSource() == DamageSource.IN_WALL || event.getSource() == DamageSource.ANVIL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorsInit.SHINE_HELMET.get() && chest.getItem() == ArmorsInit.SHINE_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.SHINE_LEGGINGS.get() && boots.getItem() == ArmorsInit.SHINE_BOOTS.get()) {
			if(event.getSource().isMagic()) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorsInit.MIGUELITIO_HELMET.get() && chest.getItem() == ArmorsInit.MIGUELITIO_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.MIGUELITIO_LEGGINGS.get() && boots.getItem() == ArmorsInit.MIGUELITIO_BOOTS.get()) {
			if(event.getSource() == DamageSource.LIGHTNING_BOLT || event.getSource() == DamageSource.FLY_INTO_WALL) {
				event.setCanceled(true);
			}
		}
		else if (helmet.getItem() == ArmorsInit.HUGODIUM_HELMET.get() && chest.getItem() == ArmorsInit.HUGODIUM_CHESTPLATE.get()
				&& legs.getItem() == ArmorsInit.HUGODIUM_LEGGINGS.get() && boots.getItem() == ArmorsInit.HUGODIUM_BOOTS.get()) {
			if(player.getHealth() < 5) {
				player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0));
			}
		}
	}
}
