package longlegs.mod.world.biomes;

import longlegs.mod.init.BlockInit;
import longlegs.mod.objects.blocks.BlockDirts;
import longlegs.mod.objects.blocks.BlockOres;
import longlegs.mod.objects.blocks.BlockPlank;
import longlegs.mod.util.handlers.EnumHandler;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeCrazy extends Biome 
{
	public BiomeCrazy() 	{
		
		super(new BiomeProperties("Copper").setBaseHeight(1.5F).setHeightVariation(1.2f).setTemperature(0.6f)
				.setRainDisabled().setWaterColor(13925155));

		topBlock = BlockInit.DIRT.getDefaultState().withProperty(BlockDirts.VARIANT, EnumHandler.EnumType.CRAZY);
		fillerBlock = BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT,
				EnumHandler.EnumType.CRAZY);

		this.decorator.coalGen = new WorldGenMinable(
				BlockInit.PLANKS.getDefaultState().withProperty(BlockPlank.VARIANT, EnumHandler.EnumType.CRAZY), 10);

		this.decorator.treesPerChunk = 2;



		
	}
}
