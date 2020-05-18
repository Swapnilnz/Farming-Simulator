package gamePackage;

/**
 * Swamp farm class; subclass of Farm
 * @author Swapnil
 *
 */
public class SwampFarm extends Farm {
	
	/**
	 * Constructer, uses superclass to initialise farm variables
	 * @param farmType
	 * @param growthRate
	 */
	public SwampFarm(String farmType, int growthRate) {
		super(farmType, growthRate);
	}
	
	/**
	 * Constructer, uses superclass to initialise farm variables
	 */
	public SwampFarm() {
		super("Swamp Farm", 1);
	}

}
