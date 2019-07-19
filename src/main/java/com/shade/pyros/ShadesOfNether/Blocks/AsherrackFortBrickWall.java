package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;

public class AsherrackFortBrickWall extends WallBlock{
	public AsherrackFortBrickWall() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("asherrack_fort_brick_wall");
	}
}
