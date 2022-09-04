package com.hugorandom.oredium.blocks.metals;

import com.hugorandom.oredium.blocks.MetalBlock;
import com.hugorandom.oredium.blocks.entitys.UpgradingEntity;
import com.hugorandom.oredium.init.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.network.NetworkHooks;

import java.util.Random;

public class ShineBlock extends MetalBlock {

    public ShineBlock(float strength, float explosion) {
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
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(!pLevel.isClientSide()){
            if (pHand == InteractionHand.MAIN_HAND){
                if (pPlayer.getItemInHand(pHand).is(FoodsInit.A12_PILL.get())) {
                    pPlayer.getItemInHand(pHand).shrink(1);
                    pLevel.addFreshEntity(new ItemEntity(pLevel, pPos.getX()+0.5, pPos.getY()+1, pPos.getZ()+0.5,
                            new ItemStack(Items1Init.RAW_SHINE.get())));
                    pLevel.playSound(null, pPos, SoundEvents.ITEM_FRAME_REMOVE_ITEM,
                            SoundSource.BLOCKS, 0.85F, 2F);
                }
            }
        }
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }
}
