package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallSignBlock;
import net.minecraftforge.common.ToolType;

public class PetribarkWallSign extends WallSignBlock {
	public PetribarkWallSign() {
		super(Properties
				.create(Materials.PETRIBARK_WOOD)
				.doesNotBlockMovement()
				.hardnessAndResistance(0.45F)
				.sound(SoundType.WOOD)
				.lootFrom(new PetribarkSign())
				);
		setRegistryName("petribark_wall_sign");
	}
	
	@Override
	public BlockRenderType getRenderType(BlockState state)
{		return BlockRenderType.MODEL;
	}
	
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.AXE;
	}
}
