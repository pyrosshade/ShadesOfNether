package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class GraniteFortBricks extends Block{
	public GraniteFortBricks() {
		super(Properties.from(Blocks.POLISHED_GRANITE)
				);
		setRegistryName("granite_fort_bricks");
	}
}
