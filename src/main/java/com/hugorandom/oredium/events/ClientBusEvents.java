package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.client.TeleporterChargeOverlay;
import com.hugorandom.oredium.init.BlocksInit;
import com.hugorandom.oredium.init.MenusInit;
import com.hugorandom.oredium.screens.UpgradingScreen;
import com.hugorandom.oredium.util.KeyBindings;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.SOLIMA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.POTTED_SOLIMA.get(), RenderType.cutout());

        // Menu de Mejoras de Armaduras
        MenuScreens.register(MenusInit.UPGRADING_MENU.get(), UpgradingScreen::new);

        // Registro de Tecla
        ClientRegistry.registerKeyBinding(KeyBindings.VITAMINS_KEY);

        // Registro de Overlays
        OverlayRegistry.registerOverlayTop("telecharge", TeleporterChargeOverlay.TELEPORTER_CHARGE_HUD);
    }
}
