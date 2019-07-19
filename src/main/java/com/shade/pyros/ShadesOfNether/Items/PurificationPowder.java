package com.shade.pyros.ShadesOfNether.Items;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;

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
	}
	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		BlockPos pos = context.getPos();
		ItemStack item = context.getItem();
		ActionResultType ret  = ShadesOfNether.effectactions.Purify(pos, world)
				? ActionResultType.SUCCESS : ActionResultType.FAIL;
		if(ret == ActionResultType.SUCCESS) {
			item.setCount(item.getCount()-1);;
		}
		return ret;
	}
}
