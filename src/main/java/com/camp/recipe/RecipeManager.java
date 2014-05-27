package com.camp.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeManager {

	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}//end mainRegistry
		  
		 
	public static void addCraftingRecipes() {
		//guess that this shapeless recipe (one where order doesn't matter) does this shit
		//creates a new ItemStack (versus an Item) from one block of dirt ugh
		//takes an unlimited number of Object "items"
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 64), Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.dirt, Blocks.sand, Blocks.sand);
		
		//Shaped recipe on a 2x2 square (personal inventory), where square is like row 1: x y and row 2: y x
		//here the x's are stone blocks and the y's are gravel
		GameRegistry.addShapedRecipe(new ItemStack(Items.book), "xy", "yx", 'x', Blocks.stone, 'y', Blocks.gravel);
		
		//here it's a 3x3 square, with each row listed respectively; add as many variables as needed in whatever combination
		GameRegistry.addShapedRecipe(new ItemStack(Items.carrot), "xyx", "y y", "xyx", 'x', Blocks.stone, 'y', Blocks.gravel);
		GameRegistry.addShapedRecipe(new ItemStack(Items.bed), "xxx", "y y", "zzz", 'x', Blocks.bookshelf, 'y', Blocks.cactus, 'z', Blocks.wool );
	}//end addCraftingRecipes    
		  
		 
	public static void addSmeltingRecipes() {   
		//input, then output, then a number showing how much experience is gained from this action
		GameRegistry.addSmelting(new ItemStack(Blocks.bookshelf), new ItemStack(Items.baked_potato), 0.1f);
	}
}
