package com.hugorandom.oredium.items;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Rarity;

public class Item extends net.minecraft.world.item.Item {

    public Item() {
        super(new Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.COMMON)
                .stacksTo(64)
                .setNoRepair());
    }
}
