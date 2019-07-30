package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WoodButtonBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkButton extends WoodButtonBlock {

	public PetribarkButton() {
		super(Properties.from(Blocks.ACACIA_BUTTON));
		setRegistryName("petribark_button");
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}

}
