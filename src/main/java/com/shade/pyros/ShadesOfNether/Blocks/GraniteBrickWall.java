package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class GraniteBrickWall extends WallBlock{
	public GraniteBrickWall() {
		super(Properties.from(Blocks.GRANITE));
		setRegistryName("granite_brick_wall");
	}
}
