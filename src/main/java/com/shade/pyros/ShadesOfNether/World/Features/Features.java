package com.shade.pyros.ShadesOfNether.World.Features;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class Features {
	public static final Feature<NoFeatureConfig> PETRIBARK_PATCH = new PetribarkPatch(NoFeatureConfig::deserialize);
	public static final Feature<NoFeatureConfig> HUGE_PETRIBARK_MUSHROOM = new HugePetribarkMushroom(NoFeatureConfig::deserialize);
	public static final Feature<NoFeatureConfig> CLAYCACOON_BLOB = new ClayCacoonBlob(NoFeatureConfig::deserialize);
}
