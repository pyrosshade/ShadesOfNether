package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraftforge.common.ToolType;

public class ScreamerrackFortBrickWall extends WallBlock{
	public ScreamerrackFortBrickWall() {
		super(Properties
				.create(Materials.SCREAMERRACK_STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("screamerrack_fort_brick_wall");
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
