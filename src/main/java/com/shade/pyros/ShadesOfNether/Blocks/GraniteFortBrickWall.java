package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class GraniteFortBrickWall extends WallBlock{
	public GraniteFortBrickWall() {
		super(Properties.from(Blocks.GRANITE));
		setRegistryName("granite_fort_brick_wall");
	}
}
