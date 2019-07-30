package com.shade.pyros.ShadesOfNether.Blocks.Granite;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraftforge.common.ToolType;

public class GraniteBrickSlab extends SlabBlock{
	public GraniteBrickSlab() {
		super(Properties.from(Blocks.GRANITE));
		setRegistryName("granite_brick_slab");
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
