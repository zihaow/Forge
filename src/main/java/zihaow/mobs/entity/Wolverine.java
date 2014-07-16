package zihaow.mobs.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

/**
 * The Wolverine class creates a wolf called wolverine
 * that is very aggressive and it will attack the player
 * no matter what
 * @author Zihao Wu, Xuefei Yang.
 * Version = "1.0a".
 */

public class Wolverine extends EntityWolf{

	ResourceLocation cowTextures;
	
	public Wolverine(World par1World){
		super(par1World);
        this.setSize(1.0F, 1.2F);
        cowTextures = new ResourceLocation("textures.wolverine.png");
        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 1.2F));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 2.0D, true));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
        this.tasks.addTask(6, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIBeg(this, 8.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 3.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, EntitySheep.class, 250, false));
        this.setTamed(false);
	}
	
	
	/**
	 To make the wolverine very aggressive.
	 */
	@Override
    public void setAttackTarget(EntityLivingBase par1EntityLivingBase){
        super.setAttackTarget(par1EntityLivingBase);
        if (par1EntityLivingBase == null){
            this.setAngry(true);
        }
        else if (!this.isTamed()){
            this.setAngry(true);
        }
    }
    
    protected String getLivingSound(){
        return this.isAngry() ? "textures.wolverine.growl" : (this.rand.nextInt(3) == 0 ? (this.isTamed() && this.dataWatcher.getWatchableObjectFloat(18) < 10.0F ? "textures.wolverine.whine" : "textures.wolverine.panting") : "textures.wolverine.bark");
    }

    protected String getHurtSound(){
        return "textures.wolverine.hurt";
    }

    protected String getDeathSound(){
        return "textures.wolverine.death";
    }

    @Override
    protected float getSoundVolume(){
        return 0.8F;
    }

}
