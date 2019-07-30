package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkPressurePlate extends PressurePlateBlock {
	public PetribarkPressurePlate() {
		super(Sensitivity.EVERYTHING, Properties.from(Blocks.ACACIA_PRESSURE_PLATE));
		setRegistryName("petribark_pressure_plate");
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
