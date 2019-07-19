package com.shade.pyros.ShadesOfNether.Blocks;

public class AsherrackFortBrickStairs extends ModStairs{
	public AsherrackFortBrickStairs() {
		super(new AsherrackFortBricks().getDefaultState(), Properties.from(new AsherrackFortBricks()));
		
		setRegistryName("asherrack_fort_brick_stairs");
	}
}
