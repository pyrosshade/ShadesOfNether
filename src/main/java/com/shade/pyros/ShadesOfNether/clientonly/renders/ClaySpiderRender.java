package com.shade.pyros.ShadesOfNether.clientonly.renders;

import com.mojang.blaze3d.platform.GlStateManager;
import com.shade.pyros.ShadesOfNether.Entities.ClaySpider;
import com.shade.pyros.ShadesOfNether.clientonly.models.ClaySpiderModel;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class ClaySpiderRender extends LivingRenderer<ClaySpider, ClaySpiderModel>{

	public ClaySpiderRender(EntityRendererManager p_i50965_1_) {
		super(p_i50965_1_, new ClaySpiderModel(), 0.7f);
	}
	
	protected void preRenderCallback(ClaySpider entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scalef(0.7F, 0.7F, 0.7F);
	}
	@Override
	protected ResourceLocation getEntityTexture(ClaySpider entity) {
		return new ResourceLocation("textures/entities/spider/clay_spider.png");
	}
	public static class renderFac implements IRenderFactory<ClaySpider>{

		@Override
		public EntityRenderer<? super ClaySpider> createRenderFor(EntityRendererManager manager) {
			return new ClaySpiderRender(manager);
		}
	}
}
