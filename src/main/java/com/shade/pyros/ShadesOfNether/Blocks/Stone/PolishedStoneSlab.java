package com.shade.pyros.ShadesOfNether.Blocks.Stone;

import net.minecraft.block.SlabBlock;
import net.minecraftforge.common.ToolType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class PolishedStoneSlab extends SlabBlock{
	public PolishedStoneSlab() {
		super(Properties.from(Blocks.STONE) );
		setRegistryName("polished_stone_slab");
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
