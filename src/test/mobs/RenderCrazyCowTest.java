package zihaow.mobs.render;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RenderCrazyCowTest {
	
	private static RenderCrazyCow rc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rc = new RenderCrazyCow(null, 3);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_renderCrazyCow() {
		rc.renderCrazyCow(null, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_doRenderLiving() {
		rc.doRenderLiving(null, 0, 0, 0, 0, 0);
	}
}
