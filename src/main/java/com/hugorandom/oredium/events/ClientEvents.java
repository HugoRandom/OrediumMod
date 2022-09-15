package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.util.KeyBindings;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.event.KeyEvent;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Oredium.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvent{
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event){
            if(KeyBindings.VITAMINS_KEY.consumeClick()){
                Minecraft.getInstance().player.sendMessage(new TranslatableComponent("key.oredium.vitamins.event"),
                        Minecraft.getInstance().player.getUUID());
            }
        }
    }
}
