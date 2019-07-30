package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class PolishedScreamerrack extends Block{
	public PolishedScreamerrack() {
		super(Properties.from(new Screamerrack()));
		setRegistryName("polished_screamerrack");
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
