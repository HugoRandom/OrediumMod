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

        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_SHINE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_SHINE_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_SHINE_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_CABALLERITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_CABALLERITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_CABALLERITA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_AXIDITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_AXIDITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_AXIDITA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_CESARITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_CESARITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_CESARITA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_FRANITOLINA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_FRANITOLINA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_FRANITOLINA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_ENDERITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_ENDERITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_ENDERITA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_ALEZARITA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_ALEZARITA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_ALEZARITA_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_HUGODIUM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_HUGODIUM_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_HUGODIUM_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_MIGUELITIO.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_MIGUELITIO_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_MIGUELITIO_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_INFERNUM.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_INFERNUM_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.INFERNUM_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_MELUNA.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(FluidsInit.MOLTEN_MELUNA_FLOWING.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(BlockFluidsInit.MOLTEN_MELUNA_BLOCK.get(), RenderType.translucent());

        MenuScreens.register(MenusInit.UPGRADING_MENU.get(), UpgradingScreen::new);
    }
}
