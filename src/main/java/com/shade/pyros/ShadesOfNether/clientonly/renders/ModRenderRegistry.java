package com.shade.pyros.ShadesOfNether.clientonly.renders;

import com.shade.pyros.ShadesOfNether.Entities.ClaySpider;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ModRenderRegistry {
	public static void registryEntityRenders(){
		RenderingRegistry.registerEntityRenderingHandler(ClaySpider.class, new ClaySpiderRender.renderFac());
	}
}
