package zihaow.mymod.blocks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class myblockTest {
	
	private static myblock mb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mb = new myblock(null);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_registerIcons() {
		mb.registerIcons(null);
	}

}
