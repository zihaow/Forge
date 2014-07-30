package zihaow.mymod.blocks;


import zihaow.mymod.mymod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author: Zihao Wu, Xuefei Yang, 
 */	

public class question3_3 extends Block{
	
	
	/**
	 * Constructor
	 * @param: glass
	 */
	public question3_3(Material glass){
		super(glass);
		this.setCreativeTab(mymod.zihaowTab);
		
		/**
		 Set the powerfulBlock's specification.
		 */
		this.setHardness(20.0F);
		this.setResistance(30.0F);
		this.setLightLevel(5.0F);
		this.setBlockTextureName("mymod"+":project-q2_part1x3");
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon(mymod.modid +":"+this.getUnlocalizedName().substring(5));
	}
}
