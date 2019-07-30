package com.shade.pyros.ShadesOfNether.Blocks.Stone;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class PolishedStoneStairs extends ModStairs{
	public PolishedStoneStairs() {
		super(Blocks.STONE.getDefaultState(), Properties.from(Blocks.STONE));
		setRegistryName("polished_stone_stairs");
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
