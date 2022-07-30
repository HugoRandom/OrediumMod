package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.blocks.*;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ItemsInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


    // Bloques de x9 Lingotes - Blocks of Metal
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

    // Menas normales y profundas - Normal and deepslate Ores
    public static final RegistryObject<Block> SHINE_ORE = registerBlock("shine_ore",
            () -> new OreBlock(4f, 3f));
    public static final RegistryObject<Block> CABALLERITA_ORE = registerBlock("caballerita_ore",
            () -> new OreBlock(5f, 4f));
    public static final RegistryObject<Block> AXIDITA_ORE = registerBlock("axidita_ore",
            () -> new OreBlock(4f, 3f));
    public static final RegistryObject<Block> CESARITA_ORE = registerBlock("cesarita_ore",
            () -> new OreBlock(5f, 4f));
    public static final RegistryObject<Block> FRANITOLINA_ORE = registerBlock("franitolina_ore",
            () -> new OreBlock(5f, 5f));
    public static final RegistryObject<Block> DEEPSLATE_ENDERIUM_ORE = registerBlock("deepslate_enderium_ore",
            () -> new DeepslateOreBlock(6f, 10f));
    public static final RegistryObject<Block> ALEZARITA_ORE = registerBlock("alezarita_ore",
            () -> new OreBlock(5f, 6f));
    public static final RegistryObject<Block> HUGODIUM_ORE = registerBlock("hugodium_ore",
            () -> new OreBlock(6f, 7f));
    public static final RegistryObject<Block> MIGUELITIO_ORE = registerBlock("miguelitio_ore",
            () -> new OreBlock(4f, 8f));
    public static final RegistryObject<Block> DEEPSLATE_SHINE_ORE = registerBlock("deepslate_shine_ore",
            () -> new DeepslateOreBlock(4.5f, 3f));
    public static final RegistryObject<Block> DEEPSLATE_CABALLERITA_ORE = registerBlock("deepslate_caballerita_ore",
            () -> new DeepslateOreBlock(5.5f, 4f));
    public static final RegistryObject<Block> DEEPSLATE_CESARITA_ORE = registerBlock("deepslate_cesarita_ore",
            () -> new DeepslateOreBlock(5.5f, 4f));
    public static final RegistryObject<Block> DEEPSLATE_AXIDITA_ORE = registerBlock("deepslate_axidita_ore",
            () -> new DeepslateOreBlock(4.5f, 3f));
    public static final RegistryObject<Block> DEEPSLATE_FRANITOLINA_ORE = registerBlock("deepslate_franitolina_ore",
            () -> new DeepslateOreBlock(5.5f, 5f));


    // Bloques de metal en bruto - Raw metal blocks
    public static final RegistryObject<Block> RAW_SHINE_BLOCK = registerBlock("raw_shine_block",
            () -> new MetalBlock(4f, 3f));
    public static final RegistryObject<Block> RAW_CABALLERITA_BLOCK = registerBlock("raw_caballerita_block",
            () -> new MetalBlock(5f, 3f));
    public static final RegistryObject<Block> RAW_AXIDITA_BLOCK = registerBlock("raw_axidita_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_CESARITA_BLOCK = registerBlock("raw_cesarita_block",
            () -> new MetalBlock(5f, 3f));
    public static final RegistryObject<Block> RAW_FRANITOLINA_BLOCK = registerBlock("raw_franitolina_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_ENDERIUM_BLOCK = registerBlock("raw_enderium_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_ALEZARITA_BLOCK = registerBlock("raw_alezarita_block",
            () -> new MetalBlock(6f, 6f));
    public static final RegistryObject<Block> RAW_HUGODIUM_BLOCK = registerBlock("raw_hugodium_block",
            () -> new MetalBlock(6f, 7f));
    public static final RegistryObject<Block> RAW_MIGUELITIO_BLOCK = registerBlock("raw_miguelitio_block",
            () -> new MetalBlock(6f, 8f));

    // Lamparas - Lamps
    public static final RegistryObject<Block> SHINE_LAMP = registerBlock("shine_lamp", LampBlock::new);
    public static final RegistryObject<Block> CABALLERITA_LAMP = registerBlock("caballerita_lamp", LampBlock::new);
    public static final RegistryObject<Block> AXIDITA_LAMP = registerBlock("axidita_lamp", LampBlock::new);
    public static final RegistryObject<Block> CESARITA_LAMP = registerBlock("cesarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> FRANITOLINA_LAMP = registerBlock("franitolina_lamp", LampBlock::new);
    public static final RegistryObject<Block> ENDERIUM_LAMP = registerBlock("enderium_lamp", LampBlock::new);
    public static final RegistryObject<Block> ALEZARITA_LAMP = registerBlock("alezarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> HUGODIUM_LAMP = registerBlock("hugodium_lamp", LampBlock::new);
    public static final RegistryObject<Block> MIGUELITIO_LAMP = registerBlock("miguelitio_lamp", LampBlock::new);

    // Flores - Flowers
    public static final RegistryObject<Block> SOLIMA = registerBlock("solima",
            () -> new FlowerBlock(MobEffects.GLOWING, 3,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SOLIMA = registerBlockNoItem("potted_solima",
            () -> new FlowerPotBlock(null, BlocksInit.SOLIMA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    // Especiales - Specials
    public static final RegistryObject<Block> OREDIUM_BLOCK = registerBlock("oredium_block", OrediumBlock::new);
}
