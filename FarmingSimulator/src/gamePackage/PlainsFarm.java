package gamePackage;

/**
 * Plains farm class; subclass of Farm
 * @author Swapnil
 *
 */
public class PlainsFarm extends Farm {
	
	/**
	 * Constructer, uses superclass to initialise farm variables
	 * @param farmType
	 * @param growthRate
	 */
	public PlainsFarm(String farmType, int growthRate) {
		super(farmType, growthRate);
	}
	
	/**
	 * Constructer, uses superclass to initialise farm variables
	 */
	public PlainsFarm() {
		super("Plains Farm", 2);
	}

}
