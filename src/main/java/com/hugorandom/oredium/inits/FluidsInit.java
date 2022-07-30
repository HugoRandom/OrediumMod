package com.hugorandom.oredium.inits;

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
	public static final ResourceLocation HUGODIUM_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/hugodium_fluid_still");
    public static final ResourceLocation HUGODIUM_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/hugodium_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> HUGODIUM_FLUID =
    		FLUIDS.register("hugodium_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.HUGODIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> HUGODIUM_FLOWING =
    		FLUIDS.register("hugodium_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.HUGODIUM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties HUGODIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> HUGODIUM_FLUID.get(), () -> HUGODIUM_FLOWING.get(), FluidAttributes.builder(HUGODIUM_STILL, HUGODIUM_FLOW)
    			.overlay(HUGODIUM_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
				.bucket(ItemsRareInit.HUGODIUM_BUCKET).block(BlockFluidsInit.MOLTEN_HUGODIUM);
    
    // Alezarita
    public static final ResourceLocation ALEZARITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/alezarita_fluid_still");
    public static final ResourceLocation ALEZARITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/alezarita_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> ALEZARITA_FLUID =
    		FLUIDS.register("alezarita_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.ALEZARITA_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> ALEZARITA_FLOWING =
    		FLUIDS.register("alezarita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.ALEZARITA_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ALEZARITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> ALEZARITA_FLUID.get(), () -> ALEZARITA_FLOWING.get(), FluidAttributes.builder(ALEZARITA_STILL, ALEZARITA_FLOW)
    			.overlay(ALEZARITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
				.bucket(ItemsRareInit.ALEZARITA_BUCKET).block(BlockFluidsInit.MOLTEN_ALEZARITA);
    
    // Axidita
	public static final ResourceLocation AXIDITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/axidita_fluid_still");
	public static final ResourceLocation AXIDITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/axidita_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> AXIDITA_FLUID =
			FLUIDS.register("axidita_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.AXIDITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> AXIDITA_FLOWING =
			FLUIDS.register("axidita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.AXIDITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties AXIDITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> AXIDITA_FLUID.get(), () -> AXIDITA_FLOWING.get(), FluidAttributes.builder(AXIDITA_STILL, AXIDITA_FLOW)
			.overlay(AXIDITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.AXIDITA_BUCKET).block(BlockFluidsInit.MOLTEN_AXIDITA);
    
    // Franitolina
	public static final ResourceLocation FRANITOLINA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/franitolina_fluid_still");
	public static final ResourceLocation FRANITOLINA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/franitolina_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> FRANITOLINA_FLUID =
			FLUIDS.register("franitolina_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.FRANITOLINA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> FRANITOLINA_FLOWING =
			FLUIDS.register("franitolina_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.FRANITOLINA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties FRANITOLINA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> FRANITOLINA_FLUID.get(), () -> FRANITOLINA_FLOWING.get(), FluidAttributes.builder(FRANITOLINA_STILL, FRANITOLINA_FLOW)
			.overlay(FRANITOLINA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.FRANITOLINA_BUCKET).block(BlockFluidsInit.MOLTEN_FRANITOLINA);
    
    // Miguelitio
	public static final ResourceLocation MIGUELITIO_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/miguelitio_fluid_still");
	public static final ResourceLocation MIGUELITIO_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/miguelitio_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> MIGUELITIO_FLUID =
			FLUIDS.register("miguelitio_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.MIGUELITIO_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> MIGUELITIO_FLOWING =
			FLUIDS.register("miguelitio_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.MIGUELITIO_PROPERTIES));

	public static final ForgeFlowingFluid.Properties MIGUELITIO_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> MIGUELITIO_FLUID.get(), () -> MIGUELITIO_FLOWING.get(), FluidAttributes.builder(MIGUELITIO_STILL, MIGUELITIO_FLOW)
			.overlay(MIGUELITIO_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1500)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.MIGUELITIO_BUCKET).block(BlockFluidsInit.MOLTEN_MIGUELITIO);
    
    // Shine
	public static final ResourceLocation SHINE_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/shine_fluid_still");
	public static final ResourceLocation SHINE_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/shine_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> SHINE_FLUID =
			FLUIDS.register("shine_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.SHINE_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> SHINE_FLOWING =
			FLUIDS.register("shine_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.SHINE_PROPERTIES));

	public static final ForgeFlowingFluid.Properties SHINE_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> SHINE_FLUID.get(), () -> SHINE_FLOWING.get(), FluidAttributes.builder(SHINE_STILL, SHINE_FLOW)
			.overlay(SHINE_STILL).luminosity(15).density(3000).viscosity(6000).temperature(800)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.SHINE_BUCKET).block(BlockFluidsInit.MOLTEN_SHINE);
    
    // Cesarita
	public static final ResourceLocation CESARITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/cesarita_fluid_still");
	public static final ResourceLocation CESARITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/cesarita_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> CESARITA_FLUID =
			FLUIDS.register("cesarita_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.CESARITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> CESARITA_FLOWING =
			FLUIDS.register("cesarita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.CESARITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties CESARITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> CESARITA_FLUID.get(), () -> CESARITA_FLOWING.get(), FluidAttributes.builder(CESARITA_STILL, CESARITA_FLOW)
			.overlay(CESARITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.CESARITA_BUCKET).block(BlockFluidsInit.MOLTEN_CESARITA);
    
    // Caballerita
	public static final ResourceLocation CABALLERITA_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/caballerita_fluid_still");
	public static final ResourceLocation CABALLERITA_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/caballerita_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> CABALLERITA_FLUID =
			FLUIDS.register("caballerita_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.CABALLERITA_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> CABALLERITA_FLOWING =
			FLUIDS.register("caballerita_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.CABALLERITA_PROPERTIES));

	public static final ForgeFlowingFluid.Properties CABALLERITA_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> CABALLERITA_FLUID.get(), () -> CABALLERITA_FLOWING.get(), FluidAttributes.builder(CABALLERITA_STILL, CABALLERITA_FLOW)
			.overlay(CABALLERITA_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1000)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.CABALLERITA_BUCKET).block(BlockFluidsInit.MOLTEN_CABALLERITA);
    
    // Enderium
	public static final ResourceLocation ENDERIUM_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/enderium_fluid_still");
	public static final ResourceLocation ENDERIUM_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/enderium_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> ENDERIUM_FLUID =
			FLUIDS.register("enderium_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.ENDERIUM_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> ENDERIUM_FLOWING =
			FLUIDS.register("enderium_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.ENDERIUM_PROPERTIES));

	public static final ForgeFlowingFluid.Properties ENDERIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> ENDERIUM_FLUID.get(), () -> ENDERIUM_FLOWING.get(), FluidAttributes.builder(ENDERIUM_STILL, ENDERIUM_FLOW)
			.overlay(ENDERIUM_STILL).luminosity(15).density(3000).viscosity(6000).temperature(1200)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.ENDERIUM_BUCKET).block(BlockFluidsInit.MOLTEN_ENDERIUM);
    
    // Infernum

	public static final ResourceLocation INFERNUM_STILL = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/infernum_fluid_still");
	public static final ResourceLocation INFERNUM_FLOW = new ResourceLocation(Oredium.MOD_ID, "blocks/fluids/infernum_fluid_flow");;
	public static final RegistryObject<ForgeFlowingFluid.Source> INFERNUM_FLUID =
			FLUIDS.register("infernum_fluid", () -> new ForgeFlowingFluid.Source(FluidsInit.INFERNUM_PROPERTIES));
	public static final RegistryObject<ForgeFlowingFluid.Flowing> INFERNUM_FLOWING =
			FLUIDS.register("infernum_flowing", () -> new ForgeFlowingFluid.Flowing(FluidsInit.INFERNUM_PROPERTIES));

	public static final ForgeFlowingFluid.Properties INFERNUM_PROPERTIES = new ForgeFlowingFluid.Properties(
			()-> INFERNUM_FLUID.get(), () -> INFERNUM_FLOWING.get(), FluidAttributes.builder(INFERNUM_STILL, INFERNUM_FLOW)
			.overlay(INFERNUM_STILL).luminosity(15).density(3000).viscosity(6000).temperature(2500)
			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
			.explosionResistance(1000.0f).tickRate(20).levelDecreasePerBlock(2)
			.bucket(ItemsRareInit.INFERNUM_BUCKET).block(BlockFluidsInit.INFERNUM);
}
