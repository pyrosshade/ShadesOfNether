package com.shade.pyros.ShadesOfNether.Items.Armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.registries.ForgeRegistries;

public class SunsetMaterial implements IArmorMaterial{
	public SunsetMaterial() {
		
	}
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		// TODO Sunset Armor durability
		switch (slotIn) {
		case HEAD:
			return 1;
		case CHEST:
			return 1;
		case FEET:
			return 1;
		case LEGS:
			return 1;
		default:
			break;
		}
		return 0;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		// TODO Sunset Armor damage Reduction
		switch (slotIn) {
		case HEAD:
			return 1;
		case CHEST:
			return 1;
		case FEET:
			return 1;
		case LEGS:
			return 1;
		default:
			break;
		}
		return 0;
	}

	@Override
	public int getEnchantability() {
		// TODO Sunset Armor Enchantability
		return 0;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Sunset Armor E
		return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
	}

	@Override
	public Ingredient getRepairMaterial() {
		// TODO Auto-generated method stub
		return Ingredient.fromItems(ForgeRegistries.ITEMS.getValue(new ResourceLocation("shadesofnether:sunset_whewellite_gem")));
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return 0;
	}

}
