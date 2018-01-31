package longlegs.mod.objects.items;

import longlegs.mod.Main;
import longlegs.mod.init.ItemInit;
import longlegs.mod.proxy.ClientProxy;
import longlegs.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.crazymod2Tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()  
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
