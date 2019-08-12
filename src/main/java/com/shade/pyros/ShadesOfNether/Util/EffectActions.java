package com.shade.pyros.ShadesOfNether.Util;

import java.util.Collection;
import java.util.Map;

import org.apache.logging.log4j.Level;

import com.google.common.collect.Maps;
import com.shade.pyros.ShadesOfNether.ShadesOfNether;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModSounds;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IProperty;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectActions {
	public static Map<ResourceLocation, Block> purifyPairsDictionary = Maps.newHashMap() ;
	public static Map<ResourceLocation, Block> corruptPairsDictionary = Maps.newHashMap();
	
	public EffectActions() {
		AddTwowayPair(new ResourceLocation("minecraft:netherrack"),new ResourceLocation("minecraft:granite"));
		AddTwowayPair(new ResourceLocation("minecraft:nether_bricks"), new ResourceLocation("shadesofnether:granite_fort_bricks"));
		AddTwowayPair(new ResourceLocation("minecraft:nether_brick_fence"), new ResourceLocation("shadesofnether:granite_fort_brick_fence"));
		AddTwowayPair(new ResourceLocation("minecraft:nether_brick_slab"), new ResourceLocation("shadesofnether:granite_fort_brick_slab"));
		AddTwowayPair(new ResourceLocation("minecraft:nether_brick_stairs"), new ResourceLocation("shadesofnether:granite_fort_brick_stairs"));
		AddTwowayPair(new ResourceLocation("minecraft:nether_brick_wall"), new ResourceLocation("shadesofnether:granite_fort_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:netherrack_bricks"), new ResourceLocation("shadesofnether:granite_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:netherrack_brick_fence"), new ResourceLocation("shadesofnether:granite_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:netherrack_brick_slab"), new ResourceLocation("shadesofnether:granite_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:netherrack_brick_stairs"), new ResourceLocation("shadesofnether:granite_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:netherrack_brick_wall"), new ResourceLocation("shadesofnether:granite_brick_wall"));
		AddTwowayPair(new ResourceLocation("minecraft:soul_sand"), new ResourceLocation("minecraft:sand"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack"), new ResourceLocation("minecraft:stone"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_fort_bricks"), new ResourceLocation("shadesofnether:stone_fort_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_fort_brick_fence"), new ResourceLocation("shadesofnether:stone_fort_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_fort_brick_slab"), new ResourceLocation("shadesofnether:stone_fort_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_fort_brick_stairs"), new ResourceLocation("shadesofnether:stone_fort_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_fort_brick_wall"), new ResourceLocation("shadesofnether:stone_fort_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_bricks"), new ResourceLocation("minecraft:stone_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_brick_fence"), new ResourceLocation("shadesofnether:stone_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_brick_slab"), new ResourceLocation("minecraft:stone_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_brick_stairs"), new ResourceLocation("minecraft:stone_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:asherrack_brick_wall"), new ResourceLocation("minecraft:stone_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack"), new ResourceLocation("minecraft:diorite"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_fort_bricks"), new ResourceLocation("shadesofnether:diorite_fort_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_fort_brick_fence"), new ResourceLocation("shadesofnether:diorite_fort_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_fort_brick_slab"), new ResourceLocation("shadesofnether:diorite_fort_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_fort_brick_stairs"), new ResourceLocation("shadesofnether:diorite_fort_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_fort_brick_wall"), new ResourceLocation("shadesofnether:diorite_fort_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_bricks"), new ResourceLocation("shadesofnether:diorite_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_brick_fence"), new ResourceLocation("shadesofnether:diorite_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_brick_slab"), new ResourceLocation("shadesofnether:diorite_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_brick_stairs"), new ResourceLocation("shadesofnether:diorite_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:screamerrack_brick_wall"), new ResourceLocation("shadesofnether:diorite_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack"), new ResourceLocation("minecraft:andesite"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_fort_bricks"), new ResourceLocation("shadesofnether:andesite_fort_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_fort_brick_fence"), new ResourceLocation("shadesofnether:andesite_fort_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_fort_brick_slab"), new ResourceLocation("shadesofnether:andesite_fort_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_fort_brick_stairs"), new ResourceLocation("shadesofnether:andesite_fort_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_fort_brick_wall"), new ResourceLocation("shadesofnether:andesite_fort_brick_wall"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_bricks"), new ResourceLocation("shadesofnether:andesite_bricks"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_brick_fence"), new ResourceLocation("shadesofnether:andesite_brick_fence"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_brick_slab"), new ResourceLocation("shadesofnether:andesite_brick_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_brick_stairs"), new ResourceLocation("shadesofnether:andesite_brick_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:sweaterrack_brick_wall"), new ResourceLocation("shadesofnether:andesite_brick_wall"));
		

		AddTwowayPair(new ResourceLocation("shadesofnether:polished_netherrack"), new ResourceLocation("minecraft:polished_granite"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_asherrack"), new ResourceLocation("shadesofnether:polished_stone"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_screamerrack"), new ResourceLocation("minecraft:polished_diorite"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_sweaterrack"), new ResourceLocation("minecraft:polished_andesite"));
		
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_netherrack_slab"), new ResourceLocation("minecraft:polished_granite_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_asherrack_slab"), new ResourceLocation("shadesofnether:polished_stone_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_screamerrack_slab"), new ResourceLocation("minecraft:polished_diorite_slab"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_sweaterrack_slab"), new ResourceLocation("minecraft:polished_andesite_slab"));
		
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_netherrack_stairs"), new ResourceLocation("minecraft:polished_granite_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_asherrack_stairs"), new ResourceLocation("shadesofnether:polished_stone_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_screamerrack_stairs"), new ResourceLocation("minecraft:polished_diorite_stairs"));
		AddTwowayPair(new ResourceLocation("shadesofnether:polished_sweaterrack_stairs"), new ResourceLocation("minecraft:polished_andesite_stairs"));
		
		//TODO generate pairs from Json config
		ShadesOfNether.debug.log(Level.INFO, "Effectactions constructed");
	}
	private void AddPair(Map<ResourceLocation,Block> map, ResourceLocation from, ResourceLocation to) {
		map.put(from, ForgeRegistries.BLOCKS.getValue(to));
	}
	private void AddTwowayPair(ResourceLocation from, ResourceLocation to) {
		AddPair(purifyPairsDictionary,from, to);
		AddPair(corruptPairsDictionary,to,from);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>, V extends T> boolean Purify(BlockPos pos, World world, ItemStack item) {
		ResourceLocation blockLocation = world.getBlockState(pos).getBlock().getRegistryName();
		boolean haskey = purifyPairsDictionary.containsKey(blockLocation);
		//ShadesOfNether.debug.log(Level.INFO, haskey);
		boolean ret = true;
		if (haskey) {
			BlockState changestate = purifyPairsDictionary.get(blockLocation).getDefaultState();
			BlockState oldstate = world.getBlockState(pos);
			//ShadesOfNether.debug.log(Level.INFO, "State: "+changestate);
			Collection<IProperty<?>> props = oldstate.getProperties();
			for(IProperty<?> iproperty: props) {
				ShadesOfNether.debug.log(Level.INFO, iproperty.getName()+" : "+oldstate.get(iproperty));
				changestate = changestate.with((IProperty<T>)iproperty, (V) oldstate.get(iproperty));
			}
			world.setBlockState(pos, changestate, 3);
			world.playSound((PlayerEntity)null, pos, ModSounds.PURIFY, SoundCategory.BLOCKS, 1.0f, 1.0f);
			item.setCount(item.getCount()-1);
		}else {
			ret = false;
		}
		return ret;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>, V extends T> boolean Corrupt(BlockPos pos, World world, ItemStack item) {
		ResourceLocation blockLocation = world.getBlockState(pos).getBlock().getRegistryName();
		boolean ret = true;
		if (corruptPairsDictionary.containsKey(blockLocation)) {
			BlockState changestate = corruptPairsDictionary.get(blockLocation).getDefaultState();
			BlockState oldstate = world.getBlockState(pos);
			//ShadesOfNether.debug.log(Level.INFO, "State: "+changestate);
			Collection<IProperty<?>> props = oldstate.getProperties();
			for(IProperty<?> iproperty: props) {

				changestate = changestate.with((IProperty<T>)iproperty, (V) oldstate.get(iproperty));
			}
			world.setBlockState(pos, changestate, 3);
			world.playSound((PlayerEntity)null, pos, ModSounds.CORRUPT, SoundCategory.BLOCKS, 1.0f, 1.0f);
			item.setCount(item.getCount()-1);
		}else {
			ret = false;
		}
		return ret;
	}
}
