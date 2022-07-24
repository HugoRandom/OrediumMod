package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class Sword extends SwordItem {

    public Sword(Tier pTier) {
        super(pTier, 2, -2.4f,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
