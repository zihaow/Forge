package zihaow.GiantItems.Client;

import static org.junit.Assert.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ZihaowGR class, to test the GiantItemRenderer class under
   zihaow.GiantItems.Client package.
 * @author Zihao Wu.
*/

public class ZihaowGR{
	
	Minecraft mc;

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
	/**
	 * to test the handleRenderType method.
	*/
	public void testHandleRenderType(){
		ItemRenderType t1 = ItemRenderType.EQUIPPED;
		ItemRenderType t2 = ItemRenderType.EQUIPPED_FIRST_PERSON;
		assertEquals(t1,ItemRenderType.EQUIPPED);
		assertEquals(t2,ItemRenderType.EQUIPPED_FIRST_PERSON);
	}
	
	@Test
	/**
	 * to test the shouldUseRenderHelper method.
	*/
	public void testShouldUseRenderHelper(){
		ItemRendererHelper h = ItemRendererHelper.EQUIPPED_BLOCK;
		assertSame(h,ItemRendererHelper.EQUIPPED_BLOCK);
	}
	
	@Test
	/**
	 * to test the renderBigItem method.
	*/
	public void testRenderBigItem(){
		Minecraft mc1 = Minecraft.getMinecraft();
		assertSame(mc1,Minecraft.getMinecraft());
		
		TextureManager tm = this.mc.getTextureManager();
		assertEquals(tm,this.mc.getTextureManager());
	}
}
