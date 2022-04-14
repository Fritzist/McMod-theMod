package de.fritzist.theMod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties BROCCOLI = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(new MobEffectInstance(MobEffects.HUNGER, 200, 3), 100F).effect(new MobEffectInstance(MobEffects.POISON, 100, 1),100F).meat().build();




}
