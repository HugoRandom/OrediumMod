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

        base.add(OrePlaced.SHINE_PLACED);
        base.add(OrePlaced.AXIDITA_PLACED);
        base.add(OrePlaced.CABALLERITA_PLACED);
        base.add(OrePlaced.CESARITA_PLACED);
        base.add(OrePlaced.FRANITOLINA_PLACED);
        base.add(OrePlaced.ENDERIUM_PLACED);
        base.add(OrePlaced.ALEZARITA_PLACED);
        base.add(OrePlaced.HUGODIUM_PLACED);
        base.add(OrePlaced.MIGUELITIO_PLACED);
    }
}
