package zihaow.Timer.client;

import org.lwjgl.input.Keyboard;
import zihaow.Timer.Timer;
import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy {
	
	public void registerTimer(Timer timer){
		KeyBinding[] bindings = { new KeyBinding("Toggle Stopwatch", Keyboard.KEY_APOSTROPHE, "Toggle Stopwatch"),
				  				  new KeyBinding("Reset Stopwatch", Keyboard.KEY_SEMICOLON, "Reset Stopwatch")};
		
		boolean[] repeats = { false, false };
		ClientRegistry.registerKeyBinding(bindings[0]);
		ClientRegistry.registerKeyBinding(bindings[1]);
	}

}

