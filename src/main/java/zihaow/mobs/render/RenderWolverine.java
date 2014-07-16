package zihaow.mobs.render;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import zihaow.mobs.Mobs;
import zihaow.mobs.entity.Wolverine;
import zihaow.mobs.model.ModelWolverine;

/**
 * The rendercow class render the wolverine.
 * @author: Zihao Wu.
 * Version ="1.0a".
 */

@SideOnly(Side.CLIENT)
public class RenderWolverine extends RenderWolf{

	private static final ResourceLocation texture = new ResourceLocation(Mobs.modId+":"+"textures/model/Wolverine.png");
	
	protected ModelWolverine modelEntity;
	
	public RenderWolverine(ModelBase par1ModelBase, ModelBase par2ModelBase, float par2){
		super(par1ModelBase, par2ModelBase, par2);
		modelEntity = ((ModelWolverine) mainModel);
	}
	
	public void renderWolverine(Wolverine entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double x, double y, double z, float u, float v){
		super.doRender((Wolverine)entityliving, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v){
		doRenderLiving((Wolverine)entity, x, y, z, u, v);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(Entity e1){
    	return texture;
    }
}