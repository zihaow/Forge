package zihaow.mobs.client;

import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.passive.EntityCow;
import zihaow.mobs.model.ModelBadAss;
import zihaow.mobs.model.ModelCrazyCow;
import zihaow.mobs.model.ModelWolverine;
import zihaow.mobs.render.RenderBadAss;
import zihaow.mobs.render.RenderCrazyCow;
import zihaow.mobs.render.RenderWolverine;
import zihaow.mobs.common.CommonProxy;
import zihaow.mobs.entity.BadAss;
import zihaow.mobs.entity.CrazyCow;
import zihaow.mobs.entity.Wolverine;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderThings(){
		
		//entities
		RenderingRegistry.registerEntityRenderingHandler(CrazyCow.class, new RenderCrazyCow(new ModelCrazyCow(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Wolverine.class, new RenderWolverine(new ModelWolverine(1, 0.3F),new ModelWolverine(2, 0.4F), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(BadAss.class, new RenderBadAss());
		//Wolverine.class, new RenderWolverine(new ModelWolverine(2, 0.4F), 0.3F)
	
	}
}