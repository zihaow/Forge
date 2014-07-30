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
import zihaow.mymod.blocks.*;
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
	public static Block part1;
	public static Block part2;
	public static Block part3;
	public static Block part4;
	public static Block question_1x1;
	public static Block question_1x2;
	public static Block question_1x3;
	public static Block question_1x4;
	public static Block question_1x5;
	public static Block question_2x1;
	public static Block question_2x2;
	public static Block question_2x3;
	public static Block question_2x4;
	public static Block question_2x5;
	public static Block question2_1;
	public static Block question2_2;
	public static Block question2_3;
	public static Block question2_4;
	public static Block question2_5;
	public static Block question3_1;
	public static Block question3_2;
	public static Block question3_3;
	public static Block question3_4;
	public static Block question3_5;
	public static Block question2_21;
	public static Block question2_22;
	public static Block question2_23;
	public static Block question2_24;
	public static Block question2_25;
	public static Block question3_21;
	public static Block question3_22;
	public static Block question3_23;
	public static Block question3_24;
	public static Block question3_25;
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
		
		part1 = new blockP1(Material.glass).setBlockName("Part1");
		GameRegistry.registerBlock(part1,"Part1");
		part2 = new blockP2(Material.glass).setBlockName("Part2");
		GameRegistry.registerBlock(part2,"Part2");
		part3 = new blockP3(Material.glass).setBlockName("Part3");
		GameRegistry.registerBlock(part3,"Part3");
		part4 = new blockP4(Material.glass).setBlockName("Part4");
		GameRegistry.registerBlock(part4,"Part4");
		
		question_1x1 = new question_1x1(Material.glass).setBlockName("question_1x1");
		GameRegistry.registerBlock(question_1x1,"question_1x1");
		question_1x2 = new question_1x2(Material.glass).setBlockName("question_1x2");
		GameRegistry.registerBlock(question_1x2,"question_1x2");
		question_1x3 = new question_1x3(Material.glass).setBlockName("question_1x3");
		GameRegistry.registerBlock(question_1x3,"question_1x3");
		question_1x4 = new question_1x4(Material.glass).setBlockName("question_1x4");
		GameRegistry.registerBlock(question_1x4,"question_1x4");
		question_1x5 = new question_1x5(Material.glass).setBlockName("question_1x5");
		GameRegistry.registerBlock(question_1x5,"question_1x5");
		
		question_2x1 = new question_2x1(Material.glass).setBlockName("question_2x1");
		GameRegistry.registerBlock(question_2x1,"question_2x1");
		question_2x2 = new question_2x2(Material.glass).setBlockName("question_2x2");
		GameRegistry.registerBlock(question_2x2,"question_2x2");
		question_2x3 = new question_2x3(Material.glass).setBlockName("question_2x3");
		GameRegistry.registerBlock(question_2x3,"question_2x3");
		question_2x4 = new question_2x4(Material.glass).setBlockName("question_2x4");
		GameRegistry.registerBlock(question_2x4,"question_2x4");
		question_2x5 = new question_2x5(Material.glass).setBlockName("question_2x5");
		GameRegistry.registerBlock(question_2x5,"question_2x5");
		
		question2_1 = new question2_1(Material.glass).setBlockName("question2_1");
		GameRegistry.registerBlock(question2_1,"question2_1");
		question2_2 = new question2_2(Material.glass).setBlockName("question2_2");
		GameRegistry.registerBlock(question2_2,"question2_2");
		question2_3 = new question2_3(Material.glass).setBlockName("question2_3");
		GameRegistry.registerBlock(question2_3,"question2_3");
		question2_4 = new question2_4(Material.glass).setBlockName("question2_4");
		GameRegistry.registerBlock(question2_4,"question2_4");
		question2_5 = new question2_5(Material.glass).setBlockName("question2_5");
		GameRegistry.registerBlock(question2_5,"question2_5");
		question2_21 = new question2_21(Material.glass).setBlockName("question2_21");
		GameRegistry.registerBlock(question2_21,"question2_21");
		question2_22 = new question2_22(Material.glass).setBlockName("question2_22");
		GameRegistry.registerBlock(question2_22,"question2_22");
		question2_23 = new question2_23(Material.glass).setBlockName("question2_23");
		GameRegistry.registerBlock(question2_23,"question2_23");
		question2_24 = new question2_24(Material.glass).setBlockName("question2_24");
		GameRegistry.registerBlock(question2_24,"question2_24");
		question2_25 = new question2_25(Material.glass).setBlockName("question2_25");
		GameRegistry.registerBlock(question2_25,"question2_25");

		question3_1 = new question3_1(Material.glass).setBlockName("question3_1");
		GameRegistry.registerBlock(question3_1,"question3_1");
		question3_2 = new question3_2(Material.glass).setBlockName("question3_2");
		GameRegistry.registerBlock(question3_2,"question3_2");
		question3_3 = new question3_3(Material.glass).setBlockName("question3_3");
		GameRegistry.registerBlock(question3_3,"question3_3");
		question3_4 = new question3_4(Material.glass).setBlockName("question3_4");
		GameRegistry.registerBlock(question3_4,"question3_4");
		question3_5 = new question3_5(Material.glass).setBlockName("question3_5");
		GameRegistry.registerBlock(question3_5,"question3_5");
		question3_21 = new question3_21(Material.glass).setBlockName("question3_21");
		GameRegistry.registerBlock(question3_21,"question3_21");
		question3_22 = new question3_22(Material.glass).setBlockName("question3_22");
		GameRegistry.registerBlock(question3_22,"question3_22");
		question3_23 = new question3_23(Material.glass).setBlockName("question3_23");
		GameRegistry.registerBlock(question3_23,"question3_23");
		question3_24 = new question3_24(Material.glass).setBlockName("question3_24");
		GameRegistry.registerBlock(question3_24,"question3_24");
		question3_25 = new question3_25(Material.glass).setBlockName("question3_25");
		GameRegistry.registerBlock(question3_25,"question3_25");
		
		itempowerfulSword = new mysword(ToolMaterial.GOLD).setUnlocalizedName("PowerfulSword");
		GameRegistry.registerItem(itempowerfulSword,"PowerfulSword");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
