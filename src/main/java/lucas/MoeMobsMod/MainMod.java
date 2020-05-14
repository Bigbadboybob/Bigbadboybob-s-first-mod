package lucas.MoeMobsMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lucas.tutorialmod.config.Config;
import lucas.tutorialmod.lists.ArmorMaterialList;
import lucas.tutorialmod.lists.BlockList;
import lucas.tutorialmod.lists.ItemList;
import lucas.tutorialmod.lists.ToolMaterialList;
import lucas.tutorialmod.lists.TutorialBiomes;
import lucas.tutorialmod.world.TutorialWorldType;
import lucas.tutorialmod.world.biomes.TutorialBiome;
import lucas.tutorialmod.world.gen.OreGen;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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


@Mod("bigbadboybob1")
public class MainMod {
	public static MainMod instance;
	public static final String modid = "bigbadboybob1";
	public static final Logger logger = LogManager.getLogger(modid);
	public static final ItemGroup tutorial = new TutorialItemGroup();
	public static final WorldType TUTORIAL_TYPE = new TutorialWorldType();
	
	public MainMod() {
		
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("tutorialmod-server.toml").toString());
		Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("tutorialmod-client.toml").toString());

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) {
		OreGen.generateOre();
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
					
			ItemList.tutorial_item = new Item(new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_item")),
			
			ItemList.tutorial_block = new BlockItem(BlockList.tutorial_block, new Item.Properties().group(tutorial)).setRegistryName(BlockList.tutorial_block.getRegistryName()),
			ItemList.tutorial_ore = new BlockItem(BlockList.tutorial_ore, new Item.Properties().group(tutorial)).setRegistryName(BlockList.tutorial_ore.getRegistryName()),
			
			ItemList.tutorial_axe = new AxeItem(ToolMaterialList.tutorial, -10.0f, 2.0f, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_axe")),
			ItemList.tutorial_hoe = new HoeItem(ToolMaterialList.tutorial, -40.0f, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_hoe")),
			ItemList.tutorial_pickaxe = new PickaxeItem(ToolMaterialList.tutorial, -40, 2.0f, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_pickaxe")),
			ItemList.tutorial_shovel = new ShovelItem(ToolMaterialList.tutorial, -40.0f, 2.0f, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_shovel")),
			ItemList.tutorial_sword = new SwordItem(ToolMaterialList.tutorial, 0, 2.0f, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_sword")),
			
			
			ItemList.tutorial_helmet = new ArmorItem(ArmorMaterialList.tutorial, EquipmentSlotType.HEAD, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_helmet")),
			ItemList.tutorial_chestplate = new ArmorItem(ArmorMaterialList.tutorial, EquipmentSlotType.CHEST, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_chestplate")),
			ItemList.tutorial_leggings = new ArmorItem(ArmorMaterialList.tutorial, EquipmentSlotType.LEGS, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_leggings")),
			ItemList.tutorial_boots = new ArmorItem(ArmorMaterialList.tutorial, EquipmentSlotType.FEET, new Item.Properties().group(tutorial)).setRegistryName(Location("tutorial_boots")),
			
			//sound
			ItemList.test_helmet = new ArmorItem(ArmorMaterialList.test, EquipmentSlotType.HEAD, new Item.Properties().group(tutorial)).setRegistryName(Location("test_helmet")),
			ItemList.test_chestplate = new ArmorItem(ArmorMaterialList.test, EquipmentSlotType.CHEST, new Item.Properties().group(tutorial)).setRegistryName(Location("test_chestplate")),
			ItemList.tutorial_leggings = new ArmorItem(ArmorMaterialList.test, EquipmentSlotType.LEGS, new Item.Properties().group(tutorial)).setRegistryName(Location("test_leggings")),
			ItemList.tutorial_chestplate = new ArmorItem(ArmorMaterialList.test, EquipmentSlotType.FEET, new Item.Properties().group(tutorial)).setRegistryName(Location("test_boots"))
			
			);
			
			//EntityList.registerEntitySpawneggs(event);

			logger.info("Items registered");
		}
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			

			event.getRegistry().registerAll (
					
					BlockList.tutorial_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).lightValue(5).sound(SoundType.SNOW)).setRegistryName(Location("tutorial_block")),
					BlockList.tutorial_ore = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).lightValue(10).sound(SoundType.STONE)).setRegistryName(Location("tutorial_ore"))
					
			);

			logger.info("Items registered");
		}
		
/*
		@SubscribeEvent
		public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
			event.getRegistry().registerAll(
					EntityList.TUTORIAL_ENTITY
			);
				
			EntityList.registerEntityWorldSpawns();
		}
*/
		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
			event.getRegistry().registerAll(
					TutorialBiomes.tutorial_biome = new TutorialBiome()
			);
			
			TutorialBiomes.registerBiomes();
				
		}
		
		private static ResourceLocation Location(String name) {
			return new ResourceLocation(modid, name);
		}
	}
}
