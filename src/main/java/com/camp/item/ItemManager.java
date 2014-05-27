package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	 
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
    
    public static Item customItem;
    public static Item customPickaxe;
    
    //level of material the tool can harvest, between 0 and 3 (number greater than 3 is three, less than 0 is 0)
    //max uses: wood is 59, stone 131, iron 250, diamond 1561, gold 32
    //efficiency: strength of tool; wood 2, stone 4, iron 6, diamond 8, gold 12
    //damage: wood 0 (as if it wasn't there), stone 1, iron 2, diamond 3, gold 0
    //enchantability (natural enchantability factor): wood 15, stone 5, iron 14, diamond 10, gold 22
    public static ToolMaterial jade = EnumHelper.addToolMaterial("Jade", 3, 561, 7, 3, 19);
 
    public static void initializeItem() {
    	customItem = new CustomItem();
    	customPickaxe = new CustomPickaxe(jade).setUnlocalizedName("CustomPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(StringLibrary.MODID + ":jade_pickaxe");
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    	GameRegistry.registerItem(customPickaxe, customPickaxe.getUnlocalizedName());
    }
 
}
