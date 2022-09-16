package com.hugorandom.oredium.network.packets;

import com.hugorandom.oredium.client.TeleporterChargeData;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class TeleporterChargeS2CPacket {

    private final int TeleporterCharge;

    public TeleporterChargeS2CPacket(int teleporterCharge){
        this.TeleporterCharge = teleporterCharge;
    }

    public TeleporterChargeS2CPacket(FriendlyByteBuf buf){
        this.TeleporterCharge = buf.readInt();
    }

    public void toBytes(FriendlyByteBuf buf){
        buf.writeInt(TeleporterCharge);
    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() ->{
            // PARTE DEL CLIENTE
            TeleporterChargeData.setTeleporterCharge(TeleporterCharge);
        });
        return true;
    }
}
