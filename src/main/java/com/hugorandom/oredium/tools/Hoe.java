package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class Hoe extends HoeItem {

    public Hoe(Tier pTier) {
        super(pTier, 0, 0f,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
