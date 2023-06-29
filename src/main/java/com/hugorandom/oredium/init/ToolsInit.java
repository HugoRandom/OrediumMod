package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.DiscItem;
import com.hugorandom.oredium.items.GemItem;
import com.hugorandom.oredium.tools.*;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ToolsInit {

    public static final DeferredRegister<Item> TOOLS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        registerFullTools("disprosio", ToolsTier.DISPROSIO);
        registerFullTools("franitolina", ToolsTier.FRANITOLINA);
        registerFullTools("melitonila", ToolsTier.MELITONILA);
        registerFullTools("terium", ToolsTier.TERIUM);
        registerFullTools("alezarita", ToolsTier.ALEZARITA);
        registerFullTools("halinox", ToolsTier.HALINOX);
        registerFullTools("miguelitio", ToolsTier.MIGUELITIO);
        TOOLS.register(eventBus);
    };

    private static void registerFullTools(String prefix, Tier tier) {
        TOOLS.register(prefix + "_sword", () -> new Sword(tier));
        TOOLS.register(prefix + "_pickaxe", () -> new PickAxe(tier));
        TOOLS.register(prefix + "_axe", () -> new Axe(tier));
        TOOLS.register(prefix + "_shovel", () -> new Shovel(tier));
        TOOLS.register(prefix + "_hoe", () -> new Hoe(tier));
        registerExtraTools(prefix, tier);
    }

    private static void registerExtraTools(String prefix, Tier tier){
        TOOLS.register(prefix + "_hammer", () -> new Hammer(tier, 3, 1, tier.getUses()*4));
    }
}
