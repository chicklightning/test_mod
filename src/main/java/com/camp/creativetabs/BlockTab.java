package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.block.BlockManager;

public class BlockTab extends CreativeTabs {

	public BlockTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		//sets icon to be the customBlock image
		return Item.getItemFromBlock(BlockManager.customBlock);
	}

}
