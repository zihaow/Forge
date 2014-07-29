package zihaow.GiantItems;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.config.Configuration;

/**
 * ZihaoG class, used to test the GiantItems class under zihaow package.
 * @author: Zihao Wu.
*/

public class ZihaowG {

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
	public void testConfig(FMLPreInitializationEvent event){
		Configuration config1 = new Configuration(event.getSuggestedConfigurationFile());
		if(config1 instanceof Configuration)
			System.out.println("Success to configuration: ");
		else
			System.out.println("Fail to configuration.");
	}
	
	@Test
	public void testEvent(){
		FMLInitializationEvent event1 = new FMLInitializationEvent();
		if(event1 instanceof FMLInitializationEvent)
			System.out.println("Event FMLinitialization success.");
		else
			System.out.println("Fail to event FMLinitialization.");
	}

}
