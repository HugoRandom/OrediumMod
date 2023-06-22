package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
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
}
