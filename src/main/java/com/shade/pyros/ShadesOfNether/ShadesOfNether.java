package com.shade.pyros.ShadesOfNether;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.shade.pyros.ShadesOfNether.Blocks.Asherth;
import com.shade.pyros.ShadesOfNether.Blocks.ClayCacoon;
import com.shade.pyros.ShadesOfNether.Blocks.CorundumBlock;
import com.shade.pyros.ShadesOfNether.Blocks.CorundumOreAsher;
import com.shade.pyros.ShadesOfNether.Blocks.CorundumOreNether;
import com.shade.pyros.ShadesOfNether.Blocks.CorundumOreScreamer;
import com.shade.pyros.ShadesOfNether.Blocks.CorundumOreSweater;
import com.shade.pyros.ShadesOfNether.Blocks.SunsetWhewelliteBlock;
import com.shade.pyros.ShadesOfNether.Blocks.SunsetWhewelliteOreAsher;
import com.shade.pyros.ShadesOfNether.Blocks.SunsetWhewelliteOreNether;
import com.shade.pyros.ShadesOfNether.Blocks.SunsetWhewelliteOreScreamer;
import com.shade.pyros.ShadesOfNether.Blocks.SunsetWhewelliteOreSweater;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Andesite.AndesiteFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.Asherrack;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.AsherrackFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.PolishedAsherrack;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.PolishedAsherrackSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Asherrack.PolishedAsherrackStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Diorite.DioriteFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Granite.GraniteFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.NetherrackBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.NetherrackBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.NetherrackBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.NetherrackBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.NetherrackBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.PolishedNetherrack;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.PolishedNetherrackSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Nether.PolishedNetherrackStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkBarrel;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkButton;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkCraftingTable;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkDoor;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkFence;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkFenceGate;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkLadder;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkMushroom;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkMushroomCap;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkMushroomStem;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkPlanks;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkPressurePlate;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkSign;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkTrapdoor;
import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkWallSign;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.PolishedScreamerrack;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.PolishedScreamerrackSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.PolishedScreamerrackStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.Screamerrack;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Screamerrack.ScreamerrackFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.PolishedStone;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.PolishedStoneSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.PolishedStoneStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Stone.StoneFortBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.PolishedSweaterrack;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.PolishedSweaterrackSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.PolishedSweaterrackStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.Sweaterrack;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackBricks;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackFortBrickFence;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackFortBrickSlab;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackFortBrickStairs;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackFortBrickWall;
import com.shade.pyros.ShadesOfNether.Blocks.Sweaterrack.SweaterrackFortBricks;
import com.shade.pyros.ShadesOfNether.Common.EffectActions;
import com.shade.pyros.ShadesOfNether.Containers.ModVanillaCraftContainer;
import com.shade.pyros.ShadesOfNether.Items.ClayEgg;
import com.shade.pyros.ShadesOfNether.Items.CorruptionPowder;
import com.shade.pyros.ShadesOfNether.Items.CorundumGem;
import com.shade.pyros.ShadesOfNether.Items.PetribarkStick;
import com.shade.pyros.ShadesOfNether.Items.PurificationPowder;
import com.shade.pyros.ShadesOfNether.Items.SunsetWhewelliteGem;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModEntities;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModSounds;
import com.shade.pyros.ShadesOfNether.Setup.ModSetup;
import com.shade.pyros.ShadesOfNether.TileEntities.ModBarrelTE;
import com.shade.pyros.ShadesOfNether.proxy.ClientProxy;
import com.shade.pyros.ShadesOfNether.proxy.CommonProxy;
import com.shade.pyros.ShadesOfNether.proxy.Proxy;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.SignItem;
import net.minecraft.tileentity.SignTileEntity;
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
	public static EffectActions effectActions = null;

	
	public static ModSetup setup = new ModSetup();
	public ShadesOfNether() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event) {
        debug.info(modid + " : common setup");
        effectActions = new EffectActions();
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
			

			event.getRegistry().register(new AndesiteBrickFence());
			event.getRegistry().register(new AndesiteBricks());
			event.getRegistry().register(new AndesiteBrickSlab());
			event.getRegistry().register(new AndesiteBrickStairs());
			event.getRegistry().register(new AndesiteBrickWall());
			event.getRegistry().register(new AndesiteFortBrickFence());
			event.getRegistry().register(new AndesiteFortBricks());
			event.getRegistry().register(new AndesiteFortBrickSlab());
			event.getRegistry().register(new AndesiteFortBrickStairs());
			event.getRegistry().register(new AndesiteFortBrickWall());
			
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
			
			event.getRegistry().register(new CorundumBlock());
			event.getRegistry().register(new CorundumOreAsher());
			event.getRegistry().register(new CorundumOreNether());
			event.getRegistry().register(new CorundumOreScreamer());
			event.getRegistry().register(new CorundumOreSweater());
			
			event.getRegistry().register(new DioriteBrickFence());
			event.getRegistry().register(new DioriteBricks());
			event.getRegistry().register(new DioriteBrickSlab());
			event.getRegistry().register(new DioriteBrickStairs());
			event.getRegistry().register(new DioriteBrickWall());
			event.getRegistry().register(new DioriteFortBrickFence());
			event.getRegistry().register(new DioriteFortBricks());
			event.getRegistry().register(new DioriteFortBrickSlab());
			event.getRegistry().register(new DioriteFortBrickStairs());
			event.getRegistry().register(new DioriteFortBrickWall());
			
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

			event.getRegistry().register(new NetherrackBrickFence());
			event.getRegistry().register(new NetherrackBricks());
			event.getRegistry().register(new NetherrackBrickSlab());
			event.getRegistry().register(new NetherrackBrickStairs());
			event.getRegistry().register(new NetherrackBrickWall());
			
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
			
			event.getRegistry().register(new PolishedAsherrack());
			event.getRegistry().register(new PolishedScreamerrack());
			event.getRegistry().register(new PolishedStone());
			event.getRegistry().register(new PolishedSweaterrack());
			event.getRegistry().register(new PolishedNetherrack());
			
			event.getRegistry().register(new PolishedAsherrackSlab());
			event.getRegistry().register(new PolishedScreamerrackSlab());
			event.getRegistry().register(new PolishedStoneSlab());
			event.getRegistry().register(new PolishedSweaterrackSlab());
			event.getRegistry().register(new PolishedNetherrackSlab());

			event.getRegistry().register(new PolishedAsherrackStairs());
			event.getRegistry().register(new PolishedScreamerrackStairs());
			event.getRegistry().register(new PolishedStoneStairs());
			event.getRegistry().register(new PolishedSweaterrackStairs());
			event.getRegistry().register(new PolishedNetherrackStairs());
			

			event.getRegistry().register(new Screamerrack());
			event.getRegistry().register(new ScreamerrackBrickFence());
			event.getRegistry().register(new ScreamerrackBricks());
			event.getRegistry().register(new ScreamerrackBrickSlab());
			event.getRegistry().register(new ScreamerrackBrickStairs());
			event.getRegistry().register(new ScreamerrackBrickWall());
			event.getRegistry().register(new ScreamerrackFortBrickFence());
			event.getRegistry().register(new ScreamerrackFortBricks());
			event.getRegistry().register(new ScreamerrackFortBrickSlab());
			event.getRegistry().register(new ScreamerrackFortBrickStairs());
			event.getRegistry().register(new ScreamerrackFortBrickWall());
			
			event.getRegistry().register(new StoneBrickFence());
			event.getRegistry().register(new StoneFortBrickFence());
			event.getRegistry().register(new StoneFortBricks());
			event.getRegistry().register(new StoneFortBrickSlab());
			event.getRegistry().register(new StoneFortBrickStairs());
			event.getRegistry().register(new StoneFortBrickWall());
			
			event.getRegistry().register(new SunsetWhewelliteBlock());
			event.getRegistry().register(new SunsetWhewelliteOreAsher());
			event.getRegistry().register(new SunsetWhewelliteOreNether());
			event.getRegistry().register(new SunsetWhewelliteOreScreamer());
			event.getRegistry().register(new SunsetWhewelliteOreSweater());
			
			event.getRegistry().register(new Sweaterrack());
			event.getRegistry().register(new SweaterrackBrickFence());
			event.getRegistry().register(new SweaterrackBricks());
			event.getRegistry().register(new SweaterrackBrickSlab());
			event.getRegistry().register(new SweaterrackBrickStairs());
			event.getRegistry().register(new SweaterrackBrickWall());
			event.getRegistry().register(new SweaterrackFortBrickFence());
			event.getRegistry().register(new SweaterrackFortBricks());
			event.getRegistry().register(new SweaterrackFortBrickSlab());
			event.getRegistry().register(new SweaterrackFortBrickStairs());
			event.getRegistry().register(new SweaterrackFortBrickWall());
			}
		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			Item.Properties properties = new Properties().group(setup.itemGroup);
			//Block items

			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_BRICK_FENCE, properties).setRegistryName("andesite_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_BRICKS, properties).setRegistryName("andesite_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_BRICK_SLAB, properties).setRegistryName("andesite_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_BRICK_STAIRS, properties).setRegistryName("andesite_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_BRICK_WALL, properties).setRegistryName("andesite_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_FORT_BRICK_FENCE, properties).setRegistryName("andesite_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_FORT_BRICKS, properties).setRegistryName("andesite_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_FORT_BRICK_SLAB, properties).setRegistryName("andesite_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_FORT_BRICK_STAIRS, properties).setRegistryName("andesite_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.ANDESITE_FORT_BRICK_WALL, properties).setRegistryName("andesite_fort_brick_wall"));
			
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
			
			event.getRegistry().register(new BlockItem(ModBlocks.CORUNDUM_BLOCK, properties).setRegistryName("corundum_block"));
			event.getRegistry().register(new BlockItem(ModBlocks.CORUNDUM_ORE_ASHERRACK, properties).setRegistryName("corundum_ore_asherrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.CORUNDUM_ORE_NETHER, properties).setRegistryName("corundum_ore_nether"));
			event.getRegistry().register(new BlockItem(ModBlocks.CORUNDUM_ORE_SCREAMERRACK, properties).setRegistryName("corundum_ore_screamerrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.CORUNDUM_ORE_SWEATERRACK, properties).setRegistryName("corundum_ore_sweaterrack"));
			
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_BRICK_FENCE, properties).setRegistryName("diorite_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_BRICKS, properties).setRegistryName("diorite_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_BRICK_SLAB, properties).setRegistryName("diorite_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_BRICK_STAIRS, properties).setRegistryName("diorite_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_BRICK_WALL, properties).setRegistryName("diorite_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_FORT_BRICK_FENCE, properties).setRegistryName("diorite_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_FORT_BRICKS, properties).setRegistryName("diorite_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_FORT_BRICK_SLAB, properties).setRegistryName("diorite_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_FORT_BRICK_STAIRS, properties).setRegistryName("diorite_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.DIORITE_FORT_BRICK_WALL, properties).setRegistryName("diorite_fort_brick_wall"));
			
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

			event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_BRICK_FENCE, properties).setRegistryName("netherrack_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_BRICKS, properties).setRegistryName("netherrack_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_BRICK_SLAB, properties).setRegistryName("netherrack_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_BRICK_STAIRS, properties).setRegistryName("netherrack_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.NETHERRACK_BRICK_WALL, properties).setRegistryName("netherrack_brick_wall"));
			
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
			event.getRegistry().register(new SignItem(new Properties().maxStackSize(16), ModBlocks.PETRIBARK_SIGN, ModBlocks.PETRIBARK_WALL_SIGN).setRegistryName("petribark_sign"));
			event.getRegistry().register(new BlockItem(ModBlocks.PETRIBARK_CRAFTING_TABLE, properties).setRegistryName("petribark_crafting_table"));

			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_ASHERRACK, properties).setRegistryName("polished_asherrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_ASHERRACK_SLAB, properties).setRegistryName("polished_asherrack_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_ASHERRACK_STAIRS, properties).setRegistryName("polished_asherrack_stairs"));

			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_NETHERRACK, properties).setRegistryName("polished_netherrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_NETHERRACK_SLAB, properties).setRegistryName("polished_netherrack_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_NETHERRACK_STAIRS, properties).setRegistryName("polished_netherrack_stairs"));

			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_STONE, properties).setRegistryName("polished_stone"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_STONE_SLAB, properties).setRegistryName("polished_stone_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_STONE_STAIRS, properties).setRegistryName("polished_stone_stairs"));

			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SCREAMERRACK, properties).setRegistryName("polished_screamerrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SCREAMERRACK_SLAB, properties).setRegistryName("polished_screamerrack_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SCREAMERRACK_STAIRS, properties).setRegistryName("polished_screamerrack_stairs"));

			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SWEATERRACK, properties).setRegistryName("polished_sweaterrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SWEATERRACK_SLAB, properties).setRegistryName("polished_sweaterrack_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.POLISHED_SWEATERRACK_STAIRS, properties).setRegistryName("polished_sweaterrack_stairs"));

			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK, properties).setRegistryName("screamerrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_BRICK_FENCE, properties).setRegistryName("screamerrack_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_BRICKS, properties).setRegistryName("screamerrack_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_BRICK_SLAB, properties).setRegistryName("screamerrack_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_BRICK_STAIRS, properties).setRegistryName("screamerrack_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_BRICK_WALL, properties).setRegistryName("screamerrack_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_FORT_BRICK_FENCE, properties).setRegistryName("screamerrack_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_FORT_BRICKS, properties).setRegistryName("screamerrack_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_FORT_BRICK_SLAB, properties).setRegistryName("screamerrack_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_FORT_BRICK_STAIRS, properties).setRegistryName("screamerrack_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.SCREAMERRACK_FORT_BRICK_WALL, properties).setRegistryName("screamerrack_fort_brick_wall"));
			
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_BRICK_FENCE, properties).setRegistryName("stone_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_FORT_BRICK_FENCE, properties).setRegistryName("stone_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_FORT_BRICKS, properties).setRegistryName("stone_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_FORT_BRICK_SLAB, properties).setRegistryName("stone_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_FORT_BRICK_STAIRS, properties).setRegistryName("stone_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.STONE_FORT_BRICK_WALL, properties).setRegistryName("stone_fort_brick_wall"));
			
			event.getRegistry().register(new BlockItem(ModBlocks.SUNSET_WHEWELLITE_BLOCK, properties).setRegistryName("sunset_whewellite_block"));
			event.getRegistry().register(new BlockItem(ModBlocks.SUNSET_WHEWELLITE_ORE_ASHERRACK, properties).setRegistryName("sunset_whewellite_ore_asherrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.SUNSET_WHEWELLITE_ORE_NETHER, properties).setRegistryName("sunset_whewellite_ore_nether"));
			event.getRegistry().register(new BlockItem(ModBlocks.SUNSET_WHEWELLITE_ORE_SCREAMERRACK, properties).setRegistryName("sunset_whewellite_ore_screamerrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.SUNSET_WHEWELLITE_ORE_SWEATERRACK, properties).setRegistryName("sunset_whewellite_ore_sweaterrack"));
			
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK, properties).setRegistryName("sweaterrack"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_BRICK_FENCE, properties).setRegistryName("sweaterrack_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_BRICKS, properties).setRegistryName("sweaterrack_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_BRICK_SLAB, properties).setRegistryName("sweaterrack_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_BRICK_STAIRS, properties).setRegistryName("sweaterrack_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_BRICK_WALL, properties).setRegistryName("sweaterrack_brick_wall"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_FORT_BRICK_FENCE, properties).setRegistryName("sweaterrack_fort_brick_fence"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_FORT_BRICKS, properties).setRegistryName("sweaterrack_fort_bricks"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_FORT_BRICK_SLAB, properties).setRegistryName("sweaterrack_fort_brick_slab"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_FORT_BRICK_STAIRS, properties).setRegistryName("sweaterrack_fort_brick_stairs"));
			event.getRegistry().register(new BlockItem(ModBlocks.SWEATERRACK_FORT_BRICK_WALL, properties).setRegistryName("sweaterrack_fort_brick_wall"));
			//Item items
			event.getRegistry().register(new ClayEgg());
			event.getRegistry().register(new PetribarkStick());
			event.getRegistry().register(new PurificationPowder());
			event.getRegistry().register(new CorruptionPowder());
			event.getRegistry().register(new SunsetWhewelliteGem());
			event.getRegistry().register(new CorundumGem());
		}
		@SubscribeEvent
		public static void onRegisterContainerType(final RegistryEvent.Register<ContainerType<?>> event) {
				event.getRegistry().registerAll(
						new ContainerType<>(ModVanillaCraftContainer::new).setRegistryName("vanilla_workbench")
						);
		}
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
		{
			event.getRegistry().register(ModEntities.CLAYSPIDER);
		}
		@SubscribeEvent
		public static void registerSounds(RegistryEvent.Register<SoundEvent> event){
			event.getRegistry().register(ModSounds.PURIFY);
			event.getRegistry().register(ModSounds.CORRUPT);
		}
		@SubscribeEvent
		public static void onRegisterTileEntityType(final RegistryEvent.Register<TileEntityType<?>> event) {
			IForgeRegistry<TileEntityType<?>> registry = event.getRegistry();

			registry.register(TileEntityType.Builder
					.create(() -> new ModBarrelTE(ModBlocks.PETRIBARK_BARREL.getTileEntityType()),ModBlocks.PETRIBARK_BARREL)
					.build(null)
					.setRegistryName("petribark_barrel"));
			registry.register(TileEntityType.Builder
					.create(SignTileEntity::new, ModBlocks.PETRIBARK_SIGN, ModBlocks.PETRIBARK_WALL_SIGN)
					.build(null)
					.setRegistryName("petribark_sign"));
		}
	}
}
