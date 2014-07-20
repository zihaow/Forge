package zihaow.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.World;

/**
 * The blus class set the basic feature for blu.
 * @author Zihao Wu.
 */

public class Blu extends EntityPig {
	
	/**
	 * constrcutor
	 * @param world
	 */
	public Blu(World world){
        super(world);
        this.setSize(1.2F, 1.2F);
        this.getNavigator().setAvoidsWater(false);
        this.getNavigator().setEnterDoors(true);
        this.getNavigator().getCanBreakDoors();
        this.getNavigator().setSpeed(0.1D);
        this.getNavigator().setCanSwim(true);
        
    }
	
	/**
	 * set blu's attribute
	 */
	protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
    }
	
	/**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.pig.say";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.pig.say";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "mob.pig.death";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.pig.step", 0.15F, 1.0F);
    }
}
