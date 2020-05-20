package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameEnvironmentTest {
	
	private GameEnvironment game;
	Farm farm;

	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		farm = new Farm("Mountain", 1);
		game.farm = farm;
		
	}
	
	@Test
	void farmerNameTest() {
		assertTrue(game.farmerNameChecker("Dave"));
		assertTrue(game.farmerNameChecker("God"));
		assertTrue(game.farmerNameChecker("abcdefghijklmno"));
		assertFalse(game.farmerNameChecker("Dave1"));
		assertFalse(game.farmerNameChecker("abcdefghijklmnop"));
		assertFalse(game.farmerNameChecker("ab"));
		assertFalse(game.farmerNameChecker("12345"));
	}

	@Test
	void feedAnimals() {
		Cow cow = new Cow();
		game.farm.animalList.add(cow);
		game.farm.setAnimalFeed(5);
		game.feedAnimals(game);
		assertEquals(75, cow.getHealth());
		
	}
	
	@Test
	void playWithAnimalsTest() {
		Cow cow = new Cow();
		game.farm.animalList.add(cow);
		game.playWithAnimals(game);
		assertEquals(90, cow.getHappiness());
		
	}
	
	@Test
	void harvestCropsTest() {
		Crop avocado = new Crop("Avocado");
		avocado.setDaysTillHarvest(0);
		farm.cropList.add(avocado);
		game.harvestCrops(game);
		assertEquals(114, farm.getFarmMoney());
		assertEquals(0, farm.cropList.size());
	}
	
	@Test
	void tendToFarmLandTest() {
		assertEquals(false, farm.isMaintained());
		game.tendToFarmLand(game);
		assertEquals(true, farm.isMaintained());
	}
	
	@Test
	void getTotalMoneyTest() {
		farm.addCowToFarm();
		assertEquals(55, game.getTotalMoney(game));
	}
	
	@Test
	void endDayTest() {
		farm.addCowToFarm();
		farm.addSheepToFarm();
		Crop avo = new Crop("Avocado");
		farm.cropList.add(avo);
		farm.addToItemList("Milk Master");
		farm.addToItemList("Shear Master");
		farm.addToItemList("Harvester");
		game.endDay(game);
		assertEquals(187, farm.getFarmMoney());
		assertEquals(40, farm.animalList.get(0).getHappiness());
		assertEquals(30, farm.animalList.get(0).getHealth());
	}
	
	@Test
	void calculateScoreTest() {
		farm.addCowToFarm();
		game.gameDuration = 5;
		assertEquals(31732, game.calculateScore(game));
		
	}
}
