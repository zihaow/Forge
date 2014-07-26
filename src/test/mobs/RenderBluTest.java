package zihaow.mobs.render;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RenderBluTest {

	private static RenderBlu rb;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rb = new RenderBlu(null, 2);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_renderCrazyCow() {
		rb.renderCrazyCow(null, 0, 0, 0, 0, 0);
		
	}
	
	@Test
	public void test_doRenderLiving() {
		rb.doRenderLiving(null, 0, 0, 0, 0, 0);		
	}
	
	@Test
	public void test_getEntityTexture() {
		rb.getEntityTexture(null);
	}
}
