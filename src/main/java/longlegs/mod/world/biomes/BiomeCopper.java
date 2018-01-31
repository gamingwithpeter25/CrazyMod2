package longlegs.mod.world.biomes;

import java.util.Random;

import longlegs.mod.entity.EntityCentaur;
import longlegs.mod.init.BlockInit;
import longlegs.mod.objects.blocks.BlockDirts;
import longlegs.mod.objects.blocks.BlockOres;
import longlegs.mod.objects.blocks.BlockPlank;
import longlegs.mod.util.handlers.EnumHandler;
import longlegs.mod.world.gen.generators.WorldGenCopperTree;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCopper extends Biome {
	protected static final WorldGenAbstractTree TREE = new WorldGenCopperTree(true, false);

	public BiomeCopper() 
	{
		super(new BiomeProperties("Copper").setBaseHeight(1.5F).setHeightVariation(1.2f).setTemperature(0.6f)
				.setRainDisabled().setWaterColor(1199361));

		topBlock = BlockInit.DIRT.getDefaultState().withProperty(BlockDirts.VARIANT, EnumHandler.EnumType.COPPER);
		fillerBlock = BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT,
				EnumHandler.EnumType.COPPER);

		this.decorator.coalGen = new WorldGenMinable(
				BlockInit.PLANKS.getDefaultState().withProperty(BlockPlank.VARIANT, EnumHandler.EnumType.COPPER), 10);

		this.decorator.treesPerChunk = 2;
	}
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}
