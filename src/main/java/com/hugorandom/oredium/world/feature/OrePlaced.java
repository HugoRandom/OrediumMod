package com.hugorandom.oredium.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class OrePlaced {

    public static final Holder<PlacedFeature> SOLIMA_PLACED = PlacementUtils.register("solima_placed",
            WorldConfig.FLOWER_SOLIMA, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> SHINE_PLACED = PlacementUtils.register("shine_placed",
            WorldConfig.SHINE_ORE, OreConfig.commonOrePlacement(18, HeightRangePlacement.triangle(
                    VerticalAnchor.aboveBottom(-100),VerticalAnchor.absolute(256))));

    public static final Holder<PlacedFeature> AXIDITA_PLACED = PlacementUtils.register("axidita_placed",
            WorldConfig.AXIDITA_ORE, OreConfig.commonOrePlacement(8, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(50))));

    public static final Holder<PlacedFeature> CABALLERITA_PLACED = PlacementUtils.register("caballerita_placed",
            WorldConfig.CABALLERITA_ORE, OreConfig.commonOrePlacement(10, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(50))));

    public static final Holder<PlacedFeature> CESARITA_PLACED = PlacementUtils.register("cesarita_placed",
            WorldConfig.CESARITA_ORE, OreConfig.commonOrePlacement(10, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(50))));

    public static final Holder<PlacedFeature> FRANITOLINA_PLACED = PlacementUtils.register("franitolina_placed",
            WorldConfig.FRANITOLINA_ORE, OreConfig.commonOrePlacement(9, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(64))));

    public static final Holder<PlacedFeature> ENDERIUM_PLACED = PlacementUtils.register("enderium_placed",
            WorldConfig.ENDERIUM_ORE, OreConfig.commonOrePlacement(5, HeightRangePlacement.triangle(
                    VerticalAnchor.aboveBottom(-80),VerticalAnchor.absolute(-10))));

    public static final Holder<PlacedFeature> ALEZARITA_PLACED = PlacementUtils.register("alezarita_placed",
            WorldConfig.ALEZARITA_ORE, OreConfig.commonOrePlacement(12, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(115))));

    public static final Holder<PlacedFeature> HUGODIUM_PLACED = PlacementUtils.register("hugodium_placed",
                WorldConfig.HUGODIUM_ORE, OreConfig.commonOrePlacement(11, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(115))));

    public static final Holder<PlacedFeature> MIGUELITIO_PLACED = PlacementUtils.register("miguelitio_placed",
            WorldConfig.MIGUELITIO_ORE, OreConfig.commonOrePlacement(12, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(5),VerticalAnchor.absolute(100))));
}
