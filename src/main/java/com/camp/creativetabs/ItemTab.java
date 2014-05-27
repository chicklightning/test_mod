package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.item.ItemManager;

public class ItemTab extends CreativeTabs {

	public ItemTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		//sets the icon for this tab to be the customItem image (Pizza, here)
		return ItemManager.customItem;
	}

}
