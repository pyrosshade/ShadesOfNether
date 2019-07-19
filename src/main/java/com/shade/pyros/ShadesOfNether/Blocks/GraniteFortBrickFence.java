package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;

public class GraniteFortBrickFence extends FenceBlock{
	public GraniteFortBrickFence() {
		super(Properties.from(Blocks.GRANITE));
		setRegistryName("granite_fort_brick_fence");
	}
}
