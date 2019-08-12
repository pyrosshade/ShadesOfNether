package com.shade.pyros.ShadesOfNether.ObjectHolders;

import com.shade.pyros.ShadesOfNether.Items.ClayEgg;
import com.shade.pyros.ShadesOfNether.Items.PetribarkStick;
import com.shade.pyros.ShadesOfNether.Items.PurificationPowder;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;
@ObjectHolder("shadesofnether")
public class ModItems{
	
	@ObjectHolder("clayegg")
	public static ClayEgg CLAYEGG;
	
	@ObjectHolder("petribark_stick")
	public static PetribarkStick PETRIBARK_STICK;
	
	@ObjectHolder("purification_powder")
	public static PurificationPowder PURIFICATION_POWDER;
	
	@ObjectHolder("clay_spider_spawn_egg")
	public static Item CLAY_SPIDER_SPAWN_EGG;
}