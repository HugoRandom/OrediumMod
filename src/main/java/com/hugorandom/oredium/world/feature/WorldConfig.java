package com.hugorandom.oredium.world.feature;

import com.hugorandom.oredium.init.BlocksInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class WorldConfig {

    public static final List<OreConfiguration.TargetBlockState> DISPROSIO_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.DISPROSIO_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_DISPROSIO_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> FRANITOLINA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.FRANITOLINA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_FRANITOLINA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> MELITONILA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.MELITONILA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_MELITONILA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TERIUM_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_TERIUM_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ALEZARITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK,
                    BlocksInit.ALEZARITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> HALINOX_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK,
                    BlocksInit.HALINOX_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> MIGUELITIO_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK,
                    BlocksInit.MIGUELITIO_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TIN_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_TIN_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> LEAD_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_LEAD_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> SILVER_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> NICKEL_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    BlocksInit.NICKEL_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    BlocksInit.DEEPSLATE_NICKEL_ORE.get().defaultBlockState())
    );
    // Flores - Flowers
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SOLIMA =
            FeatureUtils.register("flower_solima", Feature.FLOWER,
                    new RandomPatchConfiguration(10, 2, 1,
                            PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksInit.SOLIMA.get())))));

    // Minerales - Ores
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DISPROSIO_ORE =
            FeatureUtils.register("disprosio_ore", Feature.ORE,
                    new OreConfiguration(DISPROSIO_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FRANITOLINA_ORE =
            FeatureUtils.register("franitolina_ore", Feature.ORE,
                    new OreConfiguration(FRANITOLINA_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MELITONILA_ORE =
            FeatureUtils.register("melitonila_ore", Feature.ORE,
                    new OreConfiguration(MELITONILA_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TERIUM_ORE =
            FeatureUtils.register("terium_ore", Feature.ORE,
                    new OreConfiguration(TERIUM_SPAWN, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALEZARITA_ORE =
            FeatureUtils.register("alezarita_ore", Feature.ORE,
                    new OreConfiguration(ALEZARITA_SPAWN, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HALINOX_ORE =
            FeatureUtils.register("halinox_ore", Feature.ORE,
                    new OreConfiguration(HALINOX_SPAWN, 3));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MIGUELITIO_ORE =
            FeatureUtils.register("miguelitio_ore", Feature.ORE,
                    new OreConfiguration(MIGUELITIO_SPAWN, 2));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE =
            FeatureUtils.register("tin_ore", Feature.ORE,
                    new OreConfiguration(TIN_SPAWN, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE =
            FeatureUtils.register("lead_ore", Feature.ORE,
                    new OreConfiguration(LEAD_SPAWN, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE =
            FeatureUtils.register("silver_ore", Feature.ORE,
                    new OreConfiguration(SILVER_SPAWN, 9));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NICKEL_ORE =
            FeatureUtils.register("nickel_ore", Feature.ORE,
                    new OreConfiguration(NICKEL_SPAWN, 9));
}

