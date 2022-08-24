package com.hugorandom.oredium.init;

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

    public static final RegistryObject<LiquidBlock> MOLTEN_SHINE_BLOCK = BLOCKFLUIDS.register("shine",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_SHINE.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_LIGHT_BLUE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.9F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_AXIDITA_BLOCK = BLOCKFLUIDS.register("axidita",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_AXIDITA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_LIGHT_GREEN).noCollission().strength(100F).noDrops()
                    .speedFactor(0.8F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CABALLERITA_BLOCK = BLOCKFLUIDS.register("caballerita",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_CABALLERITA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_YELLOW).noCollission().strength(100F).noDrops()
                    .speedFactor(0.7F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_CESARITA_BLOCK = BLOCKFLUIDS.register("cesarita",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_CESARITA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_BLACK).noCollission().strength(100F).noDrops()
                    .speedFactor(0.7F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_FRANITOLINA_BLOCK = BLOCKFLUIDS.register("franitolina",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_FRANITOLINA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_ORANGE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.6F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_MELUNA_BLOCK = BLOCKFLUIDS.register("meluna",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_MELUNA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_PINK).noCollission().strength(100F).noDrops()
                    .speedFactor(0.6F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ENDERITA_BLOCK = BLOCKFLUIDS.register("enderita",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_ENDERITA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_PURPLE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 15)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ALEZARITA_BLOCK = BLOCKFLUIDS.register("alezarita",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_ALEZARITA.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_BLUE).noCollission().strength(100F).noDrops()
                    .speedFactor(0.6F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_HUGODIUM_BLOCK = BLOCKFLUIDS.register("hugodium",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_HUGODIUM.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_RED).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> MOLTEN_MIGUELITIO_BLOCK = BLOCKFLUIDS.register("miguelitio",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_MIGUELITIO.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.DIAMOND).noCollission().strength(100F).noDrops()
                    .speedFactor(0.5F).lightLevel((lightLevel) -> 10)));
    public static final RegistryObject<LiquidBlock> INFERNUM_BLOCK = BLOCKFLUIDS.register("infernum",
            () -> new LiquidBlock(()-> FluidsInit.MOLTEN_INFERNUM.get(), BlockBehaviour.Properties
                    .of(Material.LAVA, MaterialColor.COLOR_RED).noCollission().strength(100F).noDrops()
                    .speedFactor(0.4F).lightLevel((lightLevel) -> 15)));
}
