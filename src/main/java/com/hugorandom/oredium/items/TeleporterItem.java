package com.hugorandom.oredium.items;

import com.hugorandom.oredium.init.DimensionsInit;
import com.hugorandom.oredium.init.ParticlesInit;
import com.hugorandom.oredium.network.OrediumPackets;
import com.hugorandom.oredium.network.packets.TeleporterChargeS2CPacket;
import com.hugorandom.oredium.util.ItemGroupTabs;
import com.hugorandom.oredium.world.Teleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TeleporterItem extends Item {

    public TeleporterItem() {
        super(new Item.Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.UNCOMMON)
                .stacksTo(1)
                .setNoRepair());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium.teleporter"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        BlockPos pos = pPlayer.getOnPos();

        pLevel.playSound(null, pos, SoundEvents.RESPAWN_ANCHOR_CHARGE, SoundSource.PLAYERS, 0.55f, 0.95f);


        return ItemUtils.startUsingInstantly(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        BlockPos pos = pLivingEntity.blockPosition();
        if (pLivingEntity instanceof ServerPlayer player)
        {
            int charge = getUseDuration(pStack) - pRemainingUseDuration;
            OrediumPackets.sendToPlayer(new TeleporterChargeS2CPacket(charge), player);
        }
        if (pLevel.random.nextDouble() > 0.1D) {
            pLevel.addParticle(ParticlesInit.OREDIUM_PARTICLE.get(),
                    (double)pos.getX() + pLevel.random.nextDouble(2) - 0.5D,
                    (double)pos.getY() + pLevel.random.nextDouble(2) + 0.5D,
                    (double)pos.getZ() + pLevel.random.nextDouble(2) - 0.5D,
                    0.0D, 0.0D, 0.0D);
        }
        super.onUseTick(pLevel, pLivingEntity, pStack, pRemainingUseDuration);
    }

    public int getUseDuration(ItemStack pStack) {
        return 10060;
    }

    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BOW;
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {
        if (pLivingEntity instanceof ServerPlayer player)
        {
            OrediumPackets.sendToPlayer(new TeleporterChargeS2CPacket(0), player);
        }
        this.stopUsing(pLivingEntity);
        return pStack;
    }

    // Mi codigo fumado para teletransportarse entre dimension sin morir sofocado
    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity, int pTimeCharged) {
        if (!pLevel.isClientSide()){
            Player pPlayer = (Player) pLivingEntity;

            if (pLivingEntity instanceof ServerPlayer player)
            {
                OrediumPackets.sendToPlayer(new TeleporterChargeS2CPacket(0), player);
            }
            if (pTimeCharged < 10000){

                MinecraftServer minecraftServer = pPlayer.level.getServer();
                BlockPos before = pPlayer.getOnPos();
                double nX = before.getX();
                double nY = before.getY();
                double nZ = before.getZ();
                boolean flag = false;
                int addY = 0;
                ServerLevel toDim;
                String dim;

                if (pPlayer.getLevel().dimension() == DimensionsInit.MAPASHE_DIM_KEY){
                    toDim = minecraftServer.getLevel(Level.OVERWORLD);
                    dim = "text.oredium.overworld";
                    Direction direction;
                    if (pPlayer.getBedOrientation() == null){
                        direction = pPlayer.getBedOrientation();
                        nX = direction.getStepX();
                        nY = direction.getStepY();
                        nZ = direction.getStepZ();
                    }
                }
                else{
                    toDim = minecraftServer.getLevel(DimensionsInit.MAPASHE_DIM_KEY);
                    dim = "text.oredium.mapashe";

                    while (!flag){
                        BlockPos c1 = new BlockPos(nX, nY + addY, nZ);
                        if (toDim.getLevel().getBlockState(c1).getBlock() == Blocks.AIR){
                            BlockPos c2 = new BlockPos(nX, nY + addY + 1, nZ);
                            if (toDim.getLevel().getBlockState(c2).getBlock() == Blocks.AIR){
                                BlockPos c3 = new BlockPos(nX, nY + addY + 2, nZ);
                                if (toDim.getLevel().getBlockState(c3).getBlock() == Blocks.AIR){
                                    flag = true;
                                }
                                else addY++;
                            }
                            else addY++;
                        }
                        else addY++;
                    }
                }
                pPlayer.changeDimension(toDim, new Teleporter((ServerLevel) pPlayer.getLevel()));
                pPlayer.moveTo(nX, nY + addY, nZ);
                pPlayer.getCooldowns().addCooldown(this, 6);
                pPlayer.sendMessage(new TranslatableComponent(dim), pPlayer.getUUID());
            }
        }
        this.stopUsing(pLivingEntity);
    }

    private void stopUsing(LivingEntity pUser) {
        pUser.playSound(SoundEvents.RESPAWN_ANCHOR_DEPLETE, 0.7F, 1.1F);
    }
}
