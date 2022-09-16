package com.hugorandom.oredium.events;

import com.hugorandom.oredium.Oredium;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitamins;
import com.hugorandom.oredium.capabilities.vitamins.PlayerVitaminsProvider;
import com.hugorandom.oredium.init.Items1Init;
import com.hugorandom.oredium.init.ToolsInit;
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
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.DIRT, 16),
                    new ItemStack(Items.EMERALD, 1),12,2,-0.04F));
        }

        if(event.getType() == VillagerProfession.MASON) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BASALT, 32),
                    new ItemStack(Items.EMERALD, 1),12,2,-0.04F));
            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.BLACKSTONE, 32),
                    new ItemStack(Items.EMERALD, 1),12,2,-0.04F));
        }

        if(event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ToolsInit.SHINE_PICKAXE.get(), 1), 4,4,-0.03F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 7),
                    new ItemStack(ToolsInit.CESARITA_PICKAXE.get(), 1), 4,5,-0.05F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ToolsInit.CABALLERITA_SHOVEL.get(), 1), 4,5,-0.05F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ToolsInit.AXIDITA_HOE.get(), 1), 4,5,-0.05F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ToolsInit.FRANITOLINA_PICKAXE.get(), 1), 4,6,-0.07F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items1Init.MELUNA_INGOT.get(), 2), 8,5,-0.10F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 10),
                    new ItemStack(Items1Init.HUGODIUM_INGOT.get(), 1), 6,6,-0.12F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items1Init.MIGUELITIO_INGOT.get(), 4),
                    new ItemStack(Items.EMERALD, 7), 6,6,-0.12F));
            trades.get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 17),
                    new ItemStack(ToolsInit.ALEZARITA_PICKAXE.get(), 1), 4,7,-0.15F));
        }

        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3),
                    new ItemStack(ToolsInit.SHINE_SWORD.get(), 1), 4,4,-0.03F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 7),
                    new ItemStack(ToolsInit.CESARITA_SWORD.get(), 1), 4,5,-0.05F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ToolsInit.CABALLERITA_SWORD.get(), 1), 4,5,-0.05F));
            trades.get(2).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ToolsInit.AXIDITA_AXE.get(), 1), 4,5,-0.05F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ToolsInit.FRANITOLINA_AXE.get(), 1), 4,6,-0.07F));
            trades.get(3).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items1Init.ENDERITA_INGOT.get(), 2), 8,5,-0.10F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 12),
                    new ItemStack(ToolsInit.MELUNA_HOE.get(), 1), 4,6,-0.12F));
            trades.get(4).add((trader, rand) -> new MerchantOffer(new ItemStack(Items1Init.CABALLERITA_INGOT.get(), 4),
                    new ItemStack(Items.EMERALD, 7), 6,6,-0.12F));
            trades.get(5).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 17),
                    new ItemStack(ToolsInit.ALEZARITA_AXE.get(), 1), 4,7,-0.15F));
        }
    }
    @SubscribeEvent
    public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event){
        if(event.getObject() instanceof Player){
            if(!event.getObject().getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).isPresent()){
                event.addCapability(new ResourceLocation(Oredium.MOD_ID, "properties"), new PlayerVitaminsProvider());
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event){
        if(event.isWasDeath()){
            event.getPlayer().reviveCaps();
            event.getOriginal().getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(oldStore -> {
                event.getOriginal().getCapability(PlayerVitaminsProvider.PLAYER_VITAMINS).ifPresent(newStore ->{
                    newStore.copyFrom(oldStore);
                    event.getPlayer().invalidateCaps();
                });
            });
        }
    }

    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event){
        event.register(PlayerVitamins.class);
    }


}
