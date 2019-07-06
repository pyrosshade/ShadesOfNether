package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SoundType;

public class PetribarkMushroomStem extends HugeMushroomBlock{

	public PetribarkMushroomStem() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_mushroom_stem");
	}
}
