package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;

public class PetribarkPressurePlate extends PressurePlateBlock {
	public PetribarkPressurePlate() {
		super(Sensitivity.EVERYTHING, Properties.from(Blocks.ACACIA_PRESSURE_PLATE));
		setRegistryName("petribark_pressure_plate");
	}
}
