package longlegs.mod.objects.tools;

import longlegs.mod.Main;
import longlegs.mod.init.ItemInit;
import longlegs.mod.util.interfaces.IHasModel;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;


public class ToolHoe extends ItemHoe implements IHasModel {
	
	public ToolHoe(String name, ToolMaterial material) 
	{
		super(material);
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
