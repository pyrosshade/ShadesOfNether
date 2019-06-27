package com.shade.pyros.ShadesOfNether.Items;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ClayEgg extends Item{
	public ClayEgg() {
		super(new Item.Properties()
			.maxStackSize(16)
			.group(ShadesOfNether.setup.itemGroup)
			.food(new Food.Builder()
				.hunger(1)
				.saturation(2)
				.fastToEat()
				.effect(new EffectInstance(Effects.POISON,2), .75f)
				.effect(new EffectInstance(Effects.HUNGER,15), 1)
				.build()
				)
			);
		setRegistryName("clayegg");
	}
}
