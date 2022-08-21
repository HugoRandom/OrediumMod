package com.hugorandom.oredium.items;

import com.hugorandom.oredium.Oredium;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {

    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // Lingotes - Ingots
    public static final RegistryObject<net.minecraft.world.item.Item> SHINE_INGOT = ITEMS.register("shine_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CABALLERITA_INGOT = ITEMS.register("caballerita_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> AXIDITA_INGOT = ITEMS.register("axidita_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CESARITA_INGOT = ITEMS.register("cesarita_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_INGOT = ITEMS.register("franitolina_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELUNA_INGOT = ITEMS.register("meluna_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ENDERITA_INGOT = ITEMS.register("enderita_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_INGOT = ITEMS.register("alezarita_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HUGODIUM_INGOT = ITEMS.register("hugodium_ingot", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_INGOT = ITEMS.register("miguelitio_ingot", Item::new);

    // Pepitas
    public static final RegistryObject<net.minecraft.world.item.Item> SHINE_NUGGET = ITEMS.register("shine_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CABALLERITA_NUGGET = ITEMS.register("caballerita_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> AXIDITA_NUGGET = ITEMS.register("axidita_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CESARITA_NUGGET = ITEMS.register("cesarita_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_NUGGET = ITEMS.register("franitolina_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELUNA_NUGGET = ITEMS.register("meluna_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ENDERITA_NUGGET = ITEMS.register("enderita_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_NUGGET = ITEMS.register("alezarita_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HUGODIUM_NUGGET = ITEMS.register("hugodium_nugget", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_NUGGET = ITEMS.register("miguelitio_nugget", Item::new);

    // Mineral en Bruto - RAW
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_SHINE = ITEMS.register("raw_shine", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_CABALLERITA = ITEMS.register("raw_caballerita", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_AXIDITA = ITEMS.register("raw_axidita", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_CESARITA = ITEMS.register("raw_cesarita", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_FRANITOLINA = ITEMS.register("raw_franitolina", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_ENDERITA = ITEMS.register("raw_enderita", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_ALEZARITA = ITEMS.register("raw_alezarita", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_HUGODIUM = ITEMS.register("raw_hugodium", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_MIGUELITIO = ITEMS.register("raw_miguelitio", Item::new);

    // Polvos No españoles
    public static final RegistryObject<net.minecraft.world.item.Item> SHINE_DUST = ITEMS.register("shine_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CABALLERITA_DUST = ITEMS.register("caballerita_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> AXIDITA_DUST = ITEMS.register("axidita_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CESARITA_DUST = ITEMS.register("cesarita_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_DUST = ITEMS.register("franitolina_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELUNA_DUST = ITEMS.register("meluna_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ENDERITA_DUST = ITEMS.register("enderita_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_DUST = ITEMS.register("alezarita_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HUGODIUM_DUST = ITEMS.register("hugodium_dust", Item::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_DUST = ITEMS.register("miguelitio_dust", Item::new);

    // Gemas
    public static final RegistryObject<net.minecraft.world.item.Item> SHINE_GEM = ITEMS.register("shine_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CABALLERITA_GEM = ITEMS.register("caballerita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> AXIDITA_GEM = ITEMS.register("axidita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> CESARITA_GEM = ITEMS.register("cesarita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_GEM = ITEMS.register("franitolina_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELUNA_GEM = ITEMS.register("meluna_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ENDERITA_GEM = ITEMS.register("enderita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_GEM = ITEMS.register("alezarita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HUGODIUM_GEM = ITEMS.register("hugodium_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_GEM = ITEMS.register("miguelitio_gem", GemItem::new);




}
