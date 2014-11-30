package powercrystals.minefactoryreloaded.modhelpers.chococraft;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.CustomProperty;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import powercrystals.minefactoryreloaded.MFRRegistry;
import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;
import powercrystals.minefactoryreloaded.farmables.plantables.PlantableCropPlant;

@Mod(modid="MineFactoryReloaded|CompatChococraft", name = "MFR Compat: Chococraft",
version = MineFactoryReloadedCore.version,
dependencies = "required-after:MineFactoryReloaded;after:chococraft",
customProperties = @CustomProperty(k = "cofhversion", v = "true"))
public class Chococraft
{
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		if (!Loader.isModLoaded("chococraft"))
		{
			return;
		}

		try
		{
			Class<?> mod = Class.forName("chococraft.common.ModChocoCraft");

			FMLLog.info("Registering Gysahls for Planter/Harvester/Fertilizer");
			Block blockId = ((Block)(mod.getField("gysahlStemBlock").get(null)));
			Item seedId = ((Item)(mod.getField("gysahlSeedsItem").get(null)));

			MFRRegistry.registerPlantable(new PlantableCropPlant(seedId, blockId));
			MFRRegistry.registerHarvestable(new HarvestableChococraft(blockId));
			MFRRegistry.registerFertilizable(new FertilizableChococraft(blockId));
		}
		catch (ClassNotFoundException e)
		{
			FMLLog.warning("Unable to load support for Chococraft");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
