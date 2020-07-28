package com.danch.main;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {

    public static final CreativeTabs TestTab = new CreativeTabs("TestTab") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.lapis_ore);
        }
    };

    public static final String MODID = "duda";
    public static final String  NAME = "mod";
    public static final String VERSION = "0.1";

    public static Block testBlock;

    @Mod.EventHandler
    public void preLoad(FMLPreInitializationEvent event){
        testBlock = new BlockSet(Material.wood, "DudaBlock", "wat");
    }
}
