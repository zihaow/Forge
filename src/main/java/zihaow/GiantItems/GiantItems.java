package zihaow.GiantItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

@Mod(modid="GiantItems", name="GiantItems", version="1.0a",dependencies="required-after:FML", useMetadata = true)

public class GiantItems{
	@Mod.Instance("GiantItems")
	public static GiantItems instance;
	
	@SidedProxy(clientSide = "zihaow.GiantItems.Client.ClientProxy", serverSide = "zihaow.GiantItems.CommonProxy")
	public static CommonProxy proxy;

	public static String[] ItemIDs;
	public static double Scale;

	@Mod.EventHandler
	//method to register items to be made giant
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		ItemIDs = config.get(Configuration.CATEGORY_GENERAL, "Giant Item Ids", new String[]{"minecraft:wooden_sword","minecraft:stone_sword","minecraft:iron_sword","minecraft:diamond_sword","minecraft:golden_sword"}, "Put Item Names which you want to make it giant.").getStringList();
		Scale = config.get(Configuration.CATEGORY_GENERAL, "Item Scale", 2.0d, "Item Scale").getDouble(2.0d);
		config.save();
	}
	
	@Mod.EventHandler
	//method to register info.
	public void load(FMLInitializationEvent event){
		proxy.registerClientInformation();
	}
}
