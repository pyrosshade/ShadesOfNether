package com.shade.pyros.ShadesOfNether.Blocks.Granite;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.common.ToolType;

public class GraniteBrickStairs extends StairsBlock{
	public GraniteBrickStairs() {
		super(new GraniteBricks().getDefaultState(),Properties.from(new GraniteBricks()));
		setRegistryName("granite_brick_stairs");
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
