package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests class CropMarket
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class CropMarketTest {
	
	GameEnvironment game;
	Farm farm;
	CropMarket market;
	JFrame window;
	
	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		farm = new DesertFarm();
		game.farm = farm;
		market = new CropMarket();
		window = new JFrame();
	}

	@Test
	void buyAvocadoTest() {
		market.buyAvocado(game, 1, window);
		assertEquals(42, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Avocado"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Avocado") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}
	
	@Test
	void buyCornTest() {
		market.buyCorn(game, 1, window);
		assertEquals(45, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Corn"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Corn") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}
	
	@Test
	void buyWheatTest() {
		market.buyWheat(game, 1, window);
		assertEquals(46, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Wheat"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Wheat") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}
	
	@Test
	void buyPotatoTest() {
		market.buyPotato(game, 1, window);
		assertEquals(43, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Potato"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Potato") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}
	
	@Test
	void buyCarrotTest() {
		market.buyCarrot(game, 1, window);
		assertEquals(40, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Carrot"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Carrot") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}
	
	@Test
	void buyAppleTest() {
		market.buyApple(game, 1, window);
		assertEquals(44, farm.getFarmMoney());
		assertEquals(1, farm.cropInventory.get("Apple"));
		int count = 0;
		for (Crop crop: farm.cropList) {
			if (crop.getCropType() == "Apple") {
				count += 1;
			}
		}
		assertEquals(1, count);
	}

}
