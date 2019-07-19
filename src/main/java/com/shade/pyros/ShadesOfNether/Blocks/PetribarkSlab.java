package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;

public class PetribarkSlab extends SlabBlock{

	public PetribarkSlab() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_slab");
	}

}
