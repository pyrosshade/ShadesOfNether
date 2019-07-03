package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.TrapDoorBlock;

public class PetribarkTrapdoor extends TrapDoorBlock {
	public PetribarkTrapdoor() {
		super(Properties.from(Blocks.ACACIA_TRAPDOOR));
		setRegistryName("petribark_trapdoor");
	}
}
