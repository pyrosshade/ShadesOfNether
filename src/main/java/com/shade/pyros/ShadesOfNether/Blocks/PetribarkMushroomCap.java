package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class PetribarkMushroomCap extends HugeMushroomBlock{

	public PetribarkMushroomCap() {
		super(Properties.create(Material.WOOD, MaterialColor.DIRT).hardnessAndResistance(0.2F).sound(SoundType.WOOD));
		setRegistryName("petribark_mushroom_cap");
	}

}
