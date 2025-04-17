package net.mcreator.lumber.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.lumber.entity.LumberBotTestEntity;

public class LumberBotTestModel extends GeoModel<LumberBotTestEntity> {
	@Override
	public ResourceLocation getAnimationResource(LumberBotTestEntity entity) {
		return new ResourceLocation("lumber", "animations/lumberbotskinversion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LumberBotTestEntity entity) {
		return new ResourceLocation("lumber", "geo/lumberbotskinversion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LumberBotTestEntity entity) {
		return new ResourceLocation("lumber", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(LumberBotTestEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
