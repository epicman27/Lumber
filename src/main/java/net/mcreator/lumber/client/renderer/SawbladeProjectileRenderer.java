
package net.mcreator.lumber.client.renderer;

public class SawbladeProjectileRenderer extends MobRenderer<SawbladeProjectileEntity, Modelsawbladeprojectile<SawbladeProjectileEntity>> {
	public SawbladeProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsawbladeprojectile<SawbladeProjectileEntity>(context.bakeLayer(Modelsawbladeprojectile.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(SawbladeProjectileEntity entity) {
		return new ResourceLocation("lumber:textures/entities/sawblade.png");
	}
}