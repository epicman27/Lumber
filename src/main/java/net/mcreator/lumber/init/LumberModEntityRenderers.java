
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lumber.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lumber.client.renderer.SawbladeProjectileRenderer;
import net.mcreator.lumber.client.renderer.LumberBotV1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LumberModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LumberModEntities.LUMBER_BOT_V_1.get(), LumberBotV1Renderer::new);
		event.registerEntityRenderer(LumberModEntities.SAWBLADE_PROJECTILE.get(), SawbladeProjectileRenderer::new);
	}
}
