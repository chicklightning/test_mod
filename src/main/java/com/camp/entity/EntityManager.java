package com.camp.entity;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {

	public static void mainRegistry() {
		registerEntity();
	}//end mainRegistry
		 
	public static void registerEntity() {
		//list of entities to be registered and added into the game, with respective egg colors
		createEntity(CustomEntityPassive.class, "CustomEntityPassive", 0x8D9DF7, 0xDBE4FF);
		createEntity(CustomMob.class, "CustomMob", 0xC724A1, 0x63CBEB);
		//first color is base color, second is spots color
	}//end registerEntity
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
	    EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityId);
	    EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, solidColor, spotColor));
    }
}
