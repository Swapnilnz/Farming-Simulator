package gamePackage;
import java.util.Random;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 * COULD BE A METHOD??
 *
 */
public class RandomEvent {
	private Random rnd;
	public int chanceValue = 25;
	private boolean occurs = false;
	public String event = "None";
	
	public RandomEvent(GameEnvironment game) {
		rnd = new Random();
		int temp = (int) (Math.random() * 10);
		if (temp >= chanceValue) {
			occurs = true;

		}
		if (occurs) {
			event = whichEvent(rnd);
		}
	}
	
	private String whichEvent(Random rnd) {
		int num = rnd.nextInt(4);
		String result = new String();
		switch (num) {
			case 0:
				result = "Sun God's Blessing";
				break;
				
			case 1:
				result = "County Fair";
				break;
				
			case 2:
				result = "Drought";
				break;
				
			case 3:
				result = "Broken Fence";
				break;				
			
		}
		return result;
	}
	
	/**
	 * The sun gods have blessed the player, all crops are now harvestable
	 * @param game game
	 */
	public void sunGodsBlessing(GameEnvironment game) {
		System.out.println("The Sun God has blessed your farm, all your crops are now harvestable!");
		for (Crop crop: game.farm.getCropList()) {
			crop.setDaysTillHarvest(0);
		}
	}

	/**
	 * @return the rnd
	 */
	public Random getRnd() {
		return rnd;
	}

	/**
	 * @param rnd the rnd to set
	 */
	public void setRnd(Random rnd) {
		this.rnd = rnd;
	}

	/**
	 * @return the chanceValue
	 */
	public int getChanceValue() {
		return chanceValue;
	}

	/**
	 * @param chanceValue the chanceValue to set
	 */
	public void setChanceValue(int chanceValue) {
		this.chanceValue = chanceValue;
	}

	/**
	 * @return the occurs
	 */
	public boolean isOccurs() {
		return occurs;
	}

	/**
	 * @param occurs the occurs to set
	 */
	public void setOccurs(boolean occurs) {
		this.occurs = occurs;
	}

	/**
	 * @return the event
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	
}
