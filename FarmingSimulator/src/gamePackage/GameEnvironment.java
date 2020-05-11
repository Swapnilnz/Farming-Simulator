package gamePackage;

public class GameEnvironment {
	protected int numDays;
	protected String farmerName;
	protected String farmType;
	protected Farm farm;
	protected String farmName;
	public static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public int numActions = 2;
	public boolean gameFinished = false;
	
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
		UI UI = new UI(game);
		UI.inputFarmerName();
		UI.inputNumDays();
		UI.inputChooseFarm();
		UI.inputFarmName();
		// implement startAdventure
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
 * @return the farmerName
 */
public String getFarmerName() {
	return farmerName;
}

/**
 * @param farmerName the farmerName to set
 */
public void setFarmerName(String farmerName) {
	this.farmerName = farmerName;
}

/**
 * @return the farmType
 */
public String getFarmType() {
	return farmType;
}

/**
 * @param farmType the farmType to set
 */
public void setFarmType(String farmType) {
	this.farmType = farmType;
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

}
