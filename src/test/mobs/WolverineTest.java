package zihaow.mobs.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WolverineTest {

	private static Wolverine w;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		w = new Wolverine(null);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_applyEntityArrtibute() {
		w.applyEntityArrtibute();
	}
	
	@Before
	public void test_setAttackTarget() {
		w.setAttackTarget(null);
	}
	
	@Before
	public void test_getLivingSound() {
		w.getLivingSound();
	}
	
	@Before
	public void test_getHurtSound() {
		w.getHurtSound();
	}
	
	@Before
	public void test_getDeathSound() {
		w.getDeathSound();
	}
	
	@Before
	public void test_getSoundVolume() {
		w.getSoundVolume();
	}

}
