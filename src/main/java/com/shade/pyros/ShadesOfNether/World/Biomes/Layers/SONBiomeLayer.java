package com.shade.pyros.ShadesOfNether.World.Biomes.Layers;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.shade.pyros.ShadesOfNether.World.Biomes.SONBiomeProviderSettings;
import com.shade.pyros.ShadesOfNether.World.Biomes.SONBiomes;
import com.shade.pyros.ShadesOfNether.World.Biomes.SONGenSettings;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IC0Transformer;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

public class SONBiomeLayer implements IC0Transformer {
	public static final int ASHER = Registry.BIOME.getId(SONBiomes.ASHER);//ForgeRegistries.BIOMES.getValue(new ResourceLocation("asher_biome"));
	public static final int NETHER = Registry.BIOME.getId(Biomes.NETHER);
	//private static final int BIRCH_FOREST = Registry.BIOME.getId(Biomes.BIRCH_FOREST);
	   //private static final int DESERT = Registry.BIOME.getId(Biomes.DESERT);
	   //private static final int MOUNTAINS = Registry.BIOME.getId(Biomes.MOUNTAINS);
	   //private static final int FOREST = Registry.BIOME.getId(Biomes.FOREST);
	   //private static final int SNOWY_TUNDRA = Registry.BIOME.getId(Biomes.SNOWY_TUNDRA);
	   //private static final int JUNGLE = Registry.BIOME.getId(Biomes.JUNGLE);
	   //private static final int BADLANDS_PLATEAU = Registry.BIOME.getId(Biomes.BADLANDS_PLATEAU);
	   //private static final int WOODED_BADLANDS_PLATEAU = Registry.BIOME.getId(Biomes.WOODED_BADLANDS_PLATEAU);
	   //private static final int MUSHROOM_FIELDS = Registry.BIOME.getId(Biomes.MUSHROOM_FIELDS);
	   //private static final int PLAINS = Registry.BIOME.getId(Biomes.PLAINS);
	   //private static final int GIANT_TREE_TAIGA = Registry.BIOME.getId(Biomes.GIANT_TREE_TAIGA);
	   //private static final int DARK_FOREST = Registry.BIOME.getId(Biomes.DARK_FOREST);
	   //private static final int SAVANNA = Registry.BIOME.getId(Biomes.SAVANNA);
	   //private static final int SWAMP = Registry.BIOME.getId(Biomes.SWAMP);
	   //private static final int TAIGA = Registry.BIOME.getId(Biomes.TAIGA);
	   //private static final int SNOWY_TAIGA = Registry.BIOME.getId(Biomes.SNOWY_TAIGA);
	   @SuppressWarnings("unchecked")
	   private List<BiomeManager.BiomeEntry>[] biomes = new ArrayList[BiomeManager.BiomeType.values().length];
	   private final SONGenSettings settings;

	   public SONBiomeLayer(WorldType p_i48641_1_, SONGenSettings settingsIn) {
	      for (BiomeManager.BiomeType type : BiomeManager.BiomeType.values()) {
	         ImmutableList<BiomeManager.BiomeEntry> biomesToAdd = BiomeManager.getBiomes(type);
	         int idx = type.ordinal();

	         if (biomes[idx] == null) biomes[idx] = new ArrayList<BiomeManager.BiomeEntry>();
	         if (biomesToAdd != null) biomes[idx].addAll(biomesToAdd);
	      }

	      int desertIdx = BiomeManager.BiomeType.DESERT.ordinal();
          
	      //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.DESERT, 30));
	      //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.SAVANNA, 20));
	      //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.PLAINS, 10));
          
	      if (p_i48641_1_ == WorldType.DEFAULT_1_1) {
	         biomes[desertIdx].clear();
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.DESERT, 10));
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.FOREST, 10));
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.MOUNTAINS, 10));
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.SWAMP, 10));
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.PLAINS, 10));
	         //biomes[desertIdx].add(new BiomeManager.BiomeEntry(Biomes.TAIGA, 10));
	         biomes[desertIdx].add(new BiomeManager.BiomeEntry(SONBiomes.ASHER, 10));
	         this.settings = settingsIn;
	      } else {
	         this.settings = settingsIn;
	      }

	   }

	   public int apply(INoiseRandom context, int value) {
	      if (this.settings != null && this.settings.getBiomeId() >= 0) {
	         return this.settings.getBiomeId();
	      } else {
	         //int i = (value & 3840) >> 8;
	         value = value & -3841;
	         //if (!LayerUtil.isOcean(value) && value != MUSHROOM_FIELDS) {
	         //   switch(value) {
	         //   case 1:
	         //      if (i > 0) {
	         //         return context.random(3) == 0 ? BADLANDS_PLATEAU : WOODED_BADLANDS_PLATEAU;
	         //      }
             //
	         //      return Registry.BIOME.getId(getWeightedBiomeEntry(BiomeManager.BiomeType.DESERT, context).biome);
	         //   case 2:
	         //      if (i > 0) {
	         //         return JUNGLE;
	         //      }
             //
	         //      return Registry.BIOME.getId(getWeightedBiomeEntry(BiomeManager.BiomeType.WARM, context).biome);
	         //   case 3:
	         //      if (i > 0) {
	         //         return GIANT_TREE_TAIGA;
	         //      }
             //
	         //      return Registry.BIOME.getId(getWeightedBiomeEntry(BiomeManager.BiomeType.COOL, context).biome);
	         //   case 4:
	         //      return Registry.BIOME.getId(getWeightedBiomeEntry(BiomeManager.BiomeType.ICY, context).biome);
	         //   default:
	         //      return MUSHROOM_FIELDS;
	         //   }
	         //} else {
	         //   return value;
	         //}
	         return value;
	      }
	   }

	   protected BiomeManager.BiomeEntry getWeightedBiomeEntry(BiomeManager.BiomeType type, INoiseRandom context) {
	      List<BiomeManager.BiomeEntry> biomeList = biomes[type.ordinal()];
	      int totalWeight = WeightedRandom.getTotalWeight(biomeList);
	      int weight = BiomeManager.isTypeListModded(type)?context.random(totalWeight):context.random(totalWeight / 10) * 10;
	      return (BiomeManager.BiomeEntry)WeightedRandom.getRandomItem(biomeList, weight);
	   }
	}