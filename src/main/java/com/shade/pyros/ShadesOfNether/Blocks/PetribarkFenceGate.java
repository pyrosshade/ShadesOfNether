package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SoundType;

public class PetribarkFenceGate extends FenceGateBlock {
	public PetribarkFenceGate() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_fence_gate");
	}
}
