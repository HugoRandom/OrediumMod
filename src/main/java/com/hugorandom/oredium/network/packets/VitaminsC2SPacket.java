package com.hugorandom.oredium.network.packets;

import com.hugorandom.oredium.capabilities.vitamins.PlayerVitamins;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitaminsProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraftforge.network.NetworkEvent;
import org.apache.logging.log4j.core.config.builder.api.Component;

import java.awt.*;
import java.util.function.Supplier;

public class VitaminsC2SPacket {

    private static final String VITAMINS_CONSUMED_MESSAGE = "message.oredium.vitamins";
    private static final String VITAMINS_NO_CONSUMED_MESSAGE = "message.oredium.no_vitamins";
    public VitaminsC2SPacket(){

    }

    public VitaminsC2SPacket(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() ->{
            // PARTE DEL SERVER
            ServerPlayer player = context.getSender();

            // Notificar la cantidad de vitaminas
            player.getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(vitamins -> {
                int actualVitamins = vitamins.getVitamins();
                if (actualVitamins > 0){
                    player.sendMessage(new TranslatableComponent(VITAMINS_CONSUMED_MESSAGE).withStyle(ChatFormatting.LIGHT_PURPLE),
                            player.getUUID());
                    player.sendMessage(new TextComponent(String.valueOf(actualVitamins)).withStyle(ChatFormatting.LIGHT_PURPLE),
                            player.getUUID());
                }
                else {
                    player.sendMessage(new TranslatableComponent(VITAMINS_NO_CONSUMED_MESSAGE).withStyle(ChatFormatting.RED),
                            player.getUUID());
                }
            });
        });
        return true;
    }
}
