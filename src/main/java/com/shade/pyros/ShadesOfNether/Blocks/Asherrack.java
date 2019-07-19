package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

public class Asherrack extends Block{

	public Asherrack() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("asherrack");
	}

}
