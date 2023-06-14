package com.hugorandom.oredium.screens;

import com.hugorandom.oredium.Oredium;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.jetbrains.annotations.NotNull;

public class UpgradingScreen extends AbstractContainerScreen<UpgradingMenu> {

    private static final ResourceLocation UPGRADING_SCREEN =
            new ResourceLocation(Oredium.MOD_ID, "textures/gui/upgrading_gui.png");

    public UpgradingScreen(UpgradingMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void renderBg(@NotNull PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, UPGRADING_SCREEN);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);
        if(menu.isCrafting()){
            this.blit(pPoseStack,
                    x + 51, y + 35,
                    176, 0,
                    menu.getScaledProgress(), 13);
            this.blit(pPoseStack,
                    x + 125 - menu.getScaledProgress(), y + 35,
                    196 - menu.getScaledProgress(), 13,
                    menu.getScaledProgress(), 13);
        }
    }

    @Override
    public void render(@NotNull PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, pMouseX, pMouseY, pPartialTick);
        renderTooltip(pPoseStack, pMouseX, pMouseY);
    }
}
