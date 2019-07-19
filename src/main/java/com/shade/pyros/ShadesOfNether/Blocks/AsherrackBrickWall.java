package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;

public class AsherrackBrickWall extends WallBlock{
	public AsherrackBrickWall() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("asherrack_brick_wall");
	}
}
