package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ScreamerrackBricks extends Block{
	public ScreamerrackBricks(){
		super(Properties
				.create(Materials.SCREAMERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				);
		
		setRegistryName("screamerrack_bricks");
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
