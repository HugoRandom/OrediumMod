package com.hugorandom.oredium.network;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.network.packets.TeleporterChargeS2CPacket;
import com.hugorandom.oredium.network.packets.VitaminsC2SPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class OrediumPackets {

    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id(){
        return packetId++;
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Oredium.MOD_ID, "packets"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();
        INSTANCE = net;

        net.messageBuilder(VitaminsC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(VitaminsC2SPacket::new)
                .encoder(VitaminsC2SPacket::toBytes)
                .consumer(VitaminsC2SPacket::handle)
                .add();

        net.messageBuilder(TeleporterChargeS2CPacket.class, id(), NetworkDirection.PLAY_TO_CLIENT)
                .decoder(TeleporterChargeS2CPacket::new)
                .encoder(TeleporterChargeS2CPacket::toBytes)
                .consumer(TeleporterChargeS2CPacket::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message){
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player){
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
