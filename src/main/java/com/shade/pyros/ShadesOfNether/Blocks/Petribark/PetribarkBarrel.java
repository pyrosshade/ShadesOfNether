package com.shade.pyros.ShadesOfNether.Blocks.Petribark;

import java.util.Random;

import javax.annotation.Nullable;

import com.shade.pyros.ShadesOfNether.Common.Materials;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModTileEntityTypes;
import com.shade.pyros.ShadesOfNether.TileEntities.ModBarrelTE;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class PetribarkBarrel extends BarrelBlock {
		public static final DirectionProperty field_220092_a = BlockStateProperties.FACING;
		public static final BooleanProperty field_220093_b = BlockStateProperties.OPEN;

		public PetribarkBarrel() {
			super(Properties
			.create(Materials.PETRIBARK_WOOD)
			.hardnessAndResistance(1.35F)
			.sound(SoundType.WOOD)
			);
			this.setDefaultState(this.stateContainer.getBaseState().with(field_220092_a, Direction.NORTH).with(field_220093_b, Boolean.valueOf(false)));
			setRegistryName("petribark_barrel");
		}
		
		@Override
		public ToolType getHarvestTool(BlockState state) {
			return ToolType.AXE;
		}
		@Override
		public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
			if (worldIn.isRemote) {
				return true;
			} else {
				TileEntity tileentity = worldIn.getTileEntity(pos);
				if (tileentity instanceof ModBarrelTE) {
					player.openContainer((ModBarrelTE)tileentity);
					player.addStat(Stats.OPEN_BARREL);
				}

				return true;
			}
		}

		public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
			TileEntity tileentity = worldIn.getTileEntity(pos);
			if (tileentity instanceof ModBarrelTE) {
				((ModBarrelTE)tileentity).func_213962_h();
			}

		}

		@Nullable
		@Override
		public TileEntity createNewTileEntity(IBlockReader worldIn) {
			return new ModBarrelTE(this.getTileEntityType());
		}
		
		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
			if (stack.hasDisplayName()) {
				TileEntity tileentity = worldIn.getTileEntity(pos);
				if (tileentity instanceof ModBarrelTE) {
					((ModBarrelTE)tileentity).setCustomName(stack.getDisplayName());
				}
			}
		}

		public TileEntityType<ModBarrelTE> getTileEntityType() {
			return ModTileEntityTypes.PETRIBARK_BARREL;
		}
}
