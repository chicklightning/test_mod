package com.camp.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CustomFood extends ItemFood {
	
	public CustomFood(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		//this.setAlwaysEdible() makes the food edible even when the player is not hungry
	}
	
	//still not entirely sure what this method is supposed to do? it says
	//"keeps unnecessary actions from taking place"
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		
		//creates a potion effect upon consumption; "isRemote" is used to make sure
		//actions are not duplicated client AND server side
		if(!world.isRemote)
		{
			//first arg: gets specific potion ID, 2: duration in ticks of the potion (20 ticks/sec)
			//third arg: potion amplifier, how strong the potion is
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 100, 2));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 100, 2));
		}
	}
	
    /**
     * Return an item rarity from EnumRarity
     */
	//change text color!!! mad cool
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }

}
