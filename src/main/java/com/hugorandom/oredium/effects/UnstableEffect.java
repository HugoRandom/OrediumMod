package com.hugorandom.oredium.effects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;

public class UnstableEffect extends MobEffect {

    public UnstableEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()){
            addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635",
                    (double) 2.0F, AttributeModifier.Operation.MULTIPLY_TOTAL);
            float DME = 0;
            if (pLivingEntity.isInWaterOrRain()) DME  += 0.5F;
            if (pLivingEntity instanceof Player) {
                if (!pLivingEntity.isShiftKeyDown()) DME  += 0.5F;
            }
            pLivingEntity.hurt(new DamageSource("unstable"), (pAmplifier + 1) + DME);
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

    @Override
    public boolean isBeneficial() {
        return false;
    }
}
