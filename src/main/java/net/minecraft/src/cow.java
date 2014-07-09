package net.minecraft.src;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 The cow class has a cow's basic features. 
  @author: Zihao Wu.
  version = "1.0". 
*/

public abstract class cow extends EntityAnimal
{
    
    /**
     * Constructor to set the cow.
     * @param world
     * @param cowTextures 
    */
    public cow(World world){
        super(world);
        cowTextures = new ResourceLocation("textures/cow.png");
        setSize(0.9F, 1.3F);
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound){
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound){
        super.readEntityFromNBT(nbttagcompound);
    }

    protected String getLivingSound(){
        return "mob.cow";
    }

    protected String getHurtSound(){
        return "mob.cow";
    }

    protected String getDeathSound(){
        return "mob.cow";
    }

    protected float getSoundVolume(){
        return 0.8F;
    }

    protected int getDropItemId(){
        return 0;
    }
}
