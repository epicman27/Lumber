
package net.mcreator.lumber.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.lumber.entity.LumberBotV1Entity;

public class LumberBotV1Renderer extends HumanoidMobRenderer<LumberBotV1Entity, HumanoidModel<LumberBotV1Entity>> {
	public LumberBotV1Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<LumberBotV1Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(LumberBotV1Entity entity) {
		return new ResourceLocation("lumber:textures/entities/lumberbotv1skinversion.png");
	}
}
