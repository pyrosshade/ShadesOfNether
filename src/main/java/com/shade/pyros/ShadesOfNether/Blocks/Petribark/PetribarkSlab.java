package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class PetribarkSlab extends SlabBlock{

	public PetribarkSlab() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_slab");
	}

	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
