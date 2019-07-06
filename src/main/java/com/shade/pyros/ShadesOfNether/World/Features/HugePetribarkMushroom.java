package com.shade.pyros.ShadesOfNether.World.Features;

import java.util.Random;

import org.apache.logging.log4j.Level;

import com.google.common.base.Function;
import com.mojang.datafixers.Dynamic;
import com.shade.pyros.ShadesOfNether.ShadesOfNether;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.BigMushroomFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class HugePetribarkMushroom extends Feature<BigMushroomFeatureConfig>{
	public HugePetribarkMushroom(Function<Dynamic<?>, ? extends BigMushroomFeatureConfig> deserializer)
    {
        super(deserializer);
    }

	@Override
	public boolean place(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> generator, Random rand,
			BlockPos pos, BigMushroomFeatureConfig config) {
		
		int mushHeight = rand.nextInt(3) + 4;
		if (rand.nextInt(12) == 0) {
			mushHeight *= 2;
		}

		int j = pos.getY();
		if (j >= 1 && j + mushHeight + 1 < worldIn.getWorld().getDimension().getHeight()) {
			Block block = worldIn.getBlockState(pos.down()).getBlock();
			if (!Block.isDirt(block) && block != Blocks.GRASS_BLOCK && block != Blocks.MYCELIUM && block != Blocks.NETHERRACK && block != Blocks.NETHER_QUARTZ_ORE && block != Blocks.SOUL_SAND) {
					this.setBlockState(worldIn, pos, ModBlocks.PETRIBARK_MUSHROOM.getDefaultState());
					ShadesOfNether.debug.log(Level.INFO,"No room in chosen growth direction, putting back the shrooms.");
					return false;
			} else {
					BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
					int growFacing = rand.nextInt(4);
					Direction moveDir = null;
					BooleanProperty moveBool = null;
					BooleanProperty coverBool = null;
					if(growFacing == 0) {
						moveDir = Direction.EAST;
						moveBool = HugeMushroomBlock.EAST;
						coverBool = HugeMushroomBlock.WEST;
						ShadesOfNether.debug.log(Level.INFO,"attempting to grow stem east");
					}else if(growFacing == 1) {
						moveDir = Direction.WEST;
						moveBool = HugeMushroomBlock.WEST;
						coverBool = HugeMushroomBlock.EAST;
						ShadesOfNether.debug.log(Level.INFO,"attempting to grow stem weast");
					}else if(growFacing == 2) {
							moveDir = Direction.NORTH;
							moveBool = HugeMushroomBlock.NORTH;
							coverBool = HugeMushroomBlock.SOUTH;
							ShadesOfNether.debug.log(Level.INFO,"attempting to grow stem neast");
					}else if(growFacing == 3) {
							moveDir = Direction.SOUTH;
							moveBool = HugeMushroomBlock.SOUTH;
							coverBool = HugeMushroomBlock.NORTH;
							ShadesOfNether.debug.log(Level.INFO,"attempting to grow stem seast");
					}

					for(int k = 0; k <= mushHeight; ++k) {
						int l = 0;
						if (k < mushHeight && k >= mushHeight - 3) {
							l = 2;
						} else if (k == mushHeight) {
							l = 1;
						}

						for(int i1 = -l; i1 <= l; ++i1) {
							for(int j1 = -l; j1 <= l; ++j1) {
								BlockState blockstate = worldIn.getBlockState(blockpos$mutableblockpos.setPos(pos).move(i1, k, j1).move(moveDir, 3));
								if (!blockstate.isAir(worldIn, blockpos$mutableblockpos) && !blockstate.isIn(BlockTags.LEAVES)) {
									return false;
								}
							}
						}
					}
					int heightoffset = 0;
					int lengthoffset = 0;
					BlockState risingStemBlockState = ModBlocks.PETRIBARK_MUSHROOM_STEM.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(false)).with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
					BlockState overAngleStemBlockState = ModBlocks.PETRIBARK_MUSHROOM_STEM.getDefaultState().with(HugeMushroomBlock.DOWN, Boolean.valueOf(false)).with(moveBool, Boolean.valueOf(false));
					BlockState underAngleStemBlockState = ModBlocks.PETRIBARK_MUSHROOM_STEM.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(false)).with(coverBool, Boolean.valueOf(false));
					for(int j2 = 0; j2 < (mushHeight+3); ++j2) {
						if(j2 == 0) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, overAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, overAngleStemBlockState);
								}
							}
							heightoffset++;
						}else if(j2 == 1) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2-lengthoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, underAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, underAngleStemBlockState);
								}
							}
							lengthoffset++;
						}else if(j2 == 2) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2-lengthoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, overAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, overAngleStemBlockState);
								}
							}
							heightoffset++;
						}else if(j2 == 3) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2-lengthoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, underAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, underAngleStemBlockState);
								}
							}
							lengthoffset++;
						}else if(j2 == 4) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2-lengthoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, overAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, overAngleStemBlockState);
								}
							}
							heightoffset++;
						}else if(j2 == 5) {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, j2-lengthoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, underAngleStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, underAngleStemBlockState);
								}
							}
							lengthoffset++;
						}else if(j2 == 6){
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, heightoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, risingStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, risingStemBlockState);
								}
							}
						}else {
							blockpos$mutableblockpos.setPos(pos).move(Direction.UP, j2-heightoffset).move(moveDir, heightoffset);
							if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
								if (config.planted) {
									worldIn.setBlockState(blockpos$mutableblockpos, risingStemBlockState, 3);
								} else {
									this.setBlockState(worldIn, blockpos$mutableblockpos, risingStemBlockState);
								}
							}
						}
						
					}

					BlockState blockstate1 = ModBlocks.PETRIBARK_MUSHROOM_CAP.getDefaultState().with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));

					for(int l1 = mushHeight - 3; l1 <= mushHeight; ++l1) {
						int i2 = l1 < mushHeight ? 2 : 1;

						for(int l2 = -i2; l2 <= i2; ++l2) {
							for(int k1 = -i2; k1 <= i2; ++k1) {
								boolean flag = l2 == -i2;
								boolean flag1 = l2 == i2;
								boolean flag2 = k1 == -i2;
								boolean flag3 = k1 == i2;
								boolean flag4 = flag || flag1;
								boolean flag5 = flag2 || flag3;
								if (l1 >= mushHeight || flag4 != flag5) {
									blockpos$mutableblockpos.setPos(pos).move(l2, l1, k1).move(moveDir, heightoffset);
									if (worldIn.getBlockState(blockpos$mutableblockpos).canBeReplacedByLeaves(worldIn, blockpos$mutableblockpos)) {
										this.setBlockState(
												worldIn, 
												blockpos$mutableblockpos, 
												blockstate1
													.with(HugeMushroomBlock.UP, Boolean.valueOf(l1 >= mushHeight - 1))
													.with(HugeMushroomBlock.WEST, Boolean.valueOf(l2 < 0))
													.with(HugeMushroomBlock.EAST, Boolean.valueOf(l2 > 0))
													.with(HugeMushroomBlock.NORTH, Boolean.valueOf(k1 < 0))
													.with(HugeMushroomBlock.SOUTH, Boolean.valueOf(k1 > 0)));
									}
								}
							}
						}
					}
					ShadesOfNether.debug.log(Level.INFO,"Petribark Mushroom Cap Generated");

					return true;
			}
		} else {
			return false;
		}
	}
}