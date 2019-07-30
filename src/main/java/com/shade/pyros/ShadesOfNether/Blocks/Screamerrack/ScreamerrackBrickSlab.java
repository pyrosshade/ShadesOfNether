package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ScreamerrackBrickSlab extends SlabBlock{
	public ScreamerrackBrickSlab() {
		super(Properties
				.create(Materials.SCREAMERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("screamerrack_brick_slab");
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
