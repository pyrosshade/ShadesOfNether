package com.shade.pyros.ShadesOfNether.Items;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.OptionalDispenseBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PurificationPowder extends Item{

	public PurificationPowder() {
		super(new Item.Properties()
				.group(ShadesOfNether.setup.itemGroup)
				);
		setRegistryName("purification_powder");
		DispenserBlock.registerDispenseBehavior(this, new OptionalDispenseBehavior() {
	         /**
	          * Dispense the specified stack, play the dispense sound and spawn particles.
	          */
	         protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
	            this.successful = true;
	            World world = source.getWorld();
	            BlockPos blockpos = source.getBlockPos().offset(source.getBlockState().get(DispenserBlock.FACING));
	            if (!ShadesOfNether.effectActions.Purify(blockpos, world, stack)) {
	               this.successful = false;
	            } else if (!world.isRemote) {
	               world.playEvent(2005, blockpos, 0);
	            }

	            return stack;
	         }
	      });
	}
	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		BlockPos pos = context.getPos();
		ItemStack item = context.getItem();
		ActionResultType ret  = ShadesOfNether.effectActions.Purify(pos, world, item)
				? ActionResultType.SUCCESS : ActionResultType.FAIL;
		return ret;
	}
}
