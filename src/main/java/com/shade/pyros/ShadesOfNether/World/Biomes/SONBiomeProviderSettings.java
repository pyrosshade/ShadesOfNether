package com.shade.pyros.ShadesOfNether.World.Biomes;

import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.gen.NetherGenSettings;
import net.minecraft.world.storage.WorldInfo;

public class SONBiomeProviderSettings implements IBiomeProviderSettings {
	   private WorldInfo worldInfo;
	   private SONGenSettings generatorSettings;

	   public SONBiomeProviderSettings setWorldInfo(WorldInfo info) {
	      this.worldInfo = info;
	      return this;
	   }

	   public SONBiomeProviderSettings setGeneratorSettings(SONGenSettings p_205441_1_) {
	      this.generatorSettings = p_205441_1_;
	      return this;
	   }

	   public WorldInfo getWorldInfo() {
	      return this.worldInfo;
	   }

	   public SONGenSettings getGeneratorSettings() {
	      return this.generatorSettings;
	   }
}
