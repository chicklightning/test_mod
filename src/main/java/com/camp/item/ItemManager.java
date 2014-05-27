package com.camp.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemManager {
	 
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
    
    public static Item customItem;
 
    public static void initializeItem() {
    	customItem = new CustomItem();
    	
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
    }
 
}
