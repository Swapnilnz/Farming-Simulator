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
	
	public GameEnvironment() {
		numActions = 2;
	}
	
	/**
	 * View time left until crop harvest, animal happiness
	 * @param game
	 */
	public void viewFarm(GameEnvironment game) {
		UI UI = new UI();
		UI.showCrops(game.getFarm());
		UI.showAnimals(game.getFarm());
	}
    /**
     * View the farm's money
     * @param game
     */
	public void viewFarmMoney(GameEnvironment game) {
		UI UI = new UI();
		UI.showFarmMoney(game.getFarm());
	}
	
	/**
	 * Visit Tom's Tool Market and purches various utility items
	 * @param game
	 */
	public void visitToolMarket(GameEnvironment game) {
		UI UI = new UI();
		ToolMarket toolMarket = new ToolMarket();
		boolean done = false;
		while (!done) {
			int inputNum = UI.toolMarket(game.getFarm(), toolMarket);
			switch(inputNum) {
				case 1:
					// Harvester
					toolMarket.buyHarvester(game);
					break;
				case 2:
					// Animal Statue
					toolMarket.buyAnimalStatue(game);
					break;
				case 3:
					// Milk Master
					toolMarket.buyMilkMaster(game);
					break;
				case 4:
					// Shear Master
					toolMarket.buyShearMaster(game);
					break;
				case 5:
					// Watering Can 
					toolMarket.buyWateringCan(game);
					break;
				case 6:
					// Teleportation Pad
					toolMarket.buyTeleportationPad(game);
					break;
				case 7:
					// Exit
					done = true;
					break;
			}
						
		}
	}
	
	/**
	 * Visit crop market to buy crops
	 * @param game
	 */
	public void visitCropMarket(GameEnvironment game) {
		UI UI = new UI();
		CropMarket cropMarket = new CropMarket();
		boolean done = false;
		while (!done) {
			int inputNum = UI.cropMarket(game.getFarm(), cropMarket);
			switch(inputNum) {
				case 1:
					// Avocado
					cropMarket.buyAvocado(game);
					break;
				case 2:
					// Corn
					cropMarket.buyCorn(game);
					break;
				case 3:
					// Wheat
					cropMarket.buyWheat(game);
					break;
				case 4:
					// Potato
					cropMarket.buyPotato(game);
					break;
				case 5:
					// Carrot
					cropMarket.buyCarrot(game);
					break;
				case 6:
					// Apple
					cropMarket.buyApple(game);
					break;
				case 7:
					// Exit
					done = true;
					break;
			}
						
		}
	}
	
	public void visitAnimalMarket(GameEnvironment game) {
		UI UI = new UI();
		AnimalMarket animalMarket = new AnimalMarket();
		boolean done = false;
		while (!done) {
			int inputNum = UI.animalMarket(game.getFarm(), animalMarket);
			switch(inputNum) {
				case 1:
					// Cow
					animalMarket.buyCow(game);
					break;
				case 2:
					// Pig
					animalMarket.buyPig(game);
					break;
				case 3:
					// Chicken
					animalMarket.buyChicken(game);
					break;
				case 4:
					// Sheep
					animalMarket.buySheep(game);
					break;
				case 5:
					// exit
					done = true;
					break;
			}
		}
	}
	
	/**
	 * Plays one day, with 2 or more actiosn
	 * @param game
	 */
	public void runDay(GameEnvironment game) {
		boolean exitLoop = false;
		int numActions = game.getNumActions();		
		while ((numActions >= 0) && (exitLoop != true)){
			UI UI = new UI();
			int chosenAction;
			if (numActions > 0) {
				chosenAction = UI.inputChooseAction(game, true);
			} else {
				chosenAction = UI.inputChooseAction(game, false);
			}
			switch(chosenAction) {
				case 1:
					// View your farm's crops and animals
					viewFarm(game);
					break;
				case 2:
					// View farm money (status)
					viewFarmMoney(game);
					break;
				case 3:
					// Visit tool market
					visitToolMarket(game);
					break;
				case 4:
					// Visit crop market
					visitCropMarket(game);
					break;
				case 5:
					// Visit animal market
					visitAnimalMarket(game);
					break;
				case 6:
					// Move onto next day
					exitLoop = true;
					break;
				case 7:
					// Tend to crops, speed up growth, remember watering can
					numActions -= 1;
					break;
				case 8:
					// Feed animals to make healthier and happier
					numActions -= 1;
					break;
				case 9:
					// Play with animals to make happier
					numActions -= 1;
					break;
				case 10:
					// Harvest fully grown crops for cash
					numActions -= 1;
					break;
				case 11:
					// Tend to your farm land to increas paddocks and keep animals happy
					numActions -= 1;
					break;

					
			}
		}
	}
	
	public void startAdventure(GameEnvironment game) {
		UI startInput = new UI();
		startInput.inputStartAdventure(game);
		while (game.getNumDays() > 0) {
			if (!(game.farm.itemList.contains("Animal Statue"))) {
				// Decrease animal happiness
				for (int i=0; i < game.farm.animalList.size(); i++) {
					game.farm.animalList.get(i).decreaseHappiness();
				}
			}
			// Decrease all days till harvest
			runDay(game);
			// Add money (Milk Master; Shear Master) TO DO: Normal
			
			if (game.farm.itemList.contains("Milk Master")) {
				for (Animal animal: game.farm.animalList) {
					if (animal instanceof Cow) {
						((Cow) animal).milk(game);
					} else if (animal instanceof Sheep) {
						if (game.farm.itemList.contains("Shear Master")) {
							((Sheep) animal).shear(game);
						}
					}
				}
			}
			
			game.numDays--;
		}
		// implement endAdventure()
		
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

		GameEnvironment game = new GameEnvironment();
		UI UI = new UI();
		game.getFarmer(game);
		UI.inputNumDays(game);
		UI.inputChooseFarm(game);
		UI.inputFarmName(game);
		game.startAdventure(game);
		



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
