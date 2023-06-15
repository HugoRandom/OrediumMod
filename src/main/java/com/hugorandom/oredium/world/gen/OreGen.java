package com.hugorandom.oredium.world.gen;

import com.hugorandom.oredium.world.feature.OrePlaced;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class OreGen {

    public static void generateOres(final BiomeLoadingEvent event){
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(OrePlaced.DISPROSIO_PLACED);
        base.add(OrePlaced.FRANITOLINA_PLACED);
        base.add(OrePlaced.MELITONILA_PLACED);
        base.add(OrePlaced.TERIUM_PLACED);
        base.add(OrePlaced.ALEZARITA_PLACED);
        base.add(OrePlaced.HALINOX_PLACED);
        base.add(OrePlaced.MIGUELITIO_PLACED);
        base.add(OrePlaced.TIN_PLACED);
        base.add(OrePlaced.LEAD_PLACED);
        base.add(OrePlaced.SILVER_PLACED);
        base.add(OrePlaced.NICKEL_PLACED);
    }
}
