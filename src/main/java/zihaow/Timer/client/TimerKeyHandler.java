package zihaow.Timer.client;

import net.minecraft.client.settings.KeyBinding;
import zihaow.Timer.Timer;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.FMLClientHandler;

public class TimerKeyHandler extends ClientRegistry {

	private Timer timer;

	public TimerKeyHandler(KeyBinding[] bindings, boolean[] repeats, Timer timer) {
		super();
		this.timer = timer;
	}
	
	public String getLabel(){
	    return "TimerKey";
	}

}

