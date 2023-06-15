package com.hugorandom.oredium.items;

import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UMCItem extends Item {

    public UMCItem() {
        super(new Properties()
                .tab(ItemGroupTabs.OREDIUM_ITEMS)
                .rarity(Rarity.UNCOMMON)
                .stacksTo(16)
                .setNoRepair()
                .fireResistant());
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.oredium.umc"));
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer,
                                                           @NotNull InteractionHand pUsedHand) {
        BlockPos pos = pPlayer.blockPosition();
        pLevel.explode(pPlayer,
                (double)pos.getX() + 0.0D,
                (double)pos.getY() + 0.75D,
                (double)pos.getZ() + 0.0D,
                1.0F, false,
                Explosion.BlockInteraction.BREAK);
        return super.use(pLevel, pPlayer, pUsedHand);
    }
}
