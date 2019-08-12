package com.shade.pyros.ShadesOfNether.World.Biomes;

import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.World.Features.Features;
import com.shade.pyros.ShadesOfNether.World.SurfaceBuilders.ModSurfaceBuilders;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.HellLavaConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.LiquidsConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.ChanceRangeConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class SweaterBiome extends Biome{
	public static String regName = "asher_biome";
	public static BlockState ASHER = ModBlocks.ASHERRACK.getDefaultState();
	public static SurfaceBuilderConfig ASHER_SBC = new SurfaceBuilderConfig(ASHER, ASHER, ASHER);
	
	public static BlockState ASHERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:asherrack")).getDefaultState();
	public static BlockState SCREAMERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:screamerrack")).getDefaultState();
	public static BlockState SWEATERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:sweaterrack")).getDefaultState();
	public static BlockState NETHERRACK = Blocks.NETHERRACK.getDefaultState();
	
	public static BlockState NETHER_SUNSET = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:sunset_whewellite_ore_asherrack")).getDefaultState();
	public static BlockState NETHER_CORUNDUM = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:corundum_ore_asherrack")).getDefaultState();
	protected SweaterBiome() {
			super(
				(new Biome.Builder())
				.surfaceBuilder(ModSurfaceBuilders.SWEATER_SURFACE_BUILDER, ASHER_SBC)
				.precipitation(Biome.RainType.NONE)
				.category(Biome.Category.NETHER)
				.depth(0.1F)
				.scale(0.2F)
				.temperature(2.0F)
				.downfall(0.0F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.parent((String)null));
			setRegistryName(regName);
			
			this.addCarver(GenerationStage.Carving.AIR, createCarver(WorldCarver.HELL_CAVE, new ProbabilityConfig(0.2F)));
			this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(Feature.SPRING_FEATURE, new LiquidsConfig(Fluids.LAVA.getDefaultState()), Placement.COUNT_VERY_BIASED_RANGE, new CountRangeConfig(20, 8, 16, 256)));
			DefaultBiomeFeatures.addMushrooms(this);
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.NETHER_SPRING, new HellLavaConfig(false), Placement.COUNT_RANGE, new CountRangeConfig(8, 4, 8, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.HELL_FIRE, IFeatureConfig.NO_FEATURE_CONFIG, Placement.HELL_FIRE, new FrequencyConfig(10)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.GLOWSTONE_BLOB, IFeatureConfig.NO_FEATURE_CONFIG, Placement.LIGHT_GEM_CHANCE, new FrequencyConfig(10)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.GLOWSTONE_BLOB, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.BUSH, new BushConfig(Blocks.BROWN_MUSHROOM.getDefaultState()), Placement.CHANCE_RANGE, new ChanceRangeConfig(0.5F, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.BUSH, new BushConfig(Blocks.RED_MUSHROOM.getDefaultState()), Placement.CHANCE_RANGE, new ChanceRangeConfig(0.5F, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blocks.NETHER_QUARTZ_ORE.getDefaultState(), 14), Placement.COUNT_RANGE, new CountRangeConfig(16, 10, 20, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, Blocks.MAGMA_BLOCK.getDefaultState(), 33), Placement.MAGMA, new FrequencyConfig(4)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.NETHER_SPRING, new HellLavaConfig(true), Placement.COUNT_RANGE, new CountRangeConfig(16, 10, 20, 128)));
			this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.GHAST, 50, 4, 4));
			this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ENDERMAN, 1, 4, 4));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.BUSH, new BushConfig(ModBlocks.PETRIBARK_MUSHROOM.getDefaultState()), Placement.CHANCE_RANGE, new ChanceRangeConfig(0.5F, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Features.CLAYCACOON_BLOB, IFeatureConfig.NO_FEATURE_CONFIG,Placement.LIGHT_GEM_CHANCE, new FrequencyConfig(10)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Features.CLAYCACOON_BLOB, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NETHER_SUNSET, 12), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NETHER_CORUNDUM, 8), Placement.COUNT_RANGE, new CountRangeConfig(1, 112, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NETHER_CORUNDUM, 8), Placement.COUNT_RANGE, new CountRangeConfig(1, 0, 0, 16)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ASHERRACK, 33), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, SCREAMERRACK, 33), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
			this.addFeature(Decoration.UNDERGROUND_DECORATION, createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, SWEATERRACK, 33),Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 128)));
	}
	

}