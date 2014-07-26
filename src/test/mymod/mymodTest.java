package zihaow.mymod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mymodTest {
	
	private static mymod mm;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_preInit() {
		mm.preInit(null);
	}
	
	@Test
	public void test_init() {
		mm.init(null);
	}
	
	@Test
	public void test_postInit() {
		mm.postInit(null);
	}
}
