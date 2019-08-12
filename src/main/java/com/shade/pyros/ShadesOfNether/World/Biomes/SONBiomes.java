package com.shade.pyros.ShadesOfNether.World.Biomes;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class SONBiomes {
	public static final Biome ASHER = new AsherBiome();
	public static void registerBiomes() {
		regBiome(ASHER, BiomeType.WARM, Type.NETHER ,Type.HOT, Type.DEAD, Type.DRY);
	}
	public static Biome regBiome(Biome biomeIn, BiomeType bTypeIn, Type... typesIn) {
		BiomeDictionary.addTypes(biomeIn, typesIn);
		return biomeIn;
	}
}
