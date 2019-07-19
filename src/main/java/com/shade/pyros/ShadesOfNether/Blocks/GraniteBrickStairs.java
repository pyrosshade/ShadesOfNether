package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.StairsBlock;

public class GraniteBrickStairs extends StairsBlock{
	public GraniteBrickStairs() {
		super(new GraniteBricks().getDefaultState(),Properties.from(new GraniteBricks()));
		setRegistryName("granite_brick_stairs");
	}
}
