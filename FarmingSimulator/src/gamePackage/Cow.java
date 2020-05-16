package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Cow extends Animal{
	// Constructor for Cow
	public Cow(String AnimalType, int weight, int happiness, int health) {
		super(AnimalType, weight, happiness, health);
	}
	
	public Cow() {
		super("Cow", 500, 80, 50);
	}
	
	public void milk(GameEnvironment game) {
		game.farm.increaseFarmMoney(15);
	}
}
