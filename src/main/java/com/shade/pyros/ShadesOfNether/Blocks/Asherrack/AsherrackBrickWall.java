package com.shade.pyros.ShadesOfNether.Blocks.Asherrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraftforge.common.ToolType;

public class AsherrackBrickWall extends WallBlock{
	public AsherrackBrickWall() {
		super(Properties
				.create(Materials.ASHERRACK_STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("asherrack_brick_wall");
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
