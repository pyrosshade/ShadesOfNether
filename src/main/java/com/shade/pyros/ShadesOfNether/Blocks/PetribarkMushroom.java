package com.shade.pyros.ShadesOfNether.Blocks;

import java.util.Random;

import com.shade.pyros.ShadesOfNether.World.Features.Features;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;

public class PetribarkMushroom extends BushBlock implements IGrowable{

	protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 15.0D, 12.0D);

	public PetribarkMushroom() {
		super(Properties.from(Blocks.BROWN_MUSHROOM));
		setRegistryName("petribark_mushroom");
	}


	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		if (random.nextInt(25) == 0) {
			int i = 5;

			for(BlockPos blockpos : BlockPos.getAllInBoxMutable(pos.add(-4, -1, -4), pos.add(4, 1, 4))) {
					if (worldIn.getBlockState(blockpos).getBlock() == this) {
					--i;
					if (i <= 0) {
						return;
					}
				}
			}

			BlockPos blockpos1 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

			for(int k = 0; k < 4; ++k) {
				if (worldIn.isAirBlock(blockpos1) && state.isValidPosition(worldIn, blockpos1)) {
					pos = blockpos1;
				}

				blockpos1 = pos.add(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
			}

			if (worldIn.isAirBlock(blockpos1) && state.isValidPosition(worldIn, blockpos1)) 
			{
				worldIn.setBlockState(blockpos1, state, 2);
			}
		}

	}

	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.isOpaqueCube(worldIn, pos);
	}

	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.down();
		BlockState blockstate = worldIn.getBlockState(blockpos);
		Block block = blockstate.getBlock();
		if (block != Blocks.MYCELIUM && block != Blocks.PODZOL && block != Blocks.NETHERRACK && block != Blocks.NETHER_QUARTZ_ORE && block != Blocks.SOUL_SAND) {
			return worldIn.getLightSubtracted(pos, 0) < 13 && blockstate.canSustainPlant(worldIn, blockpos, net.minecraft.util.Direction.UP, this);
		} else {
			return true;
		}
	}

	public boolean generateBigMushroom(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
		worldIn.removeBlock(pos, false);
		ConfiguredFeature<?> feature = Biome.createDecoratedFeature(Features.HUGE_PETRIBARK_MUSHROOM,IFeatureConfig.NO_FEATURE_CONFIG,Placement.DARK_OAK_TREE,IPlacementConfig.NO_PLACEMENT_CONFIG);

		if (feature != null && feature.place(worldIn, worldIn.getChunkProvider().getChunkGenerator(), rand, pos)) {
			return true;
		} else {
			worldIn.setBlockState(pos, state, 3);
			return false;
		}
	}

	/**
	 * Whether this IGrowable can grow
	 */
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return (double)rand.nextFloat() < 0.4D;
	}

	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		this.generateBigMushroom(worldIn, pos, state, rand);
	}

	public boolean needsPostProcessing(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return true;
	}
}
