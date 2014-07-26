package zihaow.mobs.client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientProxyTest {
	
	private static ClientProxy cp;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRegisterRenderThings() {
		cp.registerRenderThings();
	}

}
