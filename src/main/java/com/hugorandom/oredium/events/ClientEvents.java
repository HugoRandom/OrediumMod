package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.network.OrediumPackets;
import com.hugorandom.oredium.network.packets.VitaminsC2SPacket;
import com.hugorandom.oredium.util.KeyBindings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = Oredium.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvent{
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event){
            if(KeyBindings.VITAMINS_KEY.consumeClick()){
                OrediumPackets.sendToServer(new VitaminsC2SPacket());
            }
        }
    }
}
