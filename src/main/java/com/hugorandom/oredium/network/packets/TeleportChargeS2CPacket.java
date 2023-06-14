package com.hugorandom.oredium.network.packets;

import com.hugorandom.oredium.client.TeleporterChargeData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class TeleportChargeS2CPacket {

    private final int TeleportCharge;

    public TeleportChargeS2CPacket(int teleportCharge){
        this.TeleportCharge = teleportCharge;
    }

    public TeleportChargeS2CPacket(FriendlyByteBuf buf){
        this.TeleportCharge = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf){
        buf.writeInt(TeleportCharge);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() ->{
            // PARTE DEL CLIENTE
            TeleporterChargeData.setTeleporterCharge(TeleportCharge);
        });
        return true;
    }
}
