package gamePackage;

/**
 * Pig class, subclass of Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class Pig extends Animal {
	
	/**
	 * Constructer, initialises pig's type, weight, happiness, health using superclass Animal
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Pig(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	/**
	 * Constructer, uses superclass to initialise pig attributes
	 */
	public Pig() {
		super("Pig", 200, 80, 50);
	}
	


}
