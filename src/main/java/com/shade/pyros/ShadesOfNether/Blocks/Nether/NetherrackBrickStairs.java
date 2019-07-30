package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class NetherrackBrickStairs extends ModStairs{
	public NetherrackBrickStairs() {
		super(new NetherrackBricks().getDefaultState(), Properties.from(new NetherrackBricks()));
		
		setRegistryName("netherrack_brick_stairs");
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
