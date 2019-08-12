package com.shade.pyros.ShadesOfNether.ObjectHolders;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;
import com.shade.pyros.ShadesOfNether.Entities.ClaySpider;
import com.shade.pyros.ShadesOfNether.World.Biomes.SONBiomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
	public static EntityType<?> CLAYSPIDER = EntityType.Builder
			.create(ClaySpider::new, EntityClassification.MONSTER)
			.size(0.7F, 0.5F)
			.build("shadesofnether:clay_spider")
			.setRegistryName("clay_spider");
	

	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
				ModItems.CLAY_SPIDER_SPAWN_EGG =  registerEntitySpawnEgg(CLAYSPIDER, 0x030303, 0xff1f2f, "clay_spider_spawn_egg")
		);
	}
	public static Item registerEntitySpawnEgg(EntityType<?> type, int colour1, int colour2, String name) 
	{
		SpawnEggItem item = new SpawnEggItem(type, colour1, colour2, new Item.Properties().group(ShadesOfNether.setup.itemGroup));
		item.setRegistryName("shadesofnether:"+name);
		return item;
	}

	public static void registerEntityWorldSpawns() {
		registerEntityWorldSpawn(ForgeRegistries.ENTITIES.getValue(ModEntities.CLAYSPIDER.getRegistryName()), 20, 4, 6, SONBiomes.ASHER);
	}
	public static void registerEntityWorldSpawn(EntityType<?> entity, int spawnWeight, int spawnMin, int spawnMax, Biome...biomes) // Takes in the entity type, average number to spawn, minimum amount to spawn, and max to spawn.
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, spawnWeight, spawnMin, spawnMax));
			}
		}
	}
}
