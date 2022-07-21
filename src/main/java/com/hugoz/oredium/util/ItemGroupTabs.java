package com.hugoz.oredium.util;

import com.hugoz.oredium.inits.BlocksInit;
import com.hugoz.oredium.inits.ItemsInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupTabs {

    public static final CreativeModeTab OREDIUM_ITEMS = new CreativeModeTab("oredium_tab_items"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsInit.ALEZARITA_INGOT.get());
        }
    };

    public static final CreativeModeTab OREDIUM_BLOCKS = new CreativeModeTab("oredium_tab_blocks"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlocksInit.ALEZARITA_BLOCK.get());
        }
    };

    public static final CreativeModeTab OREDIUM_ARMORS = new CreativeModeTab("oredium_tab_armors"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsInit.ALEZARITA_NUGGET.get());
        }
    };
}
