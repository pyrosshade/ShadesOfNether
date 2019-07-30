package com.shade.pyros.ShadesOfNether.Blocks.Diorite;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class DioriteBrickStairs extends ModStairs{
	public DioriteBrickStairs() {
		super(new DioriteBricks().getDefaultState(), Properties.from(new DioriteBricks()));
		
		setRegistryName("diorite_brick_stairs");
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
