package com.shade.pyros.ShadesOfNether.Blocks.Asherrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class AsherrackFortBrickStairs extends ModStairs{
	public AsherrackFortBrickStairs() {
		super(new AsherrackFortBricks().getDefaultState(), Properties.from(new AsherrackFortBricks()));
		
		setRegistryName("asherrack_fort_brick_stairs");
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
