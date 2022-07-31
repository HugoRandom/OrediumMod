package com.hugorandom.oredium.blocks.specials;

import com.hugorandom.oredium.blocks.MetalBlock;
import com.hugorandom.oredium.inits.ItemsInit;
import com.hugorandom.oredium.inits.ParticlesInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Random;

public class MiguelitioBlock extends MetalBlock {

    public MiguelitioBlock(float strength, float explosion) {
        super(strength, explosion);
    }

    @Override
    public void animateTick(BlockState pState, Level pLevel, BlockPos pos, Random rand) {
        super.animateTick(pState, pLevel, pos, rand);
        if (rand.nextInt(12) == 0) {
            pLevel.addParticle(ParticlesInit.SHINE_PARTICLE.get(), (double)pos.getX() + rand.nextDouble(),
                    (double)pos.getY() + 1.1D, (double)pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public InteractionResult use(BlockState pState, Level worldIn, BlockPos pos, Player player, InteractionHand pHand, BlockHitResult pHit) {
        if(!worldIn.isClientSide) {
            if (player.getMainHandItem().getItem() == ItemsInit.MIGUELITIO_GEM.get()) {
                EntityType.LIGHTNING_BOLT.spawn((ServerLevel) worldIn, null, player, pos,
                        MobSpawnType.TRIGGERED.TRIGGERED, true, true);
                int count = player.getMainHandItem().getCount();
                if(count == 1) {
                    player.getMainHandItem().setCount(0);
                }
                else {
                    player.getMainHandItem().setCount(count - 1);
                }
            }
            else {
                worldIn.playSound(null, pos, SoundEvents.METAL_HIT, SoundSource.BLOCKS, 0.6f, 1f);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
