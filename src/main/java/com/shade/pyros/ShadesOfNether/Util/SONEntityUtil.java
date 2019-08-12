package com.shade.pyros.ShadesOfNether.Util;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class SONEntityUtil {
	public static void setPositionToGround(Entity entity, IWorld worldIn) {

		   if (!entity.onGround) {
			   BlockPos tempPos = entity.getPosition();
			   while(!worldIn.isAirBlock(tempPos.down())) {
				   tempPos.add(0, -1, 0);
			   }
			   entity.setPositionAndUpdate(tempPos.getX(), tempPos.getY(), tempPos.getZ());
		   }
	}
}
