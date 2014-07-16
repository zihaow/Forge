package zihaow.mymod;

import zihaow.mymod.blocks.myblock;
import zihaow.mymod.items.mysword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


	/**
 	modItems class, which is the main class for our mod items.
 	@Author: Zihao Wu, Xuefei Yang, 
 		  	 James MacNeil, Yuanjing Lin,
 		  	 Alireza Afkari.
	*/

@Mod(modid=mymod.modid,version="1.0a")

public class mymod{
	
	
	
	//@SidedProxy(clientSide="Group7.modItems.client.ClientProxy",serverSide="Group7.modItems.common.CommonProxy")
	
	public static final String modid = "mymod";
	//public static CommonProxy proxy;
	public static Block blockpowerfulBlock;
	public static Item itempowerfulSword;
	public static CreativeTabs zihaowTab;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		zihaowTab = new CreativeTabs("mymod"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(mymod.blockpowerfulBlock);
			}
		};
		
		blockpowerfulBlock = new myblock(Material.glass).setBlockName("PowerfulBlock");
		GameRegistry.registerBlock(blockpowerfulBlock, "PowerfulBlock");
		
		itempowerfulSword = new mysword(ToolMaterial.GOLD).setUnlocalizedName("PowerfulSword");
		GameRegistry.registerItem(itempowerfulSword,"PowerfulSword");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		//PowerfulBlock = new BlockPowerfulBlock(8000).setBlockName("PowerfulBlock").setBlockTextureName("modItems"+":PowerfulBlock");
		//GameRegistry.registerBlock(PowerfulBlock, "PowerfulBlock");
		
	}
	
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}