package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.TileEntities.PurificationAltarEntity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class PurificationAltar extends Block{

	public PurificationAltar() {
		super(Properties
				.create(Material.ROCK)
				);
		setRegistryName("purification_altar");
	}
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new PurificationAltarEntity();
	}

}
