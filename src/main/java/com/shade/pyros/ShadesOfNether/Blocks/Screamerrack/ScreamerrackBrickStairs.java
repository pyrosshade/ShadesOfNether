package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class ScreamerrackBrickStairs extends ModStairs{
	public ScreamerrackBrickStairs() {
		super(new ScreamerrackBricks().getDefaultState(), Properties.from(new ScreamerrackBricks()));
		
		setRegistryName("screamerrack_brick_stairs");
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
