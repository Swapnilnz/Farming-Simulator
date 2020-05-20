package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests Animal class
 * @author Swapnil
 *
 */
class AnimalTest {
	
	/**
	 * Tests chicken attributes
	 */
	@Test
	void testAnimalChicken() {
		Chicken item = new Chicken();
		assertEquals((String)"Chicken", (String)item.getAnimalType());
		assertEquals((int)5, (int)item.getWeight());
		assertEquals((int)70, (int)item.getHappiness());
	}
	
	/**
	 * Tests sheep attributes
	 */
	@Test
	void testAnimalSheep() {
		Sheep item = new Sheep();
		assertEquals((String)"Sheep", (String)item.getAnimalType());
		assertEquals((int)60, (int)item.getWeight());
		assertEquals((int)80, (int)item.getHappiness());
	}
	
	/**
	 * Tests pig attributes
	 */
	@Test
	void testAnimalPig() {
		Pig item = new Pig();
		assertEquals((String)"Pig", (String)item.getAnimalType());
		assertEquals((int)200, (int)item.getWeight());
		assertEquals((double)80, (int)item.getHappiness());
	} 
	
	/**
	 * Tests cow attributes
	 */
	@Test
	void testAnimalCow() {
		Cow item = new Cow();
		assertEquals((String)"Cow", (String)item.getAnimalType());
		assertEquals((int)500, (int)item.getWeight());
		assertEquals((int)60, (int)item.getHappiness());
	}
	
	/*
	 * Want to check it decreases the correct amount each iteration.
	 * - and that it doesn't go lower than 0
	 */
	@Test
	void testAnimalHappinessDecreases() {
		Chicken item = new Chicken();
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
		Chicken item = new Chicken();
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
		Chicken item = new Chicken();
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
		Chicken item = new Chicken();
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
