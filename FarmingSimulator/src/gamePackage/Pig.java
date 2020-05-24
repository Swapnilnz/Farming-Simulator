package gamePackage;

/**
 * Pig class, subclass of Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class Pig extends Animal {
	
	/**
	 * Constructer, uses superclass to initialise pig attributes
	 * Weight: 200
	 * Happiness: 80
	 * Health: 50
	 * @param num allocated number of pig
	 */
	public Pig(int num) {
		super("Pig", 200, 80, 50, num);
	}
	


}
