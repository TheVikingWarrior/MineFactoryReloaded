package powercrystals.minefactoryreloaded.modhelpers.forestry;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;
import powercrystals.minefactoryreloaded.tile.machine.TileEntityUnifier;

@Mod(modid = "MineFactoryReloaded|CompatForestry", name = "MFR Compat: Forestry", version = MineFactoryReloadedCore.version, dependencies = "after:MineFactoryReloaded;after:Forestry")
public class Forestry
{
	@EventHandler
	public static void load(FMLInitializationEvent e)
	{
		if(!Loader.isModLoaded("Forestry"))
		{
			return;
		}
		try
		{
			regsiterSludgeDrop();
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}
	}
	
	private static void regsiterSludgeDrop()
	{
		//ItemStack peat = ItemInterface.getItem("peat");
		//MFRRegistry.registerSludgeDrop(10, peat);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{
		if(!Loader.isModLoaded("Forestry"))
		{
			return;
		}
		
		MineFactoryReloadedCore.proxy.onPostTextureStitch(null);
		
		TileEntityUnifier.updateUnifierLiquids();
	}
}
