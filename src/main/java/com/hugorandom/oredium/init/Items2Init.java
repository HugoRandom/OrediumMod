package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.AmuletItem;
import com.hugorandom.oredium.items.TeleporterItem;
import com.hugorandom.oredium.items.UMCItem;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items2Init {
    public static final DeferredRegister<Item> ITEMSRARE =
            DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMSRARE.register(eventBus);
    }

    // Especiales - Specials
    public static final RegistryObject<Item> UMC =
            ITEMSRARE.register("umc", UMCItem::new);
    public static final RegistryObject<Item> OREDIUM_AMULET =
            ITEMSRARE.register("oredium_amulet", AmuletItem::new);
    public static final RegistryObject<Item> DIMENSIONAL_RESONATOR =
            ITEMSRARE.register("dimensional_resonator", TeleporterItem::new);
}
