package powercrystals.minefactoryreloaded.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;
import cpw.mods.fml.common.IFuelHandler;

public class MineFactoryReloadedFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if (fuel == null)
			return 0;
		Item item = fuel.getItem();
		if(item.equals(MineFactoryReloadedCore.rubberWoodItem))
		{
			return 350;
		}
		if(item.equals(MineFactoryReloadedCore.rubberLeavesItem))
		{
			return 4 * (fuel.getItemDamage() + 1);
		}
		else if(item.equals(MineFactoryReloadedCore.rubberSaplingItem))
		{
			return 130;
		}
		else if(item.equals(MineFactoryReloadedCore.sugarCharcoalItem))
		{
			return 400;
		}
		else if(item.equals(MineFactoryReloadedCore.rawRubberItem))
		{
			return 30;
		}
		else if(item.equals(MineFactoryReloadedCore.bioFuelBucketItem))
		{
			return 22500;
		}
		
		return 0;
	}
}
