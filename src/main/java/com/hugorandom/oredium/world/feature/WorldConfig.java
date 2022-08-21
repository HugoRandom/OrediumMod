package com.hugorandom.oredium.world.feature;

import com.hugorandom.oredium.blocks.BlocksInit;
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

    public static final List<OreConfiguration.TargetBlockState> SHINE_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.SHINE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_SHINE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> CESARITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.CESARITA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_CESARITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> AXIDITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.AXIDITA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_AXIDITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> CABALLERITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.CABALLERITA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_CABALLERITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> FRANITOLINA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlocksInit.FRANITOLINA_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_FRANITOLINA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ENDERITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlocksInit.DEEPSLATE_ENDERITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ALEZARITA_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.ALEZARITA_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> HUGODIUM_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.HUGODIUM_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> MIGUELITIO_SPAWN = List.of(
            OreConfiguration.target(OreFeatures.NETHERRACK, BlocksInit.MIGUELITIO_ORE.get().defaultBlockState())
    );
    // Flores - Flowers
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_SOLIMA =
            FeatureUtils.register("flower_solima", Feature.FLOWER,
                    new RandomPatchConfiguration(18, 2, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(BlocksInit.SOLIMA.get())))));

    // Minerales - Ores
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SHINE_ORE =
            FeatureUtils.register("shine_ore", Feature.ORE, new OreConfiguration(SHINE_SPAWN, 8));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AXIDITA_ORE =
            FeatureUtils.register("axidita_ore", Feature.ORE, new OreConfiguration(AXIDITA_SPAWN, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CESARITA_ORE =
            FeatureUtils.register("cesarita_ore", Feature.ORE, new OreConfiguration(CESARITA_SPAWN, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CABALLERITA_ORE =
            FeatureUtils.register("caballerita_ore", Feature.ORE, new OreConfiguration(CABALLERITA_SPAWN, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FRANITOLINA_ORE =
            FeatureUtils.register("franitolina_ore", Feature.ORE, new OreConfiguration(FRANITOLINA_SPAWN, 6));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ENDERITA_ORE =
            FeatureUtils.register("enderita_ore", Feature.ORE, new OreConfiguration(ENDERITA_SPAWN, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALEZARITA_ORE =
            FeatureUtils.register("alezarita_ore", Feature.ORE, new OreConfiguration(ALEZARITA_SPAWN, 5));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HUGODIUM_ORE =
            FeatureUtils.register("hugodium_ore", Feature.ORE, new OreConfiguration(HUGODIUM_SPAWN, 4));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MIGUELITIO_ORE =
            FeatureUtils.register("miguelitio_ore", Feature.ORE, new OreConfiguration(MIGUELITIO_SPAWN, 3));
}

