package com.shade.pyros.ShadesOfNether.World.SurfaceBuilders;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class ModSurfaceBuilders {
	public static final SurfaceBuilder<SurfaceBuilderConfig> ASHER_SURFACE_BUILDER = new AsherSurfaceBuilder(SurfaceBuilderConfig::deserialize);
	public static final SurfaceBuilder<SurfaceBuilderConfig> SCREAMER_SURFACE_BUILDER = new ScreamerSurfaceBuilder(SurfaceBuilderConfig::deserialize);
	public static final SurfaceBuilder<SurfaceBuilderConfig> SWEATER_SURFACE_BUILDER = new SweaterSurfaceBuilder(SurfaceBuilderConfig::deserialize);
	
}
