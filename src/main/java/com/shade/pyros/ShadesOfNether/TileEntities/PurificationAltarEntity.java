package com.shade.pyros.ShadesOfNether.TileEntities;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks.PURIFICATION_ALTAR_ENTITY;

public class PurificationAltarEntity extends TileEntity implements ITickableTileEntity{

	public PurificationAltarEntity() {
		super(PURIFICATION_ALTAR_ENTITY);
	}

	@Override
	public void tick() {
		
	}

}
