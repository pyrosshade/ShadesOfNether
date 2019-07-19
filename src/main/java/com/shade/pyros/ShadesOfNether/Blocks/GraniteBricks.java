package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class GraniteBricks extends Block{
	public GraniteBricks() {
		super(Properties.from(Blocks.POLISHED_GRANITE));
		setRegistryName("granite_bricks");
	}
}
