package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gamePackage.Cow;
import gamePackage.Crop;
import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.MountainFarm;

class GameEnvironmentTest {
	
	private GameEnvironment game;
	Farm farm;
	JFrame window;
	Crop apple;
	Crop avocado;

	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		farm = new MountainFarm();
		game.farm = farm;
		game.setNumDays(5);
		apple = new Crop("Apple", 1);
		game.farm.cropInventory.put("Apple", 1);
		game.farm.cropList.add(apple);
		avocado = new Crop("Avocado", 1);
		game.farm.cropInventory.put("Avocado", 1);
		game.farm.cropList.add(avocado);
		
	}
	@Test
	void viewFarmTest() {
		game.viewFarm(window);
		assertTrue(game.test);
	}
	
	@Test
	void viewFarmMoneyTest() {
		game.viewFarmMoney(window);
		assertTrue(game.test);
	}
	
	@Test
	void visitToolMarketTest() {
		game.visitToolMarket(window);
		assertTrue(game.test);
	}
	
	@Test
	void visitCropMarketTest() {
		game.visitCropMarket(window);
		assertTrue(game.test);
	}
	
	@Test
	void visitAnimalMarketTest() {
		game.visitAnimalMarket(window);
		assertTrue(game.test);
	}
	
	@Test
	void nextDayTest() {
		game.setNumActions(0);
		game.nextDay(window, false);
		assertTrue(game.test);
		game.setNumActions(2);
		game.setNumDays(2);
		game.nextDay(window, true);
		assertTrue(game.test);
		game.setNumActions(2);
		game.nextDay(window, false);
		assertTrue(game.test);
		
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
	void tendToCropTest1() {
		farm.addToItemList("Watering Can");
		game.tendToCrops(window, "Apple");
		assertEquals(0, apple.getDaysTillHarvest());
		game.tendToCrops(window, "Avocado");
		assertEquals(4, avocado.getDaysTillHarvest());
	}
	
	@Test
	void tendToCropTest2() {
		game.tendToCrops(window, "Apple");
		assertEquals(0, apple.getDaysTillHarvest());
		game.tendToCrops(window, "Avocado");

		assertEquals(6, avocado.getDaysTillHarvest());

	}

	@Test
	void feedAnimals() {
		Cow cow = new Cow(1);
		game.farm.animalList.add(cow);
		game.farm.setAnimalFeed(5);
		game.feedAnimals(window);
		assertEquals(75, cow.getHealth());

		
	}
	
	@Test
	void playWithAnimalsTest() {
		Cow cow = new Cow(1);
		game.farm.animalList.add(cow);
		game.playWithAnimals(window);
		assertEquals(90, cow.getHappiness());
		
	}
	
	@Test
	void harvestCropsTest() {
		Crop avocado = new Crop("Avocado", 2);
		avocado.setDaysTillHarvest(0);
		farm.cropList.add(avocado);
		game.harvestCrops(window);
		assertEquals(144, farm.getFarmMoney());
		assertEquals(2, farm.cropList.size());
	}
	
	@Test
	void tendToFarmLandTest() {
		assertEquals(false, farm.isMaintained());
		game.tendToFarmLand(window);
		assertEquals(true, farm.isMaintained());
	}
	
	@Test
	void getTotalMoneyTest() {
		farm.addCowToFarm();
		assertEquals(55, game.getTotalMoney());
	}
	
	@Test
	void endDayTest() {
		farm.addCowToFarm();
		farm.addSheepToFarm();
		Crop avo = new Crop("Avocado", 1);
		farm.cropList.add(avo);
		farm.addToItemList("Milk Master");
		farm.addToItemList("Shear Master");
		farm.addToItemList("Harvester");
		game.endDay();
		assertEquals(214, farm.getFarmMoney());
		assertEquals(40, farm.animalList.get(0).getHappiness());
		assertEquals(30, farm.animalList.get(0).getHealth());
	}
	
	@Test
	void calculateScoreTest() {
		farm.addCowToFarm();
		game.gameDuration = 5;
		assertEquals(50398, game.calculateScore());
		
	}
}
