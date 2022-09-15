package com.hugorandom.oredium.capabilities.vitamins;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerVitaminsProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {

    public static Capability<PlayerVitamins> PLAYER_VITAMINS = CapabilityManager.get(
            new CapabilityToken<PlayerVitamins>() { });
    private PlayerVitamins vitamins = null;
    private final LazyOptional<PlayerVitamins> optional = LazyOptional.of(this::createPlayerVitamins);

    private PlayerVitamins createPlayerVitamins() {
        if(this.vitamins == null){
            this.vitamins = new PlayerVitamins();
        }
        return this.vitamins;
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == PLAYER_VITAMINS){
            return optional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag NBT = new CompoundTag();
        createPlayerVitamins().saveNBTData(NBT);
        return NBT;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerVitamins().loadNBTData(nbt);
    }
}
