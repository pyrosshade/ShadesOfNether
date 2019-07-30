package com.shade.pyros.ShadesOfNether.Blocks.Andesite;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class AndesiteBrickStairs extends ModStairs{
	public AndesiteBrickStairs() {
		super(new AndesiteBricks().getDefaultState(), Properties.from(new AndesiteBricks()));
		
		setRegistryName("andesite_brick_stairs");
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
