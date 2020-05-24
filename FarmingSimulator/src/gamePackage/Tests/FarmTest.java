package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gamePackage.DesertFarm;
import gamePackage.MountainFarm;
import gamePackage.PlainsFarm;
import gamePackage.SwampFarm;

class TestFarm {
	/*
	 * First check Mountain Farm
	 */
	@Test
	public void nameTest() {
		MountainFarm item = new MountainFarm();
		assertEquals((String)"Mountain Farm", (String)item.getFarmType());
	}
	
	@Test
	public void startMoneyTest() {
		MountainFarm item = new MountainFarm();
		assertEquals((int)80, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnMountainFarm() {
		MountainFarm item = new MountainFarm();
		assertEquals((int)2, (int)item.getGrowthRate());
	}
	/*
	 * Second check PlainsFarm
	 */
	@Test
	public void nameTestPlainsFarm() {
		PlainsFarm item = new PlainsFarm();
		assertEquals((String)"Plains Farm", (String)item.getFarmType());
	}
	
	@Test
	public void startMoneyTestPlainsFarm() {
		PlainsFarm item = new PlainsFarm();
		assertEquals((int)100, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnPlainsFarm() {
		PlainsFarm item = new PlainsFarm();
		assertEquals((int)3, (int)item.getGrowthRate());
	}
	/*
	 * Third Check SwampFarm
	 */
	@Test
	public void nameTestSwampFarm() {
		SwampFarm item = new SwampFarm();
		assertEquals((String)"Swamp Farm", (String)item.getFarmType());
	}
	
	@Test
	public void startMoneyTestSwampFarm() {
		SwampFarm item = new SwampFarm();
		assertEquals((int)50, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnSwampFarm() {
		SwampFarm item = new SwampFarm();
		assertEquals((int)1, (int)item.getGrowthRate());
	}
	/*
	 * Fourth Check DesertFarm
	 */
	@Test
	public void nameTestDesertFarm() {
		DesertFarm item = new DesertFarm();
		assertEquals((String)"Desert Farm", (String)item.getFarmType());
	}
	
	@Test
	public void startMoneyTestDesertFarm() {
		DesertFarm item = new DesertFarm();
		assertEquals((int)30, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnDesertFarm() {
		DesertFarm item = new DesertFarm();
		assertEquals((int)1, (int)item.getGrowthRate());
	}
	/*
	 * The above shows they all work the same! Now for a money check!
	 */
	@Test
	public void moneyCheck() {
		MountainFarm item = new MountainFarm();
		item.decreaseFarmMoney(50);
		item.increaseFarmMoney(100);
		assertEquals((int)130, (int)item.getFarmMoney());
	}
}
