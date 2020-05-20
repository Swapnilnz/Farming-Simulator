package gamePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Main class of the game, contains methods for every main action able to be performed by the farmer
 * as well as initialising all the other classes required
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class GameEnvironment {
	/**
	 * (Integer) Number of days the player has chosen to play the game (5-15), counts DOWN
	 */
	protected int numDays;
	/**
	 * (Integer) Number of days the player has chosen to play the game (5-15), counts UP
	 */
	int gameDuration;
	/**
	 * Object farmer, contains farmer name and age (maybe avatar)
	 */
	protected Farmer farmer;
	/**
	 * Object Farm, is the player's farm, used to house all farm attributes
	 */
	protected Farm farm;
	/**
	 * Static String alphabet, used for validifying farmer name
	 */
	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/**
	 * (Integer) Number of actions the player has, may increase and indecrease
	 */
	private int numActions;
	/**
	 * (Boolean) Simple true/false value on whether the game is finished or not
	 */
	private boolean gameFinished = false;
	
	/**
	 * Constructer; sets starting number of actions
	 */
	public GameEnvironment() {
		numActions = 2;
	}
	
	/**
	 * View time left until crop harvest, animal happiness
	 * @param game game
	 */
	void viewFarm(GameEnvironment game) {
		UI UI = new UI();
		UI.showCrops(game.getFarm());
		UI.showAnimals(game.getFarm());
	}
    /**
     * View the farm's money
     * @param game game
     */
	void viewFarmMoney(GameEnvironment game) {
		UI UI = new UI();
		UI.showFarmMoney(game.getFarm());
	}
	
	/**
	 * Visit Tom's Tool Market and purches various utility items
	 * @param game game 
	 */
	private void visitToolMarket(GameEnvironment game) {
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
					// Animal Feed
					toolMarket.buyAnimalFeed(game);
					break;
				case 8:
					// Exit
					done = true;
					break;
			}
						
		}
	}
	
	/**
	 * Visit crop market to buy crops
	 * @param game game
	 */
	private void visitCropMarket(GameEnvironment game) {
		UI UI = new UI();
		CropMarket cropMarket = new CropMarket();
		boolean done = false;
		while (!done) {
			int inputNum = UI.cropMarket(game.getFarm(), cropMarket);
			int amount;
			switch(inputNum) {
				case 1:
					// Avocado
					amount = UI.buyAmount(game); cropMarket.buyAvocado(game, amount);
					break;
				case 2:
					// Corn
					amount = UI.buyAmount(game); cropMarket.buyCorn(game, amount);
					break;
				case 3:
					// Wheat
					amount = UI.buyAmount(game); cropMarket.buyWheat(game, amount);
					break;
				case 4:
					// Potato
					amount = UI.buyAmount(game); cropMarket.buyPotato(game, amount);
					break;
				case 5:
					// Carrot
					amount = UI.buyAmount(game); cropMarket.buyCarrot(game, amount);
					break;
				case 6:
					// Apple
					amount = UI.buyAmount(game); cropMarket.buyApple(game, amount);
					break;
				case 7:
					// Exit
					done = true;
					break;
			}
						
		}
	}
	
	/** 
	 * Visit Andy's animal market to buy animals
	 * @param game game 
	 */
	private void visitAnimalMarket(GameEnvironment game) {
		UI UI = new UI();
		AnimalMarket animalMarket = new AnimalMarket();
		boolean done = false;
		while (!done) {
			int inputNum = UI.animalMarket(game.getFarm(), animalMarket);

			switch(inputNum) {
				case 1:
					// Cow
					int amount = UI.buyAmount(game);
					animalMarket.buyCow(game, amount);
					break;
				case 2:
					// Pig
					amount = UI.buyAmount(game);
					animalMarket.buyPig(game, amount);
					break;
				case 3:
					// Chicken
					amount = UI.buyAmount(game);
					animalMarket.buyChicken(game, amount);
					break;
				case 4:
					// Sheep
					amount = UI.buyAmount(game);
					animalMarket.buySheep(game, amount);
					break;
				case 5:
					// exit
					done = true;
					break;
			}
		}
	}
	
	/**
	 * Tend to one type of crop on the farm
	 * @param game game
	 */
	private void tendToCrops(GameEnvironment game) {
		UI UI = new UI();
		boolean chosen = false;
		HashMap<String, Integer> inventory = game.farm.cropInventory;
		while (!chosen) {
			String crop = UI.chooseTendToCrop(game);
			if (crop.equals("exit")) {
				chosen = true;
			} else if (inventory.get(crop) > 0) {

				chosen = true;
				for (Crop tempCrop : game.farm.cropList) {
					String comparedCrop = tempCrop.getCropType();

					if (comparedCrop.equals(crop)) {

						boolean contains = game.farm.itemList.contains("Watering Can");
						int ogDays = tempCrop.getDaysTillHarvest();
						if (contains) {
							if (ogDays >= 4) {
								tempCrop.setDaysTillHarvest(ogDays - 4);

							} else {
								tempCrop.setDaysTillHarvest(0);
							}
						} else {
							if (ogDays >= 2) {
								tempCrop.setDaysTillHarvest(ogDays - 2);
							} else {
								tempCrop.setDaysTillHarvest(0);
							}
						}
					}
				}
			} else {
				System.out.println("Sorry, you can't tend to a crop you don't have!");

			}
		}

	}
	
	/**
	 * Feed animals to make them healthier
	 * @param game game 
	 */
	void feedAnimals(GameEnvironment game) {
		if (game.farm.animalFeed > 0) {
			for (Animal animal : game.farm.animalList) {
				animal.increaseHealth();
			}
			game.farm.animalFeed -= 1;
		} else {
			System.out.println("Sorry, you don't have any animal feed to do this!");
		}
	}
	
	/**
	 * Play with animals to make them happier, or error if no animals
	 * @param game game 
	 */
	void playWithAnimals(GameEnvironment game) {
		if (game.farm.animalList.size() > 0) {
			for (Animal animal : game.farm.animalList) {
				animal.increaseHappiness();
			}
		} else {
			System.out.println("Sorry, you don't have any animals to play with!");
		}
	}
	
	/**
	 * Harvest harvestable crops (days till harvest == 0) and remove them from cropList
	 * Adds required money
	 * @param game game 
	 */
	void harvestCrops(GameEnvironment game) {
		ArrayList<Crop> tempCropList = new ArrayList<Crop>();
		for (Crop crop : game.farm.cropList) {
			if (crop.getDaysTillHarvest() == 0) {
				game.farm.farmMoney += crop.getSellPrice();
			} else {
				tempCropList.add(crop);
			}
		game.farm.cropList = tempCropList;

		}
	}
	
	/**
	 * Simple method that sets the farm's maintenance attribute to true
	 * @param game game
	 */
	void tendToFarmLand(GameEnvironment game) {
		game.farm.setMaintained(true);
	}
	
	/**
	 * Plays one day, with 2 or more actions
	 * @param game game
	 */
	private void runDay(GameEnvironment game) {
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
					game.farm.setMaintained(false);
					exitLoop = true;
					break;
				case 7:
					// Tend to crops, speed up growth, remember watering can
					tendToCrops(game);
					numActions -= 1;
					break;
				case 8:
					// Feed animals to make healthier and happier
					feedAnimals(game);
					numActions -= 1;
					break;
				case 9:
					// Play with animals to make happier
					playWithAnimals(game);
					numActions -= 1;
					break;
				case 10:
					// Harvest fully grown crops for cash
					harvestCrops(game);
					numActions -= 1;
					break;
				case 11:
					// Tend to your farm land to keep animals happy
					tendToFarmLand(game);
					numActions -= 1;
					break;

					
			}
		}
	}
	
	/**
	 * Returns total money based on animal happiness/healthiness
	 * @param game game
	 * @return int total money
	 */
	int getTotalMoney(GameEnvironment game) {
		int totalMoney = 0;
		int happinessSum = 0;
		int healthinessSum = 0;
		for (Animal animal: game.farm.animalList) {
			happinessSum += animal.getHappiness();
			healthinessSum += animal.getHealth();
		}
		int aLSize = game.farm.animalList.size();
		if (aLSize > 0) {
			int happinessAv = Math.round(happinessSum / aLSize);
			int healthinessAv = Math.round(healthinessSum / aLSize);
			totalMoney = Math.round((happinessAv + healthinessAv) / 2);
		}
		return totalMoney;
	}
	
	/**
	 * Does end of day calculations to add money, harvest if necessary etc
	 * @param game game
	 */
	void endDay(GameEnvironment game) {
		// Add money (Milk Master; Shear Master; Harvester) TO DO: Normal
		if (game.farm.itemList.contains("Milk Master")) {
			for (Animal animal: game.farm.animalList) {
				if (animal instanceof Cow) {
					((Cow) animal).milk(game); // Adds milking money
				}
			}
		}
		if (game.farm.itemList.contains("Shear Master")) {
			for (Animal animal: game.farm.animalList) {
				if (animal instanceof Sheep) {
					((Sheep) animal).shear(game); // Adds shearing money
				}
			}
		}
		if (game.farm.itemList.contains("Harvester")) {
			if (game.farm.cropList.size() > 0) {
				Random rnd = new Random();
				int rand = rnd.nextInt(game.farm.cropList.size());
				game.farm.cropList.get(rand).harvest(game); // Adds harvester money
			}
		}
		// Adds animal money
		int moneyToAdd = getTotalMoney(game);
		game.farm.farmMoney += moneyToAdd;
		// Decrease all days till harvest by 1 
		for (Crop crop : game.farm.cropList) {
			if (crop.getDaysTillHarvest() > game.farm.getGrowthRate()) {
				crop.daysTillHarvest -= game.farm.getGrowthRate();
			}
		}
		// Decrease animal happiness if farm is not maintained and doesn't have animal statue
		boolean containsStatue = game.farm.itemList.contains("Animal Statue");
		boolean maintained = game.farm.isMaintained();
		if ((!containsStatue && !maintained)) {
			for (int i=0; i < game.farm.animalList.size(); i++) {
				game.farm.animalList.get(i).decreaseHappiness();
				
			}
		}
		// Decrease animal healthiness per day
		for (Animal animal: farm.animalList) {
			animal.decreaseHealth();
		}
	}
	
	/**
	 * Calculates final score: (money * happinessAv * healthinessAv) / duration
	 * @param game game
	 * @return score game score
	 */
	int calculateScore(GameEnvironment game) {
		int money = game.farm.getFarmMoney();
		int duration = game.gameDuration;
		int score = 0;
		
		int happinessSum = 0;
		int healthinessSum = 0;
		int happinessAv = 0;
		int healthinessAv = 0;
		for (Animal animal: game.farm.animalList) {
			happinessSum += animal.getHappiness();
			healthinessSum += animal.getHealth();
		}
		int aLSize = game.farm.animalList.size();
		if (aLSize > 0) {
			happinessAv = Math.round(happinessSum / aLSize);
			healthinessAv = Math.round(healthinessSum / aLSize);
		}
		score = Math.round(((money + 1) * (happinessAv + 1) * (healthinessAv + 1)) / duration);
		
		return score;

	}
	
	/**
	 * End the adventure as days have run out
	 * @param game game
	 */
	private void endAdventure(GameEnvironment game) {
		// Display farm's name, game's duration, profit
		UI UI = new UI();
		UI.displayEndAdventure(game);
		int score = calculateScore(game);
		// Print Score
		System.out.println("------------------------------------------");
		System.out.println("Your score was");
		System.out.println(score);
		System.out.println("------------------------------------------");

		
	}
	
	/**
	 * Start the adventure as set up is done
	 * @param game game
	 */
	private void startAdventure(GameEnvironment game) {
		UI startInput = new UI();
		startInput.inputStartAdventure(game);
		while (game.getNumDays() > 0) {
			runDay(game);
			// Happens at the end of the day
			endDay(game);
			game.numDays--;
			game.gameDuration++;
		}
	}
	
	/**
	 * Get farmer name and age
	 * @param game game
	 */
	private void getFarmer(GameEnvironment game) {
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
	boolean farmerNameChecker(String name) {
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
	
	/**
	 * Main method; used to start and end game
	 * @param args no args needed
	 */
	public static void main(String[] args) {

		GameEnvironment game = new GameEnvironment();
		UI UI = new UI();
		game.getFarmer(game);
		UI.inputNumDays(game);
		UI.inputChooseFarm(game);
		UI.inputFarmName(game);
		game.startAdventure(game);
		game.endAdventure(game);

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
