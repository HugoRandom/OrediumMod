package com.hugoz.oredium.inits;

import com.hugoz.oredium.Oredium;
import com.hugoz.oredium.blocks.alezarita.AlezaritaBlock;
import com.hugoz.oredium.util.ItemGroupTabs;
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

    // Bloques de x9 Lingotes
    public static final RegistryObject<Block> ALEZARITA_BLOCK = registerBlock("alezarita_block", AlezaritaBlock::new);


    // REGISTERS - NO TOCAR
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, ItemGroupTabs.OREDIUM_BLOCKS);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ItemsInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
