package gamePackage;

/**
 * Cow animal type, extends Animal
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class Cow extends Animal{
	
	/**
	 * Constructor for cow, uses superclass to initialise variables
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Cow(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	/**
	 * Constructor for cow, uses superclass to initialise variables
	 * @param AnimalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Cow() {
		super("Cow", 500, 80, 50);
	}
	
	/**
	 * Milks cow, adds money to farm money
	 * @param game
	 */
	public void milk(GameEnvironment game) {
		game.farm.increaseFarmMoney(5);
	}
}
