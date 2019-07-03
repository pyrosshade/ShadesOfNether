package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.WallSignBlock;

public class PetribarkWallSign extends WallSignBlock {
	public PetribarkWallSign() {
		super(Properties.from(Blocks.ACACIA_WALL_SIGN).lootFrom(ModBlocks.PETRIBARK_SIGN));
		setRegistryName("petribark_wall_sign");
	}
}
