package com.shade.pyros.ShadesOfNether.Blocks.Stone;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class StoneFortBrickStairs extends ModStairs{
	public StoneFortBrickStairs() {
		super(new StoneFortBricks().getDefaultState(), Properties.from(new StoneFortBricks()));
		
		setRegistryName("stone_fort_brick_stairs");
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
