package gamePackage;

/**
 * Sheep class, subclass of Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */

class Sheep extends Animal {

	
	/**
	 * Constructer, initialises sheep's type, weight, happiness, health using superclass Animal
	 */
	public Sheep(int num) {
		super("Sheep", 60, 80, 50, num);
	}
	
	/**
	 * Shears the sheep, adding money to farm
	 * @param game game
	 */
	void shear(GameEnvironment game) {
		game.farm.increaseFarmMoney(8);
	}

}
