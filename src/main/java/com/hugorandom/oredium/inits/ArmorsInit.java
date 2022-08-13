package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.armors.Armor;
import com.hugorandom.oredium.armors.ArmorTier;
import com.hugorandom.oredium.armors.ArmorU;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorsInit {

    public static final DeferredRegister<Item> ARMORS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){ ARMORS.register(eventBus); };

    // Cascos - Helmets
    public static final RegistryObject<Item> SHINE_HELMET = ARMORS.register("shine_helmet",
            () -> new Armor(ArmorTier.SHINE, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> CABALLERITA_HELMET = ARMORS.register("caballerita_helmet",
            () -> new Armor(ArmorTier.CABALLERITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> AXIDITA_HELMET = ARMORS.register("axidita_helmet",
            () -> new Armor(ArmorTier.AXIDITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> CESARITA_HELMET = ARMORS.register("cesarita_helmet",
            () -> new Armor(ArmorTier.CESARITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> FRANITOLINA_HELMET = ARMORS.register("franitolina_helmet",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MELUNA_HELMET = ARMORS.register("meluna_helmet",
            () -> new Armor(ArmorTier.MELUNA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ENDERITA_HELMET = ARMORS.register("enderita_helmet",
            () -> new Armor(ArmorTier.ENDERITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ALEZARITA_HELMET = ARMORS.register("alezarita_helmet",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> HUGODIUM_HELMET = ARMORS.register("hugodium_helmet",
            () -> new Armor(ArmorTier.HUGODIUM, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MIGUELITIO_HELMET = ARMORS.register("miguelitio_helmet",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.HEAD));

    // Pecheras - Chestplate
    public static final RegistryObject<Item> SHINE_CHESTPLATE = ARMORS.register("shine_chestplate",
            () -> new Armor(ArmorTier.SHINE, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> CABALLERITA_CHESTPLATE = ARMORS.register("caballerita_chestplate",
            () -> new Armor(ArmorTier.CABALLERITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> AXIDITA_CHESTPLATE = ARMORS.register("axidita_chestplate",
            () -> new Armor(ArmorTier.AXIDITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> CESARITA_CHESTPLATE = ARMORS.register("cesarita_chestplate",
            () -> new Armor(ArmorTier.CESARITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> FRANITOLINA_CHESTPLATE = ARMORS.register("franitolina_chestplate",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MELUNA_CHESTPLATE = ARMORS.register("meluna_chestplate",
            () -> new Armor(ArmorTier.MELUNA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ENDERITA_CHESTPLATE = ARMORS.register("enderita_chestplate",
            () -> new Armor(ArmorTier.ENDERITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ALEZARITA_CHESTPLATE = ARMORS.register("alezarita_chestplate",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> HUGODIUM_CHESTPLATE = ARMORS.register("hugodium_chestplate",
            () -> new Armor(ArmorTier.HUGODIUM, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MIGUELITIO_CHESTPLATE = ARMORS.register("miguelitio_chestplate",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.CHEST));

    // Pantalones - Leggings

    public static final RegistryObject<Item> SHINE_LEGGINGS = ARMORS.register("shine_leggings",
            () -> new Armor(ArmorTier.SHINE, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> CABALLERITA_LEGGINGS = ARMORS.register("caballerita_leggings",
            () -> new Armor(ArmorTier.CABALLERITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> AXIDITA_LEGGINGS = ARMORS.register("axidita_leggings",
            () -> new Armor(ArmorTier.AXIDITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> CESARITA_LEGGINGS = ARMORS.register("cesarita_leggings",
            () -> new Armor(ArmorTier.CESARITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> FRANITOLINA_LEGGINGS = ARMORS.register("franitolina_leggings",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MELUNA_LEGGINGS = ARMORS.register("meluna_leggings",
            () -> new Armor(ArmorTier.MELUNA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ENDERITA_LEGGINGS = ARMORS.register("enderita_leggings",
            () -> new Armor(ArmorTier.ENDERITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ALEZARITA_LEGGINGS = ARMORS.register("alezarita_leggings",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> HUGODIUM_LEGGINGS = ARMORS.register("hugodium_leggings",
            () -> new Armor(ArmorTier.HUGODIUM, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MIGUELITIO_LEGGINGS = ARMORS.register("miguelitio_leggings",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.LEGS));

    // Botas - Boots
    public static final RegistryObject<Item> SHINE_BOOTS = ARMORS.register("shine_boots",
            () -> new Armor(ArmorTier.SHINE, EquipmentSlot.FEET));
    public static final RegistryObject<Item> CABALLERITA_BOOTS = ARMORS.register("caballerita_boots",
            () -> new Armor(ArmorTier.CABALLERITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> AXIDITA_BOOTS = ARMORS.register("axidita_boots",
            () -> new Armor(ArmorTier.AXIDITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> CESARITA_BOOTS = ARMORS.register("cesarita_boots",
            () -> new Armor(ArmorTier.CESARITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> FRANITOLINA_BOOTS = ARMORS.register("franitolina_boots",
            () -> new Armor(ArmorTier.FRANITOLINA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MELUNA_BOOTS = ARMORS.register("meluna_boots",
            () -> new Armor(ArmorTier.MELUNA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ENDERITA_BOOTS = ARMORS.register("enderita_boots",
            () -> new Armor(ArmorTier.ENDERITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ALEZARITA_BOOTS = ARMORS.register("alezarita_boots",
            () -> new Armor(ArmorTier.ALEZARITA, EquipmentSlot.FEET));
    public static final RegistryObject<Item> HUGODIUM_BOOTS = ARMORS.register("hugodium_boots",
            () -> new Armor(ArmorTier.HUGODIUM, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MIGUELITIO_BOOTS = ARMORS.register("miguelitio_boots",
            () -> new Armor(ArmorTier.MIGUELITIO, EquipmentSlot.FEET));

    // Cascos mejorados - Helmets upgraded
    public static final RegistryObject<Item> SHINE_HELMET_UPGRADED = ARMORS.register("shine_helmet_upgraded",
            () -> new ArmorU(ArmorTier.SHINE_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> CABALLERITA_HELMET_UPGRADED = ARMORS.register("caballerita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.CABALLERITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> AXIDITA_HELMET_UPGRADED = ARMORS.register("axidita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.AXIDITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> CESARITA_HELMET_UPGRADED = ARMORS.register("cesarita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.CESARITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> FRANITOLINA_HELMET_UPGRADED = ARMORS.register("franitolina_helmet_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MELUNA_HELMET_UPGRADED = ARMORS.register("meluna_helmet_upgraded",
            () -> new ArmorU(ArmorTier.MELUNA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ENDERITA_HELMET_UPGRADED = ARMORS.register("enderita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.ENDERITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> ALEZARITA_HELMET_UPGRADED = ARMORS.register("alezarita_helmet_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> HUGODIUM_HELMET_UPGRADED = ARMORS.register("hugodium_helmet_upgraded",
            () -> new ArmorU(ArmorTier.HUGODIUM_UPGRADED, EquipmentSlot.HEAD));
    public static final RegistryObject<Item> MIGUELITIO_HELMET_UPGRADED = ARMORS.register("miguelitio_helmet_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.HEAD));

    // Pecheras Mejoradas - Chestplate upgraded
    public static final RegistryObject<Item> SHINE_CHESTPLATE_UPGRADED = ARMORS.register("shine_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.SHINE_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> CABALLERITA_CHESTPLATE_UPGRADED = ARMORS.register("caballerita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.CABALLERITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> AXIDITA_CHESTPLATE_UPGRADED = ARMORS.register("axidita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.AXIDITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> CESARITA_CHESTPLATE_UPGRADED = ARMORS.register("cesarita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.CESARITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> FRANITOLINA_CHESTPLATE_UPGRADED = ARMORS.register("franitolina_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MELUNA_CHESTPLATE_UPGRADED = ARMORS.register("meluna_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.MELUNA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ENDERITA_CHESTPLATE_UPGRADED = ARMORS.register("enderita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.ENDERITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> ALEZARITA_CHESTPLATE_UPGRADED = ARMORS.register("alezarita_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> HUGODIUM_CHESTPLATE_UPGRADED = ARMORS.register("hugodium_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.HUGODIUM_UPGRADED, EquipmentSlot.CHEST));
    public static final RegistryObject<Item> MIGUELITIO_CHESTPLATE_UPGRADED = ARMORS.register("miguelitio_chestplate_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.CHEST));

    // Pantalones Mejorados - Leggings upgraded

    public static final RegistryObject<Item> SHINE_LEGGINGS_UPGRADED = ARMORS.register("shine_leggings_upgraded",
            () -> new ArmorU(ArmorTier.SHINE_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> CABALLERITA_LEGGINGS_UPGRADED = ARMORS.register("caballerita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.CABALLERITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> AXIDITA_LEGGINGS_UPGRADED = ARMORS.register("axidita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.AXIDITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> CESARITA_LEGGINGS_UPGRADED = ARMORS.register("cesarita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.CESARITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> FRANITOLINA_LEGGINGS_UPGRADED = ARMORS.register("franitolina_leggings_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MELUNA_LEGGINGS_UPGRADED = ARMORS.register("meluna_leggings_upgraded",
            () -> new ArmorU(ArmorTier.MELUNA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ENDERITA_LEGGINGS_UPGRADED = ARMORS.register("enderita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.ENDERITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> ALEZARITA_LEGGINGS_UPGRADED = ARMORS.register("alezarita_leggings_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> HUGODIUM_LEGGINGS_UPGRADED = ARMORS.register("hugodium_leggings_upgraded",
            () -> new ArmorU(ArmorTier.HUGODIUM_UPGRADED, EquipmentSlot.LEGS));
    public static final RegistryObject<Item> MIGUELITIO_LEGGINGS_UPGRADED = ARMORS.register("miguelitio_leggings_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.LEGS));

    // Botas Mejoradas - Boots upgraded
    public static final RegistryObject<Item> SHINE_BOOTS_UPGRADED = ARMORS.register("shine_boots_upgraded",
            () -> new ArmorU(ArmorTier.SHINE_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> CABALLERITA_BOOTS_UPGRADED = ARMORS.register("caballerita_boots_upgraded",
            () -> new ArmorU(ArmorTier.CABALLERITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> AXIDITA_BOOTS_UPGRADED = ARMORS.register("axidita_boots_upgraded",
            () -> new ArmorU(ArmorTier.AXIDITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> CESARITA_BOOTS_UPGRADED = ARMORS.register("cesarita_boots_upgraded",
            () -> new ArmorU(ArmorTier.CESARITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> FRANITOLINA_BOOTS_UPGRADED = ARMORS.register("franitolina_boots_upgraded",
            () -> new ArmorU(ArmorTier.FRANITOLINA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MELUNA_BOOTS_UPGRADED = ARMORS.register("meluna_boots_upgraded",
            () -> new ArmorU(ArmorTier.MELUNA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ENDERITA_BOOTS_UPGRADED = ARMORS.register("enderita_boots_upgraded",
            () -> new ArmorU(ArmorTier.ENDERITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> ALEZARITA_BOOTS_UPGRADED = ARMORS.register("alezarita_boots_upgraded",
            () -> new ArmorU(ArmorTier.ALEZARITA_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> HUGODIUM_BOOTS_UPGRADED = ARMORS.register("hugodium_boots_upgraded",
            () -> new ArmorU(ArmorTier.HUGODIUM_UPGRADED, EquipmentSlot.FEET));
    public static final RegistryObject<Item> MIGUELITIO_BOOTS_UPGRADED = ARMORS.register("miguelitio_boots_upgraded",
            () -> new ArmorU(ArmorTier.MIGUELITIO_UPGRADED, EquipmentSlot.FEET));
}
