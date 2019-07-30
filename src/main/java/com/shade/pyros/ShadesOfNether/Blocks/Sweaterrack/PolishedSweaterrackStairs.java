package com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PolishedSweaterrackStairs extends ModStairs{
	public PolishedSweaterrackStairs() {
		super(new PolishedSweaterrack().getDefaultState(), Properties.from(new PolishedSweaterrack()));
		setRegistryName("polished_sweaterrack_stairs");
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
