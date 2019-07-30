package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraftforge.common.ToolType;



public class PolishedNetherrackSlab extends SlabBlock{
	public PolishedNetherrackSlab() {
		super(Properties.from(new PolishedNetherrack()));
		setRegistryName("polished_netherrack_slab");
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
