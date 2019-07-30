package com.shade.pyros.ShadesOfNether.Blocks.Andesite;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AndesiteBrickWall extends WallBlock{
	public AndesiteBrickWall() {
		super(Properties
				.create(Material.ROCK)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("andesite_brick_wall");
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
