package com.shade.pyros.ShadesOfNether.Blocks;

import com.shade.pyros.ShadesOfNether.Common.Materials;
import com.shade.pyros.ShadesOfNether.Containers.VanillaWorkBench;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class PetribarkCraftingTable extends CraftingTableBlock{

	public PetribarkCraftingTable() {
		super(Block.Properties
				.create(Materials.PETRIBARK_WOOD)
				.hardnessAndResistance(1.35F)
				.sound(SoundType.WOOD)
				);
		setRegistryName("petribark_crafting_table");
	}
	@Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		player.openContainer(state.getContainer(worldIn, pos));
		player.addStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
		return true;
	}
	
	@Override
	public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
		return new SimpleNamedContainerProvider((p_220270_2_, p_220270_3_, p_220270_4_) -> {
			return new VanillaWorkBench(p_220270_2_, p_220270_3_, IWorldPosCallable.of(worldIn, pos));
		}, getNameTextComponent());
	}
	
	//public INamedContainerProvider getcontainer(BlockState state, World worldIn, BlockPos pos) {
	//	return new SimpleNamedContainerProvider((p_220270_2_, p_220270_3_, p_220270_4_)->{
	//		return new WorkbenchContainer(p_220270_2_, p_220270_3_, IWorldPosCallable.of(worldIn, pos));
	//	}, getNameTextComponent());
	//}
}
