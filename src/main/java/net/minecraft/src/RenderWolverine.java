package net.minecraft.src;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityWolf;

/**
 * The rendercow class render the wolverine.
 * @author: Zihao Wu.
 * Version ="1.0a".
 */

@SideOnly(Side.CLIENT)
public abstract class RenderWolverine extends RenderLiving{

	public RenderWolverine(ModelBase par1ModelBase, float par2){
		super(par1ModelBase, par2);
	}
	
	public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, float f, float f1){
		super.doRender((EntityCow)entityliving, d, d1, d2, f, f1);
  }

  public void doRender(Entity entity, double d, double d1, double d2, float f, float f1){
		doRenderLiving((EntityCow)entity, d, d1, d2, f, f1);
  }
}
