package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FluidsInit {
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Oredium.MOD_ID);

	public static void register(IEventBus eventBus){
		FLUIDS.register(eventBus);
	}
    
	// Hugodium
	public static final ResourceLocation HUGODIUM_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/hugodium_still");
    public static final ResourceLocation HUGODIUM_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/hugodium_flow");
    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_HUGODIUM =
    		FLUIDS.register("molten_hugodium", () -> new ForgeFlowingFluid.Source(FluidsInit.HUGODIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_HUGODIUM_FLOWING =
    		FLUIDS.register("molten_hugodium_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.HUGODIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties HUGODIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> MOLTEN_HUGODIUM.get(), () -> MOLTEN_HUGODIUM_FLOWING.get(), FluidAttributes.builder(HUGODIUM_STILL, HUGODIUM_FLOW)
    			.overlay(HUGODIUM_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
				.bucket(BucketsInit.HUGODIUM_BUCKET).block(BlockFluidsInit.MOLTEN_HUGODIUM_BLOCK);
    
    // Alezarita
    public static final ResourceLocation ALEZARITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/alezarita_still");
    public static final ResourceLocation ALEZARITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/alezarita_flow");
    public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_ALEZARITA =
    		FLUIDS.register("molten_alezarita", () -> new ForgeFlowingFluid.Source(FluidsInit.ALEZARITA_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_ALEZARITA_FLOWING =
    		FLUIDS.register("molten_alezarita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.ALEZARITA_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ALEZARITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_ALEZARITA.get(), () -> MOLTEN_ALEZARITA_FLOWING.get(), FluidAttributes.builder(ALEZARITA_STILL, ALEZARITA_FLOW)
    			.overlay(ALEZARITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
				.bucket(BucketsInit.ALEZARITA_BUCKET).block(BlockFluidsInit.MOLTEN_ALEZARITA_BLOCK);
    
    // Axidita
	public static final ResourceLocation AXIDITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/axidita_still");
	public static final ResourceLocation AXIDITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/axidita_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_AXIDITA =
			FLUIDS.register("molten_axidita", () -> new ForgeFlowingFluid.Source(FluidsInit.AXIDITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_AXIDITA_FLOWING =
			FLUIDS.register("molten_axidita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.AXIDITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties AXIDITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_AXIDITA.get(), () -> MOLTEN_AXIDITA_FLOWING.get(), FluidAttributes.builder(AXIDITA_STILL, AXIDITA_FLOW)
			.overlay(AXIDITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.AXIDITA_BUCKET).block(BlockFluidsInit.MOLTEN_AXIDITA_BLOCK);
    
    // Franitolina
	public static final ResourceLocation FRANITOLINA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/franitolina_still");
	public static final ResourceLocation FRANITOLINA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/franitolina_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_FRANITOLINA =
			FLUIDS.register("molten_franitolina", () -> new ForgeFlowingFluid.Source(FluidsInit.FRANITOLINA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_FRANITOLINA_FLOWING =
			FLUIDS.register("molten_franitolina_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.FRANITOLINA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties FRANITOLINA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_FRANITOLINA.get(), () -> MOLTEN_FRANITOLINA_FLOWING.get(), FluidAttributes.builder(FRANITOLINA_STILL, FRANITOLINA_FLOW)
			.overlay(FRANITOLINA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.FRANITOLINA_BUCKET).block(BlockFluidsInit.MOLTEN_FRANITOLINA_BLOCK);
    
    // Miguelitio
	public static final ResourceLocation MIGUELITIO_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/miguelitio_still");
	public static final ResourceLocation MIGUELITIO_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/miguelitio_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_MIGUELITIO =
			FLUIDS.register("molten_miguelitio", () -> new ForgeFlowingFluid.Source(FluidsInit.MIGUELITIO_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_MIGUELITIO_FLOWING =
			FLUIDS.register("molten_miguelitio_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.MIGUELITIO_PROPERTIES));

	public static final ForgeFlowingFluid.Properties MIGUELITIO_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_MIGUELITIO.get(), () -> MOLTEN_MIGUELITIO_FLOWING.get(), FluidAttributes.builder(MIGUELITIO_STILL, MIGUELITIO_FLOW)
			.overlay(MIGUELITIO_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.MIGUELITIO_BUCKET).block(BlockFluidsInit.MOLTEN_MIGUELITIO_BLOCK);
    
    // Shine
	public static final ResourceLocation SHINE_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/shine_still");
	public static final ResourceLocation SHINE_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/shine_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_SHINE =
			FLUIDS.register("molten_shine", () -> new ForgeFlowingFluid.Source(FluidsInit.SHINE_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_SHINE_FLOWING =
			FLUIDS.register("molten_shine_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.SHINE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties SHINE_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_SHINE.get(), () -> MOLTEN_SHINE_FLOWING.get(), FluidAttributes.builder(SHINE_STILL, SHINE_FLOW)
			.overlay(SHINE_STILL).luminosity(15).density(3000).viscosity(6000).temperature(800)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.SHINE_BUCKET).block(BlockFluidsInit.MOLTEN_SHINE_BLOCK);
    
    // Cesarita
	public static final ResourceLocation CESARITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/cesarita_still");
	public static final ResourceLocation CESARITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/cesarita_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_CESARITA =
			FLUIDS.register("molten_cesarita", () -> new ForgeFlowingFluid.Source(FluidsInit.CESARITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_CESARITA_FLOWING =
			FLUIDS.register("molten_cesarita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.CESARITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties CESARITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_CESARITA.get(), () -> MOLTEN_CESARITA_FLOWING.get(), FluidAttributes.builder(CESARITA_STILL, CESARITA_FLOW)
			.overlay(CESARITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.CESARITA_BUCKET).block(BlockFluidsInit.MOLTEN_CESARITA_BLOCK);
    
    // Caballerita
	public static final ResourceLocation CABALLERITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/caballerita_still");
	public static final ResourceLocation CABALLERITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/caballerita_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_CABALLERITA =
			FLUIDS.register("molten_caballerita", () -> new ForgeFlowingFluid.Source(FluidsInit.CABALLERITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_CABALLERITA_FLOWING =
			FLUIDS.register("molten_caballerita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.CABALLERITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties CABALLERITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_CABALLERITA.get(), () -> MOLTEN_CABALLERITA_FLOWING.get(), FluidAttributes.builder(CABALLERITA_STILL, CABALLERITA_FLOW)
			.overlay(CABALLERITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.CABALLERITA_BUCKET).block(BlockFluidsInit.MOLTEN_CABALLERITA_BLOCK);
    
    // Enderita
	public static final ResourceLocation ENDERITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/enderita_still");
	public static final ResourceLocation ENDERITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/enderita_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_ENDERITA =
			FLUIDS.register("molten_enderita", () -> new ForgeFlowingFluid.Source(FluidsInit.ENDERITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_ENDERITA_FLOWING =
			FLUIDS.register("molten_enderita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.ENDERITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties ENDERITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_ENDERITA.get(), () -> MOLTEN_ENDERITA_FLOWING.get(), FluidAttributes.builder(ENDERITA_STILL, ENDERITA_FLOW)
			.overlay(ENDERITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1200)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.ENDERITA_BUCKET).block(BlockFluidsInit.MOLTEN_ENDERITA_BLOCK);
    
    // Infernum

	public static final ResourceLocation INFERNUM_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/infernum_still");
	public static final ResourceLocation INFERNUM_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/infernum_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_INFERNUM =
			FLUIDS.register("molten_infernum", () -> new ForgeFlowingFluid.Source(FluidsInit.INFERNUM_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_INFERNUM_FLOWING =
			FLUIDS.register("molten_infernum_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.INFERNUM_PROPERTIES));

	public static final ForgeFlowingFluid.Properties INFERNUM_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_INFERNUM.get(), () -> MOLTEN_INFERNUM_FLOWING.get(), FluidAttributes.builder(INFERNUM_STILL, INFERNUM_FLOW)
			.overlay(INFERNUM_STILL).luminosity(15).density(3000).viscosity(6000).temperature(2500)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.INFERNUM_BUCKET).block(BlockFluidsInit.INFERNUM_BLOCK);

	// Meluna
	public static final ResourceLocation MELUNA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/meluna_still");
	public static final ResourceLocation MELUNA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/meluna_flow");
	public static final RegistryObject<ForgeFlowingFluid.Source> MOLTEN_MELUNA =
			FLUIDS.register("molten_meluna", () -> new ForgeFlowingFluid.Source(FluidsInit.MELUNA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MOLTEN_MELUNA_FLOWING =
			FLUIDS.register("molten_meluna_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.MELUNA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties MELUNA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MOLTEN_MELUNA.get(), () -> MOLTEN_MELUNA_FLOWING.get(), FluidAttributes.builder(MELUNA_STILL, MELUNA_FLOW)
			.overlay(MELUNA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(BucketsInit.MELUNA_BUCKET).block(BlockFluidsInit.MOLTEN_MELUNA_BLOCK);
}
