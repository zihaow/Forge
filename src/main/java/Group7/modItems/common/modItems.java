package Group7.modItems.common;

import Group7.modItems.common.item.ItemPowerfulSword;
import Group7.modItems.common.block.BlockPowerfulBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

	/**
 	  * modItems class, which is the main class for our mod items.
 	  * @Author: Zihao Wu, Xuefei Yang, 
 		     James MacNeil, Yuanjing Lin,
 		     Alireza Afkari.
	*/

@Mod(modid="modItems", name="modItems",version="1.0a")

public class modItems{
	
	//aggregation
	@Instance("modItems")
	public static modItems instance;
	
	@SidedProxy(clientSide="Group7.modItems.client.ClientProxy",serverSide="Group7.modItems.common.CommonProxy")
	
	public static CommonProxy proxy;
	public static Block PowerfulBlock;
	public static Item PowerfulSword;
	
	/**
	 * a void method for set pre-initialization event
	 * @param event
	 */
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
	}
	
	/**
	 * a void method for set FML initialization event
	 * @param event
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		PowerfulSword = new ItemPowerfulSword(ToolMaterial.GOLD).setUnlocalizedName("PowerfulSword");
		PowerfulBlock = new BlockPowerfulBlock(8000).setBlockName("PowerfulBlock");
		GameRegistry.registerBlock(PowerfulBlock, "PowerfulBlock");
		GameRegistry.registerItem(PowerfulSword,"PowerfulSword");
	}
	
	/**
	 * a method that set necessary initialization event on this
	 * @param event
	 */
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
