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
    public static final RegistryObject<Item> SHINE_CUPCAKE = FOODS.register("shine_cupcake", () ->
            new EffectFood(MobEffects.WATER_BREATHING, 600, 0, 8, 0.5f));
    public static final RegistryObject<Item> CABALLERITA_CAKE = FOODS.register("caballerita_cake",() ->
            new EffectFood(MobEffects.FIRE_RESISTANCE, 600, 0, 10, 0.6f));
    public static final RegistryObject<Item> CLORETS = FOODS.register("clorets",
            Clorets::new);
    public static final RegistryObject<Item> BLUE_CLORETS = FOODS.register("blue_clorets",
            Clorets::new);
    public static final RegistryObject<Item> FRAOPU = FOODS.register("fraopu",() ->
            new EffectFood(MobEffects.REGENERATION, 400, 0, 6, 1.0f));
    public static final RegistryObject<Item> ENDERITA_APPLE = FOODS.register("enderita_apple", () ->
            new Apples(MobEffects.REGENERATION, 300, 2));
    public static final RegistryObject<Item> ALEZARITA_CHICKEN = FOODS.register("alezarita_chicken",() ->
            new EffectFood(MobEffects.FIRE_RESISTANCE, 600, 0, 11, 0.9f));
    public static final RegistryObject<Item> HUGODIUM_SMOOTHIE = FOODS.register("hugodium_smoothie",
            Smoothie::new);
    public static final RegistryObject<Item> PEPENNE = FOODS.register("pepenne",
            Pepenne::new);


    // Pildoras normales
    public static final RegistryObject<Item> BLANK_PILL = FOODS.register("blank_pill", ()->
            new Pill(MobEffects.HUNGER, 600, 0));
    public static final RegistryObject<Item> SHINE_PILL = FOODS.register("shine_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> CABALLERITA_PILL = FOODS.register("caballerita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> AXIDITA_PILL = FOODS.register("axidita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> CESARITA_PILL = FOODS.register("cesarita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> FRANITOLINA_PILL = FOODS.register("franitolina_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> MELUNA_PILL = FOODS.register("meluna_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> ENDERITA_PILL = FOODS.register("enderita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> ALEZARITA_PILL = FOODS.register("alezarita_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> HUGODIUM_PILL = FOODS.register("hugodium_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));
    public static final RegistryObject<Item> MIGUELITIO_PILL = FOODS.register("miguelitio_pill", ()->
            new Pill(MobEffects.REGENERATION, 200, 0));

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

    // Cafes
    public static final RegistryObject<Item> COFFEE_CHEMICAL = FOODS.register("coffee_chemical", ()->
            new EffectFood(MobEffects.CONFUSION, 80, 0, 1, 0.1F));
    public static final RegistryObject<Item> COFFEE_CUP = FOODS.register("coffee_cup", ()->
            new EffectFood(MobEffects.POISON, 100, 0,1, 0.1F));
    public static final RegistryObject<Item> COFFEE_ESPRESSO = FOODS.register("coffee_espresso", ()->
            new Coffees(6, 0.5F));
    public static final RegistryObject<Item> COFFEE_AMERICANO = FOODS.register("coffee_americano", ()->
            new Coffees(7, 0.5F));
    public static final RegistryObject<Item> COFFEE_LATTE = FOODS.register("coffee_latte", ()->
            new Coffees(8, 0.6F));
    public static final RegistryObject<Item> COFFEE_LUNGO = FOODS.register("coffee_lungo", ()->
            new Coffees(8, 0.6F));
    public static final RegistryObject<Item> COFFEE_CAPPUCCINO = FOODS.register("coffee_cappuccino", ()->
            new Coffees(9, 0.6F));
    public static final RegistryObject<Item> COFFEE_BOMBON = FOODS.register("coffee_bombon", ()->
            new Coffees(6, 0.8F));
    public static final RegistryObject<Item> COFFEE_CAFELECHE = FOODS.register("coffee_cafeleche", ()->
            new Coffees(7, 0.6F));
    public static final RegistryObject<Item> COFFEE_IRISH = FOODS.register("coffee_irish", ()->
            new Coffees(9, 0.7F));
    public static final RegistryObject<Item> COFFEE_MOCCA = FOODS.register("coffee_mocca", ()->
            new Coffees(10, 0.9F));
    public static final RegistryObject<Item> COFFEE_CARAJILLO = FOODS.register("coffee_carajillo", ()->
            new Coffees(7, 0.8F));
}
