package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;

public class GraniteBrickSlab extends SlabBlock{
	public GraniteBrickSlab() {
		super(Properties.from(Blocks.GRANITE));
		setRegistryName("granite_brick_slab");
	}
}
