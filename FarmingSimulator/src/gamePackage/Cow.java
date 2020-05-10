package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Cow extends Animal{
	// Constructor for Cow
	public Cow(String AnimalType, int weight, double happiness) {
		super(AnimalType, weight, happiness);
	}
	
	public Cow() {
		super("Cow", 500, 0.8);
	}
	

}
