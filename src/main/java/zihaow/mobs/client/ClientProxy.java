package zihaow.mobs.client;

import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.passive.EntityCow;
import zihaow.mobs.model.ModelCrazyCow;
import zihaow.mobs.model.ModelWolverine;
import zihaow.mobs.render.RenderCrazyCow;
import zihaow.mobs.render.RenderWolverine;
import zihaow.mobs.common.CommonProxy;
import zihaow.mobs.entity.Wolverine;
import zihaow.mobs.entity.CrazyCow;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderThings(){
		
		//entities
		RenderingRegistry.registerEntityRenderingHandler(CrazyCow.class, new RenderCrazyCow(new ModelCrazyCow(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Wolverine.class, new RenderWolverine(new ModelWolverine(1, 0.3F),new ModelWolverine(2, 0.4F), 0.3F));
		//Wolverine.class, new RenderWolverine(new ModelWolverine(2, 0.4F), 0.3F)
	
	}
}
