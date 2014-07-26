package zihaow.mobs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class MobsTest {

	private static Mobs mobs;
	private static FMLPreInitializationEvent event;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPreInit() {
		mobs.preInit(event);
	}
	
	@Test
	public void testInit() {
		mobs.init(null);
	}
	
	@Test
	public void testPostInit() {
		mobs.postInit(null);
	}

}
