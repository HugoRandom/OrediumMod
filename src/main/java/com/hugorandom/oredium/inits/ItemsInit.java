package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.GemItem;
import com.hugorandom.oredium.items.CommonItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // Lingotes - Ingots
    public static final RegistryObject<Item> SHINE_INGOT = ITEMS.register("shine_ingot", CommonItem::new);
    public static final RegistryObject<Item> CABALLERITA_INGOT = ITEMS.register("caballerita_ingot", CommonItem::new);
    public static final RegistryObject<Item> AXIDITA_INGOT = ITEMS.register("axidita_ingot", CommonItem::new);
    public static final RegistryObject<Item> CESARITA_INGOT = ITEMS.register("cesarita_ingot", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_INGOT = ITEMS.register("franitolina_ingot", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_INGOT = ITEMS.register("meluna_ingot", CommonItem::new);
    public static final RegistryObject<Item> ENDERITA_INGOT = ITEMS.register("enderita_ingot", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_INGOT = ITEMS.register("alezarita_ingot", CommonItem::new);
    public static final RegistryObject<Item> HUGODIUM_INGOT = ITEMS.register("hugodium_ingot", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_INGOT = ITEMS.register("miguelitio_ingot", CommonItem::new);

    // Pepitas
    public static final RegistryObject<Item> SHINE_NUGGET = ITEMS.register("shine_nugget", CommonItem::new);
    public static final RegistryObject<Item> CABALLERITA_NUGGET = ITEMS.register("caballerita_nugget", CommonItem::new);
    public static final RegistryObject<Item> AXIDITA_NUGGET = ITEMS.register("axidita_nugget", CommonItem::new);
    public static final RegistryObject<Item> CESARITA_NUGGET = ITEMS.register("cesarita_nugget", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_NUGGET = ITEMS.register("franitolina_nugget", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_NUGGET = ITEMS.register("meluna_nugget", CommonItem::new);
    public static final RegistryObject<Item> ENDERITA_NUGGET = ITEMS.register("enderita_nugget", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_NUGGET = ITEMS.register("alezarita_nugget", CommonItem::new);
    public static final RegistryObject<Item> HUGODIUM_NUGGET = ITEMS.register("hugodium_nugget", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_NUGGET = ITEMS.register("miguelitio_nugget", CommonItem::new);

    // Mineral en Bruto - RAW
    public static final RegistryObject<Item> RAW_SHINE = ITEMS.register("raw_shine", CommonItem::new);
    public static final RegistryObject<Item> RAW_CABALLERITA = ITEMS.register("raw_caballerita", CommonItem::new);
    public static final RegistryObject<Item> RAW_AXIDITA = ITEMS.register("raw_axidita", CommonItem::new);
    public static final RegistryObject<Item> RAW_CESARITA = ITEMS.register("raw_cesarita", CommonItem::new);
    public static final RegistryObject<Item> RAW_FRANITOLINA = ITEMS.register("raw_franitolina", CommonItem::new);
    public static final RegistryObject<Item> RAW_ENDERITA = ITEMS.register("raw_enderita", CommonItem::new);
    public static final RegistryObject<Item> RAW_ALEZARITA = ITEMS.register("raw_alezarita", CommonItem::new);
    public static final RegistryObject<Item> RAW_HUGODIUM = ITEMS.register("raw_hugodium", CommonItem::new);
    public static final RegistryObject<Item> RAW_MIGUELITIO = ITEMS.register("raw_miguelitio", CommonItem::new);

    // Polvos No españoles
    public static final RegistryObject<Item> SHINE_DUST = ITEMS.register("shine_dust", CommonItem::new);
    public static final RegistryObject<Item> CABALLERITA_DUST = ITEMS.register("caballerita_dust", CommonItem::new);
    public static final RegistryObject<Item> AXIDITA_DUST = ITEMS.register("axidita_dust", CommonItem::new);
    public static final RegistryObject<Item> CESARITA_DUST = ITEMS.register("cesarita_dust", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_DUST = ITEMS.register("franitolina_dust", CommonItem::new);
    public static final RegistryObject<Item> MELUNA_DUST = ITEMS.register("meluna_dust", CommonItem::new);
    public static final RegistryObject<Item> ENDERITA_DUST = ITEMS.register("enderita_dust", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_DUST = ITEMS.register("alezarita_dust", CommonItem::new);
    public static final RegistryObject<Item> HUGODIUM_DUST = ITEMS.register("hugodium_dust", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_DUST = ITEMS.register("miguelitio_dust", CommonItem::new);

    // Gemas
    public static final RegistryObject<Item> SHINE_GEM = ITEMS.register("shine_gem", GemItem::new);
    public static final RegistryObject<Item> CABALLERITA_GEM = ITEMS.register("caballerita_gem", GemItem::new);
    public static final RegistryObject<Item> AXIDITA_GEM = ITEMS.register("axidita_gem", GemItem::new);
    public static final RegistryObject<Item> CESARITA_GEM = ITEMS.register("cesarita_gem", GemItem::new);
    public static final RegistryObject<Item> FRANITOLINA_GEM = ITEMS.register("franitolina_gem", GemItem::new);
    public static final RegistryObject<Item> MELUNA_GEM = ITEMS.register("meluna_gem", GemItem::new);
    public static final RegistryObject<Item> ENDERITA_GEM = ITEMS.register("enderita_gem", GemItem::new);
    public static final RegistryObject<Item> ALEZARITA_GEM = ITEMS.register("alezarita_gem", GemItem::new);
    public static final RegistryObject<Item> HUGODIUM_GEM = ITEMS.register("hugodium_gem", GemItem::new);
    public static final RegistryObject<Item> MIGUELITIO_GEM = ITEMS.register("miguelitio_gem", GemItem::new);




}
