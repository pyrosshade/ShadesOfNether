package com.shade.pyros.ShadesOfNether.World;

import com.shade.pyros.ShadesOfNether.World.Features.Features;

import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;

public class OreGeneration {
	public static void SetupOreGeneration() {
		SetupNetherGeneration();
	}
	public static void SetupNetherGeneration() {
		Biomes.NETHER.addFeature(Decoration.VEGETAL_DECORATION, Features.PETRIBARK_PATCH);
		
	}
}
