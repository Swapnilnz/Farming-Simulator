package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Pig extends Animal {
	// Constructor for pig
	public Pig(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	public Pig() {
		super("Pig", 200, 80, 50);
	}
	


}
