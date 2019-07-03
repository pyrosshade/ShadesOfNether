package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PetribarkPlanks extends Block{

	public PetribarkPlanks() {
		super(Properties
				.create(Material.WOOD)
				);
		setRegistryName("petribark_planks");
	}
	
}
