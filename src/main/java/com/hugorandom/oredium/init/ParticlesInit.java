package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ParticlesInit {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){
        PARTICLE_TYPES.register(eventBus);
    }

    public static final RegistryObject<SimpleParticleType> OREDIUM_PARTICLE =
            PARTICLE_TYPES.register("oredium_particle", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> FRANITOLINA_PARTICLE =
            PARTICLE_TYPES.register("franitolina_particle", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> MIGUELITIO_PARTICLE =
            PARTICLE_TYPES.register("miguelitio_particle", () -> new SimpleParticleType(true));
}
