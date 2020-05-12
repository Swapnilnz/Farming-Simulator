package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FarmTest {
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
		assertEquals((int)100, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnMountainFarm() {
		MountainFarm item = new MountainFarm();
		assertEquals((double)1.0, (double)item.getGrowthRate());
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
		assertEquals((double)4.0, (double)item.getGrowthRate());
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
		assertEquals((int)100, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnSwampFarm() {
		SwampFarm item = new SwampFarm();
		assertEquals((double)2.0, (double)item.getGrowthRate());
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
		assertEquals((int)100, (int)item.getFarmMoney());
	}
	
	@Test
	public void GrowthRateOnDesertFarm() {
		DesertFarm item = new DesertFarm();
		assertEquals((double)0.5, (double)item.getGrowthRate());
	}
	/*
	 * The above shows they all work the same! Now for a money check!
	 */
	@Test
	public void moneyCheck() {
		MountainFarm item = new MountainFarm();
		item.decreaseFarmMoney(50);
		item.increaseFarmMoney(100);
		assertEquals((int)150, (int)item.getFarmMoney());
	}
}
