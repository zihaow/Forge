package zihaow.mobs.handler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EntityHandlerTest {
	
	private static EntityHandler eh;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_registerEntities() {
		eh.registerEntities(null, null);
	}
	
	@Test
	public void test_registerMonster() {
		eh.registerMonster(null, null);
	}
	
	@Test
	public void test_registerFriendly() {
		eh.registerFriendly(null, null);
	}

}
