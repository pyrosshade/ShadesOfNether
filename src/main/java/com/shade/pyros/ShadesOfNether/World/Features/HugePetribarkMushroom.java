package com.shade.pyros.ShadesOfNether.World.Features;

import java.util.Random;

import com.google.common.base.Function;
import com.mojang.datafixers.Dynamic;
import com.shade.pyros.ShadesOfNether.Blocks.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class HugePetribarkMushroom extends Feature<NoFeatureConfig>{
	public HugePetribarkMushroom(Function<Dynamic<?>, ? extends NoFeatureConfig> deserializer)
    {
        super(deserializer);
    }

	@Override
	public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand,
			BlockPos pos, NoFeatureConfig config) {
		this.setBlockState(worldIn, pos, ModBlocks.CLAYCACOON.getDefaultState());
		return true;
	}
}
