package net.minecraft.src;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class cow extends EntityAnimal
{
    public cow(World world)
    {
        super(world);
        texture = "/mob/cow.png";
        setSize(1.0F, 1.5F);
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    }

    protected String getLivingSound()
    {
        return "mob.cow”;
    }

    protected String getHurtSound()
    {
        return "mob.cow”;
    }

    protected String getDeathSound()
    {
        return "mob.cow”;
    }

    protected float getSoundVolume()
    {
        return 0.5F;
    }

    protected int getDropItemId()
    {
        return 0;
    }
}