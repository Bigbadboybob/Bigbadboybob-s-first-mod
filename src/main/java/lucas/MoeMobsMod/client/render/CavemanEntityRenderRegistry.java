package lucas.MoeMobsMod.client.render;

import lucas.MoeMobsMod.lists.EntityList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;


@OnlyIn(Dist.CLIENT)
public class CavemanEntityRenderRegistry {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityList.caveman_entity, new CavemanEntityRender.RenderFactory());
	}

}
