package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tier;

public class PickAxe extends PickaxeItem {

    public PickAxe(Tier pTier) {
        super(pTier, 1, -2.8f,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON));
    }
}
