package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.ArmorsInit;
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
		
        if (helmet.getItem() == ArmorsInit.ALEZARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ALEZARITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.ALEZARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ALEZARITA_BOOTS_UPGRADED.get()) {
			if (event.getSource() == DamageSource.FALL || event.getSource() == DamageSource.LAVA) {
				player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0));
			}
		}
		else if (helmet.getItem() == ArmorsInit.AXIDITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.AXIDITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.AXIDITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.AXIDITA_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.CACTUS || event.getSource() == DamageSource.SWEET_BERRY_BUSH) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorsInit.CABALLERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CABALLERITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.CABALLERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CABALLERITA_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.IN_FIRE || event.getSource() == DamageSource.ON_FIRE || event.getSource() == DamageSource.HOT_FLOOR ) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorsInit.CESARITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.CESARITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.CESARITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.CESARITA_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.WITHER) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorsInit.ENDERITA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.ENDERITA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.ENDERITA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.ENDERITA_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.DRAGON_BREATH || event.getSource() == DamageSource.FALL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorsInit.FRANITOLINA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.FRANITOLINA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.FRANITOLINA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.FRANITOLINA_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.IN_WALL || event.getSource() == DamageSource.ANVIL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorsInit.MELUNA_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MELUNA_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.MELUNA_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MELUNA_BOOTS_UPGRADED.get()) {
			if(event.getAmount() < 2) {
				event.setCanceled(true);
			}
		}
		else if (helmet.getItem() == ArmorsInit.SHINE_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.SHINE_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.SHINE_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.SHINE_BOOTS_UPGRADED.get()) {
			if(event.getSource().isMagic()) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorsInit.MIGUELITIO_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.MIGUELITIO_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.MIGUELITIO_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.MIGUELITIO_BOOTS_UPGRADED.get()) {
			if(event.getSource() == DamageSource.LIGHTNING_BOLT || event.getSource() == DamageSource.FLY_INTO_WALL) {
				event.setCanceled(true);
			}
		}
		else if (helmet.getItem() == ArmorsInit.HUGODIUM_HELMET_UPGRADED.get() && chest.getItem() == ArmorsInit.HUGODIUM_CHESTPLATE_UPGRADED.get()
				&& legs.getItem() == ArmorsInit.HUGODIUM_LEGGINGS_UPGRADED.get() && boots.getItem() == ArmorsInit.HUGODIUM_BOOTS_UPGRADED.get()) {
			if(player.getHealth() < 5) {
				player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 0));
			}
		}
	}
}
