package com.shade.pyros.ShadesOfNether.Items.Armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;

public class SunsetHelmet extends ArmorItem{
	public SunsetHelmet(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(new SunsetMaterial(), EquipmentSlotType.HEAD, builder);
	}
}
