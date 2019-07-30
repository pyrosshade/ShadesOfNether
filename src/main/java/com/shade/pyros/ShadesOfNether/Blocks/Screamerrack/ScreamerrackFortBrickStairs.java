package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class ScreamerrackFortBrickStairs extends ModStairs{
	public ScreamerrackFortBrickStairs() {
		super(new ScreamerrackFortBricks().getDefaultState(), Properties.from(new ScreamerrackFortBricks()));
		
		setRegistryName("screamerrack_fort_brick_stairs");
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
