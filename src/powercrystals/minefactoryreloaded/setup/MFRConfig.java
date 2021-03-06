package powercrystals.minefactoryreloaded.setup;

import static net.minecraftforge.common.config.Configuration.*;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class MFRConfig
{
	// client config
	public static Property spyglassRange;
	public static Property brightRednetBand;

	// common config
	public static Property dropFilledContainers;

	public static Property machineBlock0Id;
	public static Property machineBlock1Id;
	public static Property machineBlock2Id;

	public static Property conveyorBlockId;

	public static Property factoryGlassBlockId;
	public static Property factoryGlassPaneBlockId;
	public static Property factoryRoadBlockId;
	public static Property factoryDecorativeBrickBlockId;
	public static Property factoryDecorativeStoneBlockId;

	public static Property rubberWoodBlockId;
	public static Property rubberLeavesBlockId;
	public static Property rubberSaplingBlockId;

	public static Property railPickupCargoBlockId;
	public static Property railDropoffCargoBlockId;
	public static Property railPickupPassengerBlockId;
	public static Property railDropoffPassengerBlockId;

	public static Property rednetCableBlockId;
	public static Property rednetLogicBlockId;
	public static Property rednetPanelBlockId;

	public static Property fakeLaserBlockId;

	public static Property vineScaffoldBlockId;

	public static Property detCordBlockId;

	public static Property milkStillBlockId;
	public static Property sludgeStillBlockId;
	public static Property sewageStillBlockId;
	public static Property essenceStillBlockId;
	public static Property biofuelStillBlockId;
	public static Property meatStillBlockId;
	public static Property pinkslimeStillBlockId;
	public static Property chocolateMilkStillBlockId;
	public static Property mushroomSoupStillBlockId;

	public static Property hammerItemId;
	public static Property milkItemId; //TODO: UNUSED
	public static Property sludgeItemId; //TODO: UNUSED
	public static Property sewageItemId; //TODO: UNUSED
	public static Property mobEssenceItemId; //TODO: UNUSED
	public static Property fertilizerItemId;
	public static Property plasticSheetItemId;
	public static Property rawPlasticItemId;
	public static Property rubberBarItemId;
	public static Property sewageBucketItemId;
	public static Property sludgeBucketItemId;
	public static Property mobEssenceBucketItemId;
	public static Property syringeEmptyItemId;
	public static Property syringeHealthItemId;
	public static Property syringeGrowthItemId;
	public static Property rawRubberItemId;
	public static Property machineBaseItemId;
	public static Property safariNetItemId;
	public static Property ceramicDyeItemId;
	public static Property blankRecordId;
	public static Property syringeZombieId;
	public static Property safariNetSingleItemId;
	public static Property bioFuelItemId; //TODO: UNUSED
	public static Property bioFuelBucketItemId;
	public static Property upgradeItemId;
	public static Property safariNetLauncherItemId;
	public static Property sugarCharcoalItemId;
	public static Property milkBottleItemId;
	public static Property spyglassItemId;
	public static Property portaSpawnerItemId;
	public static Property strawItemId;
	public static Property xpExtractorItemId;
	public static Property syringeSlimeItemId;
	public static Property syringeCureItemId;
	public static Property logicCardItemId;
	public static Property rednetMeterItemId;
	public static Property rednetMemoryCardItemId;
	public static Property rulerItemId;
	public static Property meatIngotRawItemId;
	public static Property meatIngotCookedItemId;
	public static Property meatNuggetRawItemId;
	public static Property meatNuggetCookedItemId;
	public static Property meatBucketItemId;
	public static Property pinkSlimeBucketItemId;
	public static Property pinkSlimeballItemId;
	public static Property safariNetJailerItemId;
	public static Property laserFocusItemId;
	public static Property chocolateMilkBucketItemId;
	public static Property mushroomSoupBucketItemId;
	public static Property needlegunItemId;
	public static Property needlegunAmmoEmptyItemId;
	public static Property needlegunAmmoStandardItemId;
	public static Property needlegunAmmoLavaItemId;
	public static Property needlegunAmmoSludgeItemId;
	public static Property needlegunAmmoSewageItemId;
	public static Property needlegunAmmoFireItemId;
	public static Property needlegunAmmoAnvilItemId;
	public static Property plasticCupItemId;
	public static Property rocketLauncherItemId;
	public static Property rocketItemId;
	public static Property plasticCellItemId;
	public static Property fishingRodItemId;
	public static Property bagItemId;
	public static Property plasticBootsItemId;

	public static Property zoolologistEntityId;

	public static Property colorblindMode;
	public static Property treeSearchMaxVertical;
	public static Property treeSearchMaxHorizontal;
	public static Property verticalHarvestSearchMaxVertical;
	public static Property enableBonemealFertilizing;
	public static Property conveyorCaptureNonItems;
	public static Property conveyorNeverCapturesPlayers;
	public static Property conveyorNeverCapturesTCGolems;
	public static Property playSounds;
	public static Property fruitTreeSearchMaxVertical;
	public static Property fruitTreeSearchMaxHorizontal;
	public static Property breederShutdownThreshold;
	public static Property autospawnerCostStandard;
	public static Property autospawnerCostExact;
	public static Property laserdrillCost;
	public static Property meatSaturation;
	public static Property fishingDropRate;

	public static Property vanillaOverrideGlassPane;
	public static Property vanillaOverrideIce;
	public static Property vanillaOverrideMilkBucket;

	public static Property enableCheapDSU;
	public static Property craftSingleDSU;
	public static Property enableMossyCobbleRecipe;
	public static Property enablePortaSpawner;
	public static Property enableSyringes;
	public static Property enableLiquidSyringe;
	public static Property enableGuns;
	public static Property enableNetLauncher;
	public static Property enableSPAMRExploding;
	public static Property enableFuelExploding;
	public static Property enableSpawnerCarts;
	public static Property enableMassiveTree;
	public static Property enableChunkLimitBypassing;
	public static Property enableChunkLoaderRequiresOwner;
	public static Property enableSmoothSlabRecipe;
	public static Property enableCheapCL;

	public static Property redNetDebug;
	public static Property redNetConnectionBlacklist;

	public static Property worldGenDimensionBlacklist;

	public static Property rubberTreeWorldGen;
	public static Property rubberTreeBiomeWhitelist;
	public static Property rubberTreeBiomeBlacklist;

	public static Property mfrLakeWorldGen;
	public static Property mfrLakeSewageRarity;
	public static Property mfrLakeSewageBiomeList;
	public static Property mfrLakeSewageBiomeListToggle;
	public static Property mfrLakeSludgeRarity;
	public static Property mfrLakeSludgeBiomeList;
	public static Property mfrLakeSludgeBiomeListToggle;

	public static Property mfrLakeSewageRetrogen;
	public static Property mfrLakeSludgeRetrogen;
	public static Property rubberTreeRetrogen;

	public static Property unifierBlacklist;
	public static Property spawnerBlacklist;

	public static Property passengerRailSearchMaxHorizontal;
	public static Property passengerRailSearchMaxVertical;

	// recipes config
	public static Property vanillaRecipes;
	public static Property thermalExpansionRecipes;
	public static Property gregTechRecipes;

	public static String CATEGORY_ITEM = "item";

	public static void loadClientConfig(File configFile)
	{
		Configuration c = new Configuration(configFile);

		spyglassRange = c.get(CATEGORY_GENERAL, "SpyglassRange", 200);
		spyglassRange.comment = "The maximum number of blocks the spyglass and ruler can look to find something. This calculation is performed only on the client side.";
		brightRednetBand = c.get(CATEGORY_GENERAL, "BrightRedNetColors", false);
		brightRednetBand.comment = "If true, RedNet color bands will always be bright.";
		colorblindMode = c.get(CATEGORY_GENERAL, "EnableColorblindMode", false);
		colorblindMode.comment = "Set to true to enable the RedNet GUI's colorblind mode.";
		// TODO: expand this to as many textures as possible (cofh core config option?)

		c.save();
	}

	//private static Configuration config;

	public static void loadCommonConfig(File configFile)
	{
		Configuration c = new Configuration(configFile);
		c.load();
		//config = c;

		String category = "Entity", subCategory = "";
		zoolologistEntityId = c.get(category, "ID.Zoologist", 330).setRequiresMcRestart(true);
		enableSpawnerCarts = c.get(category, "EnableSpawnerCarts", true);
		enableSpawnerCarts.comment = "If true, using a portaspawner on an empty minecart will make it into a spawner cart";

		playSounds = c.get(CATEGORY_GENERAL, "PlaySounds", true);
		playSounds.comment = "Set to false to disable the harvester's sound when a block is harvested.";

		//{ Searching
		treeSearchMaxHorizontal = c.get(CATEGORY_GENERAL + ".SearchDistance", "Tree.MaxHorizontal", 512);
		treeSearchMaxHorizontal.comment = "When searching for parts of a tree, how far out to the sides (radius) to search";
		treeSearchMaxVertical = c.get(CATEGORY_GENERAL + ".SearchDistance", "Tree.MaxVertical", 256);
		treeSearchMaxVertical.comment = "When searching for parts of a tree, how far up to search";
		verticalHarvestSearchMaxVertical = c.get(CATEGORY_GENERAL + ".SearchDistance", "StackingBlock.MaxVertical", 5);
		verticalHarvestSearchMaxVertical.comment = "How far upward to search for members of \"stacking\" blocks, like cactus and sugarcane";
		passengerRailSearchMaxVertical = c.get(CATEGORY_GENERAL + ".SearchDistance", "PassengerRail.MaxVertical", 2);
		passengerRailSearchMaxVertical.comment = "When searching for players or dropoff locations, how far up to search";
		passengerRailSearchMaxHorizontal = c.get(CATEGORY_GENERAL + ".SearchDistance", "PassengerRail.MaxHorizontal", 3);
		passengerRailSearchMaxHorizontal.comment = "When searching for players or dropoff locations, how far out to the sides (radius) to search";
		fruitTreeSearchMaxHorizontal = c.get(CATEGORY_GENERAL + ".SearchDistance", "FruitTree.MaxHoriztonal", 5);
		fruitTreeSearchMaxHorizontal.comment = "When searching for parts of a fruit tree, how far out to the sides (radius) to search";
		fruitTreeSearchMaxVertical = c.get(CATEGORY_GENERAL + ".SearchDistance", "FruitTree.MaxVertical", 20);
		fruitTreeSearchMaxVertical.comment = "When searching for parts of a fruit tree, how far up to search";
		//}

		//{ RedNet
		category = CATEGORY_GENERAL + ".RedNet";
		redNetDebug = c.get(category, "Debug", false);
		redNetDebug.comment = "If true, RedNet cables will dump a massive amount of data to the log file. You should probably only use this if PC tells you to.";
		redNetConnectionBlacklist = c.get(category, "ConnectionBlackList", new String[] {}).setRequiresMcRestart(true);
		redNetConnectionBlacklist.comment = "A list of block IDs to prevent RedNet cables from connecting to. (e.g., minecraft:torch)";
		//}

		//{ Worldgen
		category = CATEGORY_GENERAL + ".WorldGen";
		worldGenDimensionBlacklist = c.get(category, "Dimension.Blacklist", new int[] {}).setRequiresMcRestart(true);
		worldGenDimensionBlacklist.comment = "A list of dimension IDs to disable MFR worldgen in.";

		subCategory = category + ".RetroGen";
		c.getCategory(subCategory).setComment("Enable or disable specific retrogen items. Only has an effect if retroactive geneneration is enabled in CoFHCore.");
		mfrLakeSewageRetrogen = c.get(subCategory, "SewageLakes", false).setRequiresMcRestart(true);
		mfrLakeSludgeRetrogen = c.get(subCategory, "SludgeLakes", false).setRequiresMcRestart(true);
		rubberTreeRetrogen = c.get(subCategory, "RubberTrees", true).setRequiresMcRestart(true);

		subCategory = category + ".RubberTrees";
		rubberTreeWorldGen = c.get(subCategory, "Enable", true).setRequiresMcRestart(true);
		rubberTreeWorldGen.comment = "Whether or not to generate MFR rubber trees during map generation";
		rubberTreeBiomeWhitelist = c.get(subCategory, "Biome.Whitelist", new String[] {}).setRequiresMcRestart(true);
		rubberTreeBiomeWhitelist.comment = "A list of biomes to allow rubber trees to spawn in. Does nothing if rubber tree worldgen is disabled.";
		rubberTreeBiomeBlacklist = c.get(subCategory, "Biome.Blacklist", new String[] {}).setRequiresMcRestart(true);
		rubberTreeBiomeBlacklist.comment = "A list of biomes to disallow rubber trees to spawn in. Overrides any other biomes added.";
		enableMassiveTree = c.get(subCategory, "SacredRubberSapling", true).setRequiresMcRestart(true);
		enableMassiveTree.comment = "If true, enable adding enchanted Sacred Rubber Saplings to jungle temple loot.";

		subCategory = category + ".Lakes";
		mfrLakeWorldGen = c.get(subCategory, "Enable", true).setRequiresMcRestart(true);
		mfrLakeWorldGen.comment = "Whether or not to generate MFR lakes during map generation. By default, MFR will not attempt lake worldgen in dimensions where the player cannot respawn.";

		mfrLakeSludgeRarity = c.get(subCategory + ".Sludge", "Rarity", 32).setRequiresMcRestart(true);
		mfrLakeSludgeRarity.comment = "Higher numbers make sludge lakes rarer. A value of one will be approximately one per chunk. 0 will disable.";
		mfrLakeSludgeBiomeList = c.get(subCategory + ".Sludge", "BiomeList", new String[] {}).setRequiresMcRestart(true);
		mfrLakeSludgeBiomeList.comment = "A list of biomes to allow/disallow Sludge lakes to spawn in. Does nothing if lake worldgen is disabled.";
		mfrLakeSludgeBiomeListToggle = c.get(subCategory + ".Sludge", "BiomeList.Mode", false).setRequiresMcRestart(true);
		mfrLakeSludgeBiomeListToggle.comment = "If false, the biome list is a blacklist. If true, the biome list is a whitelist.";

		mfrLakeSewageRarity = c.get(subCategory + ".Sewage", "Rarity", 32).setRequiresMcRestart(true);
		mfrLakeSewageRarity.comment = "Higher numbers make Sewage lakes rarer. A value of one will be approximately one per chunk. 0 will disable.";
		mfrLakeSewageBiomeList = c.get(subCategory + ".Sewage", "BiomeList", new String[] {}).setRequiresMcRestart(true);
		mfrLakeSewageBiomeList.comment = "A list of biomes to allow/disallow Sewage lakes to spawn in. Does nothing if lake worldgen is disabled.";
		mfrLakeSewageBiomeListToggle = c.get(subCategory + ".Sewage", "BiomeList.Mode", false).setRequiresMcRestart(true);
		mfrLakeSewageBiomeListToggle.comment = "If false, the biome list is a blacklist. If true, the biome list is a whitelist.";
		//}

		// Alternate recipe sets TODO: auto-register for config handling
		vanillaRecipes = c.get("RecipeSets", "Vanilla", true).setRequiresMcRestart(true);
		vanillaRecipes.comment = "If true, MFR will register its standard (vanilla-item-only) recipes.";
		thermalExpansionRecipes = c.get("RecipeSets", "ThermalExpansion", false).setRequiresMcRestart(true);
		thermalExpansionRecipes.comment = "If true, MFR will register its Thermal Expansion-based recipes.";
		//}

		//{ Item/block behavior overriding
		category = CATEGORY_ITEM + ".VanillaOverride";
		vanillaOverrideGlassPane = c.get(category, "GlassPanes", true).setRequiresMcRestart(true);
		vanillaOverrideGlassPane.comment = "If true, allows vanilla glass panes to connect to MFR stained glass panes.";
		vanillaOverrideIce = c.get(category, "Ice", true).setRequiresMcRestart(true);
		vanillaOverrideIce.comment = "If true, enables MFR unmelting ice as well as vanilla ice.";
		vanillaOverrideMilkBucket = c.get(category, "MilkBucket", true).setRequiresMcRestart(true);
		vanillaOverrideMilkBucket.comment = "If true, replaces the vanilla milk bucket so milk can be placed in the world.";
		//}

		//{ misc. item changes
		meatSaturation = c.get(CATEGORY_ITEM, "Meat.IncreasedSaturation", false).setRequiresMcRestart(true);
		meatSaturation.comment = "If true, meat will be worth steak saturation instead of cookie saturation.";
		fishingDropRate = c.get(CATEGORY_ITEM, "FishDropRate", 5);
		fishingDropRate.comment = "The rate at which fish are dropped from the fishing rod. The drop rate is 1 / this number. Must be greater than 0.";

		enableSPAMRExploding = c.get(CATEGORY_ITEM, "SPAMR.Exploding", true);
		enableSPAMRExploding.comment = "If true, SPAMRs will explode when they run out of fuel.";
		enableFuelExploding = c.get(CATEGORY_ITEM, "Biofuel.Exploding", true);
		enableFuelExploding.comment = "If true, biofuel will explode when in the nether.";

		enableLiquidSyringe = c.get(CATEGORY_ITEM, "LiquidSyringes", true).setRequiresMcRestart(true);
		enableLiquidSyringe.comment = "If true, Empty Syringes will be able to contain liquids and inject players.";
		//}

		//{ Alterations to recipes
		category = CATEGORY_ITEM + ".Recipe";
		enableCheapDSU = c.get(category, "CheaperDSU",  false).setRequiresMcRestart(true);
		enableCheapDSU.comment = "If true, the DSU can be built out of chests instead of ender pearls. Does nothing if the recipe is disabled.";
		craftSingleDSU = c.get(category, "SingleDSU",  true).setRequiresMcRestart(true);
		craftSingleDSU.comment = "DSU recipes will always craft one DSU. Does nothing for recipes that already only craft one DSU (cheap mode, etc).";
		enableMossyCobbleRecipe = c.get(category, "MossyCobble",  true).setRequiresMcRestart(true);
		enableMossyCobbleRecipe.comment = "If true, mossy cobble can be crafted.";
		enablePortaSpawner = c.get(category, "PortaSpawner", true).setRequiresMcRestart(true);
		enablePortaSpawner.comment = "If true, the PortaSpawner will be craftable.";
		enableSyringes = c.get(category, "Syringes", true).setRequiresMcRestart(true);
		enableSyringes.comment = "If true, the Syringes will be craftable.";
		enableGuns = c.get(category, "Guns", true).setRequiresMcRestart(true);
		enableGuns.comment = "If true, the Guns will be craftable.";
		enableNetLauncher = c.get(category, "NetLauncher", true).setRequiresMcRestart(true);
		enableNetLauncher.comment = "If true, the safarinet launcher will be craftable.";
		enableSmoothSlabRecipe = c.get(category, "SmoothSlab", true).setRequiresMcRestart(true);
		enableSmoothSlabRecipe.comment = "If true, smooth double stone slabs can be craftable.";
		enableCheapCL = c.get(category, "CheaperChunkLoader", false).setRequiresMcRestart(true);
		enableCheapCL.comment = "If true, the ChunkLoader can be built out of cheaper materials. Does nothing if the recipe is disabled.";
		//}

		//{ Additional machine configs
		conveyorCaptureNonItems = c.get("Machine.Conveyor", "CaptureNonItems", true).setRequiresMcRestart(true);
		conveyorCaptureNonItems.comment = "If false, conveyors will not grab non-item entities. Breaks conveyor mob grinders but makes them safe for golems, etc.";
		conveyorNeverCapturesPlayers = c.get("Machine.Conveyor", "NeverCapturePlayers", false).setRequiresMcRestart(true);
		conveyorNeverCapturesPlayers.comment = "If true, conveyors will NEVER capture players regardless of other settings.";
		conveyorNeverCapturesTCGolems = c.get("Machine.Conveyor", "NeverCaptureTCGolems", false).setRequiresMcRestart(true);
		conveyorNeverCapturesTCGolems.comment = "If true, conveyors will NEVER capture ThaumCraft golems regardless of other settings.";

		enableChunkLimitBypassing = c.get("Machine." + Machine.ChunkLoader.getName(), "IgnoreChunkLimit", false);
		enableChunkLimitBypassing.comment = "If true, the Chunk Loader will ignore forgeChunkLoading.cfg.";
		enableChunkLoaderRequiresOwner = c.get("Machine." + Machine.ChunkLoader.getName(), "RequiresOwnerOnline", false);
		enableChunkLoaderRequiresOwner.comment = "If true, the Chunk Loader will require that the player who placed it be online to function";
		autospawnerCostExact = c.get("Machine." + Machine.AutoSpawner.getName(), "Work.Exact", 50).setRequiresMcRestart(true);
		autospawnerCostExact.comment = "The work required to generate a mob in exact mode.";
		autospawnerCostStandard = c.get("Machine." + Machine.AutoSpawner.getName(), "Work.Standard", 15).setRequiresMcRestart(true);
		autospawnerCostStandard.comment = "The work required to generate a mob in standard (non-exact) mode.";
		laserdrillCost = c.get("Machine." + Machine.LaserDrill.getName(), "Work", 300).setRequiresMcRestart(true);
		laserdrillCost.comment = "The work required by the drill to generate a single ore.";
		unifierBlacklist = c.get("Machine." + Machine.Unifier.getName(), "Blacklist", new String[] {"dyeBlue","dyeWhite","dyeBrown","dyeBlack","listAllwater","listAllmilk"}).setRequiresMcRestart(true);
		unifierBlacklist.comment = "A list of ore dictionary entrys to disable unifying for. By default, MFR will not attempt to unify anything with more than one oredict name.";
		spawnerBlacklist = c.get("Machine." + Machine.AutoSpawner.getName(), "Blacklist", new String[] {"VillagerGolem"}).setRequiresMcRestart(true);
		spawnerBlacklist.comment = "A list of entity IDs (e.g.: CaveSpider, VillagerGolem, butterflyGE) to blacklist from the AutoSpawner.";
		breederShutdownThreshold = c.get("Machine." + Machine.Breeder.getName(), "ShutdownThreshold", 50).setRequiresMcRestart(true);
		breederShutdownThreshold.comment = "If the number of entities in the breeder's target area exceeds this value, the breeder will cease operating. This is provided to control server lag.";
		enableBonemealFertilizing = c.get("Machine." + Machine.Fertilizer.getName(), "EnableBonemeal", false).setRequiresMcRestart(true);
		enableBonemealFertilizing.comment = "If true, the fertilizer will use bonemeal as well as MFR fertilizer. Provided for those who want a less work-intensive farm.";
		//}

		for(Machine machine : Machine.values())
		{
			machine.load(c);
		}

		// TODO: make this config per-player
		dropFilledContainers = c.get(CATEGORY_GENERAL, "Tanks.FillWithoutEmptySlots", true);
		dropFilledContainers.comment = "If true, when you have no empty slots in your inventory, you will continue filling buckets from tanks and drop them on the ground.";

		c.save();
	}
}