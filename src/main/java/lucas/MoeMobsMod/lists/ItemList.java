package lucas.MoeMobsMod.lists;

import lucas.MoeMobsMod.MainMod;
import lucas.MoeMobsMod.items.CavemanClub;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	
	public static Item caveman_entity_egg;
	
	public static Item caveman_club;
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, MainMod.modid);
	
	public static final RegistryObject<Item> CAVEMAN_CLUB = ITEMS.register("caveman_club2", CavemanClub::new);
	
}
