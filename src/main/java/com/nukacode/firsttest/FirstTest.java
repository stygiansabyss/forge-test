package com.nukacode.firsttest;

import com.nukacode.firsttest.blocks.ModBlocks;
import com.nukacode.firsttest.items.ModItems;
import com.nukacode.firsttest.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class FirstTest {

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event) {

    }
}
