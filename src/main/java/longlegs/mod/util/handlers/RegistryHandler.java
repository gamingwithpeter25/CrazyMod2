package longlegs.mod.util.handlers;

import java.util.Arrays;

import longlegs.mod.init.BiomeInit;
import longlegs.mod.init.BlockInit;
import longlegs.mod.init.EntityInit;
import longlegs.mod.init.ItemInit;
import longlegs.mod.util.Reference;
import longlegs.mod.util.interfaces.IHasModel;
import longlegs.mod.world.gen.WorldGenCustomOres;
import longlegs.mod.world.gen.WorldGenCustomTrees;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		Reference.LOGGER.info("Items Registered");
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		Reference.LOGGER.info("Blocks Registered");
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() 
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(), 0);

		BiomeInit.registerBiomes();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
	
	public static void InitRegistries() 
	{
		SoundsHandler.registerSounds();
	}
}
