package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.DiscItem;
import com.hugorandom.oredium.items.GemItem;
import com.hugorandom.oredium.items.CommonItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items1Init {

    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    // Lingotes - Ingots
    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_INGOT = 
            ITEMS.register("disprosio_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_INGOT = 
            ITEMS.register("franitolina_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_INGOT = 
            ITEMS.register("melitonila_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> TERIUM_INGOT = 
            ITEMS.register("terium_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_INGOT = 
            ITEMS.register("alezarita_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HALINOX_INGOT = 
            ITEMS.register("halinox_ingot", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_INGOT = 
            ITEMS.register("miguelitio_ingot", CommonItem::new);

    // Pepitas
    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_NUGGET = 
            ITEMS.register("disprosio_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_NUGGET = 
            ITEMS.register("franitolina_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_NUGGET = 
            ITEMS.register("melitonila_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> TERIUM_NUGGET = 
            ITEMS.register("terium_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_NUGGET = 
            ITEMS.register("alezarita_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HALINOX_NUGGET = 
            ITEMS.register("halinox_nugget", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_NUGGET = 
            ITEMS.register("miguelitio_nugget", CommonItem::new);

    // Mineral en Bruto - RAW
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_DISPROSIO = 
            ITEMS.register("raw_disprosio", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_FRANITOLINA = 
            ITEMS.register("raw_franitolina", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_MELITONILA = 
            ITEMS.register("raw_melitonila", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_TERIUM = 
            ITEMS.register("raw_terium", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_ALEZARITA = 
            ITEMS.register("raw_alezarita", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_HALINOX = 
            ITEMS.register("raw_halinox", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> RAW_MIGUELITIO = 
            ITEMS.register("raw_miguelitio", CommonItem::new);

    // Polvos No españoles
    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_DUST = 
            ITEMS.register("disprosio_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_DUST = 
            ITEMS.register("franitolina_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_DUST = 
            ITEMS.register("melitonila_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> TERIUM_DUST = 
            ITEMS.register("terium_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_DUST = 
            ITEMS.register("alezarita_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HALINOX_DUST = 
            ITEMS.register("halinox_dust", CommonItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_DUST = 
            ITEMS.register("miguelitio_dust", CommonItem::new);

    // Gemas
    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_GEM = 
            ITEMS.register("disprosio_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_GEM = 
            ITEMS.register("franitolina_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_GEM = 
            ITEMS.register("melitonila_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> TERIUM_GEM = 
            ITEMS.register("terium_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_GEM = 
            ITEMS.register("alezarita_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> HALINOX_GEM =
            ITEMS.register("halinox_gem", GemItem::new);
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_GEM = 
            ITEMS.register("miguelitio_gem", GemItem::new);
    
    // Discos  
    public static final RegistryObject<net.minecraft.world.item.Item> DISPROSIO_DISC = 
            ITEMS.register("disprosio_disc",
                    () -> new DiscItem(1, SoundsInit.DISPROSIO_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> FRANITOLINA_DISC = 
            ITEMS.register("franitolina_disc",
                () -> new DiscItem(1, SoundsInit.FRANITOLINA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> MELITONILA_DISC = 
            ITEMS.register("melitonila_disc",
                () -> new DiscItem(1, SoundsInit.MELITONILA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> TERIUM_DISC = 
            ITEMS.register("terium_disc",
                () -> new DiscItem(1, SoundsInit.TERIUM_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> ALEZARITA_DISC = 
            ITEMS.register("alezarita_disc",
                () -> new DiscItem(1, SoundsInit.ALEZARITA_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> HALINOX_DISC = 
            ITEMS.register("halinox_disc",
                () -> new DiscItem(1, SoundsInit.HALINOX_DISC));
    public static final RegistryObject<net.minecraft.world.item.Item> MIGUELITIO_DISC = 
            ITEMS.register("miguelitio_disc",
                () -> new DiscItem(1, SoundsInit.MIGUELITIO_DISC));
}
