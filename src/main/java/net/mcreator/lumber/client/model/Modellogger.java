package net.mcreator.lumber.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellogger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("lumber", "modellogger"), "main");
	public final ModelPart head;
	public final ModelPart rightfrontleg;
	public final ModelPart leftfrontleg;
	public final ModelPart rightbackleg;
	public final ModelPart leftbackleg;

	public Modellogger(ModelPart root) {
		this.head = root.getChild("head");
		this.rightfrontleg = root.getChild("rightfrontleg");
		this.leftfrontleg = root.getChild("leftfrontleg");
		this.rightbackleg = root.getChild("rightbackleg");
		this.leftbackleg = root.getChild("leftbackleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, -8)
				.addBox(4.0F, -2.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, -8).addBox(-4.0F, -2.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, -8).addBox(-4.0F, -15.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, -8).addBox(4.0F, -15.0F, -4.0F, 0.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition rightfrontleg = partdefinition.addOrReplaceChild("rightfrontleg",
				CubeListBuilder.create().texOffs(16, 16).addBox(-2.8333F, -0.5F, -1.1667F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 2).addBox(-1.8333F, -1.5F, -1.1667F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.8333F, 19.5F, -5.8333F));
		PartDefinition cube_r2 = rightfrontleg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 2).addBox(-7.0F, -6.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8333F, 4.5F, 5.8333F, 0.0F, -1.5708F, 0.0F));
		PartDefinition leftfrontleg = partdefinition.addOrReplaceChild("leftfrontleg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.8333F, -0.5F, -2.8333F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.8333F, 19.5F, 5.8333F));
		PartDefinition cube_r3 = leftfrontleg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 2).addBox(-7.0F, -6.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8333F, 4.5F, -5.8333F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r4 = leftfrontleg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 2).addBox(4.0F, -6.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8333F, 4.5F, -5.8333F, 0.0F, -1.5708F, 0.0F));
		PartDefinition rightbackleg = partdefinition.addOrReplaceChild("rightbackleg",
				CubeListBuilder.create().texOffs(0, 26).addBox(-1.1667F, -0.5F, -1.1667F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(2, 2).addBox(-1.1667F, -1.5F, -1.1667F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.8333F, 19.5F, -5.8333F));
		PartDefinition cube_r5 = rightbackleg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(2, 2).addBox(-7.0F, -6.0F, 7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8333F, 4.5F, 5.8333F, 0.0F, -1.5708F, 0.0F));
		PartDefinition leftbackleg = partdefinition.addOrReplaceChild("leftbackleg", CubeListBuilder.create().texOffs(16, 26).addBox(-1.1667F, -0.5F, -2.8333F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.8333F, 19.5F, 5.8333F));
		PartDefinition cube_r6 = leftbackleg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(2, 2).addBox(4.0F, -6.0F, -7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8333F, 4.5F, -5.8333F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r7 = leftbackleg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(2, 2).addBox(4.0F, -6.0F, 7.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.8333F, 4.5F, -5.8333F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfrontleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightbackleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftbackleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
