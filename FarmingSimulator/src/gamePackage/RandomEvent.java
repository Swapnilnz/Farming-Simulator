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
	public int chanceValue = 50;
	private boolean occurs = false;
	
	public RandomEvent() {
		rnd = new Random();
		float temp = (float) Math.random();
		if (temp >= chanceValue) {
			occurs = true;

		}
		if (occurs) {
			String event = whichEvent(rnd);
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
	
}
