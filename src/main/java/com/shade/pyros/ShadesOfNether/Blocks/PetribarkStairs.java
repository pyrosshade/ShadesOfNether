package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class PetribarkStairs extends StairsBlock{

	public PetribarkStairs() {
		super(new PetribarkPlanks().getDefaultState(), Block.Properties.from(ModBlocks.PETRIBARK_PLANKS));
		setRegistryName("petribark_stairs");
	}

}
