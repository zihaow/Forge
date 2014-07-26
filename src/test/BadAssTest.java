package Test.mobs;

import static org.junit.Assert.*;
import net.minecraft.world.World;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class BadAssTest {
	
	private static BadAss ba;

	@Before
	public void setUp() throws Exception {
	}
	
	@BeforeClass
	public void oneTimeSetUp() throws Exception {
		ba = new BadAss(null);
	}

	@Test
	public void testApplyEntityAttributes() {
		ba.applyEntityAttributes();
	}
	
	@Test
	public void testIsAIEnabled() {
		ba.isAIEnabled();
	}
	
	@Test
	public void TestGetLivingSound() {
		ba.getLivingSound();
	}
	
	@Test
	public void testGetHurtSound() {
		ba.getHurtSound();
	}
	
	@Test
	public void testGetDeathSound() {
		ba.getDeathSound();
	}
	
	@Test
	public void testFunc_145780_a() {
		ba.func_145780_a(1, 2, 3, null);
	}
	
	@Test
	public void testGetDropItem() {
		ba.getDropItem();
	}
	
	@Test
	public void testGetCreatureAttribute() {
		ba.getCreatureAttribute();
	}
	
}
