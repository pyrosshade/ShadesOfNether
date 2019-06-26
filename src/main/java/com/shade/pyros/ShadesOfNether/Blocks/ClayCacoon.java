package com.shade.pyros.ShadesOfNether.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ClayCacoon extends Block{
  public ClayCacoon() {
    super(Properties.create(Material.GOURD)
      .hardnessAndResistance(6f, 5f)
      .lightValue(3)
      );
    setRegistryName("claycacoon");
  }
}
