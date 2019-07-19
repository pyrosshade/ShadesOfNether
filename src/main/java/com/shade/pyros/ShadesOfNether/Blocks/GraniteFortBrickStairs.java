package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.StairsBlock;

public class GraniteFortBrickStairs extends StairsBlock{
	public GraniteFortBrickStairs() {
		super(new GraniteFortBricks().getDefaultState(),Properties.from(new GraniteFortBricks()));
		setRegistryName("granite_fort_brick_stairs");
	}
}
