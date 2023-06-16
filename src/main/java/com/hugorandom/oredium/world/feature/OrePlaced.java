package com.hugorandom.oredium.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class OrePlaced {

    // Flores
    public static final Holder<PlacedFeature> SOLIMA_PLACED = PlacementUtils.register("solima_placed",
            WorldConfig.FLOWER_SOLIMA, RarityFilter.onAverageOnceEvery(4),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    // Metales
    public static final Holder<PlacedFeature> DISPROSIO_PLACED = PlacementUtils.register("disprosio_placed",
            WorldConfig.DISPROSIO_ORE, OreConfig.commonOrePlacement(4, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(15))));
    public static final Holder<PlacedFeature> FRANITOLINA_PLACED = PlacementUtils.register("franitolina_placed",
            WorldConfig.FRANITOLINA_ORE, OreConfig.commonOrePlacement(4, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(15))));
    public static final Holder<PlacedFeature> MELITONILA_PLACED = PlacementUtils.register("melitonila_placed",
            WorldConfig.MELITONILA_ORE, OreConfig.commonOrePlacement(4, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(15))));
    public static final Holder<PlacedFeature> TERIUM_PLACED = PlacementUtils.register("terium_placed",
            WorldConfig.TERIUM_ORE, OreConfig.commonOrePlacement(3, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(-20))));
    public static final Holder<PlacedFeature> ALEZARITA_PLACED = PlacementUtils.register("alezarita_placed",
            WorldConfig.ALEZARITA_ORE, OreConfig.commonOrePlacement(3, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(10),VerticalAnchor.absolute(100))));
    public static final Holder<PlacedFeature> HALINOX_PLACED = PlacementUtils.register("halinox_placed",
                WorldConfig.HALINOX_ORE, OreConfig.commonOrePlacement(3, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(10),VerticalAnchor.absolute(100))));
    public static final Holder<PlacedFeature> MIGUELITIO_PLACED = PlacementUtils.register("miguelitio_placed",
            WorldConfig.MIGUELITIO_ORE, OreConfig.commonOrePlacement(3, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(10),VerticalAnchor.absolute(100))));
    public static final Holder<PlacedFeature> TIN_PLACED = PlacementUtils.register("tin_placed",
            WorldConfig.TIN_ORE, OreConfig.commonOrePlacement(8, HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(65))));
    public static final Holder<PlacedFeature> LEAD_PLACED = PlacementUtils.register("lead_placed",
            WorldConfig.LEAD_ORE, OreConfig.commonOrePlacement(8, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(45))));
    public static final Holder<PlacedFeature> SILVER_PLACED = PlacementUtils.register("silver_placed",
            WorldConfig.SILVER_ORE, OreConfig.commonOrePlacement(8, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(45))));
    public static final Holder<PlacedFeature> NICKEL_PLACED = PlacementUtils.register("nickel_placed",
            WorldConfig.NICKEL_ORE, OreConfig.commonOrePlacement(8, HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(-60),VerticalAnchor.absolute(65))));
}
