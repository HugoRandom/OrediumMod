package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.DiscItem;
import com.hugorandom.oredium.items.GemItem;
import com.hugorandom.oredium.items.CommonItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.ObjectUtils;

import java.util.function.Supplier;

public class Items1Init {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus) {
        registerFullItems("disprosio", SoundsInit.DISPROSIO_DISC);
        registerFullItems("franitolina", SoundsInit.FRANITOLINA_DISC);
        registerFullItems("melitonila", SoundsInit.MELITONILA_DISC);
        registerFullItems("terium", SoundsInit.TERIUM_DISC);
        registerFullItems("alezarita", SoundsInit.ALEZARITA_DISC);
        registerFullItems("halinox", SoundsInit.HALINOX_DISC);
        registerFullItems("miguelitio", SoundsInit.MIGUELITIO_DISC);
        registerOreItems("tin");
        registerOreItems("lead");
        registerOreItems("silver");
        registerOreItems("nickel");
        registerNoOreItems("invar");
        registerNoOreItems("electrum");
        registerNoOreItems("constantan");
        registerDustItems("copper");
        registerDustItems("iron");
        registerDustItems("gold");
        registerDustItems("diamond");
        ITEMS.register(eventBus);
    }

    private static void registerFullItems(String prefix, Supplier<SoundEvent> pSound) {
        registerOreItems(prefix);
        ITEMS.register(prefix + "_gem", GemItem::new);
        ITEMS.register(prefix + "_disc", () -> new DiscItem(1, pSound));
    }

    private static void registerOreItems(String prefix) {
        registerNoOreItems(prefix);
        ITEMS.register("raw_" + prefix, CommonItem::new);
    }

    private static void registerNoOreItems(String prefix) {
        ITEMS.register(prefix + "_ingot", CommonItem::new);
        ITEMS.register(prefix + "_nugget", CommonItem::new);
        registerDustItems(prefix);
    }

    private static void registerDustItems(String prefix) {
        ITEMS.register(prefix + "_dust", CommonItem::new);
    }
}


