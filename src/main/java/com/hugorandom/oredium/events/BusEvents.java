package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.init.ParticlesInit;
import com.hugorandom.oredium.particles.NormalParticle;
import com.hugorandom.oredium.screens.slots.recipes.UpgradingRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BusEvents {

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event){
        Registry.register(Registry.RECIPE_TYPE, UpgradingRecipe.Type.ID, UpgradingRecipe.Type.INSTANCE);
    }

    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particleEngine.register(ParticlesInit.OREDIUM_PARTICLE.get(), NormalParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ParticlesInit.SHINE_PARTICLE.get(), NormalParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ParticlesInit.FRANITOLINA_PARTICLE.get(), NormalParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ParticlesInit.MIGUELITIO_PARTICLE.get(), NormalParticle.Provider::new);
    }
}
