package com.shade.pyros.ShadesOfNether.proxy;

import com.shade.pyros.ShadesOfNether.ObjectHolders.ModContainerType;
import com.shade.pyros.ShadesOfNether.gui.screen.VanillaCraftingScreen;

import net.minecraft.client.gui.ScreenManager;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ClientProxy implements Proxy {
    @Override
    public void onClientSetup(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(ModContainerType.VANILLA_WORKBENCH, VanillaCraftingScreen::new);
        
    }

    @Override
    public void onCommonSetup(FMLCommonSetupEvent event) {

    }
}