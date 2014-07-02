package zihaow.GiantItems.Client;

import zihaow.GiantItems.GiantItems;
import zihaow.GiantItems.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameData;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerClientInformation(){
		Item item = null;
		int i=0;
		for(i=0;i<GiantItems.ItemIDs.length;i++){
			item = GameData.itemRegistry.getObject(GiantItems.ItemIDs[i]);
			if(item != null)
				MinecraftForgeClient.registerItemRenderer(item, new GiantItemRenderer());
			else
				System.out.println("No item id detcted!");
		}
	}
	
	@Override
	public World getClientWorld(){
		return FMLClientHandler.instance().getClient().theWorld;
	}
}