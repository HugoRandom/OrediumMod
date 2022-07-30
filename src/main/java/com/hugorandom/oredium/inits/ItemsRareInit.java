package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.items.AmuletItem;
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

public class ItemsRareInit {
    public static final DeferredRegister<Item> ITEMSRARE = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMSRARE.register(eventBus);
    }

    // Cubetas - Buckets
    public static final RegistryObject<Item> SHINE_BUCKET = ITEMSRARE.register("shine_bucket",
            () -> new BucketItem(FluidsInit.SHINE_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CABALLERITA_BUCKET = ITEMSRARE.register("caballerita_bucket",
            () -> new BucketItem(FluidsInit.CABALLERITA_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> AXIDITA_BUCKET = ITEMSRARE.register("axidita_bucket",
            () -> new BucketItem(FluidsInit.AXIDITA_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CESARITA_BUCKET = ITEMSRARE.register("cesarita_bucket",
            () -> new BucketItem(FluidsInit.CESARITA_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> FRANITOLINA_BUCKET = ITEMSRARE.register("franitolina_bucket",
            () -> new BucketItem(FluidsInit.FRANITOLINA_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ENDERIUM_BUCKET = ITEMSRARE.register("enderium_bucket",
            () -> new BucketItem(FluidsInit.ENDERIUM_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ALEZARITA_BUCKET = ITEMSRARE.register("alezarita_bucket",
            () -> new BucketItem(FluidsInit.ALEZARITA_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> HUGODIUM_BUCKET = ITEMSRARE.register("hugodium_bucket",
            () -> new BucketItem(FluidsInit.HUGODIUM_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MIGUELITIO_BUCKET = ITEMSRARE.register("miguelitio_bucket",
            () -> new BucketItem(FluidsInit.MIGUELITIO_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));
        public static final RegistryObject<Item> INFERNUM_BUCKET = ITEMSRARE.register("infernum_bucket",
            () -> new BucketItem(FluidsInit.INFERNUM_FLUID,
                    new Item.Properties().tab(ItemGroupTabs.OREDIUM_ITEMS).stacksTo(1)
                            .craftRemainder(Items.BUCKET).rarity(Rarity.UNCOMMON)));

    // Especiales - Specials
    public static final RegistryObject<Item> UMC = ITEMSRARE.register("umc", UMCItem::new);
    public static final RegistryObject<Item> OREDIUM_AMULET = ITEMSRARE.register("oredium_amulet", AmuletItem::new);
}
