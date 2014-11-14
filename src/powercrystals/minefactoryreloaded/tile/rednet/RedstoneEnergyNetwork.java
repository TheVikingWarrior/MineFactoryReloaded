package powercrystals.minefactoryreloaded.tile.rednet;

import cofh.api.energy.EnergyStorage;
import cofh.lib.util.position.BlockPosition;

import java.util.LinkedHashSet;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import powercrystals.minefactoryreloaded.core.ArrayHashList;
import powercrystals.minefactoryreloaded.core.IGrid;
import powercrystals.minefactoryreloaded.net.GridTickHandler;

public class RedstoneEnergyNetwork implements IGrid
{
	public static final int TRANSFER_RATE = 1000;
	public static final int STORAGE = TRANSFER_RATE * 6;
	static final GridTickHandler<RedstoneEnergyNetwork, TileEntityRedNetEnergy> HANDLER =
			GridTickHandler.energy;

	private ArrayHashList<TileEntityRedNetEnergy> nodeSet = new ArrayHashList<TileEntityRedNetEnergy>();
	private LinkedHashSet<TileEntityRedNetEnergy> conduitSet;
	private TileEntityRedNetEnergy master;
	private int overflowSelector;
	private boolean regenerating = false;
	EnergyStorage storage = new EnergyStorage(480, 80);

	public int distribution;
	public int distributionSide;

	protected RedstoneEnergyNetwork() {
		storage.setCapacity(STORAGE);
		storage.setMaxTransfer(TRANSFER_RATE);
	}

	public RedstoneEnergyNetwork(TileEntityRedNetEnergy base) { this();
		conduitSet = new LinkedHashSet<TileEntityRedNetEnergy>();
		regenerating = true;
		addConduit(base);
		regenerating = false;
	}

	public int getNodeShare(TileEntityRedNetEnergy cond) {
		int size = nodeSet.size();
		if (size == 1)
			return storage.getEnergyStored();
		int amt = 0;
		if (master == cond) amt = storage.getEnergyStored() % size;
		return amt + storage.getEnergyStored() / size;
	}

	public void addConduit(TileEntityRedNetEnergy cond) {
		if (conduitSet.add(cond))
			if (!conduitAdded(cond))
				return;
		if (cond.isNode) {
			if (nodeSet.add(cond)) {
				nodeAdded(cond);
			}
		} else if (!nodeSet.isEmpty()) {
			int share = getNodeShare(cond);
			if (nodeSet.remove(cond)) {
				cond.energyForGrid = storage.extractEnergy(share, false);
				nodeRemoved(cond);
			}
		}
	}

	public void removeConduit(TileEntityRedNetEnergy cond) {
		conduitSet.remove(cond);
		if (!nodeSet.isEmpty()) {
			int share = getNodeShare(cond);
			if (nodeSet.remove(cond)) {
				cond.energyForGrid = storage.extractEnergy(share, false);
				nodeRemoved(cond);
			}
		}
	}

	public void regenerate() {
		regenerating = true;
		HANDLER.regenerateGrid(this);
	}

	public boolean isRegenerating() {
		return regenerating;
	}

	@Override
	public void markSweep() {
		destroyGrid();
		if (conduitSet.isEmpty())
			return;
		TileEntityRedNetEnergy main = conduitSet.iterator().next();
		LinkedHashSet<TileEntityRedNetEnergy> oldSet = conduitSet;
		nodeSet.clear();
		conduitSet = new LinkedHashSet<TileEntityRedNetEnergy>(Math.min(oldSet.size() / 6, 5));
		rebalanceGrid();

		LinkedHashSet<TileEntityRedNetEnergy> toCheck = new LinkedHashSet<TileEntityRedNetEnergy>();
		LinkedHashSet<TileEntityRedNetEnergy> checked = new LinkedHashSet<TileEntityRedNetEnergy>();
		BlockPosition bp = new BlockPosition(0,0,0);
		ForgeDirection[] dir = ForgeDirection.VALID_DIRECTIONS;
		toCheck.add(main);
		checked.add(main);
		while (!toCheck.isEmpty()) {
			main = toCheck.iterator().next();
			addConduit(main);
			World world = main.getWorldObj();
			for (int i = 6; i --> 0; ) {
				bp.x = main.xCoord; bp.y = main.yCoord; bp.z = main.zCoord;
				bp.step(dir[i]);
				if (world.blockExists(bp.x, bp.y, bp.z)) {
					TileEntity te = bp.getTileEntity(world);
					if (te instanceof TileEntityRedNetEnergy) {
						if (main.canInterface((TileEntityRedNetEnergy)te, dir[i^1]) && !checked.contains(te))
							toCheck.add((TileEntityRedNetEnergy)te);
						checked.add((TileEntityRedNetEnergy)te);
					}
				}
			}
			toCheck.remove(main);
			oldSet.remove(main);
		}
		if (!oldSet.isEmpty()) {
			RedstoneEnergyNetwork newGrid = new RedstoneEnergyNetwork();
			newGrid.conduitSet = oldSet;
			newGrid.regenerating = true;
			newGrid.markSweep();
		}
		if (nodeSet.isEmpty())
			HANDLER.removeGrid(this);
		else
			HANDLER.addGrid(this);
		regenerating = false;
	}

	public void destroyGrid() {
		master = null;
		regenerating = true;
		for (TileEntityRedNetEnergy curCond : nodeSet)
			destroyNode(curCond);
		for (TileEntityRedNetEnergy curCond : conduitSet)
			destroyConduit(curCond);
		HANDLER.removeGrid(this);
	}

	public void destroyNode(TileEntityRedNetEnergy cond) {
		cond.energyForGrid = getNodeShare(cond);
		cond._grid = null;
	}

	public void destroyConduit(TileEntityRedNetEnergy cond) {
		cond._grid = null;
	}

	@Override
	public void doGridPreUpdate() {
		if (regenerating)
			return;
		if (nodeSet.isEmpty()) {
			HANDLER.removeGrid(this);
			return;
		}
		EnergyStorage tank = storage;
		if (tank.getEnergyStored() >= tank.getMaxEnergyStored())
			return;
		ForgeDirection[] directions = ForgeDirection.VALID_DIRECTIONS;

		for (TileEntityRedNetEnergy cond : nodeSet)
			for (int i = 6; i --> 0; )
				cond.extract(directions[i], tank);
	}

	@Override
	public void doGridUpdate() {
		if (regenerating)
			return;
		if (nodeSet.isEmpty()) {
			HANDLER.removeGrid(this);
			return;
		}
		EnergyStorage storage = this.storage;
		if (storage.getEnergyStored() <= 0)
			return;
		ForgeDirection[] directions = ForgeDirection.VALID_DIRECTIONS;
		int size = nodeSet.size();
		int toDistribute = storage.getEnergyStored() / size;
		int sideDistribute = toDistribute / 6;

		distribution = toDistribute;
		distributionSide = sideDistribute;

		int overflow = overflowSelector;
		TileEntityRedNetEnergy master = nodeSet.get(overflow);
		if (size > 1)
			overflowSelector = (overflow + 1) % size;

		if (sideDistribute > 0) for (TileEntityRedNetEnergy cond : nodeSet)
			if (cond != master) {
				int e = 0;
				for (int i = 6; i --> 0; )
					e += cond.transfer(directions[i], sideDistribute);
				if (e > 0) storage.modifyEnergyStored(-e);
			}

		toDistribute += storage.getEnergyStored() % size;
		sideDistribute = toDistribute / 6;

		if (sideDistribute > 0) {
			int e = 0;
			for (int i = 6; i --> 0; )
				e += master.transfer(directions[i], sideDistribute);
			if (e > 0) storage.modifyEnergyStored(-e);
		} else if (toDistribute > 0) {
			int e = 0;
			for (int i = 6; i --> 0 && e < toDistribute; )
				e += master.transfer(directions[i], toDistribute - e);
			if (e > 0) storage.extractEnergy(e, false);
		}
	}

	public boolean canMergeGrid(RedstoneEnergyNetwork otherGrid) {
		if (otherGrid == null) return false;
		return true;
	}

	public void mergeGrid(RedstoneEnergyNetwork grid) {
		if (grid == this) return;
		boolean r = regenerating || grid.regenerating;
		grid.destroyGrid();
		if (!regenerating & r)
			regenerate();

		regenerating = true;
		for (TileEntityRedNetEnergy cond : grid.conduitSet)
			addConduit(cond);
		regenerating = r;

		grid.conduitSet.clear();
		grid.nodeSet.clear();
	}

	public void nodeAdded(TileEntityRedNetEnergy cond) {
		if (master == null) {
			master = cond;
			HANDLER.addGrid(this);
		}
		rebalanceGrid();
		storage.modifyEnergyStored(cond.energyForGrid);
	}

	public void nodeRemoved(TileEntityRedNetEnergy cond) {
		rebalanceGrid();
		if (cond == master) {
			if (nodeSet.isEmpty()) {
				master = null;
				HANDLER.removeGrid(this);
			} else {
				master = nodeSet.get(0);
			}
		}
	}

	public boolean conduitAdded(TileEntityRedNetEnergy cond) {
		if (cond._grid != null) {
			if (cond._grid != this) {
				conduitSet.remove(cond);
				if (canMergeGrid(cond._grid)) {
					mergeGrid(cond._grid);
				} else
					return false;
			} else
				return false;
		} else
			cond.setGrid(this);
		return true;
	}

	public void rebalanceGrid() {
		storage.setCapacity(nodeSet.size() * STORAGE);
	}

	public int getConduitCount() {
		return conduitSet.size();
	}

	public int getNodeCount() {
		return nodeSet.size();
	}

	@Override
	public String toString() {
		return "RedstoneEnergyNetwork@" + Integer.toString(hashCode()) + "; master:" + master +
				"; regenerating:" + regenerating + "; isTicking:" + HANDLER.isGridTicking(this);
	}
}
