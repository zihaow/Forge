package Group7.modItems.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

	/**
	@author: Zihao Wu, Xuefei Yang, 
		     James MacNeil, Yuanjing Lin,
		     Alireza Afkari.
	 */	

public class BlockPowerfulBlock extends Block{
	
	public BlockPowerfulBlock(int id){
		super(Material.glass);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
		/**
		 Set the powerfulBlock's specification.
		 */
		this.setHardness(20.0F);
		this.setResistance(30.0F);
		this.setLightLevel(5.0F);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		blockIcon = par1IconRegister.registerIcon("modItems:PowerfulBlock");
	}
}
