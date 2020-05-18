package gamePackage;

/**
 * Sheep class, subclass of Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Sheep extends Animal {
	
	/**
	 * Constructer, initialises sheep's type, weight, happiness, health using superclass Animal
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Sheep(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	/**
	 * Constructer, initialises sheep's type, weight, happiness, health using superclass Animal
	 */
	public Sheep() {
		super("Sheep", 60, 80, 50);
	}
	
	/**
	 * Shears the sheep, adding money to farm
	 * @param game
	 */
	public void shear(GameEnvironment game) {
		game.farm.increaseFarmMoney(8);
	}

}
