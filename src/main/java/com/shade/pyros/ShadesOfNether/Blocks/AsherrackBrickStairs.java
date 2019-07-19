package com.shade.pyros.ShadesOfNether.Blocks;

public class AsherrackBrickStairs extends ModStairs{
	public AsherrackBrickStairs() {
		super(new AsherrackBricks().getDefaultState(), Properties.from(new AsherrackBricks()));
		
		setRegistryName("asherrack_brick_stairs");
	}
}
