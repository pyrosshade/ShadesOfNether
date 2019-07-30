package com.shade.pyros.ShadesOfNether.ObjectHolders;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;

public class ModEntities {
	public static EntityType<?> CLAYSPIDER = EntityType.Builder
			.create(ClaySpiderEntity::new, EntityClassification.MONSTER)
			.build("shadesofnether:clay_spider")
			.setRegistryName("clay_spider");
}
