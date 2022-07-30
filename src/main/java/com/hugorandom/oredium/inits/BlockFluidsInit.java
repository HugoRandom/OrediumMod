package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockFluidsInit {

    public static final DeferredRegister<Block> BLOCKFLUIDS = DeferredRegister.create(ForgeRegistries.BLOCKS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKFLUIDS.register(eventBus);
    }

    public static final RegistryObject<LiquidBlock> MOLTEN_HUGODIUM = BLOCKFLUIDS.register("hugodium",
            () -> new LiquidBlock(()-> FluidsInit.HUGODIUM_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_RED).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALEZARITA = BLOCKFLUIDS.register("alezarita",
            () -> new LiquidBlock(()-> FluidsInit.ALEZARITA_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_BLUE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.6F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_AXIDITA = BLOCKFLUIDS.register("axidita",
            () -> new LiquidBlock(()-> FluidsInit.AXIDITA_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_LIGHT_GREEN).noCollission().strength(100F).noDrops()
                    .speedFactor(0.8F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_FRANITOLINA = BLOCKFLUIDS.register("franitolina",
            () -> new LiquidBlock(()-> FluidsInit.FRANITOLINA_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_ORANGE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.6F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_MIGUELITIO = BLOCKFLUIDS.register("miguelitio",
            () -> new LiquidBlock(()-> FluidsInit.MIGUELITIO_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.DIAMOND).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SHINE = BLOCKFLUIDS.register("shine",
            () -> new LiquidBlock(()-> FluidsInit.SHINE_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.9F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CESARITA = BLOCKFLUIDS.register("cesarita",
            () -> new LiquidBlock(()-> FluidsInit.CESARITA_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_BLACK).noCollission().strength(100F).noDrops()
                    .speedFactor(0.7F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CABALLERITA = BLOCKFLUIDS.register("caballerita",
            () -> new LiquidBlock(()-> FluidsInit.CABALLERITA_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_YELLOW).noCollission().strength(100F).noDrops()
                    .speedFactor(0.7F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ENDERIUM = BLOCKFLUIDS.register("enderium",
            () -> new LiquidBlock(()-> FluidsInit.ENDERIUM_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_PURPLE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 15)));
    public static final RegistryObject<LiquidBlock> INFERNUM = BLOCKFLUIDS.register("infernum",
            () -> new LiquidBlock(()-> FluidsInit.INFERNUM_FLUID.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_RED).noCollission().strength(100F).noDrops()
                    .speedFactor(0.4F).lightLevel((lightLevel) -> 15)));
}
