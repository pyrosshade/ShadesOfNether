package com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class Sweaterrack extends Block{

	public Sweaterrack() {
		super(Properties
				.create(Materials.SWEATERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("sweaterrack");
	}
	@Override
	public int getHarvestLevel(BlockState state) {
		return 1;
	}
	@Override
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.PICKAXE;
	}

}
