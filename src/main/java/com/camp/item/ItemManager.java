package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	 
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
    
    public static Item customItem;
    public static Item customPickaxe;
 
    public static void initializeItem() {
    	customItem = new CustomItem();
    	customPickaxe = new CustomPickaxe(ToolMaterial.EMERALD).setUnlocalizedName("CustomPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(StringLibrary.MODID + ":jade_pickaxe");
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    	GameRegistry.registerItem(customPickaxe, customPickaxe.getUnlocalizedName());
    }
 
}
