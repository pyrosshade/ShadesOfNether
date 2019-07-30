package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class CorundumOreSweater extends Block{

	public CorundumOreSweater() {
		super(Properties
				.create(Materials.SWEATERRACK_STONE)
				.hardnessAndResistance(3.0F, 3.0F)
				);
		setRegistryName("corundum_ore_sweaterrack");
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
