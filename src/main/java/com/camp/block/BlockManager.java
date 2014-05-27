package com.camp.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockManager {
	 
    public static void mainRegistry() {
        intializeBlock();
        registerBlock();
    }
    
    public static Block customBlock;
    public static Block multiBlock;
 
    public static void intializeBlock() {
    	//change the material based on how you want the block to break: by hand, pickaxe, etc.
    	customBlock = new CustomBlock(Material.cactus);
    	multiBlock = new MultiBlock(Material.rock);
    }
 
    public static void registerBlock() {
    	GameRegistry.registerBlock(customBlock, customBlock.getUnlocalizedName());
    	GameRegistry.registerBlock(multiBlock, multiBlock.getUnlocalizedName());
    }
 
}
