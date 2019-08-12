package com.shade.pyros.ShadesOfNether.World.SurfaceBuilders;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.OctavesNoiseGenerator;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.registries.ForgeRegistries;

public class AsherSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig>{
	private static final BlockState CAVE_AIR = Blocks.CAVE_AIR.getDefaultState();
	private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
	private static final BlockState SOUL_SAND = Blocks.SOUL_SAND.getDefaultState();
	private static final BlockState ASHERRACK = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("shadesofnether:asherrack")).getDefaultState();
	protected long field_205552_a;
	protected OctavesNoiseGenerator field_205553_b;
	
	public AsherSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> p_i51305_1_) {
		super(p_i51305_1_);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
			BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
		int i = seaLevel + 1;
	      int j = x & 15;
	      int k = z & 15;
	      boolean flag = this.field_205553_b.func_205563_a((double)x * 0.03125D, (double)z * 0.03125D, 0.0D) + random.nextDouble() * 0.2D > 0.0D;
	      boolean flag1 = this.field_205553_b.func_205563_a((double)x * 0.03125D, 109.0D, (double)z * 0.03125D) + random.nextDouble() * 0.2D > 0.0D;
	      int l = (int)(noise / 3.0D + 3.0D + random.nextDouble() * 0.25D);
	      BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
	      int i1 = -1;
	      BlockState blockstate = ASHERRACK;
	      BlockState blockstate1 = ASHERRACK;

	      for(int j1 = 127; j1 >= 0; --j1) {
	         blockpos$mutableblockpos.setPos(j, j1, k);
	         BlockState blockstate2 = chunkIn.getBlockState(blockpos$mutableblockpos);
	         if (blockstate2.getBlock() != null && !blockstate2.isAir()) {
	            if (blockstate2.getBlock() == defaultBlock.getBlock()) {
	               if (i1 == -1) {
	                  if (l <= 0) {
	                     blockstate = CAVE_AIR;
	                     blockstate1 = ASHERRACK;
	                  } else if (j1 >= i - 4 && j1 <= i + 1) {
	                     blockstate = ASHERRACK;
	                     blockstate1 = ASHERRACK;
	                     if (flag1) {
	                        blockstate = GRAVEL;
	                        blockstate1 = ASHERRACK;
	                     }

	                     if (flag) {
	                        blockstate = SOUL_SAND;
	                        blockstate1 = SOUL_SAND;
	                     }
	                  }

	                  if (j1 < i && (blockstate == null || blockstate.isAir())) {
	                     blockstate = defaultFluid;
	                  }

	                  i1 = l;
	                  if (j1 >= i - 1) {
	                     chunkIn.setBlockState(blockpos$mutableblockpos, blockstate, false);
	                  } else {
	                     chunkIn.setBlockState(blockpos$mutableblockpos, blockstate1, false);
	                  }
	               } else if (i1 > 0) {
	                  --i1;
	                  chunkIn.setBlockState(blockpos$mutableblockpos, blockstate1, false);
	               }
	            }
	         } else {
	            i1 = -1;
	         }
	      }

	   }

	public void setSeed(long seed) {
		if (this.field_205552_a != seed || this.field_205553_b == null) {
			this.field_205553_b = new OctavesNoiseGenerator(new SharedSeedRandom(seed), 4);
		}

		this.field_205552_a = seed;
	}
}
