package com.hugorandom.oredium.armors;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.Items1Init;
import com.hugorandom.oredium.util.OrediumTags;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ArmorTier implements ArmorMaterial {
    
    // Armaduras Normaels - Standar Armors
    DISPROSIO("disprosio", 34, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F,
            () -> {return Ingredient.of(OrediumTags.Items.INGOTS_DISPROSIO); }),
    FRANITOLINA("franitolina", 35, new int[]{3, 6, 8, 3}, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.0F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_FRANITOLINA); }),
    MELITONILA("melitonila", 35, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.1F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_MELITONILA); }),
    TERIUM("terium", 36, new int[]{3, 6, 8, 3}, 18,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_TERIUM); }),
    ALEZARITA("alezarita", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 1.0F, 0.1F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_ALEZARITA); }),
    HALINOX("halinox", 38, new int[]{3, 6, 8, 3}, 12,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.1F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_HALINOX); }),
    MIGUELITIO("miguelitio", 39, new int[]{3, 6, 8, 3}, 10,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.2F,
            () -> {return Ingredient.of(OrediumTags.Items.INGOTS_MIGUELITIO); }),

    // Armaduras Mejoradas - Upgraded Armors
    DISPROSIO_UPGRADED("disprosio_u", 37, new int[]{4, 7, 9, 4}, 25,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.1F,
            () -> {return Ingredient.of(OrediumTags.Items.INGOTS_DISPROSIO); }),
    FRANITOLINA_UPGRADED("franitolina_u", 37, new int[]{4, 7, 9, 4}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.2F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_FRANITOLINA); }),
    MELITONILA_UPGRADED("melitonila_u", 38, new int[]{4, 7, 9, 4}, 18,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3.0F, 0.2F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_MELITONILA); }),
    TERIUM_UPGRADED("terium_u", 40, new int[]{4, 7, 9, 4}, 20,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_TERIUM); }),
    ALEZARITA_UPGRADED("alezarita_u", 40, new int[]{4, 7, 9, 4}, 18,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_ALEZARITA); }),
    HALINOX_UPGRADED("halinox_u", 40, new int[]{4, 7, 9, 4}, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_HALINOX); }),
    MIGUELITIO_UPGRADED("miguelitio_u", 40, new int[]{4, 7, 9, 4}, 12,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F,
            () -> { return Ingredient.of(OrediumTags.Items.INGOTS_MIGUELITIO); });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ArmorTier(String pName, int pDurabilityMultiplier, int[] pSlotProtections,
                      int pEnchantmentValue, SoundEvent pSound, float pToughness,
                      float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
        this.name = pName;
        this.durabilityMultiplier = pDurabilityMultiplier;
        this.slotProtections = pSlotProtections;
        this.enchantmentValue = pEnchantmentValue;
        this.sound = pSound;
        this.toughness = pToughness;
        this.knockbackResistance = pKnockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull SoundEvent getEquipSound() {
        return this.sound;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public @NotNull String getName() {
        return Oredium.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}