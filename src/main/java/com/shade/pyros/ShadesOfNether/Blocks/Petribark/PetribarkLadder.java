package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PetribarkLadder extends LadderBlock{

	public PetribarkLadder() {
		super(Properties
				.create(Material.WOOD)
				.sound(SoundType.LADDER)
				.hardnessAndResistance(0.4f)
				);
		setRegistryName("petribark_ladder");
	}

	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
