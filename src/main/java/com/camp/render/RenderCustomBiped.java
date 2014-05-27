package com.camp.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import com.camp.lib.StringLibrary;


//I suppose you have to create a new render class for every model you want rendered with
//a custom texture and put it under the ClientProxy
public class RenderCustomBiped extends RenderBiped {

	public RenderCustomBiped(ModelBiped par1ModelBiped, float par2) {
		super(par1ModelBiped, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return new ResourceLocation(StringLibrary.MODID + ":textures/entity/guilain_texture.png");
	}

}
