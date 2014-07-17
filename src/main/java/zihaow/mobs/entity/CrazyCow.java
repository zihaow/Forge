package zihaow.mobs.entity;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.EntityLiving;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 The cow class has a cow's basic features. 
  @author: Zihao Wu, Xuefei Yang.
  version = "1.0a". 
*/

public class CrazyCow extends EntityLiving
{
	ResourceLocation cowTextures;
	
	/**
	 * Constructor to set the cow.
	 * @param world
	 * @param cowTextures
	 */
    public CrazyCow(World world){
        super(world);
        cowTextures = new ResourceLocation("textures/CrazyCow.png");
        setSize(0.9F, 1.3F);
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound){
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound){
        super.readEntityFromNBT(nbttagcompound);
    }

    protected String getLivingSound(){
        return "textures.CrazyCow";
    }

    protected String getHurtSound(){
        return "textures.CrazyCow";
    }

    protected String getDeathSound(){
        return "textures.CrazyCow";
    }

    protected float getSoundVolume(){
        return 0.8F;
    }

    protected int getDropItemId(){
        return 0;
    }
}
