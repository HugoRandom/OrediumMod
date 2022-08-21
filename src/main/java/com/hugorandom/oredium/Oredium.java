package com.hugorandom.oredium;

import com.hugorandom.oredium.armors.ArmorsInit;
import com.hugorandom.oredium.blocks.BlockFluidsInit;
import com.hugorandom.oredium.blocks.BlocksInit;
import com.hugorandom.oredium.blocks.entitys.BlocksEntitiesInit;
import com.hugorandom.oredium.fluids.FluidsInit;
import com.hugorandom.oredium.foods.FoodsInit;
import com.hugorandom.oredium.items.ItemsInit;
import com.hugorandom.oredium.items.BucketsInit;
import com.hugorandom.oredium.particles.ParticlesInit;
import com.hugorandom.oredium.screens.MenusInit;
import com.hugorandom.oredium.screens.slots.recipes.RecipesInit;
import com.hugorandom.oredium.tools.ToolsInit;
import com.hugorandom.oredium.world.WoldEvents;
import com.hugorandom.oredium.others.*;
import com.hugorandom.oredium.world.dimension.DimensionsInit;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Oredium.MOD_ID)
public class Oredium
{
    // Directly reference a slf4j logger
    public static final String MOD_ID = "oredium";

    public Oredium()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemsInit.register(eventBus);
        BlocksInit.register(eventBus);
        FoodsInit.register(eventBus);
        FluidsInit.register(eventBus);
        BlockFluidsInit.register(eventBus);
        BucketsInit.register(eventBus);
        BlocksEntitiesInit.register(eventBus);
        ToolsInit.register(eventBus);
        ArmorsInit.register(eventBus);
        PaintingsInit.register(eventBus);
        SoundsInit.register(eventBus);
        MenusInit.register(eventBus);
        RecipesInit.register(eventBus);
        ParticlesInit.register(eventBus);
        DimensionsInit.register();

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(WoldEvents.class);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
       event.enqueueWork(() -> {
           ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlocksInit.SOLIMA.getId(), BlocksInit.POTTED_SOLIMA);
       });
    }
}
