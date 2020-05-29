package lucas.MoeMobsMod.client.render;

import lucas.MoeMobsMod.MainMod;
import lucas.MoeMobsMod.client.models.CavemanModel;
import lucas.MoeMobsMod.entities.Caveman;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;


@OnlyIn(Dist.CLIENT)
public class CavemanEntityRender extends MobRenderer<Caveman, CavemanModel<Caveman>> {
	public CavemanEntityRender(EntityRendererManager manager) {
		super(manager, new CavemanModel<Caveman>(), 0.5f);
	}
	
	@Override
	public ResourceLocation getEntityTexture(Caveman entity) {
		return MainMod.Location("textures/entity/caveman_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<Caveman> {

		@Override
		public EntityRenderer<? super Caveman> createRenderFor(EntityRendererManager manager) {
			return new CavemanEntityRender(manager);
		}
		
	}

}
