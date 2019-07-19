package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;

public class AsherrackBrickFence extends FenceBlock{
	public AsherrackBrickFence() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				);
		
		setRegistryName("asherrack_brick_fence");
	}
}
