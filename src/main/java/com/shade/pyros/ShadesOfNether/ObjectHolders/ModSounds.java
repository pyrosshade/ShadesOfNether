package com.shade.pyros.ShadesOfNether.ObjectHolders;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModSounds {
	@ObjectHolder("shadesofnether:purify")
	public static SoundEvent PURIFY = new SoundEvent(new ResourceLocation("shadesofnether:purify")).setRegistryName("purify");
}
