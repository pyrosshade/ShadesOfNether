package com.shade.pyros.ShadesOfNether.Blocks.Nether;

import com.shade.pyros.ShadesOfNether.Blocks.ModStairs;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.ToolType;

public class PolishedNetherrackStairs extends ModStairs{
	public PolishedNetherrackStairs() {
		super(Blocks.NETHERRACK.getDefaultState(), Properties.from(new PolishedNetherrack()));
		setRegistryName("polished_netherrack_stairs");
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
