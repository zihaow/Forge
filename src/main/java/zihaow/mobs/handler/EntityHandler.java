package zihaow.mobs.handler;

import java.util.Random;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import zihaow.mobs.Mobs;
import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * EntityHandler class, to set up entities.
 * @author: Zihao Wu, Xuefei Yang.
*/

public class EntityHandler{
	
	/**
	 * @param entityClass
	 * @param name
	 */
	public static void registerEntities(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long i = name.hashCode();
		Random random = new Random(i);
		int mainColor = random.nextInt()* 1677215;
		int subColor = random.nextInt()* 1677215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Mobs.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	/**
	 * @param entityClass
	 * @param name
	 */
	public static void registerMonster(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long i = name.hashCode();
		Random random = new Random(i);
		int mainColor = random.nextInt()* 1677215;
		int subColor = random.nextInt()* 1677215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 50, 3, 8, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Mobs.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
	
	/**
	 * @param entityClass
	 * @param name
	 */
	public static void registerFriendly(Class entityClass, String name){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long i = name.hashCode();
		Random random = new Random(i);
		int mainColor = random.nextInt()* 1677215;
		int subColor = random.nextInt()* 1677215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 100, 5, 10, EnumCreatureType.creature, BiomeGenBase.jungle, BiomeGenBase.beach);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Mobs.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}

}
