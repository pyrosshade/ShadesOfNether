package com.shade.pyros.ShadesOfNether.Setup;

import com.shade.pyros.ShadesOfNether.Blocks.ModBlocks;
import com.shade.pyros.ShadesOfNether.World.ShadesOfNetherWorldGen;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	public ItemGroup itemGroup = new ItemGroup("Shades Of Nether") {
			public ItemStack createIcon() {
				return new ItemStack(ModBlocks.CLAYCACOON);
			}
	};
	public void init() {
		ShadesOfNetherWorldGen.SetupOreGeneration();
	}
}
