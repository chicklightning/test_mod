package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsManager {

	public static void mainRegistry(){
        initializeTabs();
    }
 
    public static CreativeTabs tabItem;
    public static CreativeTabs tabBlock;
 
    public static void initializeTabs(){
        tabItem = new ItemTab(6, "CustomItemTab");
        tabBlock = new BlockTab(7, "CustomBlockTab");
    }
}