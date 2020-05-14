package gamePackage;


public class GameEnvironment {
	protected int numDays;
	protected Farmer farmer;
	protected Farm farm;
	protected String farmName;
	public static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public int numActions;
	public boolean gameFinished = false;
	public boolean adventureRunning = false;
	
	

		
	public void viewFarmStatus(GameEnvironment game) {
		
	}
	
	public void startAdventure(GameEnvironment game) {
		UI numInput = new UI();
		String nonActions = "What would you like to do?\n"
				+ "1. View your farm's crops and animals\n"
				+ "2. View farm money\n"
				+ "3. Visit the County Tool Store\n"
				+ "4. Visit the County Crop Store\n"
				+ "5. Visit the County Animal Store\n"
				+ "6. Move on to the next day";
		String actions = "------------------------\n"
				+ "Or, using an action, you can:\n"
				+ "7. Tend to crops to speed up their growth\n"
				+ "8. Feed farm animals to make them healthier and happier\n"
				+ "9. Play with farm animal to make them happer\n"
				+ "10. Harvest your fully grown crops for some extra cash\n"
				+ "11. Tend to your farm land to keep your animals happy\n";
		numInput.inputStartAdventure(game);
		numActions = 2;
		while (numActions > 0) {
			UI UI = new UI();
			int chosenAction = UI.inputChooseAction(game);
			switch(chosenAction) {
				case 1:
					// View your farm's crops and animals
					break;
				case 2:
					// View farm money
					break;
				case 3:
					// Visit tool store
					break;
				case 4:
					// Visit crop store
				case 5:
					// Visit animal store
				case 6:
					// Move onto next day
				case 7:
					// Tend to crops, speed up growth
				case 8:
					// Feed animals to make healthier and happier
				case 9:
					// Play with animals to make happier
				case 10:
					// Harvest fully grown crops for cash
				case 11:
					// Tend to your farm land to increas paddocks and keep animals happy
					
			}
			
			
		}
	}
	
public void getFarmer(GameEnvironment game) {
		UI UI = new UI();
		String farmerName = UI.inputFarmerName(game);
		int farmerAge = UI.inputFarmerAge(game);
		farmer = new Farmer(farmerName, farmerAge);
	}
	
	/**
	 * Checks if a given name is valid according to requirements (3-15 chars, alphabetic only)
	 * @param name, name to check
	 * @return boolean if valid (true) or not (false)
	 */
	public boolean farmerNameChecker(String name) {
		// Checks between 3-15 chars
		boolean acceptableLength = false;
		if ((name.length() >= 3) && (name.length() <= 15)) {
			acceptableLength = true;
		}
		// Checks if only alphabetic if it is acceptable length
		boolean successful = true;
		if (acceptableLength) {
			for (int i = 0; i < name.length(); i++) {
				String tempChar = String.valueOf(name.charAt(i));
			    if (alphabet.contains(tempChar) == false) {
			    	successful = false;
			    }
			}
		}
		if ((acceptableLength) && (successful)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameEnvironment game = new GameEnvironment();
		UI UI = new UI();
		game.getFarmer(game);
		UI.inputNumDays(game);
		UI.inputChooseFarm(game);
		UI.inputFarmName(game);
		game.startAdventure(game);
		
		System.out.println(game.numActions);
		System.out.println(game.farmer);
		System.out.println(game.farm.getFarmType());


	}

/**
 * @return the numDays
 */
public int getNumDays() {
	return numDays;
}

/**
 * @param numDays the numDays to set
 */
public void setNumDays(int numDays) {
	this.numDays = numDays;
}

/**
 * @return the farm
 */
public Farm getFarm() {
	return farm;
}

/**
 * @param farm the farm to set
 */
public void setFarm(Farm farm) {
	this.farm = farm;
}

/**
 * @return the farmName
 */
public String getFarmName() {
	return farmName;
}

/**
 * @param farmName the farmName to set
 */
public void setFarmName(String farmName) {
	this.farmName = farmName;
}

/**
 * @return the numActions
 */
public int getNumActions() {
	return numActions;
}

/**
 * @param numActions the numActions to set
 */
public void setNumActions(int numActions) {
	this.numActions = numActions;
}

/**
 * @return the gameFinished
 */
public boolean isGameFinished() {
	return gameFinished;
}

/**
 * @param gameFinished the gameFinished to set
 */
public void setGameFinished(boolean gameFinished) {
	this.gameFinished = gameFinished;
}

/**
 * @return the farmer
 */
public Farmer getFarmer() {
	return farmer;
}

/**
 * @param farmer the farmer to set
 */
public void setFarmer(Farmer farmer) {
	this.farmer = farmer;
}

}
