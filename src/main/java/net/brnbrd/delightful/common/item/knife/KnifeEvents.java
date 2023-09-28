package net.brnbrd.delightful.common.item.knife;

import net.brnbrd.delightful.Util;
import net.brnbrd.delightful.data.tags.DelightfulItemTags;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class KnifeEvents {

	// Twilight Forest, Nether's Exoticism, Create Stuff & Additions Compat
	@SubscribeEvent
	void onFireKnife(LivingAttackEvent e) {
		if (e.getSource().getEntity() instanceof LivingEntity living &&
			living.getMainHandItem().is(DelightfulItemTags.FIRE_KNIVES) &&
			!e.getEntity().fireImmune()) {
			e.getEntity().setSecondsOnFire(15);
		}
	}

	// Twilight Forest Compat
	@SubscribeEvent
	void onKnightmetalKnife(LivingHurtEvent e) {
	}

	// Phantasm Compat
	@SubscribeEvent
	void onStelliumKnife(LivingHurtEvent e) {
	}
}
