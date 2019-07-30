package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PolishedScreamerrackStairs extends ModStairs{
	public PolishedScreamerrackStairs() {
		super(new PolishedScreamerrack().getDefaultState(), Properties.from(new PolishedScreamerrack()));
		setRegistryName("polished_screamerrack_stairs");
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
