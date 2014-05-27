package com.camp.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.block.BlockManager;

public class BlockTab extends CreativeTabs {

	public BlockTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		//sets icon to be the customBlock image
		return Item.getItemFromBlock(BlockManager.customBlock);
	}

}
