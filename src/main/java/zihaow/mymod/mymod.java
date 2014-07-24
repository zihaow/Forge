package zihaow.mymod;

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
import zihaow.mymod.blocks.myblock;
import zihaow.mymod.blocks.myblock_f;
import zihaow.mymod.blocks.myblock_h;
import zihaow.mymod.blocks.myblock_i;
import zihaow.mymod.blocks.myblock_n;
import zihaow.mymod.blocks.myblock_s;
import zihaow.mymod.items.mysword;


/**
 * mymod class, which is the main class for our mod items.
 * @author: Zihao Wu, Xuefei Yang, 
 */ 		  	 

@Mod(modid=mymod.modid,version="1.0a")

public class mymod{
	
	public static final String modid = "mymod";
	public static Block blockpowerfulBlock;
	public static Block Word_F;
	public static Block Word_I;
	public static Block Word_N;
	public static Block Word_S;
	public static Block Word_H;
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
		Word_F = new myblock_f(Material.glass).setBlockName("F");
		GameRegistry.registerBlock(Word_F, "F");
		Word_I = new myblock_i(Material.glass).setBlockName("I");
		GameRegistry.registerBlock(Word_I, "I");
		Word_N = new myblock_n(Material.glass).setBlockName("N");
		GameRegistry.registerBlock(Word_N, "N");
		Word_S = new myblock_s(Material.glass).setBlockName("S");
		GameRegistry.registerBlock(Word_S, "S");
		Word_H = new myblock_h(Material.glass).setBlockName("H");
		GameRegistry.registerBlock(Word_H, "H");
		
		itempowerfulSword = new mysword(ToolMaterial.GOLD).setUnlocalizedName("PowerfulSword");
		GameRegistry.registerItem(itempowerfulSword,"PowerfulSword");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
