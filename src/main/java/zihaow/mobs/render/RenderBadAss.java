package zihaow.mobs.render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zihaow.mobs.Mobs;
import zihaow.mobs.entity.BadAss;
import zihaow.mobs.entity.CrazyCow;
import zihaow.mobs.model.ModelBadAss;
import zihaow.mobs.model.ModelCrazyCow;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

/**
 *The RenderBadAss class render the bad ass.
 * @author: Zihao Wu.
 */

@SideOnly(Side.CLIENT)
public class RenderBadAss extends RenderZombie {
	
	private static final ResourceLocation badAssTextures = new ResourceLocation(Mobs.modId + ":" + "textures/model/BadAss.png");
	protected ModelBadAss baentity;
	
	public RenderBadAss(){
        super();
        baentity = ((ModelBadAss) mainModel);
    }
	
	public void doRender(EntityMob par1EntityZombie, double par2, double par4, double par6, float par8, float par9){
	    super.doRender((BadAss)par1EntityZombie, par2, par4, par6, par8, par9);
	}
	
	public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
        this.doRender((BadAss)par1EntityLiving, par2, par4, par6, par8, par9);
    }
	
	public void renderBadAss(BadAss entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	@Override
    protected ResourceLocation getEntityTexture(Entity e1){
    	return badAssTextures;
    }
}
