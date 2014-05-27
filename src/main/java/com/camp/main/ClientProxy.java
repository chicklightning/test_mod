package com.camp.main;

import net.minecraft.client.model.ModelBiped;

import com.camp.entity.CustomMob;
import com.camp.render.RenderCustomBiped;

import cpw.mods.fml.client.registry.RenderingRegistry;



public class ClientProxy extends ServerProxy {

	public void registerRenderThings() {
        //add a new rendering handler for every entity that needs to be rendered
		RenderingRegistry.registerEntityRenderingHandler(CustomMob.class, new RenderCustomBiped(new ModelBiped(), 0));
    }
	
}
