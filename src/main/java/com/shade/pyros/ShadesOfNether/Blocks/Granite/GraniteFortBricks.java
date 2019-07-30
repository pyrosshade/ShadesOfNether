package com.shade.pyros.ShadesOfNether.Blocks.Granite;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class GraniteFortBricks extends Block{
	public GraniteFortBricks() {
		super(Properties.from(Blocks.POLISHED_GRANITE)
				);
		setRegistryName("granite_fort_bricks");
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
