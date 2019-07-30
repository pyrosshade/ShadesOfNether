package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class PetribarkMushroomCap extends HugeMushroomBlock{

	public PetribarkMushroomCap() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_mushroom_cap");
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
