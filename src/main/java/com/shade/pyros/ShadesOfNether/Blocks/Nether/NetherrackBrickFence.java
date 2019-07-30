package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class NetherrackBrickFence extends FenceBlock{
	public NetherrackBrickFence() {
		super(Properties
				.from(Blocks.NETHERRACK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(2.0F, 6.0F)
				);
		
		setRegistryName("netherrack_brick_fence");
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
