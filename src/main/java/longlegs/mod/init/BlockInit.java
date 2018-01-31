package longlegs.mod.init;

import java.util.ArrayList;
import java.util.List;

import longlegs.mod.objects.blocks.BlockBase;
import longlegs.mod.objects.blocks.BlockDirts;
import longlegs.mod.objects.blocks.BlockLeaf;
import longlegs.mod.objects.blocks.BlockLogs;
import longlegs.mod.objects.blocks.BlockOres;
import longlegs.mod.objects.blocks.BlockPlank;
import longlegs.mod.objects.blocks.BlockSaplings;
import longlegs.mod.objects.blocks.machines.sinterer.BlockSinteringFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_CRAZY = new BlockBase("block_crazy",Material.IRON);
	public static final Block BLOCK_COPPER = new BlockBase("block_copper",Material.IRON);
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld","overworld");
	
	
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLINGS = new BlockSaplings("sapling");
	public static final Block DIRT = new BlockDirts("dirt");
	
	public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");
}
