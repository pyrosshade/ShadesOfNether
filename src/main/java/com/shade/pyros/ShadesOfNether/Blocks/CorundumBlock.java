package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class CorundumBlock extends Block{
	public CorundumBlock() {
		super(Properties
				.create(Material.ROCK, MaterialColor.PURPLE)
				.hardnessAndResistance(3.0F, 3.0F)
				);
		setRegistryName("corundum_block");
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}

	@Override
	public int getHarvestLevel(BlockState state) {
		return 2;
	}
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
	}
}
