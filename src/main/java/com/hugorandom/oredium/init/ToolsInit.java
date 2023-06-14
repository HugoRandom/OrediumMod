package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.tools.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolsInit {

    public static final DeferredRegister<Item> TOOLS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){ TOOLS.register(eventBus); };

    // Espadas - Swords
    public static final RegistryObject<Item> DISPROSIO_SWORD = TOOLS.register("disprosio_sword",
            () -> new Sword(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_SWORD = TOOLS.register("franitolina_sword",
            () -> new Sword(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELITONILA_SWORD = TOOLS.register("melitonila_sword",
            () -> new Sword(ToolsTier.MELITONILA));
    public static final RegistryObject<Item> TERIUM_SWORD = TOOLS.register("terium_sword",
            () -> new Sword(ToolsTier.TERIUM));
    public static final RegistryObject<Item> ALEZARITA_SWORD = TOOLS.register("alezarita_sword",
            () -> new Sword(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALINOX_SWORD = TOOLS.register("halinox_sword",
            () -> new Sword(ToolsTier.HALINOX));
    public static final RegistryObject<Item> MIGUELITIO_SWORD = TOOLS.register("miguelitio_sword",
            () -> new Sword(ToolsTier.MIGUELITIO));

    // Picos - Pickaxes
    public static final RegistryObject<Item> DISPROSIO_PICKAXE = TOOLS.register("disprosio_pickaxe",
            () -> new PickAxe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_PICKAXE = TOOLS.register("franitolina_pickaxe",
            () -> new PickAxe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELITONILA_PICKAXE = TOOLS.register("melitonila_pickaxe",
            () -> new PickAxe(ToolsTier.MELITONILA));
    public static final RegistryObject<Item> TERIUM_PICKAXE = TOOLS.register("terium_pickaxe",
            () -> new PickAxe(ToolsTier.TERIUM));
    public static final RegistryObject<Item> ALEZARITA_PICKAXE = TOOLS.register("alezarita_pickaxe",
            () -> new PickAxe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALINOX_PICKAXE = TOOLS.register("halinox_pickaxe",
            () -> new PickAxe(ToolsTier.HALINOX));
    public static final RegistryObject<Item> MIGUELITIO_PICKAXE = TOOLS.register("miguelitio_pickaxe",
            () -> new PickAxe(ToolsTier.MIGUELITIO));

    // Hachas - Axes
    public static final RegistryObject<Item> DISPROSIO_AXE = TOOLS.register("disprosio_axe",
            () -> new Axe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_AXE = TOOLS.register("franitolina_axe",
            () -> new Axe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELITONILA_AXE = TOOLS.register("melitonila_axe",
            () -> new Axe(ToolsTier.MELITONILA));
    public static final RegistryObject<Item> TERIUM_AXE = TOOLS.register("terium_axe",
            () -> new Axe(ToolsTier.TERIUM));
    public static final RegistryObject<Item> ALEZARITA_AXE = TOOLS.register("alezarita_axe",
            () -> new Axe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALINOX_AXE = TOOLS.register("halinox_axe",
            () -> new Axe(ToolsTier.HALINOX));
    public static final RegistryObject<Item> MIGUELITIO_AXE = TOOLS.register("miguelitio_axe",
            () -> new Axe(ToolsTier.MIGUELITIO));

    // Palas - Shovels
    public static final RegistryObject<Item> DISPROSIO_SHOVEL = TOOLS.register("disprosio_shovel",
            () -> new Shovel(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_SHOVEL = TOOLS.register("franitolina_shovel",
            () -> new Shovel(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELITONILA_SHOVEL = TOOLS.register("melitonila_shovel",
            () -> new Shovel(ToolsTier.MELITONILA));
    public static final RegistryObject<Item> TERIUM_SHOVEL = TOOLS.register("terium_shovel",
            () -> new Shovel(ToolsTier.TERIUM));
    public static final RegistryObject<Item> ALEZARITA_SHOVEL = TOOLS.register("alezarita_shovel",
            () -> new Shovel(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALINOX_SHOVEL = TOOLS.register("halinox_shovel",
            () -> new Shovel(ToolsTier.HALINOX));
    public static final RegistryObject<Item> MIGUELITIO_SHOVEL = TOOLS.register("miguelitio_shovel",
            () -> new Shovel(ToolsTier.MIGUELITIO));

    // Azadas - Hoes
    public static final RegistryObject<Item> DISPROSIO_HOE = TOOLS.register("disprosio_hoe",
            () -> new Hoe(ToolsTier.DISPROSIO));
    public static final RegistryObject<Item> FRANITOLINA_HOE = TOOLS.register("franitolina_hoe",
            () -> new Hoe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> MELITONILA_HOE = TOOLS.register("melitonila_hoe",
            () -> new Hoe(ToolsTier.MELITONILA));
    public static final RegistryObject<Item> TERIUM_HOE = TOOLS.register("terium_hoe",
            () -> new Hoe(ToolsTier.TERIUM));
    public static final RegistryObject<Item> ALEZARITA_HOE = TOOLS.register("alezarita_hoe",
            () -> new Hoe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HALINOX_HOE = TOOLS.register("halinox_hoe",
            () -> new Hoe(ToolsTier.HALINOX));
    public static final RegistryObject<Item> MIGUELITIO_HOE = TOOLS.register("miguelitio_hoe",
            () -> new Hoe(ToolsTier.MIGUELITIO));
}
