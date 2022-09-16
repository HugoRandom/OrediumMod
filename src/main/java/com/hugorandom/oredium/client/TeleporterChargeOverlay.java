package com.hugorandom.oredium.client;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.Items2Init;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.gui.IIngameOverlay;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID, value = Dist.CLIENT)
public class TeleporterChargeOverlay {

    private static final ResourceLocation TELECHARGE_OFF = new ResourceLocation(Oredium.MOD_ID,
            "textures/overlays/telecharge_off.png");
    private static final ResourceLocation TELECHARGE_ON = new ResourceLocation(Oredium.MOD_ID,
            "textures/overlays/telecharge_on.png");

    public static final IIngameOverlay TELEPORTER_CHARGE_HUD = ((gui, poseStack, partialTick, width, height) -> {
        int x = width/ 2;
        int y = height;
        int charge = TeleporterChargeData.getTeleporterCharge() / 20;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        // OFF
        RenderSystem.setShaderTexture(0, TELECHARGE_OFF);
        for (int i = 0; i < 3; i++){
            GuiComponent.blit(poseStack, x + 93, y - 15 - (i * 12), 0, 0,
                    12, 12, 12, 12);
        }
        // ON
        RenderSystem.setShaderTexture(0, TELECHARGE_ON);
        if (charge != 0)
        {
            for (int i = 0; i < 3; i++){
                if (charge > i)
                {
                    GuiComponent.blit(poseStack, x + 93, y - 15 - (i * 12), 0, 0,
                            12, 12, 12, 12);
                }
            }
        }
    });

    @SubscribeEvent
    public static void overlayEnableOrDisable(RenderGameOverlayEvent.PostLayer event){
        Player player = Minecraft.getInstance().player;
        Item teleporter = player.getItemInHand(InteractionHand.MAIN_HAND).getItem();

        if(teleporter == Items2Init.DIMENSIONAL_RESONATOR.get()){
            OverlayRegistry.enableOverlay(TeleporterChargeOverlay.TELEPORTER_CHARGE_HUD, true);
        }
        else {
            TeleporterChargeData.setTeleporterCharge(0);
            OverlayRegistry.enableOverlay(TeleporterChargeOverlay.TELEPORTER_CHARGE_HUD, false);
        }
    }
}
