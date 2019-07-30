package com.shade.pyros.ShadesOfNether.Blocks.Asherrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class AsherrackBrickStairs extends ModStairs{
	public AsherrackBrickStairs() {
		super(new AsherrackBricks().getDefaultState(), Properties.from(new AsherrackBricks()));
		
		setRegistryName("asherrack_brick_stairs");
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
