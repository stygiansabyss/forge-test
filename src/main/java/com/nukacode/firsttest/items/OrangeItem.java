package com.nukacode.firsttest.items;

import com.nukacode.firsttest.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OrangeItem extends Item {

    private String name = "orangeItem";

    public OrangeItem () {

        setUnlocalizedName(Constants.MODID + "_" + name);
        setTextureName(Constants.MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabMaterials);

        GameRegistry.registerItem(this, name);

    }
}
