package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkDoor extends DoorBlock {
	public PetribarkDoor() {
		super(Properties.from(Blocks.ACACIA_DOOR));
		setRegistryName("petribark_door");
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
