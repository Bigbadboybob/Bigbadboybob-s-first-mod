package lucas.MoeMobsMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lucas.MoeMobsMod.client.render.CavemanEntityRenderRegistry;
import lucas.MoeMobsMod.lists.EntityList;
import lucas.MoeMobsMod.lists.ItemList;
import lucas.MoeMobsMod.lists.ToolMaterialList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;


@Mod("bigbadboybob2")
public class MainMod {
	public static MainMod instance;
	public static final String modid = "bigbadboybob2";
	public static final Logger logger = LogManager.getLogger(modid);
	
	public MainMod() {
		
		instance = this;
	
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("Setup method registered.");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) {
		
		logger.info("Client method registered.");
		

	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			

			event.getRegistry().registerAll (
			
			ItemList.caveman_club = new SwordItem(ToolMaterialList.caveman, 0, 2.0f, new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(Location("caveman_club"))
					
			);
			
			EntityList.registerEntitySpawnEggs(event);

			logger.info("Items registered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			

			event.getRegistry().registerAll (
					
					
			);

			logger.info("Items registered");
		}
	
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
			event.getRegistry().registerAll(
					EntityList.caveman_entity
			);
				
			EntityList.registerEntityWorldSpawns();
			CavemanEntityRenderRegistry.registerEntityRenders();
		}
		
		
	}

	public static ResourceLocation Location(String name) {
		return new ResourceLocation(modid, name);
	}
	
}
