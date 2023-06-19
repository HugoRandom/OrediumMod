package com.hugorandom.oredium.items;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
import java.util.Random;

public class MortarItem extends Item implements IForgeItem {
    public MortarItem(int durability) {
        super(new Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.COMMON)
                .stacksTo(1)
                .durability(durability));
    }
    @Override
    public void setDamage(ItemStack stack, int damage) {
        stack.getOrCreateTag().putInt("Damage", Math.max(0, damage));
    }
    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.hurt(1, new Random(), null)) return ItemStack.EMPTY;
        else return container;
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack)
    {
        return true;
    }

    public boolean isTool(ItemStack item)
    {
        return true;
    }
}
