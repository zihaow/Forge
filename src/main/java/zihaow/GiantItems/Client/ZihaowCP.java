package zihaow.GiantItems.Client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import zihaow.GiantItems.GiantItems;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameData;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 ZihaowCP class, to test the ClientProxy 
 class under zihaow.GiantItems.Client package 
 @author: Zihao Wu.
*/

public class ZihaowCP {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("setupBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception{
		System.out.println("setUp()");
	}

	@After
	public void tearDown() throws Exception{
		System.out.println("tearDown()");
	}

	@Test
	//to test the registerClientInformation() method.
	public void testRegisterClientInformation(){
		Item i1= new Item();
		for(int i=0;i<GiantItems.ItemIDs.length;i++){
			assertEquals(i1,GameData.itemRegistry.getObject(GiantItems.ItemIDs[i]));
		}
	}
	
	@Test
	//to test the getClientWorld() method.
    public void testGetClientWorld(){
		World w = null;
		assertEquals(w,FMLClientHandler.instance().getClient().theWorld);
	}
}
