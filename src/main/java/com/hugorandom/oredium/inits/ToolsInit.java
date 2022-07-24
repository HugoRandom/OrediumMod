package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.tools.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolsInit {

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){ TOOLS.register(eventBus); };

    // Espadas - Swords
    public static final RegistryObject<Item> SHINE_SWORD = TOOLS.register("shine_sword",
            () -> new Sword(ToolsTier.SHINE));
    public static final RegistryObject<Item> CABALLERITA_SWORD = TOOLS.register("caballerita_sword",
            () -> new Sword(ToolsTier.CABALLERITA));
    public static final RegistryObject<Item> AXIDITA_SWORD = TOOLS.register("axidita_sword",
            () -> new Sword(ToolsTier.AXIDITA));
    public static final RegistryObject<Item> CESARITA_SWORD = TOOLS.register("cesarita_sword",
            () -> new Sword(ToolsTier.CESARITA));
    public static final RegistryObject<Item> FRANITOLINA_SWORD = TOOLS.register("franitolina_sword",
            () -> new Sword(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> ENDERIUM_SWORD = TOOLS.register("enderium_sword",
            () -> new Sword(ToolsTier.ENDERIUM));
    public static final RegistryObject<Item> ALEZARITA_SWORD = TOOLS.register("alezarita_sword",
            () -> new Sword(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HUGODIUM_SWORD = TOOLS.register("hugodium_sword",
            () -> new Sword(ToolsTier.HUGODIUM));
    public static final RegistryObject<Item> MIGUELITIO_SWORD = TOOLS.register("miguelitio_sword",
            () -> new Sword(ToolsTier.MIGUELITIO));

    // Picos - Pickaxes
    public static final RegistryObject<Item> SHINE_PICKAXE = TOOLS.register("shine_pickaxe",
            () -> new PickAxe(ToolsTier.SHINE));
    public static final RegistryObject<Item> CABALLERITA_PICKAXE = TOOLS.register("caballerita_pickaxe",
            () -> new PickAxe(ToolsTier.CABALLERITA));
    public static final RegistryObject<Item> AXIDITA_PICKAXE = TOOLS.register("axidita_pickaxe",
            () -> new PickAxe(ToolsTier.AXIDITA));
    public static final RegistryObject<Item> CESARITA_PICKAXE = TOOLS.register("cesarita_pickaxe",
            () -> new PickAxe(ToolsTier.CESARITA));
    public static final RegistryObject<Item> FRANITOLINA_PICKAXE = TOOLS.register("franitolina_pickaxe",
            () -> new PickAxe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> ENDERIUM_PICKAXE = TOOLS.register("enderium_pickaxe",
            () -> new PickAxe(ToolsTier.ENDERIUM));
    public static final RegistryObject<Item> ALEZARITA_PICKAXE = TOOLS.register("alezarita_pickaxe",
            () -> new PickAxe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HUGODIUM_PICKAXE = TOOLS.register("hugodium_pickaxe",
            () -> new PickAxe(ToolsTier.HUGODIUM));
    public static final RegistryObject<Item> MIGUELITIO_PICKAXE = TOOLS.register("miguelitio_pickaxe",
            () -> new PickAxe(ToolsTier.MIGUELITIO));

    // Hachas - Axes
    public static final RegistryObject<Item> SHINE_AXE = TOOLS.register("shine_axe",
            () -> new Axe(ToolsTier.SHINE));
    public static final RegistryObject<Item> CABALLERITA_AXE = TOOLS.register("caballerita_axe",
            () -> new Axe(ToolsTier.CABALLERITA));
    public static final RegistryObject<Item> AXIDITA_AXE = TOOLS.register("axidita_axe",
            () -> new Axe(ToolsTier.AXIDITA));
    public static final RegistryObject<Item> CESARITA_AXE = TOOLS.register("cesarita_axe",
            () -> new Axe(ToolsTier.CESARITA));
    public static final RegistryObject<Item> FRANITOLINA_AXE = TOOLS.register("franitolina_axe",
            () -> new Axe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> ENDERIUM_AXE = TOOLS.register("enderium_axe",
            () -> new Axe(ToolsTier.ENDERIUM));
    public static final RegistryObject<Item> ALEZARITA_AXE = TOOLS.register("alezarita_axe",
            () -> new Axe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HUGODIUM_AXE = TOOLS.register("hugodium_axe",
            () -> new Axe(ToolsTier.HUGODIUM));
    public static final RegistryObject<Item> MIGUELITIO_AXE = TOOLS.register("miguelitio_axe",
            () -> new Axe(ToolsTier.MIGUELITIO));

    // Palas - Shovels
    public static final RegistryObject<Item> SHINE_SHOVEL = TOOLS.register("shine_shovel",
            () -> new Shovel(ToolsTier.SHINE));
    public static final RegistryObject<Item> CABALLERITA_SHOVEL = TOOLS.register("caballerita_shovel",
            () -> new Shovel(ToolsTier.CABALLERITA));
    public static final RegistryObject<Item> AXIDITA_SHOVEL = TOOLS.register("axidita_shovel",
            () -> new Shovel(ToolsTier.AXIDITA));
    public static final RegistryObject<Item> CESARITA_SHOVEL = TOOLS.register("cesarita_shovel",
            () -> new Shovel(ToolsTier.CESARITA));
    public static final RegistryObject<Item> FRANITOLINA_SHOVEL = TOOLS.register("franitolina_shovel",
            () -> new Shovel(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> ENDERIUM_SHOVEL = TOOLS.register("enderium_shovel",
            () -> new Shovel(ToolsTier.ENDERIUM));
    public static final RegistryObject<Item> ALEZARITA_SHOVEL = TOOLS.register("alezarita_shovel",
            () -> new Shovel(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HUGODIUM_SHOVEL = TOOLS.register("hugodium_shovel",
            () -> new Shovel(ToolsTier.HUGODIUM));
    public static final RegistryObject<Item> MIGUELITIO_SHOVEL = TOOLS.register("miguelitio_shovel",
            () -> new Shovel(ToolsTier.MIGUELITIO));

    // Azadas - Hoes
    public static final RegistryObject<Item> SHINE_HOE = TOOLS.register("shine_hoe",
            () -> new Hoe(ToolsTier.SHINE));
    public static final RegistryObject<Item> CABALLERITA_HOE = TOOLS.register("caballerita_hoe",
            () -> new Hoe(ToolsTier.CABALLERITA));
    public static final RegistryObject<Item> AXIDITA_HOE = TOOLS.register("axidita_hoe",
            () -> new Hoe(ToolsTier.AXIDITA));
    public static final RegistryObject<Item> CESARITA_HOE = TOOLS.register("cesarita_hoe",
            () -> new Hoe(ToolsTier.CESARITA));
    public static final RegistryObject<Item> FRANITOLINA_HOE = TOOLS.register("franitolina_hoe",
            () -> new Hoe(ToolsTier.FRANITOLINA));
    public static final RegistryObject<Item> ENDERIUM_HOE = TOOLS.register("enderium_hoe",
            () -> new Hoe(ToolsTier.ENDERIUM));
    public static final RegistryObject<Item> ALEZARITA_HOE = TOOLS.register("alezarita_hoe",
            () -> new Hoe(ToolsTier.ALEZARITA));
    public static final RegistryObject<Item> HUGODIUM_HOE = TOOLS.register("hugodium_hoe",
            () -> new Hoe(ToolsTier.HUGODIUM));
    public static final RegistryObject<Item> MIGUELITIO_HOE = TOOLS.register("miguelitio_hoe",
            () -> new Hoe(ToolsTier.MIGUELITIO));
}
