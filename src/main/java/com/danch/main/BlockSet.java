package com.danch.main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSet extends Block {
    protected BlockSet(Material p_i45394_1_ , String name, String texture) {
        super(p_i45394_1_);
        this.setBlockName(name);
        this.setLightLevel(3F);
        this.setLightOpacity(3);
        this.setHardness(1.0F);
        this.setCreativeTab(Main.TestTab);
        this.setResistance(20.0F);
        this.setHarvestLevel("sword", 2);
        this.setStepSound(soundTypeWood);
        this.setBlockTextureName(Main.MODID + ":" + texture);

        GameRegistry.registerBlock(this, name);
    }
}
