package com.hugorandom.oredium.client;

public class TeleporterChargeData {

    private static int TeleporterCharge;

    public static void setTeleporterCharge(int teleporterCharge){
        TeleporterChargeData.TeleporterCharge = teleporterCharge;
    }

    public static int getTeleporterCharge(){
        return TeleporterCharge;
    }
}
