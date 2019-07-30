package com.shade.pyros.ShadesOfNether.Containers;

import java.util.Optional;

import com.shade.pyros.ShadesOfNether.Blocks.Petribark.PetribarkCraftingTable;
import com.shade.pyros.ShadesOfNether.ObjectHolders.ModContainerType;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.CraftingResultSlot;
import net.minecraft.inventory.container.RecipeBookContainer;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModVanillaCraftContainer extends RecipeBookContainer<CraftingInventory>{
	private final CraftingInventory field_75162_e = new CraftingInventory(this, 3, 3);
	private final CraftResultInventory field_75160_f = new CraftResultInventory();
	private final IWorldPosCallable field_217070_e;
	private final PlayerEntity player;

	public ModVanillaCraftContainer(int p_i50090_1_, PlayerInventory p_i50090_2_) {
		this(p_i50090_1_, p_i50090_2_, IWorldPosCallable.DUMMY);
	}

	public ModVanillaCraftContainer(int p_i50090_1_, PlayerInventory p_i50090_2_, IWorldPosCallable p_i50090_3_) {
		super(ModContainerType.VANILLA_WORKBENCH, p_i50090_1_);
		this.field_217070_e = p_i50090_3_;
		this.player = p_i50090_2_.player;
		this.addSlot(new CraftingResultSlot(p_i50090_2_.player, this.field_75162_e, this.field_75160_f, 0, 124, 35));

		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
			  this.addSlot(new Slot(this.field_75162_e, j + i * 3, 30 + j * 18, 17 + i * 18));
			}
		}

		for(int k = 0; k < 3; ++k) {
			for(int i1 = 0; i1 < 9; ++i1) {
			  this.addSlot(new Slot(p_i50090_2_, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
			}
		}

		for(int l = 0; l < 9; ++l) {
			this.addSlot(new Slot(p_i50090_2_, l, 8 + l * 18, 142));
		}

	}

	@Override
	public boolean canInteractWith(PlayerEntity p_75145_1_) {
		return field_217070_e.applyOrElse((p_216960_2_, p_216960_3_) -> {
			return !(p_216960_2_.getBlockState(p_216960_3_).getBlock() instanceof PetribarkCraftingTable) ?
					false : p_75145_1_.getDistanceSq((double)p_216960_3_.getX() + 0.5D, (double)p_216960_3_.getY() + 0.5D, (double)p_216960_3_.getZ() + 0.5D) <= 64.0D;
		}, true);
	}

	protected static void func_217066_a(int p_217066_0_, World p_217066_1_, PlayerEntity p_217066_2_, CraftingInventory p_217066_3_, CraftResultInventory p_217066_4_) {
		if (!p_217066_1_.isRemote) {
			ServerPlayerEntity lvt_5_1_ = (ServerPlayerEntity)p_217066_2_;
			ItemStack lvt_6_1_ = ItemStack.EMPTY;
			Optional<ICraftingRecipe> lvt_7_1_ = p_217066_1_.getServer().getRecipeManager().getRecipe(IRecipeType.CRAFTING, p_217066_3_, p_217066_1_);
			if (lvt_7_1_.isPresent()) {
				ICraftingRecipe lvt_8_1_ = lvt_7_1_.get();
				if (p_217066_4_.canUseRecipe(p_217066_1_, lvt_5_1_, lvt_8_1_)) {
					lvt_6_1_ = lvt_8_1_.getCraftingResult(p_217066_3_);
				}
			}

			p_217066_4_.setInventorySlotContents(0, lvt_6_1_);
			lvt_5_1_.connection.sendPacket(new SSetSlotPacket(p_217066_0_, 0, lvt_6_1_));
		}
	}

	@Override
	public void onCraftMatrixChanged(IInventory p_75130_1_) {
		this.field_217070_e.consume((p_217069_1_, p_217069_2_) -> {
			func_217066_a(this.windowId, p_217069_1_, this.player, this.field_75162_e, this.field_75160_f);
		});
	}

	@Override
	public void func_201771_a(RecipeItemHelper p_201771_1_) {
		this.field_75162_e.fillStackedContents(p_201771_1_);
	}

	@Override
	public void clear() {
		this.field_75162_e.clear();
		this.field_75160_f.clear();
	}

	@Override
	public boolean matches(IRecipe<? super CraftingInventory> p_201769_1_) {
		return p_201769_1_.matches(this.field_75162_e, this.player.world);
	}

	@Override
	public void onContainerClosed(PlayerEntity p_75134_1_) {
		super.onContainerClosed(p_75134_1_);
		this.field_217070_e.consume((p_217068_2_, p_217068_3_) -> {
			this.clearContainer(p_75134_1_, p_217068_2_, this.field_75162_e);
		});
	}

	@Override
		/**
		 * Handle when the stack in slot {@code index} is shift-clicked. Normally this moves the stack between the player
		 * inventory and the other inventory(s).
		 */
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index == 0) {
					this.field_217070_e.consume((p_217067_2_, p_217067_3_) -> {
						itemstack1.getItem().onCreated(itemstack1, p_217067_2_, playerIn);
					});
					if (!this.mergeItemStack(itemstack1, 10, 46, true)) {
						return ItemStack.EMPTY;
					}

					slot.onSlotChange(itemstack1, itemstack);
				} else if (index >= 10 && index < 37) {
					if (!this.mergeItemStack(itemstack1, 37, 46, false)) {
						return ItemStack.EMPTY;
					}
				} else if (index >= 37 && index < 46) {
					if (!this.mergeItemStack(itemstack1, 10, 37, false)) {
						return ItemStack.EMPTY;
					}
				} else if (!this.mergeItemStack(itemstack1, 10, 46, false)) {
					return ItemStack.EMPTY;
				}

				if (itemstack1.isEmpty()) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}

				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}

				ItemStack itemstack2 = slot.onTake(playerIn, itemstack1);
				if (index == 0) {
					playerIn.dropItem(itemstack2, false);
				}
			}

			return itemstack;
		}

	@Override
	public boolean canMergeSlot(ItemStack p_94530_1_, Slot p_94530_2_) {
		return p_94530_2_.inventory != this.field_75160_f && super.canMergeSlot(p_94530_1_, p_94530_2_);
	}

	@Override
	public int getOutputSlot() {
		return 0;
	}

	@Override
	public int getWidth() {
		return this.field_75162_e.getWidth();
	}

	@Override
	public int getHeight() {
		return this.field_75162_e.getHeight();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public int getSize() {
		return 10;
	}
}
