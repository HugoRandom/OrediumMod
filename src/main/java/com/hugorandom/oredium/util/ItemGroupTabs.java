package com.hugorandom.oredium.util;

import com.hugorandom.oredium.inits.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemGroupTabs {

    public static final CreativeModeTab OREDIUM_ITEMS = new CreativeModeTab("oredium_tab_items"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRareInit.OREDIUM_AMULET.get());
        }
    };

    public static final CreativeModeTab OREDIUM_TOOLS = new CreativeModeTab("oredium_tab_tools"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ToolsInit.ENDERIUM_SWORD.get());
        }
    };
}
