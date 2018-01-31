package longlegs.mod;

import longlegs.mod.proxy.CommonProxy;
import longlegs.mod.tabs.CrazyMod2Tab;
import longlegs.mod.util.Reference;
import longlegs.mod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME,version = Reference.VERSION)
public class Main {

	public static final CreativeTabs crazymod2Tab = new CrazyMod2Tab("crazymod2");
	
	@Instance	
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.preInitRegistries();Reference.LOGGER.info("Loading PreInitialization finished");}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {RegistryHandler.InitRegistries();Reference.LOGGER.info("Loading Initialization finished");}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {Reference.LOGGER.info("Loading PostInitialization finished");}
}

