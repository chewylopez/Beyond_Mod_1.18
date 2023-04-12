package com.chewylopez.beyondmod.events;

import com.chewylopez.beyondmod.BeyondMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


//@Mod.EventBusSubscriber(modid = BeyondMod.MOD_ID, bus = Bus.FORGE)
public class TestJumpEvent {
	
@SubscribeEvent
	public static void testJumpEvent(LivingJumpEvent event) {
	BeyondMod.LOGGER.info("testJumpEvent Fired");
	LivingEntity livingEntity = event.getEntityLiving();
	World world = livingEntity.getEntityWorld();
	livingEntity.addPotionEffect(new EffectInstance(Effects.SPEED, 600, 2));
	}
}
