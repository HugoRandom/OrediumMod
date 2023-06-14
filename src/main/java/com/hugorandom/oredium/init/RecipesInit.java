package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.screens.slots.recipes.UpgradingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipesInit {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }

    public static final RegistryObject<RecipeSerializer<UpgradingRecipe>> UPGRADING_SERIALIZER =
            SERIALIZERS.register("upgrading", () -> UpgradingRecipe.Serializer.INSTANCE);
}
