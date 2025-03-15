
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lumber.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.lumber.client.model.Modelv1;
import net.mcreator.lumber.client.model.Modelsawbladeprojectile;
import net.mcreator.lumber.client.model.Modellogger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LumberModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsawbladeprojectile.LAYER_LOCATION, Modelsawbladeprojectile::createBodyLayer);
		event.registerLayerDefinition(Modelv1.LAYER_LOCATION, Modelv1::createBodyLayer);
		event.registerLayerDefinition(Modellogger.LAYER_LOCATION, Modellogger::createBodyLayer);
	}
}
