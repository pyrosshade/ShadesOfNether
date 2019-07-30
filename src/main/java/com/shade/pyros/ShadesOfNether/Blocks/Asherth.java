package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Asherth extends Block{

	public Asherth() {
		super(Properties
				.create(Material.EARTH)
				.sound(SoundType.GROUND)
				);
		setRegistryName("asherth");
	}
	public ToolType getHarvestTool(BlockState state) {
		return ToolType.SHOVEL;
	}
}	