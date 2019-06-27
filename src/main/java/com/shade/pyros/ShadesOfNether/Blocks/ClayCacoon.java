package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ClayCacoon extends Block{
  public ClayCacoon() {
    super(Properties.create(Material.GOURD)
      .sound(SoundType.GROUND)
      .hardnessAndResistance(3f, 5f)
      .lightValue(3)
      );
    setRegistryName("claycacoon");
  }
}
