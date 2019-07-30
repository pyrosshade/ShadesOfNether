package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class NetherrackBrickSlab extends SlabBlock{
	public NetherrackBrickSlab() {
		super(Properties
				.from(Blocks.NETHERRACK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(0.4F)
				);
		setRegistryName("netherrack_brick_slab");
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
