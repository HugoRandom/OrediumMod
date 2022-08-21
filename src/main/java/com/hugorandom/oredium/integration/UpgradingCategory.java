package com.hugorandom.oredium.integration;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.blocks.BlocksInit;
import com.hugorandom.oredium.screens.slots.recipes.UpgradingRecipe;
import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class UpgradingCategory implements IRecipeCategory<UpgradingRecipe> {

    public final static ResourceLocation UID = new ResourceLocation(Oredium.MOD_ID, "upgrading");
    public static ResourceLocation TEXTURE = new ResourceLocation(Oredium.MOD_ID,
            "textures/gui/upgrading_jei.png");
    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawable arrowUpgrader;
    private final IDrawable arrowArmor;

    public UpgradingCategory(IGuiHelper helper){
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(BlocksInit.OREDIUM_BLOCK.get()));
        this.arrowUpgrader = helper.createDrawable(TEXTURE, 176, 0, 20, 13);
        this.arrowArmor = helper.createDrawable(TEXTURE, 176, 13, 20, 13);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends UpgradingRecipe> getRecipeClass() {
        return UpgradingRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("jei.title.upgrading");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, UpgradingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 26, 33).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 134, 33).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 33).addItemStack(recipe.getResultItem());
    }

    @Override
    public void draw(UpgradingRecipe recipe, IRecipeSlotsView recipeSlotsView, PoseStack stack, double mouseX, double mouseY) {
        this.arrowUpgrader.draw(stack, 51, 35);
        this.arrowArmor.draw(stack, 105, 35);
    }
}
