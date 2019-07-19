package com.shade.pyros.ShadesOfNether.Common;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EffectActions {
	public static Map<ResourceLocation, Block> purifyPairsDictionary = Maps.newHashMap() ;
	
	public EffectActions() {
		purifyPairsDictionary.put(new ResourceLocation("minecraft:netherrack"), Blocks.GRANITE);
		purifyPairsDictionary.put(new ResourceLocation("minecraft:soul_sand"), Blocks.SAND);
		purifyPairsDictionary.put(new ResourceLocation("minecraft:nether_bricks"), Blocks.BRICKS);
		purifyPairsDictionary.put(new ResourceLocation("shadesofnether:asherrack"), Blocks.STONE);
		
		//TODO generate pairs from Json config
	}
	
	public boolean Purify(BlockPos pos, World world) {
		ResourceLocation blockLocation = world.getBlockState(pos).getBlock().getRegistryName();
		boolean ret = true;
		if (purifyPairsDictionary.containsKey(blockLocation)) {
			world.setBlockState(pos, purifyPairsDictionary.get(blockLocation).getDefaultState(), 3);
			world.playSound((PlayerEntity)null, pos, SoundEvents.UI_LOOM_TAKE_RESULT, SoundCategory.BLOCKS, 1.0f, 1.0f);
		}else {
			ret = false;
		}
		return ret;
	}
}
