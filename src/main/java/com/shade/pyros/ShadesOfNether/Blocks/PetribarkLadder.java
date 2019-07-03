package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.LadderBlock;
import net.minecraft.block.material.Material;

public class PetribarkLadder extends LadderBlock{

	public PetribarkLadder() {
		super(Properties
				.create(Material.WOOD)
				);
		setRegistryName("petribark_ladder");
	}

}
