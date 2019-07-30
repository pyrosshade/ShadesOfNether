package com.shade.pyros.ShadesOfNether.Items;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;

import net.minecraft.item.Item;

public class SunsetWhewelliteGem extends Item{

	public SunsetWhewelliteGem() {
		super(new Item.Properties()
				.group(ShadesOfNether.setup.itemGroup)
				);
		setRegistryName("sunset_whewellite_gem");
	}
}
