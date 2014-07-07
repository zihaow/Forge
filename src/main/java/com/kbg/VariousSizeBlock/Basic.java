/* This package is to set up Various Size of Block.
 * A 1x1 size block, a 3x3 size block and a 9x9 size block
 * 
 * @Author XueFei Yang
 */

package com.kbg.VariousSizeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
/**
 * this is a java class named basic class for create a basic model of resource on this game
 * @author yuanjianglin
 *
 */
@Mod(modid = Basic.MODID, version = Basic.VERSION)
public class Basic {
	public static final String MODID = "basic";
	public static final String VERSION = "1.0";
	public static Block basicBlock = new BasicBlock(Material.rock).setCreativeTab(CreativeTabs.tabBlock).setBlockName("basicBlock").setLightLevel(1.0f);
	
	@EventHandler
	public void preInit(FMLInitializationEvent event){
		GameRegistry.registerBlock(basicBlock, "Basic Block");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
	}
}
