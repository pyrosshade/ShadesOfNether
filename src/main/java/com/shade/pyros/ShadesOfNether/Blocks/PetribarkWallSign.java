package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallSignBlock;

public class PetribarkWallSign extends WallSignBlock {
	public PetribarkWallSign() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.doesNotBlockMovement()
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				.lootFrom(new PetribarkSign())
				);
		setRegistryName("petribark_wall_sign");
	}
}
