package com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PolishedSweaterrack extends Block {

	public PolishedSweaterrack() {
		super(Properties.from(new Sweaterrack()));
		setRegistryName("polished_sweaterrack");
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
