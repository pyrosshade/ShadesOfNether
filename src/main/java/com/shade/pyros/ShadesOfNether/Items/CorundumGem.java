package com.shade.pyros.ShadesOfNether.Items;
import com.shade.pyros.ShadesOfNether.ShadesOfNether;

import net.minecraft.item.Item;

public class CorundumGem extends Item{

	public CorundumGem() {
		super(new Item.Properties()
				.group(ShadesOfNether.setup.itemGroup)
				);
		setRegistryName("corundum_gem");
	}

}
