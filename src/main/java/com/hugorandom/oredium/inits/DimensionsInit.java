package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class DimensionsInit {

    public static final ResourceKey<Level> MAPASHE_DIM_KEY =
            ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Oredium.MOD_ID, "mapashe"));
    public static final ResourceKey<DimensionType> OREDIUM_DIM_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, MAPASHE_DIM_KEY.getRegistryName());

    public static void register(){
        System.out.println("Registering Dimensions for " + Oredium.MOD_ID);
    }
}
