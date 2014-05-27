package com.camp.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class CustomEntityPassive extends EntityAnimal {
	
	public CustomEntityPassive(World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
		this.tasks.addTask(0, new EntityAISwimming(this)); //set priority using first number
		//if swimming priority is not set to 0, then the mob will invariably drown
		
		//the double stands for how fast the entity reacts
		this.tasks.addTask(1, new EntityAIPanic(this, 1.0D));
		this.tasks.addTask(2, new EntityAIMate(this, 0.8D));
		
		//false for "Tempt" means that the thing won't be scared by player movement
		this.tasks.addTask(3, new EntityAITempt(this, 1.3D, Items.apple, false));
		this.tasks.addTask(4, new EntityAIFollowParent(this, 1.0D));
		this.tasks.addTask(5, new EntityAIWander(this, 0.7D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		
	}//end constructor
		 
		@Override
		public EntityAgeable createChild(EntityAgeable var1) {
			return new CustomEntityPassive(worldObj);
		}//end createChild
		 
		protected void applyEntityAttributes() {
			super.applyEntityAttributes();
			
			//attributes set here; NOTE: passive mobs do not attack ever
			//standard movement speed is 0.7D
			this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
			this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8D);
		}
		
		//AI is turned off by default, must be turned on for all entities
		public boolean isAIEnabled() {
	        return true;
	    }

}
