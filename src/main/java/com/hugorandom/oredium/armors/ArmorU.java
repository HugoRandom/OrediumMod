package com.hugorandom.oredium.armors;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class ArmorU extends ArmorItem {
    public ArmorU(ArmorMaterial pMaterial, EquipmentSlot pSlot) {
        super(pMaterial, pSlot,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .rarity(Rarity.UNCOMMON)
                        .stacksTo(1)
                        .fireResistant());
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public int getEntityLifespan(ItemStack itemStack, Level level) {
        return 12000;
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
