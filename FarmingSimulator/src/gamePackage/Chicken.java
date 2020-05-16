package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Chicken extends Animal {
	// Constructor for chicken
	public Chicken(String AnimalType, int weight, int happiness) {
		super(AnimalType, weight, happiness);
	}
	
	public Chicken() {
		super("Chicken", 5, 70);
	}
	
}
