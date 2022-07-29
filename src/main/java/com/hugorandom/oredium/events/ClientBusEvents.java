package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.inits.BlocksInit;
import com.hugorandom.oredium.inits.MenusInit;
import com.hugorandom.oredium.screens.UpgradingScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.SOLIMA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlocksInit.POTTED_SOLIMA.get(), RenderType.cutout());

        MenuScreens.register(MenusInit.UPGRADING_MENU.get(), UpgradingScreen::new);
    }
}
