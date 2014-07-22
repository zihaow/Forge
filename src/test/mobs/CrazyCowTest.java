package zihaow.mobs.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CrazyCowTest {
	
	private static CrazyCow cc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cc = new CrazyCow(null);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_writeEntityToNBT() {
		cc.writeEntityToNBT(null);
	}
	
	@Test
	public void test_readEntityFromNBT() {
		cc.readEntityFromNBT(null);
	}
	
	@Test
	public void testGetLivingSound() {
		cc.getLivingSound();
	}
	
	@Test
	public void testGetHurtSound() {
		cc.getHurtSound();
	}
	
	public void test_getDeathSound() {
		cc.getDeathSound();
	}
	
	@Test
	public void test_getSoundVolume() {
		cc.getSoundVolume();
	}
	
	@Test
	public void test_getDropItemId() {
		cc.getDropItemId();
	}
}
