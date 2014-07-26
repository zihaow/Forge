package zihaow.mymod.items;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class myswordTest {
	
	private static mysword ms;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ms = new mysword(null);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_registerIcons() {
		ms.registerIcons(null);
	}
	
	@Test
	public void test_getMaxItemUseDuration() {
		ms.getMaxItemUseDuration(null);
	}

}
