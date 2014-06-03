package com.camp.entity;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;


public class CustomMob extends EntityMob {

	public CustomMob(World par1World) {
		super(par1World);
	}
	
	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel) {
	    //changes the drop amount to 4 instead of the usual 1-2
		int quantity = this.rand.nextInt(4) + 1;

		//if the entity is burning it drops an item??? guess this is for being set on fire during the day
	    for (int i = 0; i < quantity; i++) {
	        if (this.isBurning()) {
	            this.dropItem(ItemManager.customItem, 1);
	        }
	        else {
	            Item drop = Item.getItemFromBlock(BlockManager.customBlock);
	            this.dropItem(drop, 1);
	        }
	    }
	 
	}
	
	@Override
	public void dropRareDrop(int par1) {
	    this.dropItem(Items.golden_apple, 1);
	}

}
