package com.camp.block;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;

public class CustomBlock extends Block {

	protected CustomBlock(Material p_i45394_1_)
	{
		super(p_i45394_1_);
		this.setBlockName("CustomBlock");
		this.setCreativeTab(CreativeTabsManager.tabBlock);
		
		//sets blast resistance, iron ore is 5, stone is 10, obsidian is 2000
		this.setResistance(100);
		
		//This is about the hardness of stone (1.5), grass is 0.6, iron ore is like 3
		this.setHardness(1.6f);
		
		//anything above 0 will make it glow
		this.setLightLevel(3);
		
		//it just knows where to look don't ask questions
		this.setBlockTextureName(StringLibrary.MODID + ":custom_block_texture");
	}
	
	@Override
	public int quantityDropped(Random rand) {
		//don't forget that it generates a number between 0-2, not including 3, so add 1
	    return rand.nextInt(3) + 1;
	}
	 
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
	    return ItemManager.customItem;
	}
	 
}
