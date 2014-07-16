package zihaow.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import zihaow.mobs.Mobs;
import zihaow.mobs.entity.CrazyCow;
import zihaow.mobs.model.ModelCrazyCow;


/**
 The rendercow class render the cow.
 @author: Zihao Wu.
 Version ="1.0".
*/

public class RenderCrazyCow extends RenderLiving{
	
	/**
    public RenderCow(ModelBase modelbase, float f){
        super(modelbase, f);
    }

    public void doRenderLiving(EntityLiving entityliving, 
    double d, double d1, double d2, float f, float f1){
        super.doRender((EntityCow)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, 
    double d2, float f, float f1){
        doRenderLiving((EntityCow)entity, d, d1, d2, f, f1);
    }
    */
    
    private static final ResourceLocation texture = new ResourceLocation(Mobs.modId+":"+"textures/model/Cow.png");
	
	protected ModelCrazyCow modelEntity;
	
	public RenderCrazyCow(ModelBase par1ModelBase, float par2){
		super(par1ModelBase, par2);
		modelEntity = ((ModelCrazyCow) mainModel);
	}
	
	public void renderCrazyCow(CrazyCow entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double x, double y, double z, float u, float v){
		super.doRender((CrazyCow)entityliving, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v){
		doRenderLiving((CrazyCow)entity, x, y, z, u, v);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity e1){
    	return texture;
    }
}