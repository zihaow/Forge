package zihaow.mobs.model;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

/**
 The ModelCow class sets the cow's model.
 @author: Zihao Wu.
 Version = "1.0".
*/

public class ModelCrazyCow extends ModelQuadruped{

    //Constructors 
    public ModelCrazyCow(){
        super(12, 0.0F);
        ModelBase m = null;
        
        //head's models.
        head = new ModelRenderer(m);
        head.setRotationPoint(1f, 1f, 1f);
        head.addBox(-4F, -4F, -6F, 8, 8, 6, 0.0F);
        
        //horn's models.
        horn1 = new ModelRenderer(m,22, 0);
        horn1.addBox(-4F, -5F, -4F, 1, 3, 1, 0.0F);
        horn1.setRotationPoint(1f, 1f, 1f);;
        horn2 = new ModelRenderer(m,22, 0);
        horn2.addBox(4F, -5F, -4F, 1, 3, 1, 0.0F);
        horn2.setRotationPoint(1f, 1f, 1f);
        
        //udders's models
        udders = new ModelRenderer(m,52, 0);
        udders.addBox(-2F, -3F, 0.0F, 4, 6, 2, 0.0F);
        udders.setRotationPoint(1f, 1f, 1f);
        udders.rotateAngleX = 1.570796F;
        
        //body model
        body = new ModelRenderer(m,18, 4);
        body.addBox(-6F, -10F, -7F, 12, 18, 10, 0.0F);
        body.setRotationPoint(1f, 1f, 1f);
        
        //leg model
        leg1.offsetX--;
        leg2.offsetX++;
        leg1.offsetZ += 0.0F;
        leg2.offsetZ += 0.0F;
        leg3.offsetX--;
        leg4.offsetX++;
        leg3.offsetZ--;
        leg4.offsetZ--;
    }
    
    //model variable declarations. 
    ModelRenderer udders;
    ModelRenderer horn1;
    ModelRenderer horn2;

    //to render the cow
    public void render(Entity e,float f, float f1, float f2, float f3, float f4, float f5){
        super.render(e,f, f1, f2, f3, f4, f5);
        horn1.render(f5);
        horn2.render(f5);
        udders.render(f5);
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity e){
        super.setRotationAngles(f, f1, f2, f3, f4, f5,e);
        horn1.rotateAngleY = head.rotateAngleY;
        horn1.rotateAngleX = head.rotateAngleX;
        horn2.rotateAngleY = head.rotateAngleY;
        horn2.rotateAngleX = head.rotateAngleX;
    }
}
