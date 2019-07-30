package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraftforge.common.ToolType;

public class NetherrackBrickWall extends WallBlock{
	public NetherrackBrickWall() {
		super(Properties
				.from(Blocks.NETHERRACK)
				.hardnessAndResistance(2.0F, 6.0F)
				.sound(SoundType.STONE)
				);
		setRegistryName("netherrack_brick_wall");
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
