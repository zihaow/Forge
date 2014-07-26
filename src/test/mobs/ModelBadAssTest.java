package zihaow.mobs.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelBadAssTest {
	
	private static ModelBadAss mb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mb = new ModelBadAss();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_render() {
		mb.render(null, 0, 0, 0, 0, 0, 0);
	}
	
	@Test
	public void test_setRotation() {
		mb.setRotationAngles(0, 0, 0, 0, 0, 0, null);
	}
	
	@Test
	public void test_setRotationAngles() {
		mb.setRotationAngles(0, 0, 0, 0, 0, 0, null);
	}
}
