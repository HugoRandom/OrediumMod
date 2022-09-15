package com.hugorandom.oredium.capabilities.vitamins;

import net.minecraft.nbt.CompoundTag;

public class PlayerVitamins {

    private int vitamins;
    private final int vitamins_min = 0;

    public int getVitamins(){
        return vitamins;
    }

    public void addVitamin(int add){
        this.vitamins = vitamins + add;
    }

    public void subVitamin(int sub){
        this.vitamins = Math.max(vitamins - sub, vitamins_min) ;
    }

    public void resetVitamins(){
        this.vitamins = vitamins_min;
    }

    public void setVitamin(int set){
        this.vitamins = Math.min(set, vitamins_min);
    }

    public void copyFrom(PlayerVitamins source){
        this.vitamins = source.vitamins;
    }

    public void saveNBTData(CompoundTag NBT){
        NBT.putInt("vitamins", vitamins);
    }

    public void loadNBTData(CompoundTag NBT){
        vitamins = NBT.getInt("vitamins");
    }
}
