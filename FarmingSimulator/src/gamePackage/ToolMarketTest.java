package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		market.buyHarvester(game, window);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Harvester"));
	}
	
	@Test
	void buyWateringCanTest() {
		market.buyWateringCan(game, window);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Watering Can"));
	}
	
	@Test
	void buyAnimalStatueTest() {
		market.buyAnimalStatue(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Animal Statue"));
	}
	
	@Test
	void buyMilkMasterTest() {
		market.buyMilkMaster(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Milk Master"));
	}

	@Test
	void buyShearMasterTest() {
		market.buyShearMaster(game, window);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Shear Master"));
	}
	
	@Test
	void buyTeleportationPadTest() {
		market.buyTeleportationPad(game, window);
		assertEquals(400, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Teleportation Pad"));
		game.nextDay(window, true);
		assertEquals(3, game.getNumActions());
	}
	

}
