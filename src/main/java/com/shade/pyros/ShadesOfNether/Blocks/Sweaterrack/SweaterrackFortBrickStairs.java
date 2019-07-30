package com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class SweaterrackFortBrickStairs extends ModStairs{
	public SweaterrackFortBrickStairs() {
		super(new SweaterrackFortBricks().getDefaultState(), Properties.from(new SweaterrackFortBricks()));
		
		setRegistryName("sweaterrack_fort_brick_stairs");
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
