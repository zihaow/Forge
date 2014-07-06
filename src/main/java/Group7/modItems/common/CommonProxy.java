package Group7.modItems.common;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * CommonProxy class, to make modItems mod working on Minecraft.
 * @author: Zihao Wu.
*/

public class CommonProxy implements IGuiHandler{
	public void registerRenderInformation(){}
	public void registerRenderThings(){}
		 
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		return null;
	}
		 
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
		return null;
	}
		
	public static int addArmor(String name){
		return 0;
	}
}
