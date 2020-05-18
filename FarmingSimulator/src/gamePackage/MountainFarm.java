package gamePackage;

/**
 * Mountain farm; subclass of farm
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class MountainFarm extends Farm {
	
	/**
	 * Constructer, initialises farm type and growth rate using super class Farm
	 * @param farmType
	 * @param growthRate
	 */
	public MountainFarm(String farmType, int growthRate) {
		super(farmType, growthRate);
	}
	
	/**
	 * Constructer, initialises farm type and growth rate using super class Farm
	 */
	public MountainFarm() {
		super("Mountain Farm", 2);
	}

}
