package gamePackage;

/**
 * Chicken class, extends Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Chicken extends Animal {
	
	/**
	 * Constructer; gets attributes from parent Animal
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Chicken(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	/**
	 * Constructer; gets attributes from parent Animal
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Chicken() {
		super("Chicken", 5, 70, 50);
	}
	
}
