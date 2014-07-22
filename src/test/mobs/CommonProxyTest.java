package zihaow.mobs.common;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommonProxyTest {
	
	private static CommonProxy cp;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		cp.registerRenderThings();
	}

}
