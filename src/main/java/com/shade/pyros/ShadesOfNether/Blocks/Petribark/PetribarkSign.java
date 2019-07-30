package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.StandingSignBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkSign extends StandingSignBlock {
	public PetribarkSign() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.doesNotBlockMovement()
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_sign");
	}
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.MODEL;
	}
}
