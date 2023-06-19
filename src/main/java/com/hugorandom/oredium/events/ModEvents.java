package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitamins;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitaminsProvider;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Oredium.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event){
        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.DIRT, 32),
                    new ItemStack(Items.EMERALD, 1),16,2,0.05F));
        }
        if(event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BASALT, 32),
                    new ItemStack(Items.EMERALD, 1),16,2,0.05F));
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BLACKSTONE, 32),
                    new ItemStack(Items.EMERALD, 1),16,2,0.05F));
        }
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event){
        event.register(PlayerVitamins.class);
    }


}
