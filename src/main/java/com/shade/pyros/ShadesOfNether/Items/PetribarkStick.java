package com.shade.pyros.ShadesOfNether.Items;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;

import net.minecraft.item.Item;

public class PetribarkStick extends Item {

	public PetribarkStick() {
		super(new Item.Properties()
				.group(ShadesOfNether.setup.itemGroup));
		setRegistryName("petribark_stick");
	}
}
