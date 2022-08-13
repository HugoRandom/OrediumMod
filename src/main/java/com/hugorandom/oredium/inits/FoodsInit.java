package com.hugorandom.oredium.inits;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.foods.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodsInit {

    public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
    public static void register(IEventBus eventBus){
        FOODS.register(eventBus);
    }

    public static final RegistryObject<Item> SHINE_CUPCAKE = FOODS.register("shine_cupcake", ShineCupcake::new);
    public static final RegistryObject<Item> CABALLERITA_CAKE = FOODS.register("caballerita_cake", CaballeritaCake::new);
    public static final RegistryObject<Item> CLORETS = FOODS.register("clorets", Clorets::new);
    public static final RegistryObject<Item> BLUE_CLORETS = FOODS.register("blue_clorets", BlueClorets::new);
    public static final RegistryObject<Item> FRAOPU = FOODS.register("fraopu", Fraopu::new);
    public static final RegistryObject<Item> ENDERITA_APPLE = FOODS.register("enderita_apple",
            () -> new Apples(MobEffects.REGENERATION, 300, 2));
    public static final RegistryObject<Item> ALEZARITA_CHICKEN = FOODS.register("alezarita_chicken", AlezaritaChicken::new);
    public static final RegistryObject<Item> HUGODIUM_SMOOTHIE = FOODS.register("hugodium_smoothie", HugodiumSmoothie::new);
    public static final RegistryObject<Item> PEPENNE = FOODS.register("pepenne", Pepenne::new);


}
