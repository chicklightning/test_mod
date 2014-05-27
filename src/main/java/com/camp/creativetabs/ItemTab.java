package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.item.ItemManager;

public class ItemTab extends CreativeTabs {

	public ItemTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		//sets the icon for this tab to be the customItem image (Pizza, here)
		return ItemManager.customItem;
	}

}
