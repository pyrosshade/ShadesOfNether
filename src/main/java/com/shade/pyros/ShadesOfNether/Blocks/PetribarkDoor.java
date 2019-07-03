package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;

public class PetribarkDoor extends DoorBlock {
	public PetribarkDoor() {
		super(Properties.from(Blocks.ACACIA_DOOR));
		setRegistryName("petribark_door");
	}
}
