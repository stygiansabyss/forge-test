package com.nukacode.firsttest.blocks;

import com.nukacode.firsttest.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OrangeBlock extends Block {

    private String name = "orangeBlock";

    public OrangeBlock () {

        super(Material.rock);

        setCreativeTab(CreativeTabs.tabBlock);
        setBlockName(Constants.MODID + "_" + name);
        setBlockTextureName(Constants.MODID + ":" + name);

        GameRegistry.registerBlock(this, name);
    }
}
