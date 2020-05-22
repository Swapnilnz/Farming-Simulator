package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToolMarketTest {

	GameEnvironment game;
	Farm farm;
	ToolMarket market;
	
	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		farm = new Farm("Swamp", 1);
		game.farm = farm;
		market = new ToolMarket();
		farm.setFarmMoney(500);

	}
	
	@Test
	void buyHarvesterTest() {
		market.buyHarvester(game);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Harvester"));
	}
	
	@Test
	void buyWateringCanTest() {
		market.buyWateringCan(game);
		assertEquals(450, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Watering Can"));
	}
	
	@Test
	void buyAnimalStatueTest() {
		market.buyAnimalStatue(game);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Animal Statue"));
	}
	
	@Test
	void buyMilkMasterTest() {
		market.buyMilkMaster(game);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Milk Master"));
	}

	@Test
	void buyShearMasterTest() {
		market.buyShearMaster(game);
		assertEquals(440, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Shear Master"));
	}
	
	@Test
	void buyTeleportationPadTest() {
		market.buyTeleportationPad(game);
		assertEquals(400, farm.getFarmMoney());
		assertEquals(true, farm.itemList.contains("Teleportation Pad"));
		assertEquals(3, game.getNumActions());
	}
	

}
