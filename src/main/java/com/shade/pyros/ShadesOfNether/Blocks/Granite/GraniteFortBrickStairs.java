package com.shade.pyros.ShadesOfNether.Blocks.Granite;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.common.ToolType;

public class GraniteFortBrickStairs extends StairsBlock{
	public GraniteFortBrickStairs() {
		super(new GraniteFortBricks().getDefaultState(),Properties.from(new GraniteFortBricks()));
		setRegistryName("granite_fort_brick_stairs");
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
