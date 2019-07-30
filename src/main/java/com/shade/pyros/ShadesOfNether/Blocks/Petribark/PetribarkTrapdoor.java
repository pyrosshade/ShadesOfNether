package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TrapDoorBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkTrapdoor extends TrapDoorBlock {
	public PetribarkTrapdoor() {
		super(Properties.from(Blocks.ACACIA_TRAPDOOR));
		setRegistryName("petribark_trapdoor");
	}
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
