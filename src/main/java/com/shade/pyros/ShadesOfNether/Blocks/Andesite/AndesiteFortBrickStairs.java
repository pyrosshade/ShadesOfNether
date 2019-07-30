package com.shade.pyros.ShadesOfNether.Blocks.Andesite;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class AndesiteFortBrickStairs extends ModStairs{
	public AndesiteFortBrickStairs() {
		super(new AndesiteFortBricks().getDefaultState(), Properties.from(new AndesiteFortBricks()));
		
		setRegistryName("andesite_fort_brick_stairs");
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
