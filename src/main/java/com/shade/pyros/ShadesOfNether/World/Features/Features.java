package com.shade.pyros.ShadesOfNether.World.Features;

import com.shade.pyros.ShadesOfNether.Blocks.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BigMushroomFeatureConfig;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;

public class Features {
	public static final ConfiguredFeature<?> PETRIBARK_PATCH 
	= Biome.createDecoratedFeature( 
			Feature.BUSH, 
			new BushConfig(
					ModBlocks.PETRIBARK_MUSHROOM.getDefaultState()),
					Placement.CHANCE_HEIGHTMAP_DOUBLE, 
					//new ChanceRangeConfig(0.85F, 0, 0, 128));
					//new FrequencyConfig(1000));
					new ChanceConfig(8));
	
	public static final ConfiguredFeature<?> HUGE_PETRIBARK_MUSHROOM
	= Biome.createDecoratedFeature(
			Feature.HUGE_BROWN_MUSHROOM,
			new BigMushroomFeatureConfig(true),
			Placement.NOPE,
			new NoPlacementConfig()
			);
}
