package com.hugorandom.oredium.integration;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.screens.slots.recipes.UpgradingRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(Oredium.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new UpgradingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        assert Minecraft.getInstance().level != null;
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level.getRecipeManager());
        List<UpgradingRecipe> recipes = rm.getAllRecipesFor(UpgradingRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(UpgradingCategory.UID, UpgradingRecipe.class), recipes);
    }
}
