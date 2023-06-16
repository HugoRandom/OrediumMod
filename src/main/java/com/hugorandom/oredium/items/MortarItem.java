package com.hugorandom.oredium.items;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class MortarItem extends Item {
    public MortarItem(int durability) {
        super(new Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.COMMON)
                .stacksTo(1)
                .durability(durability));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack returnItem = new ItemStack(itemStack.getItem(), 1, itemStack.getDamageValue());
        if (itemStack.isItemEnchanted())
        {
            NBTTagCompound nbtcompound = itemStack.getTagCompound();
            returnItem.setTagCompound(nbtcompound);
        }
        return returnItem;
    }
}
