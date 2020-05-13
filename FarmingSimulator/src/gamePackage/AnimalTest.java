package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void testAnimalChicken() {
		Chicken item = new Chicken();
		assertEquals((String)"Chicken", (String)item.getAnimalType());
		assertEquals((int)5, (int)item.getWeight());
		assertEquals((double)0.7, (double)item.getHappiness());
	}
	@Test
	void testAnimalSheep() {
		Sheep item = new Sheep();
		assertEquals((String)"Sheep", (String)item.getAnimalType());
		assertEquals((int)60, (int)item.getWeight());
		assertEquals((double)0.8, (double)item.getHappiness());
	}
	@Test
	void testAnimalPig() {
		Pig item = new Pig();
		assertEquals((String)"Pig", (String)item.getAnimalType());
		assertEquals((int)200, (int)item.getWeight());
		assertEquals((double)0.8, (double)item.getHappiness());
	} 
	void testAnimalCow() {
		Cow item = new Cow();
		assertEquals((String)"Cow", (String)item.getAnimalType());
		assertEquals((int)500, (int)item.getWeight());
		assertEquals((double)0.8, (double)item.getHappiness());
	}
}
