package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import com.camp.lib.StringLibrary;

public class MultiBlock extends Block {

	public IIcon[] iconArray = new IIcon[6];
	
	protected MultiBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockName("MultiBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconReg)
	{
		//original code was written wrong; if done as "i" vs. "i+1", then will start image
		//registering at "0", and it's likely the images will be named 1-6, so the sixth
		//image will not be added and will be replaced with the default texture
		for(int i = 0; i < iconArray.length; i++)
			iconArray[i] = iconReg.registerIcon(StringLibrary.MODID + ":multiblock_" + (i+1));
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return iconArray[side];
	}

}
