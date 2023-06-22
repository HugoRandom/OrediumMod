package com.hugorandom.oredium.network.packets;

import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkEvent;

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
        });
        return true;
    }
}
