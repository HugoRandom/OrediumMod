package com.hugorandom.oredium.util;

import com.hugorandom.oredium.init.BlocksInit;
import com.hugorandom.oredium.init.FoodsInit;
import com.hugorandom.oredium.init.BucketsInit;
import com.hugorandom.oredium.init.ToolsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupTabs {

    public static final CreativeModeTab OREDIUM_ITEMS = new CreativeModeTab("oredium_tab_items"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BucketsInit.OREDIUM_AMULET.get());
        }
    };

    public static final CreativeModeTab OREDIUM_FOODS = new CreativeModeTab("oredium_tab_foods"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoodsInit.ENDERITA_APPLE.get());
        }
    };

    public static final CreativeModeTab OREDIUM_BLOCKS = new CreativeModeTab("oredium_tab_blocks"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlocksInit.OREDIUM_BLOCK.get());
        }
    };

    public static final CreativeModeTab OREDIUM_TOOLS = new CreativeModeTab("oredium_tab_tools"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ToolsInit.ENDERITA_SWORD.get());
        }
    };
}
