
package net.mcreator.lumber.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.lumber.entity.SawbladeProjectileEntity;
import net.mcreator.lumber.client.model.Modelsawbladeprojectile;

public class SawbladeProjectileRenderer extends MobRenderer<SawbladeProjectileEntity, Modelsawbladeprojectile<SawbladeProjectileEntity>> {
	public SawbladeProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsawbladeprojectile<SawbladeProjectileEntity>(context.bakeLayer(Modelsawbladeprojectile.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SawbladeProjectileEntity entity) {
		return new ResourceLocation("lumber:textures/entities/sawblade.png");
	}
}
