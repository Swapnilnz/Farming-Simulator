package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Chicken extends Animal {
	// Constructor for chicken
	public Chicken(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	public Chicken() {
		super("Chicken", 5, 70, 50);
	}
	
}
