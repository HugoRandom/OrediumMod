package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class Shovel extends ShovelItem {

    public Shovel(Tier pTier) {
        super(pTier, 0, -3f,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
