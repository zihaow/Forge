package zihaow.Timer;

import net.minecraftforge.common.MinecraftForge;
import zihaow.Timer.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * The Timer is the main class for our timer mod.
 * @author Zihao Wu, James MacNeil.
 */


@Mod(modid="Timer", name="Timer", version="1.0a")

public class Timer{
	
	@Instance("Timer")
	public static Timer instance;
	
	@SidedProxy(clientSide="zihaow.timer.client.ClientProxy",serverSide="zihaow.timer.CommonProxy")
	
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Timer timer = new Timer();
		MinecraftForge.EVENT_BUS.register(timer);
		proxy.registerTimer(timer);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
}
