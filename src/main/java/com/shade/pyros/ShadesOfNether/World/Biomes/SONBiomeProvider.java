package com.shade.pyros.ShadesOfNether.World.Biomes;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.LongFunction;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.shade.pyros.ShadesOfNether.World.Biomes.Layers.ModBaseBLayer;
import com.shade.pyros.ShadesOfNether.World.Biomes.Layers.SONBiomeLayer;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.LayerUtil;
import net.minecraft.world.gen.layer.VoroniZoomLayer;
import net.minecraft.world.gen.layer.ZoomLayer;
import net.minecraft.world.gen.layer.traits.IAreaTransformer1;
import net.minecraft.world.storage.WorldInfo;

public class SONBiomeProvider extends BiomeProvider{

	private final Layer genBiomes;
	private final Layer biomeFactoryLayer;
	private final Biome[] biomes = new Biome[]{SONBiomes.ASHER};
	
	public SONBiomeProvider(SONBiomeProviderSettings settingsProvider) {

	      WorldInfo worldinfo = settingsProvider.getWorldInfo();
	      SONGenSettings overworldgensettings = settingsProvider.getGeneratorSettings();
	      Layer[] alayer = buildShadesBiomesProcedure(worldinfo.getSeed(), worldinfo.getGenerator(), overworldgensettings);
	      
	      this.genBiomes = alayer[0];
	      this.biomeFactoryLayer = alayer[1];
	}
	@Override
	public Biome getBiome(int x, int y) {
		return this.biomeFactoryLayer.func_215738_a(x, y);
	}

	@Override
	public Biome func_222366_b(int p_222366_1_, int p_222366_2_) {
		return this.genBiomes.func_215738_a(p_222366_1_, p_222366_2_);
	}

	
	@Override
	public Biome[] getBiomes(int x, int z, int width, int length, boolean cacheFlag) {
		return this.biomeFactoryLayer.generateBiomes(x, z, width, length);
	}

	@Override
	public Set<Biome> getBiomesInSquare(int centerX, int centerZ, int sideLength) {
	      int i = centerX - sideLength >> 2;
	      int j = centerZ - sideLength >> 2;
	      int k = centerX + sideLength >> 2;
	      int l = centerZ + sideLength >> 2;
	      int i1 = k - i + 1;
	      int j1 = l - j + 1;
	      Set<Biome> set = Sets.newHashSet();
	      Collections.addAll(set, this.genBiomes.generateBiomes(i, j, i1, j1));
	      return set;
	}

	@Override
	public BlockPos findBiomePosition(int x, int z, int range, List<Biome> biomes, Random random) {
	      int i = x - range >> 2;
	      int j = z - range >> 2;
	      int k = x + range >> 2;
	      int l = z + range >> 2;
	      int i1 = k - i + 1;
	      int j1 = l - j + 1;
	      Biome[] abiome = this.genBiomes.generateBiomes(i, j, i1, j1);
	      BlockPos blockpos = null;
	      int k1 = 0;

	      for(int l1 = 0; l1 < i1 * j1; ++l1) {
	         int i2 = i + l1 % i1 << 2;
	         int j2 = j + l1 / i1 << 2;
	         if (biomes.contains(abiome[l1])) {
	            if (blockpos == null || random.nextInt(k1 + 1) == 0) {
	               blockpos = new BlockPos(i2, 0, j2);
	            }

	            ++k1;
	         }
	      }

	      return blockpos;
	}

	@Override
	public boolean hasStructure(Structure<?> structureIn) {
	      return this.hasStructureCache.computeIfAbsent(structureIn, (p_205006_1_) -> {
	          for(Biome biome : this.biomes) {
	             if (biome.hasStructure(p_205006_1_)) {
	                return true;
	             }
	          }

	          return false;
	       });
	}

	@Override
	public Set<BlockState> getSurfaceBlocks() {
	      if (this.topBlocksCache.isEmpty()) {
	          for(Biome biome : this.biomes) {
	             this.topBlocksCache.add(biome.getSurfaceBuilderConfig().getTop());
	          }
	       }

	       return this.topBlocksCache;
	}
	
	public static Layer[] buildShadesBiomesProcedure(long seed, WorldType typeIn, SONGenSettings settings) {
	      int i = 25;
	      ImmutableList<IAreaFactory<LazyArea>> immutablelist = buildShadesBiomesProcedure(typeIn, settings, (p_215737_2_) -> {
	         return new LazyAreaLayerContext(25, seed, p_215737_2_);
	      });
	      Layer layer = new Layer(immutablelist.get(0));
	      Layer layer1 = new Layer(immutablelist.get(1));
	      Layer layer2 = new Layer(immutablelist.get(2));
	      return new Layer[]{layer, layer1, layer2};
	   }
	public static <T extends IArea, C extends IExtendedNoiseRandom<T>> ImmutableList<IAreaFactory<T>> buildShadesBiomesProcedure(WorldType worldTypeIn, SONGenSettings settings, LongFunction<C> contextFactory) {
	      IAreaFactory<T> iareafactory = ModBaseBLayer.INSTANCE.apply(contextFactory.apply(1L));
	      //iareafactory = ZoomLayer.FUZZY.apply(contextFactory.apply(2000L), iareafactory);
	      //iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(1L), iareafactory);
	      //iareafactory = ZoomLayer.NORMAL.apply(contextFactory.apply(2001L), iareafactory);
	      //iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
	      //iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(50L), iareafactory);
	      //iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(70L), iareafactory);
	      //iareafactory = RemoveTooMuchOceanLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
	      //IAreaFactory<T> iareafactory1 = OceanLayer.INSTANCE.apply(contextFactory.apply(2L));
	      //iareafactory1 = repeat(2001L, ZoomLayer.NORMAL, iareafactory1, 6, contextFactory);
	      //iareafactory = AddSnowLayer.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
	      //iareafactory = AddIslandLayer.INSTANCE.apply(contextFactory.apply(3L), iareafactory);
	      //iareafactory = EdgeLayer.CoolWarm.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
	      //iareafactory = EdgeLayer.HeatIce.INSTANCE.apply(contextFactory.apply(2L), iareafactory);
	      //iareafactory = EdgeLayer.Special.INSTANCE.apply(contextFactory.apply(3L), iareafactory);
	      int i = 4;
	      int j = i;
	      if (settings != null) {
	         i = settings.getBiomeSize();
	      }

	      if (worldTypeIn == WorldType.LARGE_BIOMES) {
	         i = 6;
	      }

	      i = LayerUtil.getModdedBiomeSize(worldTypeIn, i);

	      IAreaFactory<T> lvt_7_1_ = repeat(1000L, ZoomLayer.NORMAL, iareafactory, 0, contextFactory);
	      IAreaFactory<T> lvt_8_1_ =  (new SONBiomeLayer(worldTypeIn.getWorldType(), settings)).apply(contextFactory.apply(200L), iareafactory);
	      lvt_7_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_7_1_, 2, contextFactory);
	      lvt_7_1_ = repeat(1000L, ZoomLayer.NORMAL, lvt_7_1_, j, contextFactory);
	      IAreaFactory<T> iareafactory5 = VoroniZoomLayer.INSTANCE.apply(contextFactory.apply(10L), lvt_8_1_);
	      return ImmutableList.of(lvt_8_1_, iareafactory5, lvt_8_1_);
	   }
		public static <T extends IArea, C extends IExtendedNoiseRandom<T>> IAreaFactory<T> repeat(long seed, IAreaTransformer1 parent, IAreaFactory<T> p_202829_3_, int count, LongFunction<C> contextFactory) {
	      IAreaFactory<T> iareafactory = p_202829_3_;

	      for(int i = 0; i < count; ++i) {
	         iareafactory = parent.apply(contextFactory.apply(seed + (long)i), iareafactory);
	      }

	      return iareafactory;
	   }
		

}
