package lucas.MoeMobsMod.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import lucas.MoeMobsMod.entities.Caveman;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CavemanModel<T extends Caveman> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer hair;
	private final ModelRenderer front;
	private final ModelRenderer right;
	private final ModelRenderer left;
	private final ModelRenderer back;
	private final ModelRenderer beard;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer robe;
	
	
	public CavemanModel() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-8.0F, -33.0F, -5.0F, 16.0F, 11.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(-5.0F, -22.0F, -4.0F, 10.0F, 8.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -11.6667F, -3.5F);
		head.setTextureOffset(28, 29).addBox(-4.0F, -6.3333F, -3.5F, 8.0F, 9.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(28, 27).addBox(-4.0F, -4.3333F, -4.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		hair = new ModelRenderer(this);
		hair.setRotationPoint(0.0F, -6.3333F, -3.5F);
		head.addChild(hair);
		hair.setTextureOffset(0, 38).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(front);
		front.setTextureOffset(4, 67).addBox(-4.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		front.setTextureOffset(22, 59).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		front.setTextureOffset(16, 58).addBox(2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		front.setTextureOffset(60, 68).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		front.setTextureOffset(61, 54).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		right = new ModelRenderer(this);
		right.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(right);
		right.setTextureOffset(16, 61).addBox(4.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(0, 67).addBox(4.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(20, 47).addBox(4.0F, -1.0F, 7.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(4, 0).addBox(4.0F, -1.0F, 6.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(24, 53).addBox(4.0F, -1.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(46, 21).addBox(4.0F, -1.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		right.setTextureOffset(0, 37).addBox(4.0F, -1.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		right.setTextureOffset(56, 56).addBox(4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		left = new ModelRenderer(this);
		left.setRotationPoint(-9.0F, 0.0F, 0.0F);
		hair.addChild(left);
		left.setTextureOffset(52, 46).addBox(4.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(66, 52).addBox(4.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(16, 47).addBox(4.0F, -1.0F, 7.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(0, 0).addBox(4.0F, -1.0F, 6.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(48, 0).addBox(4.0F, -1.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(24, 37).addBox(4.0F, -1.0F, 4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left.setTextureOffset(0, 21).addBox(4.0F, -1.0F, 2.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		left.setTextureOffset(24, 47).addBox(4.0F, -1.0F, 1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setRotationPoint(-9.0F, 0.0F, 0.0F);
		hair.addChild(back);
		back.setTextureOffset(52, 20).addBox(4.0F, -1.0F, 8.0F, 10.0F, 10.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(52, 31).addBox(4.0F, 8.0F, 9.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
		back.setTextureOffset(28, 21).addBox(5.0F, 8.0F, 12.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(56, 52).addBox(3.0F, 8.0F, 12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(52, 35).addBox(13.0F, 8.0F, 12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(12, 67).addBox(13.0F, 10.0F, 12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(65, 35).addBox(11.0F, 11.0F, 12.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(52, 0).addBox(10.0F, 11.0F, 12.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(42, 0).addBox(8.0F, 11.0F, 12.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(0, 43).addBox(6.0F, 11.0F, 12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(8, 67).addBox(5.0F, 11.0F, 12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(67, 2).addBox(4.0F, 10.0F, 12.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(60, 37).addBox(2.0F, 8.0F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(56, 68).addBox(2.0F, 8.0F, 8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(23, 68).addBox(1.0F, 8.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(19, 68).addBox(3.0F, 8.0F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(58, 35).addBox(2.0F, 8.0F, 11.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(0, 27).addBox(14.0F, 8.0F, 10.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(15, 68).addBox(14.0F, 8.0F, 11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(46, 7).addBox(14.0F, 8.0F, 8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		beard = new ModelRenderer(this);
		beard.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(beard);
		beard.setTextureOffset(12, 47).addBox(-1.0F, 9.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(65, 38).addBox(0.0F, 9.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(0, 47).addBox(1.0F, 8.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(24, 65).addBox(2.0F, 8.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(62, 52).addBox(3.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(20, 65).addBox(-2.0F, 8.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(16, 65).addBox(-3.0F, 8.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(42, 46).addBox(-4.0F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(64, 0).addBox(-4.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(24, 62).addBox(3.0F, 6.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(20, 62).addBox(4.0F, 5.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(38, 46).addBox(4.0F, 4.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		beard.setTextureOffset(42, 5).addBox(-5.0F, 4.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		beard.setTextureOffset(4, 21).addBox(-5.0F, 6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(28, 47).addBox(-5.0F, 5.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(28, 25).addBox(-4.0F, 5.0F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(24, 44).addBox(-3.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		beard.setTextureOffset(4, 37).addBox(2.0F, 6.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-10.0F, -6.0F, 0.0F);
		left_arm.setTextureOffset(56, 40).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);
		left_arm.setTextureOffset(42, 46).addBox(-2.0F, 3.0F, -2.0F, 3.0F, 21.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(10.0F, -6.0F, 0.0F);
		right_arm.setTextureOffset(56, 56).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(28, 46).addBox(-1.0F, 2.0F, -2.0F, 3.0F, 22.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-4.0F, 10.0F, 0.0F);
		left_leg.setTextureOffset(52, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(4.0F, 10.0F, 0.0F);
		right_leg.setTextureOffset(0, 47).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);

		robe = new ModelRenderer(this);
		robe.setRotationPoint(0.0F, -2.0F, -4.0F);
		robe.setTextureOffset(0, 73).addBox(-9.0F, -7.0F, 7.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		robe.setTextureOffset(0, 72).addBox(-8.0F, -5.0F, -2.0F, 5.0F, 11.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(14, 79).addBox(-9.0F, -4.0F, 9.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 75).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 8.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 76).addBox(1.0F, 1.0F, -2.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(18, 73).addBox(-7.0F, 6.0F, -1.0F, 14.0F, 8.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 82).addBox(-7.0F, 6.0F, 8.0F, 14.0F, 8.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 67).addBox(8.0F, 2.0F, -2.0F, 1.0F, 4.0F, 12.0F, 0.0F, false);
		robe.setTextureOffset(4, 66).addBox(7.0F, 6.0F, -1.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
		robe.setTextureOffset(19, 64).addBox(-8.0F, 6.0F, -1.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
		robe.setTextureOffset(4, 67).addBox(-9.0F, 0.0F, -2.0F, 1.0F, 6.0F, 11.0F, 0.0F, false);
		robe.setTextureOffset(8, 75).addBox(-3.0F, 0.0F, 9.0F, 11.0F, 6.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(1, 73).addBox(-9.0F, -8.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		robe.setTextureOffset(0, 74).addBox(-8.0F, -8.0F, -2.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		robe.setTextureOffset(0, 76).addBox(-5.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(6, 74).addBox(-3.0F, -3.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 76).addBox(1.0F, 0.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 76).addBox(1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 77).addBox(8.0F, 1.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(23, 76).addBox(-3.0F, -3.0F, 9.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(12, 78).addBox(-9.0F, -7.0F, 9.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 82).addBox(-6.0F, -6.0F, 9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 78).addBox(-5.0F, -5.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 76).addBox(-9.0F, -8.0F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(23, 76).addBox(-1.0F, -1.0F, 9.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(6, 73).addBox(-3.0F, -4.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(8, 75).addBox(-8.0F, -7.0F, -2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		robe.setTextureOffset(0, 82).addBox(-9.0F, -8.0F, 1.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		robe.setTextureOffset(0, 74).addBox(-8.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityin, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//setRotationAngles(entityin, 13.0f, 5.0f, 0.0f, 0.0f, 0.0f);
		
	    this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	    this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	    this.left_leg.rotateAngleX = -1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
	    this.right_leg.rotateAngleX = 1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
	    this.left_leg.rotateAngleY = 0.0F;
	    this.right_leg.rotateAngleY = 0.0F;
	    
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		robe.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	private float triangleWave(float p_78172_1_, float p_78172_2_) {
	      return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
	   }
}