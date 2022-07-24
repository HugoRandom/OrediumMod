package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.blocks.LampBlock;
import com.hugorandom.oredium.blocks.MetalBlock;
import com.hugorandom.oredium.blocks.OreBlock;
import com.hugorandom.oredium.blocks.OrediumBlock;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlocksInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Oredium.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ItemsInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


    // Bloques de x9 Lingotes
    public static final RegistryObject<Block> SHINE_BLOCK = registerBlock("shine_block",
            () -> new MetalBlock(4f, 3f));
    public static final RegistryObject<Block> CABALLERITA_BLOCK = registerBlock("caballerita_block",
            () -> new MetalBlock(5f, 3f));
    public static final RegistryObject<Block> CESARITA_BLOCK = registerBlock("cesarita_block",
            () -> new MetalBlock(5f, 3f));
    public static final RegistryObject<Block> AXIDITA_BLOCK = registerBlock("axidita_block",
            () -> new MetalBlock(5f, 4f));
    public static final RegistryObject<Block> FRANITOLINA_BLOCK = registerBlock("franitolina_block",
            () -> new MetalBlock(5f, 4f));
    public static final RegistryObject<Block> ENDERIUM_BLOCK = registerBlock("enderium_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> ALEZARITA_BLOCK = registerBlock("alezarita_block",
            () -> new MetalBlock(6f, 6f));
    public static final RegistryObject<Block> HUGODIUM_BLOCK = registerBlock("hugodium_block",
            () -> new MetalBlock(6f, 7f));
    public static final RegistryObject<Block> MIGUELITIO_BLOCK = registerBlock("miguelitio_block",
            () -> new MetalBlock(6f, 8f));

    // Menas
    public static final RegistryObject<Block> SHINE_ORE = registerBlock("shine_ore",
            () -> new OreBlock(4f, 3f));
    public static final RegistryObject<Block> CABALLERITA_ORE = registerBlock("caballerita_ore",
            () -> new OreBlock(5f, 4f));
    public static final RegistryObject<Block> CESARITA_ORE = registerBlock("cesarita_ore",
            () -> new OreBlock(5f, 4f));
    public static final RegistryObject<Block> AXIDITA_ORE = registerBlock("axidita_ore",
            () -> new OreBlock(4f, 3f));
    public static final RegistryObject<Block> FRANITOLINA_ORE = registerBlock("franitolina_ore",
            () -> new OreBlock(5f, 5f));
    public static final RegistryObject<Block> ENDERIUM_ORE = registerBlock("enderium_ore",
            () -> new OreBlock(6f, 10f));
    public static final RegistryObject<Block> ALEZARITA_ORE = registerBlock("alezarita_ore",
            () -> new OreBlock(5f, 6f));
    public static final RegistryObject<Block> HUGODIUM_ORE = registerBlock("hugodium_ore",
            () -> new OreBlock(6f, 7f));
    public static final RegistryObject<Block> MIGUELITIO_ORE = registerBlock("miguelitio_ore",
            () -> new OreBlock(4f, 8f));

    // Lamparas
    public static final RegistryObject<Block> SHINE_LAMP = registerBlock("shine_lamp", LampBlock::new);
    public static final RegistryObject<Block> CABALLERITA_LAMP = registerBlock("caballerita_lamp", LampBlock::new);
    public static final RegistryObject<Block> AXIDITA_LAMP = registerBlock("axidita_lamp", LampBlock::new);
    public static final RegistryObject<Block> CESARITA_LAMP = registerBlock("cesarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> FRANITOLINA_LAMP = registerBlock("franitolina_lamp", LampBlock::new);
    public static final RegistryObject<Block> ENDERIUM_LAMP = registerBlock("enderium_lamp", LampBlock::new);
    public static final RegistryObject<Block> ALEZARITA_LAMP = registerBlock("alezarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> HUGODIUM_LAMP = registerBlock("hugodium_lamp", LampBlock::new);
    public static final RegistryObject<Block> MIGUELITIO_LAMP = registerBlock("miguelitio_lamp", LampBlock::new);

    // Especiales
    public static final RegistryObject<Block> OREDIUM_BLOCK = registerBlock("oredium_block", OrediumBlock::new);
}