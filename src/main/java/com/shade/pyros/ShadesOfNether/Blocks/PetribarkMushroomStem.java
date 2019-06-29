package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class PetribarkMushroomStem extends HugeMushroomBlock{

	public PetribarkMushroomStem() {
		super(Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(0.2F).sound(SoundType.WOOD));
		setRegistryName("petribark_mushroom_stem");
	}
	
}
