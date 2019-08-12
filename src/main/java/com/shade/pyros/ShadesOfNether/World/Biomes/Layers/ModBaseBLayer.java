package com.shade.pyros.ShadesOfNether.World.Biomes.Layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;

public enum ModBaseBLayer implements IAreaTransformer0 {
	   INSTANCE;

	   public int apply(INoiseRandom p_215735_1_, int p_215735_2_, int p_215735_3_) {
	      if (p_215735_2_ == 0 && p_215735_3_ == 0) {
	         return SONBiomeLayer.NETHER;
	      } else {
	         return p_215735_1_.random(10) == 0 ? SONBiomeLayer.NETHER : SONBiomeLayer.ASHER;
	      }
	   }
	}