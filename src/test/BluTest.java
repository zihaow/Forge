package Test.mobs;

import static org.junit.Assert.*;
import org.junit.BeforeClass;

import org.junit.Before;
import org.junit.Test;

public class BluTest {

	private static Blu b;
	@Before
	public void setUp() throws Exception {
	}

	@BeforeClass
	public void testOneTimeTest() {
		b = new Blu(null);
	}
	
	@Test
	public void testApplyEntityAttributes() {
		b.applyEntityAttributes();;
	}
	
	@Test
	public void testGetLivingSound() {
		b.getLivingSound();
	}
	
	@Test
	public void testGetHurtSound() {
		b.getHurtSound();
	}
	
	@Test
	public void test_func_145780_a() {
		b.func_145780_a(1, 2, 3, null);;
	}

}
