package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.StandingSignBlock;

public class PetribarkSign extends StandingSignBlock {
	public PetribarkSign() {
		super(Properties.from(Blocks.ACACIA_SIGN));
		setRegistryName("petribark_sign");
	}
}
