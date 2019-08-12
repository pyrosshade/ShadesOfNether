package com.shade.pyros.ShadesOfNether.World.Features;
import com.shade.pyros.ShadesOfNether.World.Structures.AsherMine;

import net.minecraft.world.gen.feature.BigMushroomFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;

public class Features {
	public static final Feature<NoFeatureConfig> PETRIBARK_PATCH = new PetribarkPatch(NoFeatureConfig::deserialize);
	public static final Feature<BigMushroomFeatureConfig> HUGE_PETRIBARK_MUSHROOM = new HugePetribarkMushroom(BigMushroomFeatureConfig::deserialize);
	public static final Feature<NoFeatureConfig> CLAYCACOON_BLOB = new ClayCacoonBlob(NoFeatureConfig::deserialize);
	public static final Structure<NoFeatureConfig> ASHER_MINE = new AsherMine(NoFeatureConfig::deserialize);
}
