package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gamePackage.Chicken;
import gamePackage.Cow;
import gamePackage.Pig;
import gamePackage.Sheep;

/**
 * Tests class Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class AnimalTest {
	
	/**
	 * Tests chicken attributes
	 */
	@Test
	void testAnimalChicken() {
		Chicken item = new Chicken(1);
		assertEquals((String)"Chicken", (String)item.getAnimalType());
		assertEquals((int)5, (int)item.getWeight());
		assertEquals((int)70, (int)item.getHappiness());
		assertTrue("Chicken 1".equals(item.toString()));
	}
	
	/**
	 * Tests sheep attributes
	 */
	@Test
	void testAnimalSheep() {
		Sheep item = new Sheep(4);
		assertEquals((String)"Sheep", (String)item.getAnimalType());
		assertEquals((int)300, (int)item.getWeight());
		assertEquals((int)80, (int)item.getHappiness());
		assertTrue("Sheep 4".equals(item.toString()));

	}
	
	/**
	 * Tests pig attributes
	 */
	@Test
	void testAnimalPig() {
		Pig item = new Pig(2);
		assertEquals((String)"Pig", (String)item.getAnimalType());
		assertEquals((int)200, (int)item.getWeight());
		assertEquals((double)80, (int)item.getHappiness());
		assertTrue("Pig 2".equals(item.toString()));

	} 
	
	/**
	 * Tests cow attributes
	 */
	@Test
	void testAnimalCow() {
		Cow item = new Cow(1);
		assertEquals((String)"Cow", (String)item.getAnimalType());
		assertEquals((int)500, (int)item.getWeight());
		assertEquals((int)60, (int)item.getHappiness());
		assertTrue("Cow 1".equals(item.toString()));

	}
	
	/*
	 * Want to check it decreases the correct amount each iteration.
	 * - and that it doesn't go lower than 0
	 */
	@Test
	void testAnimalHappinessDecreases() {
		Chicken item = new Chicken(1);
		item.decreaseHappiness();
		item.decreaseHappiness();
		assertEquals((int)30, (int)item.getHappiness());
		for (int i=0; i<100; i++) {
			item.decreaseHappiness();
		}
		assertEquals((int)0, (int)item.getHappiness());
	}
	
	/*
	 * Want to check it increases the correct amount each iteration.
	 * - and that it doesn't go above 100
	 */
	@Test
	void testAnimalHappinessIncreases() {
		Chicken item = new Chicken(1);
		item.increaseHappiness();
		assertEquals((int)100, (int)item.getHappiness());
		item.increaseHappiness();
		assertEquals((int)100, (int)item.getHappiness());
		for (int i=0; i<100; i++) {
			item.increaseHappiness();
		}
		assertEquals((int)100, (int)item.getHappiness());
	}
	
	/**
	 * Test health decreases, shouldn't go below 0
	 */
	@Test
	void testAnimalHealthinessDecreases() {
		Chicken item = new Chicken(1);
		item.decreaseHealth();
		item.decreaseHealth();
		assertEquals((int)10, (int)item.getHealth());
		for (int i=0; i<100; i++) {
			item.decreaseHealth();
		}
		assertEquals((int)0, (int)item.getHealth());
	}

	/**
	 * Test health increases, shouldn't be above 100
	 */
	@Test
	void testAnimalHealthinessIncreases() {
		Chicken item = new Chicken(1);
		item.increaseHealth();
		assertEquals((int)75, (int)item.getHealth());
		item.increaseHealth();
		assertEquals((int)100, (int)item.getHealth());
		for (int i=0; i<100; i++) {
			item.increaseHealth();
		}
		assertEquals((int)100, (int)item.getHealth());
	}
}
