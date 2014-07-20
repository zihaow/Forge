package zihaow.mobs;

import zihaow.mobs.entity.BadAss;
import zihaow.mobs.entity.CrazyCow;
import zihaow.mobs.entity.Wolverine;
import zihaow.mobs.handler.EntityHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="mobs",version="1.0a")

/**
 * This is the main class for mobs mod.
 * @author Zihao Wu
 */

public class Mobs {
	
	public static final String modId = "mobs";
	
	@Instance("mobs")
	public static Mobs instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		
		//entities
		EntityHandler.registerEntities(CrazyCow.class, "CrazyCow");
		EntityHandler.registerMonster(Wolverine.class, "Wolverine");
		//EntityHandler.registerFriendly(CrazyCow.class, "CrazyCow");
		EntityHandler.registerMonster(BadAss.class, "BadAss");
		EntityHandler.registerFriendly(Blu.class, "Blu");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
