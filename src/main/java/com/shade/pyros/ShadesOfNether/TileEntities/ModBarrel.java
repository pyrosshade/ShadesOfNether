package com.shade.pyros.ShadesOfNether.TileEntities;

import java.util.Iterator;

import com.shade.pyros.ShadesOfNether.Blocks.PetribarkBarrel;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ChestTileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ModBarrel extends LockableLootTileEntity {
	private NonNullList<ItemStack> field_213966_a;
	private int field_213967_b;
	
	public ModBarrel(TileEntityType<?> p_i49963_1_) {
		super(p_i49963_1_);
		this.field_213966_a = NonNullList.withSize(27, ItemStack.EMPTY);
	}


	public CompoundNBT write(CompoundNBT p_189515_1_) {
		super.write(p_189515_1_);
		if (!this.checkLootAndWrite(p_189515_1_)) {
			ItemStackHelper.saveAllItems(p_189515_1_, this.field_213966_a);
		}

		return p_189515_1_;
	}

	public void read(CompoundNBT p_145839_1_) {
		super.read(p_145839_1_);
		this.field_213966_a = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
		if (!this.checkLootAndRead(p_145839_1_)) {
			ItemStackHelper.loadAllItems(p_145839_1_, this.field_213966_a);
		}

	}

	public int getSizeInventory() {
		return 27;
	}

	public boolean isEmpty() {
		@SuppressWarnings("rawtypes")
		Iterator var1 = this.field_213966_a.iterator();

		ItemStack lvt_2_1_;
		do {
			if (!var1.hasNext()) {
				return true;
			}

			lvt_2_1_ = (ItemStack)var1.next();
		} while(lvt_2_1_.isEmpty());

		return false;
	}

	public ItemStack getStackInSlot(int p_70301_1_) {
		return (ItemStack)this.field_213966_a.get(p_70301_1_);
	}

	public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
		return ItemStackHelper.getAndSplit(this.field_213966_a, p_70298_1_, p_70298_2_);
	}

	public ItemStack removeStackFromSlot(int p_70304_1_) {
		return ItemStackHelper.getAndRemove(this.field_213966_a, p_70304_1_);
	}

	public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {
		this.field_213966_a.set(p_70299_1_, p_70299_2_);
		if (p_70299_2_.getCount() > this.getInventoryStackLimit()) {
			p_70299_2_.setCount(this.getInventoryStackLimit());
		}
	}

	public void clear() {
		this.field_213966_a.clear();
	}

	protected NonNullList<ItemStack> getItems() {
		return this.field_213966_a;
	}

	protected void setItems(NonNullList<ItemStack> p_199721_1_) {
		this.field_213966_a = p_199721_1_;
	}

	protected ITextComponent getDefaultName() {
		return new TranslationTextComponent("container.shadesofnether.petribark_barrel");
	}

	protected Container createMenu(int p_213906_1_, PlayerInventory p_213906_2_) {
		return ChestContainer.createGeneric9X3(p_213906_1_, p_213906_2_, this);
	}

	public void openInventory(PlayerEntity p_174889_1_) {
		if (!p_174889_1_.isSpectator()) {
			if (this.field_213967_b < 0) {
				this.field_213967_b = 0;
			}

			++this.field_213967_b;
			BlockState lvt_2_1_ = this.getBlockState();
			boolean lvt_3_1_ = (Boolean)lvt_2_1_.get(PetribarkBarrel.field_220093_b);
			if (!lvt_3_1_) {
				this.func_213965_a(lvt_2_1_, SoundEvents.BLOCK_BARREL_OPEN);
				this.func_213963_a(lvt_2_1_, true);
			}

			this.func_213964_r();
		}

	}

	private void func_213964_r() {
		this.world.getPendingBlockTicks().scheduleTick(this.getPos(), this.getBlockState().getBlock(), 5);
	}

	public void func_213962_h() {
		int lvt_1_1_ = this.pos.getX();
		int lvt_2_1_ = this.pos.getY();
		int lvt_3_1_ = this.pos.getZ();
		this.field_213967_b = ChestTileEntity.func_213976_a(this.world, this, lvt_1_1_, lvt_2_1_, lvt_3_1_);
		if (this.field_213967_b > 0) {
			this.func_213964_r();
		} else {
			BlockState lvt_4_1_ = this.getBlockState();
			if (!(lvt_4_1_.getBlock() instanceof PetribarkBarrel)) {
				this.remove();
				return;
			}

			boolean lvt_5_1_ = (Boolean)lvt_4_1_.get(PetribarkBarrel.field_220093_b);
			if (lvt_5_1_) {
				this.func_213965_a(lvt_4_1_, SoundEvents.BLOCK_BARREL_CLOSE);
				this.func_213963_a(lvt_4_1_, false);
			}
		}
	}

	public void closeInventory(PlayerEntity p_174886_1_) {
		if (!p_174886_1_.isSpectator()) {
			--this.field_213967_b;
		}

	}

	private void func_213963_a(BlockState p_213963_1_, boolean p_213963_2_) {
		this.world.setBlockState(this.getPos(), (BlockState)p_213963_1_.with(PetribarkBarrel.field_220093_b, p_213963_2_), 3);
	}

	private void func_213965_a(BlockState p_213965_1_, SoundEvent p_213965_2_) {
		Vec3i lvt_3_1_ = ((Direction)p_213965_1_.get(PetribarkBarrel.field_220092_a)).getDirectionVec();
		double lvt_4_1_ = (double)this.pos.getX() + 0.5D + (double)lvt_3_1_.getX() / 2.0D;
		double lvt_6_1_ = (double)this.pos.getY() + 0.5D + (double)lvt_3_1_.getY() / 2.0D;
		double lvt_8_1_ = (double)this.pos.getZ() + 0.5D + (double)lvt_3_1_.getZ() / 2.0D;
		this.world.playSound((PlayerEntity)null, lvt_4_1_, lvt_6_1_, lvt_8_1_, p_213965_2_, SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
}
}
