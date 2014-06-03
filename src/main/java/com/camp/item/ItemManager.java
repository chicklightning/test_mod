package com.camp.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
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
    public static Item customFood;
    
    //level of material the tool can harvest, between 0 and 3 (number greater than 3 is three, less than 0 is 0)
    //max uses: wood is 59, stone 131, iron 250, diamond 1561, gold 32
    //efficiency: strength of tool; wood 2, stone 4, iron 6, diamond 8, gold 12
    //damage: wood 0 (as if it wasn't there), stone 1, iron 2, diamond 3, gold 0
    //enchantability (natural enchantability factor): wood 15, stone 5, iron 14, diamond 10, gold 22
    public static ToolMaterial jade = EnumHelper.addToolMaterial("Jade", 3, 561, 7, 3, 19);
 
    public static void initializeItem() {
    	customItem = new CustomItem();
    	customPickaxe = new CustomPickaxe(jade).setUnlocalizedName("CustomPickaxe").setCreativeTab(CreativeTabs.tabTools).setTextureName(StringLibrary.MODID + ":jade_pickaxe");
    	
        //for food: first arg: visible heal amount in half hunger bars
        //second arg: saturation modifier; saturation level alculated by healamount * modifier * 2
        //third arg: whether or not a wolf can be tamed using this food; examples: apple 4, 0.3F, false, and cooked porkchop: 8, 0.8F, true
        customFood = new CustomFood(8, 0.6F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("CustomFood").setTextureName(StringLibrary.MODID + ":apple_diamond");
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    	GameRegistry.registerItem(customPickaxe, customPickaxe.getUnlocalizedName());
    	GameRegistry.registerItem(customFood, customFood.getUnlocalizedName());
    }
 
}
