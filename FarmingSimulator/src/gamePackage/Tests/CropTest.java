/**
 * 
 */
package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gamePackage.Crop;
import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.PlainsFarm;

/**
 * Tests class Crop
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class CropTest {
	
	GameEnvironment game;
	Farm farm;
	
	@BeforeEach
	void init() {
		game = new GameEnvironment();
		farm = new PlainsFarm();
		game.setFarm(farm);
	}

	@Test
	void avocadoTest() {
		Crop avocado = new Crop("Avocado", 1);
		assertTrue("Avocado 1".equals(avocado.toString()));

		assertEquals(8, avocado.getPurchasePrice());
		assertEquals(64, avocado.getSellPrice());
		assertEquals(8, avocado.getDaysTillHarvest());
		assertEquals("Avocado", avocado.getCropType());

		avocado.setDaysTillHarvest(0);
		farm.cropList.add(avocado);
		avocado.harvest(game);
		assertEquals(164, farm.getFarmMoney());
		
		
	}
	
	@Test
	void cornTest() {
		Crop corn = new Crop("Corn", 1);
		assertTrue("Corn 1".equals(corn.toString()));

		assertEquals(5, corn.getPurchasePrice());
		assertEquals(30, corn.getSellPrice());
		assertEquals(6, corn.getDaysTillHarvest());
		assertEquals("Corn", corn.getCropType());

		corn.setDaysTillHarvest(0);
		farm.cropList.add(corn);
		corn.harvest(game);
		assertEquals(130, farm.getFarmMoney());
		
		
	}
	
	@Test
	void wheatTest() {
		Crop wheat = new Crop("Wheat", 1);
		assertTrue("Wheat 1".equals(wheat.toString()));

		assertEquals(4, wheat.getPurchasePrice());
		assertEquals(16, wheat.getSellPrice());
		assertEquals(4, wheat.getDaysTillHarvest());
		assertEquals("Wheat", wheat.getCropType());

		wheat.setDaysTillHarvest(0);
		farm.cropList.add(wheat);
		wheat.harvest(game);
		assertEquals(116, farm.getFarmMoney());
		
		
	}
	
	@Test
	void potatoTest() {
		Crop potato = new Crop("Potato", 1);
		assertTrue("Potato 1".equals(potato.toString()));

		assertEquals(7, potato.getPurchasePrice());
		assertEquals(28, potato.getSellPrice());
		assertEquals(4, potato.getDaysTillHarvest());
		assertEquals("Potato", potato.getCropType());

		potato.setDaysTillHarvest(0);
		farm.cropList.add(potato);
		potato.harvest(game);
		assertEquals(128, farm.getFarmMoney());
		
		
	}
	
	@Test
	void carrotTest() {
		Crop carrot = new Crop("Carrot", 1);
		assertTrue("Carrot 1".equals(carrot.toString()));

		assertEquals(10, carrot.getPurchasePrice());
		assertEquals(30, carrot.getSellPrice());
		assertEquals(3, carrot.getDaysTillHarvest());
		assertEquals("Carrot", carrot.getCropType());

		carrot.setDaysTillHarvest(0);
		farm.cropList.add(carrot);
		carrot.harvest(game);
		assertEquals(130, farm.getFarmMoney());
		
		
	}
	
	@Test
	void appleTest() {
		Crop apple = new Crop("Apple", 1);
		assertTrue("Apple 1".equals(apple.toString()));

		assertEquals(6, apple.getPurchasePrice());
		assertEquals(12, apple.getSellPrice());
		assertEquals(2, apple.getDaysTillHarvest());
		assertEquals("Apple", apple.getCropType());

		apple.setDaysTillHarvest(0);
		farm.cropList.add(apple);
		apple.harvest(game);
		assertEquals(112, farm.getFarmMoney());
		
		
	}
	
	

}
