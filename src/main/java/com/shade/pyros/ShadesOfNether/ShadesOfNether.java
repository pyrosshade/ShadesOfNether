package com.shade.pyros.ShadesOfNether;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shade.pyros.ShadesOfNether.Blocks.ClayCacoon;
import com.shade.pyros.ShadesOfNether.Blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("shadesofnether")
public class ShadesOfNether {
	public static ShadesOfNether instance;
	public static final String modid = "shadesofnether";
	private static final Logger debug = LogManager.getLogger(modid);
	
	public ShadesOfNether() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event) {
		debug.log(Level.INFO, "Hello");
	}
	private void clientRegistries(final FMLClientSetupEvent event) {
		debug.log(Level.INFO, "Goodbye");
	}
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		@SubscribeEvent
		public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().register(new ClayCacoon());
		}
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			event.getRegistry().register(new BlockItem(ModBlocks.CLAYCACOON, new Item.Properties()).setRegistryName("claycacoon"));
		}
	}
}
