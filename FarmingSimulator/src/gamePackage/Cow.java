package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Cow extends Animal{
	// Constructor for Cow
	public Cow(String AnimalType, int weight, int happiness) {
		super(AnimalType, weight, happiness);
	}
	
	public Cow() {
		super("Cow", 500, 80);
	}
	
	public void milk(GameEnvironment game) {
		game.farm.increaseFarmMoney(15);
	}
}
