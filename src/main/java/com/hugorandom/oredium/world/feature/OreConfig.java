package com.hugorandom.oredium.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OreConfig {

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier1, PlacementModifier modifier2){
        return List.of(modifier1, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier modifier){
        return orePlacement(CountPlacement.of(pCount), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier modifier){
        return orePlacement(RarityFilter.onAverageOnceEvery(pChance), modifier);
    }
}
