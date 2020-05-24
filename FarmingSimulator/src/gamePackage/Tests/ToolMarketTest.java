package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.SwampFarm;
import gamePackage.ToolMarket;

/**
 * Tests class ToolMarket on logic
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class ToolMarketTest {

	GameEnvironment game;
	Farm farm;
	ToolMarket market;
	JFrame window;
	
	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		game.setNumDays(5);
		farm = new SwampFarm();
		game.farm = farm;
		market = new ToolMarket();
		farm.setFarmMoney(500);
		window = new JFrame();

	}
	
	@Test
	void buyHarvesterTest() {
		farm.setFarmMoney(0);
		market.buyHarvester(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyHarvester(game, window);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Harvester"));
		market.buyHarvester(game, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyWateringCanTest() {
		farm.setFarmMoney(0);
		market.buyWateringCan(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyWateringCan(game, window);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Watering Can"));
		market.buyWateringCan(game, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyAnimalStatueTest() {
		farm.setFarmMoney(0);
		market.buyAnimalStatue(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyAnimalStatue(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Animal Statue"));
		market.buyAnimalStatue(game, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyMilkMasterTest() {
		farm.setFarmMoney(0);
		market.buyMilkMaster(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyMilkMaster(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Milk Master"));
		market.buyMilkMaster(game, window);
		assertTrue(market.test);
	}

	@Test
	void buyShearMasterTest() {
		farm.setFarmMoney(0);
		market.buyShearMaster(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyShearMaster(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Shear Master"));
		market.buyShearMaster(game, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyTeleportationPadTest() {
		farm.setFarmMoney(0);
		market.buyTeleportationPad(game, window);
		assertTrue(market.test);
		farm.setFarmMoney(500);
		market.buyTeleportationPad(game, window);
		assertEquals(400, farm.getFarmMoney());
		assertEquals(true, farm.getItemList().contains("Teleportation Pad"));
		game.nextDay(window, true);
		assertEquals(3, game.getNumActions());
	}
	

}
