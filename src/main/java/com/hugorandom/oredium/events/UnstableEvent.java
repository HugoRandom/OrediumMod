package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.EffectsInit;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class UnstableEvent {

    @SubscribeEvent
    public static void playerUnstableHurt(LivingHurtEvent event){
        if (event.getEntityLiving() instanceof Player){
            LivingEntity player = event.getEntityLiving();
            if (player.hasEffect(EffectsInit.UNSTABLE.get())){
                player.sendMessage(new TextComponent(String.valueOf(event.getAmount()))
                        .withStyle(ChatFormatting.LIGHT_PURPLE), player.getUUID());
                float damage = event.getAmount();
                float bonus = (float)(damage * 0.25);
                if (bonus >= 0.5){
                    player.sendMessage(new TextComponent(String.valueOf(damage))
                            .withStyle(ChatFormatting.LIGHT_PURPLE), player.getUUID());
                    player.playSound(SoundEvents.COW_HURT, 1.0F, 1.1F);
                    event.setAmount(damage + bonus);
                    player.sendMessage(new TextComponent(String.valueOf(event.getAmount()))
                            .withStyle(ChatFormatting.LIGHT_PURPLE), player.getUUID());
                }
            }
        }
    }

    @SubscribeEvent
    public static void playerUnstableDeath(LivingDeathEvent event){
        if (event.getEntity() instanceof Player player){
            if(player.hasEffect(EffectsInit.UNSTABLE.get())){
                player.getLevel().explode(player, player.getX(), player.getY() + 0.5, player.getZ(),
                        1.0F, false, Explosion.BlockInteraction.BREAK);
            }
        }
    }
}















