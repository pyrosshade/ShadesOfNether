package com.shade.pyros.ShadesOfNether.Blocks.Granite;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class GraniteBricks extends Block{
	public GraniteBricks() {
		super(Properties.from(Blocks.POLISHED_GRANITE));
		setRegistryName("granite_bricks");
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
