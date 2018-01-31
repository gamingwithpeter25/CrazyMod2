package longlegs.mod.util.handlers;

import longlegs.mod.entity.EntityCentaur;
import longlegs.mod.entity.render.RenderCentaur;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory<EntityCentaur>() 
		{

			@Override
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return new RenderCentaur(manager);
			}
			
		});
	}
}
