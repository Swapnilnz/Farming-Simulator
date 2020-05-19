package gamePackage;

/**
 * Cow animal type, extends Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class Cow extends Animal{
	
	
	
	/**
	 * Constructor for cow, uses superclass to initialise variables
	 */
	public Cow() {
		super("Cow", 500, 80, 50);
	}
	
	/**
	 * Milks cow, adds money to farm money
	 * @param game game
	 */
	public void milk(GameEnvironment game) {
		game.farm.increaseFarmMoney(5);
	}
}
