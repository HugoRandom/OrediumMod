package com.hugorandom.oredium.items;

import com.hugorandom.oredium.init.DimensionsInit;
import com.hugorandom.oredium.init.ParticlesInit;
import com.hugorandom.oredium.network.OrediumPackets;
import com.hugorandom.oredium.network.packets.TeleporterChargeS2CPacket;
import com.hugorandom.oredium.util.ItemGroupTabs;
import com.hugorandom.oredium.world.Teleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TeleporterItem extends Item {

    private final String Tag = "Mapashe";

    public TeleporterItem() {
        super(new Item.Properties().tab(ItemGroupTabs.OREDIUM_TOOLS).rarity(Rarity.UNCOMMON).stacksTo(1).setNoRepair());
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium.teleporter"));
        if (pStack.hasTag()){
            if (pStack.getTagElement(this.Tag) != null){
                BlockPos coords = NbtUtils.readBlockPos(Objects.requireNonNull(pStack.getTagElement(this.Tag)));
                double X = coords.getX();
                double Y = coords.getY();
                double Z = coords.getZ();
                pTooltipComponents.add(new TextComponent("§6Mapashe: §f" + X + ", " + Y + ", " + Z));
            }
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pLevel.playSound(null, pPlayer.getOnPos(), SoundEvents.RESPAWN_ANCHOR_CHARGE, SoundSource.PLAYERS, 0.55f, 0.95f);
        pPlayer.startUsingItem(pUsedHand);
        return InteractionResultHolder.success(itemstack);
    }

    @Override
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        BlockPos pos = pLivingEntity.blockPosition();
        if (pLivingEntity instanceof ServerPlayer player)
        {
            int charge = getUseDuration(pStack) - pRemainingUseDuration;
            OrediumPackets.sendToPlayer(new TeleporterChargeS2CPacket(charge), player);
        }
        if (pLevel.random.nextDouble() > 0.25D) {
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
        return pStack;
    }

    public void releaseUsing(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity, int pTimeCharged) {
        if (!pLevel.isClientSide()){
            Player pPlayer = (Player) pLivingEntity;
            BlockPos respawn = null;

            CompoundTag nbtTag;
            if (pStack.hasTag()) {
                assert pStack.getTag() != null;
                nbtTag = pStack.getTag().copy();
            } else {
                nbtTag = new CompoundTag();
            }

            if (pLivingEntity instanceof ServerPlayer player)
            {
                OrediumPackets.sendToPlayer(new TeleporterChargeS2CPacket(0), player);
                respawn = player.getRespawnPosition();
            }

            if (pTimeCharged < 10000){
                MinecraftServer minecraftServer = pPlayer.level.getServer();
                double nX = pPlayer.getOnPos().getX();
                double nY = pPlayer.getOnPos().getY();
                double nZ = pPlayer.getOnPos().getZ();
                boolean flag = false;
                int addY = 0;
                String dimension;
                ServerLevel toDim;

                if (pPlayer.getLevel().dimension() == DimensionsInit.MAPASHE_DIM_KEY){
                    assert minecraftServer != null;
                    toDim = minecraftServer.getLevel(Level.OVERWORLD);
                    dimension = "text.oredium.overworld";

                    this.addCoordsTag(pPlayer.getOnPos(), nbtTag);
                    pStack.setTag(nbtTag);

                    if (respawn != null){
                        Optional<Vec3> optionalBed = Player.findRespawnPositionAndUseSpawnBlock(toDim, respawn,
                                1.0F, false, false);
                        if(optionalBed.isPresent())
                        {
                            Vec3 bedLocation = optionalBed.get();
                            BlockPos bed = new BlockPos(bedLocation.x(), bedLocation.y(), bedLocation.z());
                            nX = bed.getX();
                            nY = bed.getY();
                            nZ = bed.getZ();
                        }
                    }
                    else {
                        while (!flag){
                            BlockPos c1 = new BlockPos(nX, nY + addY, nZ);
                            assert toDim != null;
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
                }
                else {
                    assert minecraftServer != null;
                    toDim = minecraftServer.getLevel(DimensionsInit.MAPASHE_DIM_KEY);
                    dimension = "text.oredium.mapashe";

                    if (pStack.getTagElement(this.Tag) == null){
                        while (!flag){
                            BlockPos c1 = new BlockPos(nX, nY + addY, nZ);
                            assert toDim != null;
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
                    else {
                        assert pStack.getTag() != null;
                        BlockPos coords = NbtUtils.readBlockPos(Objects.requireNonNull(pStack.getTagElement(this.Tag)));
                        nX = coords.getX();
                        nY = coords.getY();
                        nZ = coords.getZ();
                    }
                }
                pPlayer.playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 0.7F, 1.1F);
                pPlayer.changeDimension(toDim, new Teleporter((ServerLevel) pPlayer.getLevel()));
                pPlayer.moveTo(nX, nY + addY, nZ);
                pPlayer.getCooldowns().addCooldown(this, 6000);
                pPlayer.sendMessage(new TranslatableComponent(dimension), pPlayer.getUUID());
            }
            else{
                pPlayer.playSound(SoundEvents.RESPAWN_ANCHOR_DEPLETE, 0.7F, 1.1F);
            }
            pLivingEntity.stopUsingItem();
        }
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if(!pLevel.isClientSide){
            if (savedCoords(pStack)) {
                CompoundTag compoundtag = pStack.getOrCreateTag();
                if (compoundtag.contains(this.Tag)) {
                    return;
                }
            }
        }
    }

    public boolean savedCoords(ItemStack pStack) {
        CompoundTag compoundtag = pStack.getTag();
        return compoundtag != null && (compoundtag.contains(this.Tag));
    }

    private void addCoordsTag(BlockPos pPos, CompoundTag pCompoundTag) {
        pCompoundTag.put(this.Tag, NbtUtils.writeBlockPos(pPos));
    }
}
