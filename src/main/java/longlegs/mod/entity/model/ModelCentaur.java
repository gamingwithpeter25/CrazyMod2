package longlegs.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelCentaur extends ModelBase {
    
	public ModelRenderer cowBody;
    public ModelRenderer cowUdders;
    public ModelRenderer cowBackLeg1;
    public ModelRenderer cowFrontLeg1;
    public ModelRenderer cowBackLeg2;
    public ModelRenderer cowFrontLeg2;
    public ModelRenderer villagerHead;
    public ModelRenderer villagerRightHand;
    public ModelRenderer villagerLeftHand;
    public ModelRenderer villagerMiddleHand;
    public ModelRenderer villagerChest;
    public ModelRenderer villagerCoat;
    public ModelRenderer villagerNose;
    public ModelRenderer villagerHeadChild;
    protected float childYOffset = 18.0f;
    protected float childZOffset = 4.0f;

    public ModelCentaur() 
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.cowFrontLeg1 = new ModelRenderer(this, 0, 16);
        this.cowFrontLeg1.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.cowFrontLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cowBody = new ModelRenderer(this, 18, 0);
        this.cowBody.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.cowBody.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(cowBody, 1.5707963267948966F, 0.0F, 0.0F);
        this.cowBackLeg2 = new ModelRenderer(this, 0, 16);
        this.cowBackLeg2.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.cowBackLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cowUdders = new ModelRenderer(this, 52, 0);
        this.cowUdders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.cowUdders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(cowUdders, 1.5707963267948966F, 0.0F, 0.0F);
        this.villagerNose = new ModelRenderer(this, 24, 34);
        this.villagerNose.setRotationPoint(0.0F, -3.1F, -1.4F);
        this.villagerNose.addBox(-1.0F, -1.0F, -8.7F, 2, 4, 2, 0.0F);
        this.villagerMiddleHand = new ModelRenderer(this, 40, 72);
        this.villagerMiddleHand.setRotationPoint(0.0F, -12.0F, -5.3F);
        this.villagerMiddleHand.addBox(-4.0F, 2.0F, -2.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(villagerMiddleHand, -0.7499679795819634F, 0.0F, 0.0F);
        this.cowFrontLeg2 = new ModelRenderer(this, 0, 16);
        this.cowFrontLeg2.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.cowFrontLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.villagerChest = new ModelRenderer(this, 16, 54);
        this.villagerChest.setRotationPoint(0.0F, -15.0F, -1.9F);
        this.villagerChest.addBox(-4.0F, 0.0F, -5.0F, 8, 12, 6, 0.0F);
        this.villagerCoat = new ModelRenderer(this, 0, 74);
        this.villagerCoat.setRotationPoint(0.0F, -15.0F, 0.0F);
        this.villagerCoat.addBox(-4.0F, 0.0F, -6.7F, 8, 17, 6, 0.5F);
        this.villagerHeadChild = new ModelRenderer(this, 24, 68);
        this.villagerHeadChild.setRotationPoint(4.0F, 7.0F, 4.0F);
        this.villagerHeadChild.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.cowBackLeg1 = new ModelRenderer(this, 0, 16);
        this.cowBackLeg1.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.cowBackLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.villagerLeftHand = new ModelRenderer(this, 44, 57);
        this.villagerLeftHand.setRotationPoint(0.0F, -12.0F, -5.2F);
        this.villagerLeftHand.addBox(-8.0F, -2.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerLeftHand, -0.7499679795819634F, 0.0F, 0.0F);
        this.villagerHead = new ModelRenderer(this, 0, 34);
        this.villagerHead.setRotationPoint(0.0F, -15.0F, 0.5F);
        this.villagerHead.addBox(-4.0F, -10.0F, -8.2F, 8, 10, 8, 0.0F);
        this.villagerRightHand = new ModelRenderer(this, 44, 57);
        this.villagerRightHand.setRotationPoint(0.0F, -12.0F, -5.1F);
        this.villagerRightHand.addBox(3.0F, -1.9F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerRightHand, -0.7499679795819634F, 0.0F, 0.0F);
        this.villagerHead.addChild(this.villagerNose);
        this.villagerHeadChild.addChild(this.villagerHead);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        
    	if(this.isChild) 
    	{
    		float f = 2.0F;
    		GlStateManager.pushMatrix();
    		GlStateManager.translate(0F, this.childYOffset * scale, this.childZOffset * scale);
    		
    		GlStateManager.popMatrix();
    		GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.villagerHead.render(scale);
            this.villagerMiddleHand.render(scale);
            this.cowBody.render(scale);
            this.cowBackLeg1.render(scale);
            this.villagerChest.render(scale);
            this.villagerCoat.render(scale);
            this.cowUdders.render(scale);
            this.cowFrontLeg2.render(scale);
            this.villagerRightHand.render(scale);
            this.cowBackLeg2.render(scale);
            this.villagerLeftHand.render(scale);
            this.cowFrontLeg1.render(scale);
            GlStateManager.popMatrix();
    	}
    	
    	else 
    	{
            this.villagerHead.render(scale);
            this.villagerMiddleHand.render(scale);
            this.cowBody.render(scale);
            this.cowBackLeg1.render(scale);
            this.villagerChest.render(scale);
            this.villagerCoat.render(scale);
            this.cowUdders.render(scale);
            this.cowFrontLeg2.render(scale);
            this.villagerRightHand.render(scale);
            this.cowBackLeg2.render(scale);
            this.villagerLeftHand.render(scale);
            this.cowFrontLeg1.render(scale);
    	}

    }


    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	//makes centaur walk 
		this.cowBody.rotateAngleX = ((float) Math.PI / 2F);
		this.cowBackLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.cowBackLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.cowFrontLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.cowFrontLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    			
    		this.villagerHead.rotateAngleY = netHeadYaw / (700F / (float) Math.PI);
    		this.villagerHead.rotateAngleX = headPitch / (700F / (float) Math.PI);
    }
    
    
}    
