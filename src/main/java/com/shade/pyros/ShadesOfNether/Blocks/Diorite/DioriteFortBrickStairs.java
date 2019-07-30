package com.shade.pyros.ShadesOfNether.Blocks.Diorite;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class DioriteFortBrickStairs extends ModStairs{
	public DioriteFortBrickStairs() {
		super(new DioriteFortBricks().getDefaultState(), Properties.from(new DioriteFortBricks()));
		
		setRegistryName("diorite_fort_brick_stairs");
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
