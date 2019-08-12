package com.shade.pyros.ShadesOfNether.Blocks.Ores;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraftforge.common.ToolType;

public class SunsetWhewelliteOreSweater extends Block{

	public SunsetWhewelliteOreSweater() {
		super(Properties
				.create(Materials.SWEATERRACK_STONE)
				.hardnessAndResistance(3.0F, 3.0F)
				);
		setRegistryName("sunset_whewellite_ore_sweaterrack");
	}
	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
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
