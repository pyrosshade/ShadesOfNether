package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;

public class GraniteBrickFence extends FenceBlock{
	public GraniteBrickFence() {
	super(Properties.from(Blocks.GRANITE));
	setRegistryName("granite_brick_fence");
	}
}
