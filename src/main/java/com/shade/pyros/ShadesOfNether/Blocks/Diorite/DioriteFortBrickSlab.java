package com.shade.pyros.ShadesOfNether.Blocks.Diorite;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DioriteFortBrickSlab extends SlabBlock{
	public DioriteFortBrickSlab() {
		super(Properties
				.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("diorite_fort_brick_slab");
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
