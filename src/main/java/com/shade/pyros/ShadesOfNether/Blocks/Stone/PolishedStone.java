package com.shade.pyros.ShadesOfNether.Blocks.Stone;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class PolishedStone extends Block{
	public PolishedStone() {
		super(Properties.from(Blocks.STONE));
		setRegistryName("polished_stone");
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
