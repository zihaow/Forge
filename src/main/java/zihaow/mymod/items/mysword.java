package zihaow.mymod.items;

import zihaow.mymod.mymod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

 /**
  * mysword, set up the speciafication of the powerful sword.
  * @author: Zihao Wu, Xuefei Yang,.
  */	 

	 public class mysword extends ItemSword{
	 private float field_150934_a;
	 private final Item.ToolMaterial field_150933_b;
	    
	 /**
	  * Constructor to set the feature of this powerful sword.
	  * @param: ToolMaterial.GOLD.
	 */
	 public mysword(Item.ToolMaterial p_i45356_1_){
		 super(ToolMaterial.GOLD);
		 this.field_150933_b = p_i45356_1_;
	     	 this.maxStackSize = 2;
	         this.setMaxDamage(1500);
	         this.field_150934_a = 12.0F + p_i45356_1_.getDamageVsEntity();
	         this.setCreativeTab(mymod.zihaowTab);
	 }
		
	 @SideOnly(Side.CLIENT)
	 public void registerIcons(IIconRegister par1IconRegister){
    	 	this.itemIcon = par1IconRegister.registerIcon(mymod.modid+":"+this.getUnlocalizedName().substring(5));
         }
	 
	 @Override
	 public int getMaxItemUseDuration(ItemStack par1ItemStack){
		 return 85000;
	 }
}
