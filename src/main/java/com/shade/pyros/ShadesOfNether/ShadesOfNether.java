package com.shade.pyros.ShadesOfNether;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shade.pyros.ShadesOfNether.Blocks.ClayCacoon;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkButton;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkCraftingTable;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkLadder;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroom;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroomCap;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroomStem;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkPlanks;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkSign;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkSlab;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkStairs;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkWallSign;
import com.shade.pyros.ShadesOfNether.Containers.VanillaWorkBench;
import com.shade.pyros.ShadesOfNether.Items.ClayEgg;
import com.shade.pyros.ShadesOfNether.Items.PetribarkStick;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.Setup.ModSetup;
import com.shade.pyros.ShadesOfNether.proxy.ClientProxy;
import com.shade.pyros.ShadesOfNether.proxy.CommonProxy;
import com.shade.pyros.ShadesOfNether.proxy.Proxy;

import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("shadesofnether")
public class ShadesOfNether {
	public static ShadesOfNether instance;
	public static final String modid = "shadesofnether";
	public static final Logger debug = LogManager.getLogger(modid);

	public static final Proxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);


	
	public static ModSetup setup = new ModSetup();
	public ShadesOfNether() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event) {
        debug.info(modid + " : common setup");
		setup.init();
        proxy.onCommonSetup(event);
	}
	private void clientRegistries(final FMLClientSetupEvent event) {
        debug.info(modid + " : client setup");
        proxy.onClientSetup(event);
	}
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		@SubscribeEvent
		public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().register(new ClayCacoon());		
			event.getRegistry().register(new PetribarkMushroom());
			event.getRegistry().register(new PetribarkMushroomCap());
			event.getRegistry().register(new PetribarkMushroomStem());
			event.getRegistry().register(new PetribarkPlanks());
			event.getRegistry().register(new PetribarkSlab());
			event.getRegistry().register(new PetribarkButton());
			event.getRegistry().register(new PetribarkLadder());
			//event.getRegistry().register(new PetribarkDoor());
			//event.getRegistry().register(new PetribarkFence());
			//event.getRegistry().register(new PetribarkFenceGate());
			//event.getRegistry().register(new PetribarkPressurePlate());
			//event.getRegistry().register(new PetribarkTrapdoor());
			event.getRegistry().register(new PetribarkStairs());
			event.getRegistry().register(new PetribarkSign());
			event.getRegistry().register(new PetribarkWallSign());
			event.getRegistry().register(new PetribarkCraftingTable());
			}
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			Item.Properties properties = new Properties().group(setup.itemGroup);
			//Block items
			event.getRegistry().register(new BlockItem(ModBlocks.CLAYCACOON, properties).setRegistryName("claycacoon"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM, properties).setRegistryName("petribark_mushroom"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM_CAP, properties).setRegistryName("petribark_mushroom_cap"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM_STEM, properties).setRegistryName("petribark_mushroom_stem"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_PLANKS, properties).setRegistryName("petribark_planks"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_SLAB, properties).setRegistryName("petribark_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_BUTTON, properties).setRegistryName("petribark_button"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_LADDER, properties).setRegistryName("petribark_ladder"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_DOOR, properties).setRegistryName("petribark_door"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_FENCE, properties).setRegistryName("petribark_fence"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_FENCEGATE, properties).setRegistryName("petribark_fencegate"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_PRESSURE_PLATE, properties).setRegistryName("petribark_pressure_plate"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_TRAPDOOR, properties).setRegistryName("petribark_trapdoor"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_STAIRS, properties).setRegistryName("petribark_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_SIGN, properties).setRegistryName("petribark_sign"));
			//event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_WALL_SIGN, properties).setRegistryName("petribark_wall_sign"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_CRAFTING_TABLE, new Properties()).setRegistryName("petribark_crafting_table"));
			//Item items
			event.getRegistry().register(new ClayEgg());
			event.getRegistry().register(new PetribarkStick());
		}
		@SubscribeEvent
		public static void onRegisterContainerType(final RegistryEvent.Register<ContainerType<?>> event) {
				event.getRegistry().registerAll(
						new ContainerType<>(VanillaWorkBench::new).setRegistryName("vanilla_workbench")
						);
		}
	}
}
