package zihaow.Timer.client;

import java.text.DecimalFormat;

import cpw.mods.fml.common.Mod.EventHandler;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

/**
 * Clock class to inilitize the timer.
 * @author: Zihao Wu, James MacNeil.
*/

public class Clock{
	
	private boolean displayTime = false;
	private boolean clockRunning = false;
	private int startTime = 0;
	private int accumulatedTime = 0;
	
	@EventHandler
	public void renderOverlay(RenderGameOverlayEvent e){
		if (displayTime && (e.type == ElementType.HOTBAR)){
			Minecraft mc = Minecraft.getMinecraft();
			int sec = 0;

			if (clockRunning){
				sec = (int)((accumulatedTime + System.currentTimeMillis() - startTime) / 1000L);
			} else {
				sec = (int)(accumulatedTime / 1000L);
			}

			int hour = sec / 3600;
			sec -= hour * 3600;
			int min = sec / 60;
			sec -= min * 60;

			DecimalFormat formatter = new DecimalFormat("00");
			String timeStr = formatter.format(hour) + ":" + formatter.format(min) + ":" + formatter.format(sec);

			mc.fontRenderer.drawString(timeStr, 2, (mc.displayHeight / 2) - 12, 0xFFFFFFFF);
		}
	}

	public void toReset(){
		displayTime = false;
		clockRunning = false;
		startTime = 0;
		accumulatedTime = 0;
	}

	public void toggleActive(){
		clockRunning = !clockRunning;
		if (clockRunning){
			displayTime = true;
			startTime = (int) System.currentTimeMillis();
		} else{
			accumulatedTime += System.currentTimeMillis() - startTime;
			startTime = 0;
		}
	}

}
