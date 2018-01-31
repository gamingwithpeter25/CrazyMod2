package longlegs.mod.init;

import java.util.ArrayList;
import java.util.List;

import longlegs.mod.objects.armor.ArmourBase;
import longlegs.mod.objects.items.ItemBase;
import longlegs.mod.objects.tools.ToolAxe;
import longlegs.mod.objects.tools.ToolHoe;
import longlegs.mod.objects.tools.ToolPickaxe;
import longlegs.mod.objects.tools.ToolShovel;
import longlegs.mod.objects.tools.ToolSword;
import longlegs.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_CRAZY = EnumHelper.addToolMaterial("tool_crazy", 2, 180, 5.0F, 1.5F, 5);
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOUR_CRAZY = EnumHelper.addArmorMaterial("armour_crazy", Reference.MODID + ":crazy", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MODID + ":copper", 13, new int[]{2, 5, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//items
	public static final Item INGOT_CRAZY = new ItemBase("ingot_crazy");
	public static final Item DUST_CRAZY = new ItemBase("dust_crazy");
	public static final Item DUST_COPPER = 	new ItemBase("dust_copper");
	public static final Item INGOT_COPPER = new ItemBase("ingot_copper");
		
	//tools crazy
	public static final Item AXE_CRAZY = new ToolAxe("axe_crazy",TOOL_CRAZY);
	public static final Item HOE_CRAZY = new ToolHoe("hoe_crazy",TOOL_CRAZY);
	public static final Item PICKAXE_CRAZY = new ToolPickaxe("pickaxe_crazy",TOOL_CRAZY);
	public static final Item SHOVEL_CRAZY = new ToolShovel("shovel_crazy",TOOL_CRAZY);
	public static final Item SWORD_CRAZY = new ToolSword("sword_crazy",TOOL_CRAZY);
	
	//tools copper
	public static final Item AXE_COPPER = new ToolAxe("axe_copper",TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper",TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper",TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper",TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper",TOOL_COPPER);
	
	//Armour crazy
	public static final Item HELMET_CRAZY = new ArmourBase("helmet_crazy",ARMOUR_CRAZY, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_CRAZY = new ArmourBase("chestplate_crazy",ARMOUR_CRAZY, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_CRAZY = new ArmourBase("leggings_crazy",ARMOUR_CRAZY, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_CRAZY = new ArmourBase("boots_crazy",ARMOUR_CRAZY, 1, EntityEquipmentSlot.FEET);
	
	//Armour copper
	public static final Item HELMET_COPPER = new ArmourBase("helmet_copper",ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_COPPER = new ArmourBase("chestplate_copper",ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_COPPER = new ArmourBase("leggings_copper",ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_COPPER = new ArmourBase("boots_copper",ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);
}

