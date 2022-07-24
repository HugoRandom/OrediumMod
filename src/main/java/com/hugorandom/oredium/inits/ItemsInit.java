package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.AmuletItem;
import com.hugorandom.oredium.items.GemItem;
import com.hugorandom.oredium.items.CommonItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // Lingotes
    public static final RegistryObject<Item> SHINE_INGOT = ITEMS.register("shine_ingot", CommonItem::new);
    public static final RegistryObject<Item> CABALLERITA_INGOT = ITEMS.register("caballerita_ingot", CommonItem::new);
    public static final RegistryObject<Item> AXIDITA_INGOT = ITEMS.register("axidita_ingot", CommonItem::new);
    public static final RegistryObject<Item> CESARITA_INGOT = ITEMS.register("cesarita_ingot", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_INGOT = ITEMS.register("franitolina_ingot", CommonItem::new);
    public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_INGOT = ITEMS.register("alezarita_ingot", CommonItem::new);
    public static final RegistryObject<Item> HUGODIUM_INGOT = ITEMS.register("hugodium_ingot", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_INGOT = ITEMS.register("miguelitio_ingot", CommonItem::new);

    // Pepitas
    public static final RegistryObject<Item> SHINE_NUGGET = ITEMS.register("shine_nugget", CommonItem::new);
    public static final RegistryObject<Item> CABALLERITA_NUGGET = ITEMS.register("caballerita_nugget", CommonItem::new);
    public static final RegistryObject<Item> AXIDITA_INUGGET = ITEMS.register("axidita_nugget", CommonItem::new);
    public static final RegistryObject<Item> CESARITA_NUGGET = ITEMS.register("cesarita_nugget", CommonItem::new);
    public static final RegistryObject<Item> FRANITOLINA_NUGGET = ITEMS.register("franitolina_nugget", CommonItem::new);
    public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", CommonItem::new);
    public static final RegistryObject<Item> ALEZARITA_NUGGET = ITEMS.register("alezarita_nugget", CommonItem::new);
    public static final RegistryObject<Item> HUGODIUM_NUGGET = ITEMS.register("hugodium_nugget", CommonItem::new);
    public static final RegistryObject<Item> MIGUELITIO_NUGGET = ITEMS.register("miguelitio_nugget", CommonItem::new);

    // Gemas
    public static final RegistryObject<Item> SHINE_GEM = ITEMS.register("shine_gem", GemItem::new);
    public static final RegistryObject<Item> CABALLERITA_GEM = ITEMS.register("caballerita_gem", GemItem::new);
    public static final RegistryObject<Item> AXIDITA_GEM = ITEMS.register("axidita_gem", GemItem::new);
    public static final RegistryObject<Item> CESARITA_GEM = ITEMS.register("cesarita_gem", GemItem::new);
    public static final RegistryObject<Item> FRANITOLINA_GEM = ITEMS.register("franitolina_gem", GemItem::new);
    public static final RegistryObject<Item> ENDERIUM_GEM = ITEMS.register("enderium_gem", GemItem::new);
    public static final RegistryObject<Item> ALEZARITA_GEM = ITEMS.register("alezarita_gem", GemItem::new);
    public static final RegistryObject<Item> HUGODIUM_GEM = ITEMS.register("hugodium_gem", GemItem::new);
    public static final RegistryObject<Item> MIGUELITIO_GEM = ITEMS.register("miguelitio_gem", GemItem::new);

    // Especiales
    public static final RegistryObject<Item> OREDIUM_AMULET = ITEMS.register("oredium_amulet", AmuletItem::new);


}
