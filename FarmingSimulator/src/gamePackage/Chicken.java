package gamePackage;

/**
 * Chicken class, extends Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Chicken extends Animal {
	
	
	
	/**
	 * Constructer; gets attributes from parent Animal
	 * Weight: 5
	 * Happiness: 70
	 * Health: 50
	 */
	public Chicken(int num) {
		super("Chicken", 5, 70, 50, num);
	}
	
}
