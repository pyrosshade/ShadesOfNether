package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;

public class PetribarkFence extends FenceBlock {
	public PetribarkFence() {
		super(Properties.from(Blocks.ACACIA_FENCE));
		setRegistryName("petribark_fence");
	}
}
