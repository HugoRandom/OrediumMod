package com.hugorandom.oredium.init;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.blocks.entitys.UpgradingEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksEntitiesInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Oredium.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

    public static final RegistryObject<BlockEntityType<UpgradingEntity>> OREDIUM_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("oredium_block_entity",
                    () -> BlockEntityType.Builder.of(UpgradingEntity::new,
                            BlocksInit.OREDIUM_BLOCK.get()).build(null));
}
