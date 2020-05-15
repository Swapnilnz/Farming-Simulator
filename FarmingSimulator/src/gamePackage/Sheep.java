package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Sheep extends Animal {
	// Constructor for Sheep
	public Sheep(String AnimalType, int weight, double happiness) {
		super(AnimalType, weight, happiness);
	}
	
	public Sheep() {
		super("Sheep", 60, 0.8);
	}
	
	public void shear(GameEnvironment game) {
		game.farm.increaseFarmMoney(8);
	}

}
