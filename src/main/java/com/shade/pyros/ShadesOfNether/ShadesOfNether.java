package com.shade.pyros.ShadesOfNether;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shade.pyros.ShadesOfNether.Blocks.Asherrack;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackBricks;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.AsherrackFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Asherth;
import com.shade.pyros.ShadesOfNether.Blocks.ClayCacoon;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteBricks;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.GraniteFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkBarrel;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkButton;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkCraftingTable;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkDoor;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkFence;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkFenceGate;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkLadder;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroom;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroomCap;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkMushroomStem;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkPlanks;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkPressurePlate;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkSign;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkSlab;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkStairs;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkTrapdoor;
import com.shade.pyros.ShadesOfNether.Blocks.PetribarkWallSign;
import com.shade.pyros.ShadesOfNether.Blocks.PurificationAltar;
import com.shade.pyros.ShadesOfNether.Common.EffectActions;
import com.shade.pyros.ShadesOfNether.Containers.ModVanillaCraftContainer;
import com.shade.pyros.ShadesOfNether.Items.ClayEgg;
import com.shade.pyros.ShadesOfNether.Items.PetribarkStick;
import com.shade.pyros.ShadesOfNether.Items.PurificationPowder;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModSounds;
import com.shade.pyros.ShadesOfNether.Setup.ModSetup;
import com.shade.pyros.ShadesOfNether.TileEntities.ModBarrel;
import com.shade.pyros.ShadesOfNether.TileEntities.PurificationAltarEntity;
import com.shade.pyros.ShadesOfNether.proxy.ClientProxy;
import com.shade.pyros.ShadesOfNether.proxy.CommonProxy;
import com.shade.pyros.ShadesOfNether.proxy.Proxy;

import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("shadesofnether")
public class ShadesOfNether {
	public static ShadesOfNether instance;
	public static final String modid = "shadesofnether";
	public static final Logger debug = LogManager.getLogger(modid);
	public static final Proxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	public static final EffectActions effectactions = new EffectActions();

	
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
			event.getRegistry().register(new Asherrack());
			event.getRegistry().register(new AsherrackBrickFence());
			event.getRegistry().register(new AsherrackBricks());
			event.getRegistry().register(new AsherrackBrickSlab());
			event.getRegistry().register(new AsherrackBrickStairs());
			event.getRegistry().register(new AsherrackBrickWall());
			event.getRegistry().register(new AsherrackFortBrickFence());
			event.getRegistry().register(new AsherrackFortBricks());
			event.getRegistry().register(new AsherrackFortBrickSlab());
			event.getRegistry().register(new AsherrackFortBrickStairs());
			event.getRegistry().register(new AsherrackFortBrickWall());
			event.getRegistry().register(new Asherth());
			event.getRegistry().register(new ClayCacoon());
			event.getRegistry().register(new GraniteBrickFence());
			event.getRegistry().register(new GraniteBricks());
			event.getRegistry().register(new GraniteBrickSlab());
			event.getRegistry().register(new GraniteBrickStairs());
			event.getRegistry().register(new GraniteBrickWall());
			event.getRegistry().register(new GraniteFortBrickFence());
			event.getRegistry().register(new GraniteFortBricks());
			event.getRegistry().register(new GraniteFortBrickSlab());
			event.getRegistry().register(new GraniteFortBrickStairs());
			event.getRegistry().register(new GraniteFortBrickWall());
			event.getRegistry().register(new PetribarkMushroom());
			event.getRegistry().register(new PetribarkMushroomCap());
			event.getRegistry().register(new PetribarkMushroomStem());
			event.getRegistry().register(new PetribarkPlanks());
			event.getRegistry().register(new PetribarkSlab());
			event.getRegistry().register(new PetribarkButton());
			event.getRegistry().register(new PetribarkBarrel());
			event.getRegistry().register(new PetribarkLadder());
			event.getRegistry().register(new PetribarkDoor());
			event.getRegistry().register(new PetribarkFence());
			event.getRegistry().register(new PetribarkFenceGate());
			event.getRegistry().register(new PetribarkPressurePlate());
			event.getRegistry().register(new PetribarkTrapdoor());
			event.getRegistry().register(new PetribarkStairs());
			event.getRegistry().register(new PetribarkSign());
			event.getRegistry().register(new PetribarkWallSign());
			event.getRegistry().register(new PetribarkCraftingTable());
			event.getRegistry().register(new PurificationAltar());
			}
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			Item.Properties properties = new Properties().group(setup.itemGroup);
			//Block items
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK, properties).setRegistryName("asherrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_BRICK_FENCE, properties).setRegistryName("asherrack_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_BRICKS, properties).setRegistryName("asherrack_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_BRICK_SLAB, properties).setRegistryName("asherrack_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_BRICK_STAIRS, properties).setRegistryName("asherrack_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_BRICK_WALL, properties).setRegistryName("asherrack_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_FORT_BRICK_FENCE, properties).setRegistryName("asherrack_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_FORT_BRICKS, properties).setRegistryName("asherrack_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_FORT_BRICK_SLAB, properties).setRegistryName("asherrack_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_FORT_BRICK_STAIRS, properties).setRegistryName("asherrack_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERRACK_FORT_BRICK_WALL, properties).setRegistryName("asherrack_fort_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.ASHERTH, properties).setRegistryName("asherth"));
			event.getRegistry().register(new BlockItem(ModBlocks.CLAYCACOON, properties).setRegistryName("claycacoon"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_BRICK_FENCE, properties).setRegistryName("granite_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_BRICKS, properties).setRegistryName("granite_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_BRICK_SLAB, properties).setRegistryName("granite_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_BRICK_STAIRS, properties).setRegistryName("granite_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_BRICK_WALL, properties).setRegistryName("granite_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_FORT_BRICK_FENCE, properties).setRegistryName("granite_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_FORT_BRICKS, properties).setRegistryName("granite_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_FORT_BRICK_SLAB, properties).setRegistryName("granite_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_FORT_BRICK_STAIRS, properties).setRegistryName("granite_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.GRANITE_FORT_BRICK_WALL, properties).setRegistryName("granite_fort_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM, properties).setRegistryName("petribark_mushroom"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM_CAP, properties).setRegistryName("petribark_mushroom_cap"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_MUSHROOM_STEM, properties).setRegistryName("petribark_mushroom_stem"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_PLANKS, properties).setRegistryName("petribark_planks"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_SLAB, properties).setRegistryName("petribark_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_BUTTON, properties).setRegistryName("petribark_button"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_BARREL, properties).setRegistryName("petribark_barrel"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_LADDER, properties).setRegistryName("petribark_ladder"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_DOOR, properties).setRegistryName("petribark_door"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_FENCE, properties).setRegistryName("petribark_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_FENCE_GATE, properties).setRegistryName("petribark_fence_gate"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_PRESSURE_PLATE, properties).setRegistryName("petribark_pressure_plate"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_TRAPDOOR, properties).setRegistryName("petribark_trapdoor"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_STAIRS, properties).setRegistryName("petribark_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_SIGN, properties).setRegistryName("petribark_sign"));
			/*event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_WALL_SIGN, properties).setRegistryName("petribark_wall_sign"));*/
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_CRAFTING_TABLE, properties).setRegistryName("petribark_crafting_table"));
			event.getRegistry().register(new BlockItem(ModBlocks.PURIFICATION_ALTAR, new Properties()).setRegistryName("purification_altar"));
			//Item items
			event.getRegistry().register(new ClayEgg());
			event.getRegistry().register(new PetribarkStick());
			event.getRegistry().register(new PurificationPowder());
		}
		@SubscribeEvent
		public static void onRegisterContainerType(final RegistryEvent.Register<ContainerType<?>> event) {
				event.getRegistry().registerAll(
						new ContainerType<>(ModVanillaCraftContainer::new).setRegistryName("vanilla_workbench")
						);
		}
		@SubscribeEvent
		public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
			event.getRegistry().register(TileEntityType.Builder
					.create( PurificationAltarEntity::new, ModBlocks.PURIFICATION_ALTAR)
					.build(null)
					.setRegistryName("purification_altar_entity")
					);
		}

		@SubscribeEvent
		public static void registerSounds(RegistryEvent.Register<SoundEvent> event){
			event.getRegistry().register(ModSounds.PURIFY);
		}
		@SubscribeEvent
		public static void onRegisterTileEntityType(final RegistryEvent.Register<TileEntityType<?>> event) {
			IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();

			registry.register(TileEntityType.Builder.create(() -> new ModBarrel(ModBlocks.PETRIBARK_BARREL.getTileEntityType()),ModBlocks.PETRIBARK_BARREL)
					.build(null)
					.setRegistryName("petribark_barrel")
			);
		}
	}
}
