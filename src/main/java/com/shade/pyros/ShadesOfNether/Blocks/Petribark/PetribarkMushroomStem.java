package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class PetribarkMushroomStem extends HugeMushroomBlock{

	public PetribarkMushroomStem() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_mushroom_stem");
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
