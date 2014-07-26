package zihaow.mobs.render;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RenderBadAssTest {
	
	private static RenderBadAss rb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rb = new RenderBadAss();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_doRender() {
		rb.doRender(null, 0, 0, 0, 0, 0);
		
	}
	
	@Test
	public void test_doRender2() {
		
		rb.doRender(null, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_renderBadAss() {
		rb.renderBadAss(null, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_getEntityTexture() {
		rb.getEntityTexture(null);
	}
}
