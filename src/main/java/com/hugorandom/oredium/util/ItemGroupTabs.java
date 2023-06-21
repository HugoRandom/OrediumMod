package com.hugorandom.oredium.util;

import com.hugorandom.oredium.init.BlocksInit;
import com.hugorandom.oredium.init.FoodsInit;
import com.hugorandom.oredium.init.Items2Init;
import com.hugorandom.oredium.init.ToolsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemGroupTabs {

    public static final CreativeModeTab OREDIUM_ITEMS = new CreativeModeTab("oredium_tab_items"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items2Init.OREDIUM_AMULET.get());
        }
    };

    public static final CreativeModeTab OREDIUM_FOODS = new CreativeModeTab("oredium_tab_foods"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(FoodsInit.TERIUM_APPLE.get());
        }
    };

    public static final CreativeModeTab OREDIUM_BLOCKS = new CreativeModeTab("oredium_tab_blocks"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(BlocksInit.OREDIUM_BLOCK.get());
        }
    };

    public static final CreativeModeTab OREDIUM_TOOLS = new CreativeModeTab("oredium_tab_tools"){
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items2Init.DIMENSIONAL_RESONATOR.get());
        }
    };
}
