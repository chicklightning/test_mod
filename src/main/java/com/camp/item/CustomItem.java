package com.camp.item;

import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;


public class CustomItem extends Item {

	public CustomItem(){
	    this.setUnlocalizedName("CustomItem");
	    this.setCreativeTab(CreativeTabsManager.tabItem);
	    this.setMaxStackSize(64);
	    this.setMaxDamage(3);
	    this.setTextureName(StringLibrary.MODID + ":CustomItemTexture");
	}
	
}
