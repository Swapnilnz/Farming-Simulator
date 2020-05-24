package gamePackage;

/**
 * Sheep class, subclass of Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Sheep extends Animal {

	
	/**
	 * Constructer, initialises sheep's type, weight, happiness, health using superclass Animal
	 * Weight: 300
	 * Happiness: 80
	 * Health: 50
	 * @param num allocated number for sheep
	 */
	public Sheep(int num) {
		super("Sheep", 300, 80, 50, num);
	}
	
	/**
	 * Shears the sheep, adding money to farm
	 * @param game main game
	 */
	void shear(GameEnvironment game) {
		game.farm.increaseFarmMoney(5);
	}

}
