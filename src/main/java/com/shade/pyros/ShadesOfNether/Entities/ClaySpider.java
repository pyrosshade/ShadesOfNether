package com.shade.pyros.ShadesOfNether.Entities;

import javax.annotation.Nullable;

import com.shade.pyros.ShadesOfNether.ShadesOfNether;
import com.shade.pyros.ShadesOfNether.Util.SONEntityUtil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class ClaySpider extends CaveSpiderEntity{

	public ClaySpider(EntityType<? extends ClaySpider> type, Object worldIn) {
		super((EntityType<? extends ClaySpider>)type, (World) worldIn);
	}
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(50.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.27D);
	}

	public boolean attackEntityAsMob(Entity entityIn) {
		if (super.attackEntityAsMob(entityIn)) {
			if (entityIn instanceof LivingEntity) {
				int i = 0;
				if (this.world.getDifficulty() == Difficulty.NORMAL) {
					i = 7;
				} else if (this.world.getDifficulty() == Difficulty.HARD) {
					i = 15;
				}
				if (i > 0) {
					((LivingEntity)entityIn).addPotionEffect(new EffectInstance(Effects.HUNGER, i * 20, 0));
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@Nullable
	public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
		return spawnDataIn;
	}
	
	@Override
	public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
		boolean temp = super.canSpawn(worldIn, spawnReasonIn);
		if(temp) return temp; // skip checks if this wouldn't spawn anyways

		switch(spawnReasonIn) {
			case NATURAL:
				if (worldIn.isAirBlock(this.getPosition().down()))
					temp = false;
				break;
			default:
				break;
		}

		ShadesOfNether.debug.info("canspawn: "+temp);
		return temp;
	}
	
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		return 0.45F;
	}
}
