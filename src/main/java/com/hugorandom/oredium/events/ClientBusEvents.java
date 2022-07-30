package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.inits.BlockFluidsInit;
import com.hugorandom.oredium.inits.BlocksInit;
import com.hugorandom.oredium.inits.FluidsInit;
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

        ItemBlockRenderTypes.setRenderLayer(FluidsInit.SHINE_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.SHINE_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_SHINE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.CABALLERITA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.CABALLERITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_CABALLERITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.AXIDITA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.AXIDITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_AXIDITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.CESARITA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.CESARITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_CESARITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.FRANITOLINA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.FRANITOLINA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_FRANITOLINA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.ENDERIUM_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.ENDERIUM_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_ENDERIUM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.ALEZARITA_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.ALEZARITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_ALEZARITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.HUGODIUM_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.HUGODIUM_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_HUGODIUM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MIGUELITIO_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MIGUELITIO_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_MIGUELITIO.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.INFERNUM_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.INFERNUM_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.INFERNUM.get(), RenderType.translucent());

        MenuScreens.register(MenusInit.UPGRADING_MENU.get(), UpgradingScreen::new);
    }
}
