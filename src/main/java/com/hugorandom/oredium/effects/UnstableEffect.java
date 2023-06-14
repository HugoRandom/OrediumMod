package com.hugorandom.oredium.effects;

import com.hugorandom.oredium.init.EffectsInit;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

import java.util.Objects;

public class UnstableEffect extends MobEffect {

    public UnstableEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level.isClientSide()){
            if (pLivingEntity.hasEffect(EffectsInit.VITAMINIZED.get())) {
                if(Objects.requireNonNull(pLivingEntity.getEffect(EffectsInit.VITAMINIZED.get())).getAmplifier() == 0){
                    pLivingEntity.removeEffect(EffectsInit.VITAMINIZED.get());
                }
                else{
                    pLivingEntity.addEffect(new MobEffectInstance(EffectsInit.VITAMINIZED.get(),
                            Objects.requireNonNull(
                                    pLivingEntity.getEffect(EffectsInit.VITAMINIZED.get())).getDuration() + 1,
                            Objects.requireNonNull(
                                    pLivingEntity.getEffect(EffectsInit.VITAMINIZED.get())).getAmplifier() - 1));
                }
                pLivingEntity.removeEffect(EffectsInit.UNSTABLE.get());
            }
            else {
                addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635",
                        (double) -1.0F, AttributeModifier.Operation.MULTIPLY_TOTAL);
                addAttributeModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3",
                        (double)-0.1F, AttributeModifier.Operation.MULTIPLY_TOTAL);
                float DME = 0;
                if (pLivingEntity.isInWaterOrRain()) DME  += 0.5F;
                if (!pLivingEntity.isShiftKeyDown()) DME  += 0.5F;
                pLivingEntity.hurt(new DamageSource("unstable"), (pAmplifier + 1) + DME);
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
        return false;
    }


}
