package com.shade.pyros.ShadesOfNether.Util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.FireBlock;
import net.minecraft.util.IItemProvider;

public class VanillaStuff {
	
	public static void init() {
		
	}
	
    //public static void registerStrippable(Block log, Block stripped_log) {
    //    AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
    //    AxeItem.BLOCK_STRIPPING_MAP.put(log, stripped_log);
    //}

    public static void registerCompostable(float chance, IItemProvider itemIn) {
        ComposterBlock.CHANCES.put(itemIn.asItem(), chance);
    }

    public static void registerFlammable(Block blockIn, int encouragement, int flammability)
    {
        FireBlock fireblock = (FireBlock)Blocks.FIRE;
        fireblock.setFireInfo(blockIn, encouragement, flammability);
    }
}
