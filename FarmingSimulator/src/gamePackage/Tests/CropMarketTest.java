package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gamePackage.Crop;
import gamePackage.CropMarket;
import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.SwampFarm;

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
		farm = new SwampFarm();
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
		market.buyAvocado(game, 50000, window);
		assertTrue(market.test);
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
		market.buyCorn(game, 50000, window);
		assertTrue(market.test);
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
		market.buyWheat(game, 50000, window);
		assertTrue(market.test);
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
		market.buyPotato(game, 50000, window);
		assertTrue(market.test);
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
		market.buyCarrot(game, 50000, window);
		assertTrue(market.test);
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
		market.buyApple(game, 50000, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyAnimalFeed() {
		market.buyAnimalFeed(game, 1, window);
		assertEquals(45, farm.getFarmMoney());
		assertEquals(1, farm.getAnimalFeed());
		market.buyAnimalFeed(game, 50000, window);
		assertTrue(market.test);
	}

}
