package com.hugoz.oredium.items;

import com.hugoz.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Normal extends Item {

    public Normal() {
        super(new Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.COMMON)
                .stacksTo(64)
                .setNoRepair());
    }
}
