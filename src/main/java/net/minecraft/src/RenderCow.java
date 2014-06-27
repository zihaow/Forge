package net.minecraft.src;

import net.minecraft.client.model.ModelBase;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;

public abstract class RenderCow extends RenderLiving
{
    public RenderCow(ModelBase modelbase, float f)
    {
        super(modelbase, f);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRender((EntityCow)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        doRenderLiving((EntityCow)entity, d, d1, d2, f, f1);
    }
}