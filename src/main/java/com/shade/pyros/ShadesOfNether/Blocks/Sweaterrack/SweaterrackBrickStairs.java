package com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class SweaterrackBrickStairs extends ModStairs{
	public SweaterrackBrickStairs() {
		super(new SweaterrackBricks().getDefaultState(), Properties.from(new SweaterrackBricks()));
		
		setRegistryName("sweaterrack_brick_stairs");
	}
	@Override
	public int getHarvestLevel(BlockState state) {
		return 1;
	}
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
	}
}
