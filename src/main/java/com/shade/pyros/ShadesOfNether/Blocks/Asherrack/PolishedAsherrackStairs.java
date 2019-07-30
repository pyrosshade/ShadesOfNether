package com.shade.pyros.ShadesOfNether.Blocks.Asherrack;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PolishedAsherrackStairs extends ModStairs{
	public PolishedAsherrackStairs() {
		super(new PolishedAsherrack().getDefaultState(), Properties.from(new PolishedAsherrack()));
		setRegistryName("polished_asherrack_stairs");
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
