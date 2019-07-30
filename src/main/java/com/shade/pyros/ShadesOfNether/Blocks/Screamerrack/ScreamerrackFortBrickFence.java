package com.shade.pyros.ShadesOfNether.Blocks.Screamerrack;

import com.shade.pyros.ShadesOfNether.Common.Materials;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ScreamerrackFortBrickFence extends FenceBlock{
	public ScreamerrackFortBrickFence() {
		super(Properties
				.create(Materials.SCREAMERRACK_STONE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				);
		
		setRegistryName("screamerrack_fort_brick_fence");
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
