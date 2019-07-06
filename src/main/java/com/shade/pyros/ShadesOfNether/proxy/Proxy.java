package com.shade.pyros.ShadesOfNether.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public interface Proxy {
    void onClientSetup(final FMLClientSetupEvent event);
    void onCommonSetup(final FMLCommonSetupEvent event);
}