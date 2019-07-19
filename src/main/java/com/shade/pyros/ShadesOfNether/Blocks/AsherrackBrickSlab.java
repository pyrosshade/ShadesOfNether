package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;

public class AsherrackBrickSlab extends SlabBlock{
	public AsherrackBrickSlab() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("asherrack_brick_slab");
	}
}
