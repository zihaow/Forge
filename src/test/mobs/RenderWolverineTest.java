package zihaow.mobs.render;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RenderWolverineTest {

	private static RenderWolverine rw;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rw = new RenderWolverine(null, null, 2);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_renderWolverine() {
		rw.renderWolverine(null, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_doRenderLiving() {
		rw.doRenderLiving(null, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_getEntityTexture() {
		rw.getEntityTexture(null);
	}

}
