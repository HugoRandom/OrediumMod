package com.hugorandom.oredium.armors;

import com.google.common.collect.ImmutableMap;
import com.hugorandom.oredium.init.EffectsInit;
import com.hugorandom.oredium.util.ItemGroupTabs;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

import java.util.Map;

public class ArmorU extends ArmorItem {

    public ArmorU(ArmorMaterial pMaterial, EquipmentSlot pSlot) {
        super(pMaterial, pSlot,
                new Properties()
                        .tab(ItemGroupTabs.OREDIUM_TOOLS)
                        .rarity(Rarity.UNCOMMON)
                        .stacksTo(1)
                        .fireResistant());
    }

    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_EFFECT =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
                    .put(ArmorTier.DISPROSIO_UPGRADED, new MobEffectInstance(
                            MobEffects.FIRE_RESISTANCE, 200, 0))
                    .put(ArmorTier.FRANITOLINA_UPGRADED, new MobEffectInstance(
                            MobEffects.REGENERATION, 200, 0))
                    .put(ArmorTier.MELITONILA_UPGRADED, new MobEffectInstance(
                            MobEffects.DAMAGE_BOOST, 200, 0))
                    .put(ArmorTier.TERIUM_UPGRADED, new MobEffectInstance(
                            MobEffects.DAMAGE_RESISTANCE, 200, 1))
                    .put(ArmorTier.ALEZARITA_UPGRADED, new MobEffectInstance(
                            MobEffects.WATER_BREATHING, 200, 0))
                    .put(ArmorTier.HALINOX_UPGRADED, new MobEffectInstance(
                            MobEffects.DIG_SPEED, 200, 1))
                    .put(ArmorTier.MIGUELITIO_UPGRADED, new MobEffectInstance(
                            MobEffects.MOVEMENT_SPEED, 200, 1))
                    .build();

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }

    @Override
    public int getEntityLifespan(ItemStack itemStack, Level level) {
        return 12000;
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                evaluateArmorEffects(player);
            }
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_EFFECT.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);
        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
        for (ItemStack armorStack: player.getInventory().armor) {
            if(!(armorStack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }
        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());
        return helmet.getMaterial() == material && breastplate.getMaterial() == material &&
                leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
