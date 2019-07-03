package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;

public class PetribarkFenceGate extends FenceGateBlock {
	public PetribarkFenceGate() {
		super(Properties.from(Blocks.ACACIA_FENCE_GATE));
		setRegistryName("petribark_fancegate");
	}
}
