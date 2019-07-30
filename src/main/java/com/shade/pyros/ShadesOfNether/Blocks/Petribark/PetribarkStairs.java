package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.Block;
//import net.minecraft.block.StairsBlock;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PetribarkStairs extends ModStairs{

	public PetribarkStairs() {
		super(new PetribarkPlanks().getDefaultState(), Block.Properties.from(new PetribarkPlanks()));
		setRegistryName("petribark_stairs");
	}

	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
