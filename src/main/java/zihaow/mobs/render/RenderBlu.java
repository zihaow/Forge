package zihaow.mobs.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import zihaow.mobs.mobs;
import zihaow.mobs.entity.Blu;
import zihaow.mobs.model.ModelBlu;

/**
 * The renderBlu class render Blu.
 * @author: Zihao Wu.
 * Version ="1.0a".
 */

@SideOnly(Side.CLIENT)
public class RenderBlu extends RenderLiving{
	
	protected ModelBlu modelEntity;
	
	public RenderBlu(ModelBase par1ModelBase, float par2){
		super(par1ModelBase, par2);
		modelEntity = ((ModelBlu) mainModel);
	}
	
	public void renderCrazyCow(Blu entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double x, double y, double z, float u, float v){
		super.doRender((Blu)entityliving, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v){
		doRenderLiving((Blu)entity, x, y, z, u, v);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return null;
	}
}
