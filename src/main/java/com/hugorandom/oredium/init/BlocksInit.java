package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.blocks.*;
import com.hugorandom.oredium.blocks.metals.FranitolinaBlock;
import com.hugorandom.oredium.blocks.metals.MiguelitioBlock;
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
        return Items1Init.ITEMS.register(name, 
                () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroupTabs.OREDIUM_BLOCKS)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


    // Bloques de x9 Lingotes - Blocks of Metal
    public static final RegistryObject<Block> DISPROSIO_BLOCK = registerBlock("disprosio_block",
            () -> new MetalBlock(5f, 8f));
    public static final RegistryObject<Block> FRANITOLINA_BLOCK = registerBlock("franitolina_block",
            () -> new FranitolinaBlock(5f, 8f));
    public static final RegistryObject<Block> MELITONILA_BLOCK = registerBlock("melitonila_block",
            () -> new MetalBlock(5f, 8f));
    public static final RegistryObject<Block> TERIUM_BLOCK = registerBlock("terium_block",
            () -> new MetalBlock(5f, 8f));
    public static final RegistryObject<Block> ALEZARITA_BLOCK = registerBlock("alezarita_block",
            () -> new MetalBlock(6f, 8f));
    public static final RegistryObject<Block> HALINOX_BLOCK = registerBlock("halinox_block",
            () -> new MetalBlock(6f, 8f));
    public static final RegistryObject<Block> MIGUELITIO_BLOCK = registerBlock("miguelitio_block",
            () -> new MiguelitioBlock(6f, 8f));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> INVAR_BLOCK = registerBlock("invar_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> CONSTANTAN_BLOCK = registerBlock("constantan_block",
            () -> new MetalBlock(5f, 6f));

    // Bloques de metal en bruto - Raw metal blocks
    public static final RegistryObject<Block> RAW_DISPROSIO_BLOCK = registerBlock("raw_disprosio_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_FRANITOLINA_BLOCK = registerBlock("raw_franitolina_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_MELITONILA_BLOCK = registerBlock("raw_melitonila_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_TERIUM_BLOCK = registerBlock("raw_terium_block",
            () -> new MetalBlock(5f, 5f));
    public static final RegistryObject<Block> RAW_ALEZARITA_BLOCK = registerBlock("raw_alezarita_block",
            () -> new MetalBlock(6f, 6f));
    public static final RegistryObject<Block> RAW_HALINOX_BLOCK = registerBlock("raw_halinox_block",
            () -> new MetalBlock(6f, 7f));
    public static final RegistryObject<Block> RAW_MIGUELITIO_BLOCK = registerBlock("raw_miguelitio_block",
            () -> new MetalBlock(6f, 8f));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new MetalBlock(5f, 6f));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            () -> new MetalBlock(5f, 6f));

    // Lamparas - Lamps
    public static final RegistryObject<Block> DISPROSIO_LAMP =
            registerBlock("disprosio_lamp", LampBlock::new);
    public static final RegistryObject<Block> FRANITOLINA_LAMP =
            registerBlock("franitolina_lamp", LampBlock::new);
    public static final RegistryObject<Block> MELITONILA_LAMP =
            registerBlock("melitonila_lamp", LampBlock::new);
    public static final RegistryObject<Block> TERIUM_LAMP =
            registerBlock("terium_lamp", LampBlock::new);
    public static final RegistryObject<Block> ALEZARITA_LAMP =
            registerBlock("alezarita_lamp", LampBlock::new);
    public static final RegistryObject<Block> HALINOX_LAMP =
            registerBlock("halinox_lamp", LampBlock::new);
    public static final RegistryObject<Block> MIGUELITIO_LAMP =
            registerBlock("miguelitio_lamp", LampBlock::new);

    // Menas normales y profundas - Normal and deepslate Ores
    public static final RegistryObject<Block> DISPROSIO_ORE = registerBlock("disprosio_ore",
            () -> new OreBlock(5f, 5f));
    public static final RegistryObject<Block> FRANITOLINA_ORE = registerBlock("franitolina_ore",
            () -> new OreBlock(5f, 5f));
    public static final RegistryObject<Block> MELITONILA_ORE = registerBlock("melitonila_ore",
            () -> new OreBlock(5f, 5f));
    public static final RegistryObject<Block> ALEZARITA_ORE = registerBlock("alezarita_ore",
            () -> new OreBlock(6f, 6f));
    public static final RegistryObject<Block> HALINOX_ORE = registerBlock("halinox_ore",
            () -> new OreBlock(6f, 6f));
    public static final RegistryObject<Block> MIGUELITIO_ORE = registerBlock("miguelitio_ore",
            () -> new OreBlock(7f, 6f));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(3f, 3f));
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new OreBlock(3f, 3f));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(3f, 3f));
    public static final RegistryObject<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new OreBlock(3f, 3f));
    public static final RegistryObject<Block> DEEPSLATE_DISPROSIO_ORE = registerBlock("deepslate_disprosio_ore",
            () -> new DeepslateOreBlock(5.5f, 6f));
    public static final RegistryObject<Block> DEEPSLATE_FRANITOLINA_ORE = registerBlock("deepslate_franitolina_ore",
            () -> new DeepslateOreBlock(5.5f, 6f));
    public static final RegistryObject<Block> DEEPSLATE_MELITONILA_ORE = registerBlock("deepslate_melitonila_ore",
            () -> new DeepslateOreBlock(5.5f, 6f));
    public static final RegistryObject<Block> DEEPSLATE_TERIUM_ORE = registerBlock("deepslate_terium_ore",
            () -> new DeepslateOreBlock(6f, 7f));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new DeepslateOreBlock(4.5f, 4.5f));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new DeepslateOreBlock(4.5f, 4.5f));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new DeepslateOreBlock(4.5f, 4.5f));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            () -> new DeepslateOreBlock(4.5f, 4.5f));

    // Especiales - Specials
    public static final RegistryObject<Block> OREDIUM_BLOCK = registerBlock("oredium_block", OrediumBlock::new);

    // Flores - Flowers
    public static final RegistryObject<Block> SOLIMA = registerBlock("solima",
            () -> new FlowerBlock(MobEffects.GLOWING, 3,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> POTTED_SOLIMA = registerBlockNoItem("potted_solima",
            () -> new FlowerPotBlock(null, BlocksInit.SOLIMA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
}
