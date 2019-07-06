package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SoundType;

public class PetribarkMushroomCap extends HugeMushroomBlock{

	public PetribarkMushroomCap() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_mushroom_cap");
	}
}
