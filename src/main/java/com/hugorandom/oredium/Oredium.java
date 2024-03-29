package com.hugorandom.oredium;

import com.hugorandom.oredium.init.ArmorsInit;
import com.hugorandom.oredium.init.BlocksInit;
import com.hugorandom.oredium.init.BlocksEntitiesInit;
import com.hugorandom.oredium.init.FoodsInit;
import com.hugorandom.oredium.init.Items1Init;
import com.hugorandom.oredium.init.Items2Init;
import com.hugorandom.oredium.init.ParticlesInit;
import com.hugorandom.oredium.init.MenusInit;
import com.hugorandom.oredium.init.RecipesInit;
import com.hugorandom.oredium.init.ToolsInit;
import com.hugorandom.oredium.network.OrediumPackets;
import com.hugorandom.oredium.events.WoldEvents;
import com.hugorandom.oredium.init.*;
import com.hugorandom.oredium.init.DimensionsInit;
import com.hugorandom.oredium.world.structure.StructuresInit;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Oredium.MOD_ID)
public class Oredium
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "oredium";
    public static final Logger LOGGER = LogManager.getLogger();

    public Oredium()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EffectsInit.register(eventBus);
        Items1Init.register(eventBus);
        BlocksInit.register(eventBus);
        FoodsInit.register(eventBus);
        Items2Init.register(eventBus);
        BlocksEntitiesInit.register(eventBus);
        ToolsInit.register(eventBus);
        ArmorsInit.register(eventBus);
        PaintingsInit.register(eventBus);
        SoundsInit.register(eventBus);
        MenusInit.register(eventBus);
        RecipesInit.register(eventBus);
        ParticlesInit.register(eventBus);
        StructuresInit.register(eventBus);
        DimensionsInit.register();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(WoldEvents.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
       event.enqueueWork(() -> {
           OrediumPackets.register();
           ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlocksInit.SOLIMA.getId(), BlocksInit.POTTED_SOLIMA);
       });


    }
}
