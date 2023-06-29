package com.hugorandom.oredium.tools;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hammer extends DiggerItem {
    private final int depth;
    private final int radius;
    public Hammer(Tier pTier, int pRadius, int pDepth, int pDurability) {
        super(0,-3F, pTier,
                BlockTags.MINEABLE_WITH_PICKAXE,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .stacksTo(1)
                        .rarity(Rarity.COMMON)
                        .durability(pDurability));
        this.radius = pRadius;
        this.depth = pDepth;
    }

    @Override
    public boolean mineBlock(@NotNull ItemStack pStack, @NotNull Level pLevel,
                             @NotNull BlockState pState, @NotNull BlockPos pPos,
                             @NotNull LivingEntity pEntityLiving) {
        if (pLevel.isClientSide || pState.getDestroySpeed(pLevel, pPos) == 0.0F) {
            return true;
        }
        HitResult pick = pEntityLiving.pick(20D, 1F, false);
        if (!(pick instanceof BlockHitResult)) {
            return super.mineBlock(pStack, pLevel, pState, pPos, pEntityLiving);
        }
        this.findAndBreakNearBlocks(pick, pPos, pStack, pLevel, pEntityLiving);
        return super.mineBlock(pStack, pLevel, pState, pPos, pEntityLiving);
    }

    public void findAndBreakNearBlocks(HitResult pick, BlockPos blockPos, ItemStack hammerStack, Level level,
                                       LivingEntity livingEntity) {

        if (!(livingEntity instanceof ServerPlayer player)) return;
        var size = (radius / 2);
        var offset = size - 1;

        Direction direction = ((BlockHitResult) pick).getDirection();
        var boundingBox = switch (direction) {
            case DOWN, UP -> new BoundingBox(
                    blockPos.getX() - size,
                    blockPos.getY() - (direction == Direction.UP ? depth - 1 : 0),
                    blockPos.getZ() - size,
                    blockPos.getX() + size,
                    blockPos.getY() + (direction == Direction.DOWN ? depth - 1 : 0),
                    blockPos.getZ() + size);
            case NORTH, SOUTH -> new BoundingBox(
                    blockPos.getX() - size,
                    blockPos.getY() - size + offset,
                    blockPos.getZ() - (direction == Direction.SOUTH ? depth - 1 : 0),
                    blockPos.getX() + size,
                    blockPos.getY() + size + offset,
                    blockPos.getZ() + (direction == Direction.NORTH ? depth - 1 : 0));
            case WEST, EAST -> new BoundingBox(
                    blockPos.getX() - (direction == Direction.EAST ? depth - 1 : 0),
                    blockPos.getY() - size + offset,
                    blockPos.getZ() - size,
                    blockPos.getX() + (direction == Direction.WEST ? depth - 1 : 0),
                    blockPos.getY() + size + offset,
                    blockPos.getZ() + size);
        };

        int damage = 0;
        Iterator<BlockPos> iterator = BlockPos.betweenClosedStream(boundingBox).iterator();
        Set<BlockPos> removedPos = new HashSet<>();
        while (iterator.hasNext()) {
            var pos = iterator.next();
            if (damage >= (hammerStack.getMaxDamage() - hammerStack.getDamageValue() - 1)) break;

            BlockState targetState = level.getBlockState(pos);
            if (pos == blockPos || removedPos.contains(pos) || !canDestroy(targetState, level, pos)) {
                continue;
            }

            if (level.getBlockState(pos).is(BlockTags.MINEABLE_WITH_PICKAXE))
            {
                removedPos.add(pos);
                level.destroyBlock(pos, false, livingEntity);
                if (!player.isCreative()) {
                    boolean correctToolForDrops = hammerStack.isCorrectToolForDrops(targetState);
                    if (correctToolForDrops) {
                        targetState.spawnAfterBreak((ServerLevel) level, pos, hammerStack);
                        List<ItemStack> drops = Block.getDrops(targetState, (ServerLevel) level, pos,
                                level.getBlockEntity(pos), livingEntity, hammerStack);
                        drops.forEach(e -> Block.popResourceFromFace(level, pos,
                                ((BlockHitResult) pick).getDirection(), e));
                    }
                }
                damage ++;
            }
        }
        damage --;
        if (damage != 0 && !player.isCreative()) {
            hammerStack.hurtAndBreak(damage, livingEntity, (livingEntityx) -> {
                livingEntityx.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }
    }

    private boolean canDestroy(BlockState pState, Level pLevel, BlockPos pPos) {
        if (pState.getDestroySpeed(pLevel, pPos) <= 0) return false;
        return pLevel.getBlockEntity(pPos) == null;
    }



    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel,
                                @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium.hammer_" + this.radius + "_" + this.depth));
    }
}
