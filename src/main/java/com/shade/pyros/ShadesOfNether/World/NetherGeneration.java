package com.shade.pyros.ShadesOfNether.World;

import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.World.Features.Features;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;

public class NetherGeneration {
	public static void setupNetherGeneration() {
		Biomes.NETHER.addFeature(
			Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Feature.BUSH, 
				new BushConfig(ModBlocks.PETRIBARK_MUSHROOM.getDefaultState()), 
				Placement.CHANCE_RANGE, 
				new ChanceRangeConfig(0.5F, 0, 0, 128)));
		
		Biomes.NETHER.addFeature(
			Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Features.CLAYCACOON_BLOB, 
				IFeatureConfig.NO_FEATURE_CONFIG, 
				Placement.LIGHT_GEM_CHANCE, 
				new FrequencyConfig(10)));
		
		Biomes.NETHER.addFeature(
			Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Features.CLAYCACOON_BLOB, 
				IFeatureConfig.NO_FEATURE_CONFIG, 
				Placement.COUNT_RANGE, 
				new CountRangeConfig(10, 0, 0, 128)));
		
	}
}
