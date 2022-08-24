package com.hugorandom.oredium.init;

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

    // Comidas iniciales
    public static final RegistryObject<Item> SHINE_CUPCAKE = FOODS.register("shine_cupcake",
            ShineCupcake::new);
    public static final RegistryObject<Item> CABALLERITA_CAKE = FOODS.register("caballerita_cake",
            CaballeritaCake::new);
    public static final RegistryObject<Item> CLORETS = FOODS.register("clorets",
            Clorets::new);
    public static final RegistryObject<Item> BLUE_CLORETS = FOODS.register("blue_clorets",
            BlueClorets::new);
    public static final RegistryObject<Item> FRAOPU = FOODS.register("fraopu",
            Fraopu::new);
    public static final RegistryObject<Item> ENDERITA_APPLE = FOODS.register("enderita_apple", () ->
            new Apples(MobEffects.REGENERATION, 300, 2));
    public static final RegistryObject<Item> ALEZARITA_CHICKEN = FOODS.register("alezarita_chicken",
            AlezaritaChicken::new);
    public static final RegistryObject<Item> HUGODIUM_SMOOTHIE = FOODS.register("hugodium_smoothie",
            HugodiumSmoothie::new);
    public static final RegistryObject<Item> PEPENNE = FOODS.register("pepenne",
            Pepenne::new);


    // Pildoras normales
    public static final RegistryObject<Item> BLANK_PILL = FOODS.register("blank_pill", ()->
            new Pill(MobEffects.HUNGER, 600, 0));
    public static final RegistryObject<Item> SHINE_PILL = FOODS.register("shine_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> CABALLERITA_PILL = FOODS.register("caballerita_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> AXIDITA_PILL = FOODS.register("axidita_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> CESARITA_PILL = FOODS.register("cesarita_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> FRANITOLINA_PILL = FOODS.register("franitolina_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> MELUNA_PILL = FOODS.register("meluna_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> ENDERITA_PILL = FOODS.register("enderita_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> ALEZARITA_PILL = FOODS.register("alezarita_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> HUGODIUM_PILL = FOODS.register("hugodium_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));
    public static final RegistryObject<Item> MIGUELITIO_PILL = FOODS.register("miguelitio_pill", ()->
            new Pill(MobEffects.GLOWING, 1200, 0));

    // Pildoras fuertes
    public static final RegistryObject<Item> A12_PILL = FOODS.register("a12_pill", ()->
            new PillDoble(MobEffects.MOVEMENT_SPEED, 1200, 1));
    public static final RegistryObject<Item> B32_PILL = FOODS.register("b32_pill", ()->
            new PillDoble(MobEffects.ABSORPTION, 600, 0));
    public static final RegistryObject<Item> C42_PILL = FOODS.register("c42_pill", ()->
            new PillDoble(MobEffects.FIRE_RESISTANCE, 1200, 0));
    public static final RegistryObject<Item> D13_PILL = FOODS.register("d13_pill", ()->
            new PillDoble(MobEffects.NIGHT_VISION, 1200, 0));
    public static final RegistryObject<Item> L7_PILL = FOODS.register("l7_pill", ()->
            new PillDoble(MobEffects.LUCK, 2400, 1));
    public static final RegistryObject<Item> I12_PILL = FOODS.register("i12_pill", ()->
            new PillDoble(MobEffects.SATURATION, 600, 0));
    public static final RegistryObject<Item> E4_PILL = FOODS.register("e4_pill", ()->
            new PillDoble(MobEffects.DAMAGE_RESISTANCE, 600, 1));
    public static final RegistryObject<Item> A24_PILL = FOODS.register("a24_pill", ()->
            new PillDoble(MobEffects.WATER_BREATHING, 1200, 0));
    public static final RegistryObject<Item> F50_PILL = FOODS.register("f50_pill", ()->
            new PillDoble(MobEffects.DIG_SPEED, 600, 1));
    public static final RegistryObject<Item> P2_PILL = FOODS.register("p2_pill", ()->
            new PillDoble(MobEffects.DOLPHINS_GRACE, 1200, 0));
    public static final RegistryObject<Item> GOLDEN_PILL = FOODS.register("golden_pill", ()->
            new PillDoble(MobEffects.REGENERATION, 600, 0));
    public static final RegistryObject<Item> RANDOM_PILL = FOODS.register("random_pill", ()->
            new PillRandom(MobEffects.GLOWING, 600, 0));
    public static final RegistryObject<Item> OREDIUM_PILL = FOODS.register("oredium_pill", ()->
            new PillDoble(MobEffects.POISON, 600, 0));
}