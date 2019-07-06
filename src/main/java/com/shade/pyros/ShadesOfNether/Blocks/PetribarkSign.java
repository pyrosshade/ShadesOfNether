package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SoundType;
import net.minecraft.block.StandingSignBlock;

public class PetribarkSign extends StandingSignBlock {
	public PetribarkSign() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.doesNotBlockMovement()
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_sign");
	}
}
