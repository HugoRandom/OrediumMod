package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.Normal;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

    // Objetos de Alex Soto: "ALEZARITA"
    public static final RegistryObject<Item> ALEZARITA_INGOT = ITEMS.register("alezarita_ingot", Normal::new);
    public static final RegistryObject<Item> ALEZARITA_NUGGET = ITEMS.register("alezarita_nugget", Normal::new);

    // REGISTER - NO TOCAR
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
