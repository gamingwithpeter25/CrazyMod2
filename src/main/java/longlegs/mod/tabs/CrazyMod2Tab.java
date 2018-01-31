package longlegs.mod.tabs;

import longlegs.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CrazyMod2Tab extends CreativeTabs
{
	public CrazyMod2Tab(String label)
	{ 
		super("crazymod2"); 
		this.setBackgroundImageName("crazymod2.png");
	}
	
		
	


	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.DUST_CRAZY);
		
	}
}