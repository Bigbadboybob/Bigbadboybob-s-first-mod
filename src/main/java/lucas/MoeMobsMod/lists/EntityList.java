package lucas.MoeMobsMod.lists;

import lucas.MoeMobsMod.MainMod;
import lucas.MoeMobsMod.entities.Caveman;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class EntityList {
	public static EntityType<Caveman> caveman_entity = (EntityType<Caveman>) EntityType.Builder.create(Caveman::new, EntityClassification.CREATURE).build(MainMod.modid + ":caveman_entity").setRegistryName(MainMod.Location("caveman_entity"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
			ItemList.caveman_entity_egg = registerEntitySpawnEgg(caveman_entity, 0x000000, 0x9c0000, "caveman_entity_egg")
		);
	}
	
	public static void registerEntityWorldSpawns() {
		registerEntityWorldSpawn(caveman_entity, EntityClassification.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.BEACH);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<Caveman> type, int color1, int color2, String name) {
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(MainMod.Location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<Caveman> entity, EntityClassification classification, Biome...biomes) {
		for(Biome biome : biomes) {
			if(biome != null) {
				biome.getSpawns(classification).add(new SpawnListEntry(entity, 10, 1, 10));
			}
		}
	}

}
