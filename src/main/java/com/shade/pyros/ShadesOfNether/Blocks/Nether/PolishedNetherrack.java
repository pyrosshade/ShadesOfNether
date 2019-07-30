package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class PolishedNetherrack extends Block{
	public PolishedNetherrack() {
		super(Properties.from(Blocks.NETHERRACK).hardnessAndResistance(2.0F, 6.0F));
		setRegistryName("polished_netherrack");
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
