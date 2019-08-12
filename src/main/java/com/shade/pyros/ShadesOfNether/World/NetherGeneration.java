package com.shade.pyros.ShadesOfNether.World;

import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.World.Features.Features;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;


public class NetherGeneration {
	public static BlockState ASHERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:asherrack")).getDefaultState();
	public static BlockState SCREAMERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:screamerrack")).getDefaultState();
	public static BlockState SWEATERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:sweaterrack")).getDefaultState();
	
	public static BlockState NETHER_SUNSET = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:sunset_whewellite_ore_nether")).getDefaultState();
	public static BlockState NETHER_CORUNDUM = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:corundum_ore_nether")).getDefaultState();
	
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
		
		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Feature.ORE, 
				new OreFeatureConfig(
					OreFeatureConfig.FillerBlockType.NETHERRACK, 
					NETHER_SUNSET, 
					12), 	
				Placement.COUNT_RANGE, 
				new CountRangeConfig(10, 0, 0, 128)));
		
		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Feature.ORE, 
				new OreFeatureConfig(
					OreFeatureConfig.FillerBlockType.NETHERRACK, 
					NETHER_CORUNDUM, 
					8), 
				Placement.COUNT_RANGE, 
				new CountRangeConfig(1, 112, 0, 128)));
		
		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
			Biome.createDecoratedFeature(
				Feature.ORE, 
				new OreFeatureConfig(
					OreFeatureConfig.FillerBlockType.NETHERRACK, 
					NETHER_CORUNDUM, 
					8), 
				Placement.COUNT_RANGE, 
				new CountRangeConfig(1, 0, 0, 16)));

		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
				Biome.createDecoratedFeature(
						Feature.ORE, 
						new OreFeatureConfig(
								OreFeatureConfig.FillerBlockType.NETHERRACK, 
								ASHERRACK, 
								33), 
						Placement.COUNT_RANGE, 
						new CountRangeConfig(10, 0, 0, 128)));
		
		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
				Biome.createDecoratedFeature(
						Feature.ORE, 
						new OreFeatureConfig(
								OreFeatureConfig.FillerBlockType.NETHERRACK, 
								SCREAMERRACK, 
								33), 
						Placement.COUNT_RANGE, 
						new CountRangeConfig(10, 0, 0, 128)));
		
		Biomes.NETHER.addFeature(
				Decoration.UNDERGROUND_DECORATION, 
				Biome.createDecoratedFeature(
						Feature.ORE, 
						new OreFeatureConfig(	
								OreFeatureConfig.FillerBlockType.NETHERRACK, 
								SWEATERRACK, 
								33), 
						Placement.COUNT_RANGE, 
						new CountRangeConfig(10, 0, 0, 128)));
	}
}
