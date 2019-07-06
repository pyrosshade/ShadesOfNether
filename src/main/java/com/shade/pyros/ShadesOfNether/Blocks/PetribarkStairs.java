package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
//import net.minecraft.block.StairsBlock;

public class PetribarkStairs extends ModStairs{

	public PetribarkStairs() {
		super(new PetribarkPlanks().getDefaultState(), Block.Properties.from(new PetribarkPlanks()));
		setRegistryName("petribark_stairs");
	}

}
