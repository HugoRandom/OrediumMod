package com.hugorandom.oredium.effects;

import com.hugorandom.oredium.init.EffectsInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class VitaminizedEffect extends MobEffect {

    public VitaminizedEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()){
            if (pAmplifier >= 8){
                pLivingEntity.hurt(new DamageSource("vitaminized"), 8);
            }
            else {
                pLivingEntity.removeEffect(EffectsInit.UNSTABLE.get());
            }
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }
}
