package com.hugorandom.oredium.network.packets;

import net.minecraft.ChatFormatting;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
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
            ServerLevel level = player.getLevel();

            EntityType.COW.spawn(level, null, null, player.blockPosition(),
                    MobSpawnType.COMMAND, true, false);
            // Notificar la cantidad de vitaminas
            level.playSound(null, player.getOnPos(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS,
                    0.5F, level.random.nextFloat() * 0.1F + 0.9F);

            if (true){
                player.sendMessage(new TranslatableComponent(VITAMINS_CONSUMED_MESSAGE).withStyle(ChatFormatting.LIGHT_PURPLE),
                        player.getUUID());
            }
            else {
                player.sendMessage(new TranslatableComponent(VITAMINS_NO_CONSUMED_MESSAGE).withStyle(ChatFormatting.RED),
                        player.getUUID());
            }

        });
        return true;
    }
}
