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
    public static final DeferredRegister<Item> ITEMSRARE = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMSRARE.register(eventBus);
    }

    // Cubetas - Buckets
    public static final RegistryObject<Item> SHINE_BUCKET = ITEMSRARE.register("shine_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_SHINE,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CABALLERITA_BUCKET = ITEMSRARE.register("caballerita_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_CABALLERITA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> AXIDITA_BUCKET = ITEMSRARE.register("axidita_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_AXIDITA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CESARITA_BUCKET = ITEMSRARE.register("cesarita_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_CESARITA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> FRANITOLINA_BUCKET = ITEMSRARE.register("franitolina_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_FRANITOLINA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MELUNA_BUCKET = ITEMSRARE.register("meluna_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_MELUNA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ENDERITA_BUCKET = ITEMSRARE.register("enderita_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_ENDERITA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALEZARITA_BUCKET = ITEMSRARE.register("alezarita_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_ALEZARITA,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> HUGODIUM_BUCKET = ITEMSRARE.register("hugodium_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_HUGODIUM,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MIGUELITIO_BUCKET = ITEMSRARE.register("miguelitio_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_MIGUELITIO,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
        public static final RegistryObject<Item> INFERNUM_BUCKET = ITEMSRARE.register("infernum_bucket",
            () -> new BucketItem(FluidsInit.MOLTEN_INFERNUM,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));

    // Especiales - Specials
    public static final RegistryObject<Item> UMC = ITEMSRARE.register("umc",
            UMCItem::new);
    public static final RegistryObject<Item> OREDIUM_AMULET = ITEMSRARE.register("oredium_amulet",
            AmuletItem::new);

    public static final RegistryObject<Item> DIMENSIONAL_RESONATOR = ITEMSRARE.register("dimensional_resonator",
            TeleporterItem::new);
}
