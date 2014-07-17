package zihaow.mobs.model;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBadAss extends ModelZombie{
	ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
  
  public ModelBadAss(){
	  
	  textureWidth = 1440;
	  textureHeight = 960;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 11, 10, 11);
      head.setRotationPoint(0F, 6F, 0F);
      head.setTextureSize(1440, 960);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 3F, -2F, 9, 12, 4);
      body.setRotationPoint(2F, 6F, 0F);
      body.setTextureSize(1440, 960);
      body.mirror = true;
      setRotation(body, -0.0297429F, 0F, 0F);
      
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-2F, 0F, -2F, 18, 6, 4);
      leg3.setRotationPoint(-2F, 18F, -4F);
      leg3.setTextureSize(1440, 960);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-2F, 0F, -2F, 10, 6, 4);
      leg4.setRotationPoint(2F, 18F, -4F);
      leg4.setTextureSize(1440, 960);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(0F, 0F, -2F, 18, 6, 4);
      leg1.setRotationPoint(-4F, 18F, 4F);
      leg1.setTextureSize(1440, 960);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      
      leg2 = new ModelRenderer(this, 9, 16);
      leg2.addBox(-1F, 0F, -2F, 4, 6, 4);
      leg2.setRotationPoint(2F, 18F, 4F);
      leg2.setTextureSize(1440, 960);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
	  
	  super.render(entity, f, f1, f2, f3, f4, f5);
      
	  setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      head.render(f5);
      body.render(f5);
      leg3.render(f5);
      leg4.render(f5);
      leg1.render(f5);
      leg2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z){
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e){
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

}
