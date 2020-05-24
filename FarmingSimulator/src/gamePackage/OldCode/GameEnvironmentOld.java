package gamePackage.OldCode;
//package gamePackage;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Random;
//
///**
// * Main class of the game, contains methods for every main action able to be performed by the farmer
// * as well as initialising all the other classes required
// * @author Swapnil Bhagat, Reed Earl
// *
// */
//class GameEnvironment {
//	/**
//	 * (Integer) Number of days the player has chosen to play the game (5-15), counts DOWN
//	 */
//	protected int numDays;
//	/**
//	 * (Integer) Number of days the player has chosen to play the game (5-15), counts UP
//	 */
//	int gameDuration;
//	/**
//	 * Object farmer, contains farmer name and age (maybe avatar)
//	 */
//	protected Farmer farmer;
//	/**
//	 * Object Farm, is the player's farm, used to house all farm attributes
//	 */
//	protected Farm farm;
//	/**
//	 * Static String alphabet, used for validifying farmer name
//	 */
//	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	/**
//	 * (Integer) Number of actions the player has, may increase and indecrease
//	 */
//	private int numActions;
//	/**
//	 * (Boolean) Simple true/false value on whether the game is finished or not
//	 */
//	private boolean gameFinished = false;
//	
//	/**
//	 * Constructer; sets starting number of actions
//	 */
//	public GameEnvironment() {
//		numActions = 2;
//	}
//	
//	/**
//	 * View time left until crop harvest, animal happiness
//	 */
//	void viewFarm() {
//		UI UI = new UI();
//		UI.showCrops(this.getFarm());
//		UI.showAnimals(this.getFarm());
//	}
//    /**
//     * View the farm's money
//     */
//	void viewFarmMoney() {
//		UI UI = new UI();
//		UI.showFarmMoney(this.getFarm());
//	}
//	
//	/**
//	 * Visit Tom's Tool Market and purches various utility items
//	 */
//	private void visitToolMarket() {
//		UI UI = new UI();
//		ToolMarket toolMarket = new ToolMarket();
//		boolean done = false;
//		while (!done) {
//			int inputNum = UI.toolMarket(this.getFarm(), toolMarket);
//			switch(inputNum) {
//				case 1:
//					// Harvester
//					toolMarket.buyHarvester(this);
//					break;
//				case 2:
//					// Animal Statue
//					toolMarket.buyAnimalStatue(this);
//					break;
//				case 3:
//					// Milk Master
//					toolMarket.buyMilkMaster(this);
//					break;
//				case 4:
//					// Shear Master
//					toolMarket.buyShearMaster(this);
//					break;
//				case 5:
//					// Watering Can 
//					toolMarket.buyWateringCan(this);
//					break;
//				case 6:
//					// Teleportation Pad
//					toolMarket.buyTeleportationPad(this);
//					break;
//				case 7:
//					// Exit
//					done = true;
//					break;
//			}
//						
//		}
//	}
//	
//	/**
//	 * Visit crop market to buy crops
//	 */
//	private void visitCropMarket() {
//		UI UI = new UI();
//		CropMarket cropMarket = new CropMarket();
//		boolean done = false;
//		while (!done) {
//			int inputNum = UI.cropMarket(this.getFarm(), cropMarket);
//			int amount;
//			switch(inputNum) {
//				case 1:
//					// Avocado
//					amount = UI.buyAmount(this); cropMarket.buyAvocado(this, amount);
//					break;
//				case 2:
//					// Corn
//					amount = UI.buyAmount(this); cropMarket.buyCorn(this, amount);
//					break;
//				case 3:
//					// Wheat
//					amount = UI.buyAmount(this); cropMarket.buyWheat(this, amount);
//					break;
//				case 4:
//					// Potato
//					amount = UI.buyAmount(this); cropMarket.buyPotato(this, amount);
//					break;
//				case 5:
//					// Carrot
//					amount = UI.buyAmount(this); cropMarket.buyCarrot(this, amount);
//					break;
//				case 6:
//					// Apple
//					amount = UI.buyAmount(this); cropMarket.buyApple(this, amount);
//					break;
//				case 7:
//					// Animal Feed
//					cropMarket.buyAnimalFeed(this);
//				case 8:
//					// Exit
//					done = true;
//					break;
//			}
//						
//		}
//	}
//	
//	/** 
//	 * Visit Andy's animal market to buy animals
//	 */
//	private void visitAnimalMarket() {
//		UI UI = new UI();
//		AnimalMarket animalMarket = new AnimalMarket();
//		boolean done = false;
//		while (!done) {
//			int inputNum = UI.animalMarket(this.getFarm(), animalMarket);
//
//			switch(inputNum) {
//				case 1:
//					// Cow
//					int amount = UI.buyAmount(this);
//					animalMarket.buyCow(this, amount);
//					break;
//				case 2:
//					// Pig
//					amount = UI.buyAmount(this);
//					animalMarket.buyPig(this, amount);
//					break;
//				case 3:
//					// Chicken
//					amount = UI.buyAmount(this);
//					animalMarket.buyChicken(this, amount);
//					break;
//				case 4:
//					// Sheep
//					amount = UI.buyAmount(this);
//					animalMarket.buySheep(this, amount);
//					break;
//				case 5:
//					// exit
//					done = true;
//					break;
//			}
//		}
//	}
//	
//	/**
//	 * Tend to one type of crop on the farm
//	 */
//	private void tendToCrops() {
//		UI UI = new UI();
//		boolean chosen = false;
//		HashMap<String, Integer> inventory = this.farm.cropInventory;
//		while (!chosen) {
//			String crop = UI.chooseTendToCrop(this);
//			if (crop.equals("exit")) {
//				chosen = true;
//			} else if (inventory.get(crop) > 0) {
//
//				chosen = true;
//				for (Crop tempCrop : this.farm.cropList) {
//					String comparedCrop = tempCrop.getCropType();
//
//					if (comparedCrop.equals(crop)) {
//
//						boolean contains = this.farm.itemList.contains("Watering Can");
//						int ogDays = tempCrop.getDaysTillHarvest();
//						if (contains) {
//							if (ogDays >= 4) {
//								tempCrop.setDaysTillHarvest(ogDays - 4);
//
//							} else {
//								tempCrop.setDaysTillHarvest(0);
//							}
//						} else {
//							if (ogDays >= 2) {
//								tempCrop.setDaysTillHarvest(ogDays - 2);
//							} else {
//								tempCrop.setDaysTillHarvest(0);
//							}
//						}
//					}
//				}
//			} else {
//				System.out.println("Sorry, you can't tend to a crop you don't have!");
//
//			}
//		}
//
//	}
//	
//	/**
//	 * Feed animals to make them healthier
//	 */
//	void feedAnimals() {
//		if (this.farm.animalFeed > 0) {
//			for (Animal animal : this.farm.animalList) {
//				animal.increaseHealth();
//			}
//			this.farm.animalFeed -= 1;
//		} else {
//			System.out.println("Sorry, you don't have any animal feed to do this!");
//		}
//	}
//	
//	/**
//	 * Play with animals to make them happier, or error if no animals
//	 */
//	void playWithAnimals() {
//		if (this.farm.animalList.size() > 0) {
//			for (Animal animal : this.farm.animalList) {
//				animal.increaseHappiness();
//			}
//		} else {
//			System.out.println("Sorry, you don't have any animals to play with!");
//		}
//	}
//	
//	/**
//	 * Harvest harvestable crops (days till harvest == 0) and remove them from cropList
//	 * Adds required money
//	 */
//	void harvestCrops() {
//		ArrayList<Crop> tempCropList = new ArrayList<Crop>();
//		for (Crop crop : this.farm.cropList) {
//			if (crop.getDaysTillHarvest() == 0) {
//				this.farm.farmMoney += crop.getSellPrice();
//			} else {
//				tempCropList.add(crop);
//			}
//		this.farm.cropList = tempCropList;
//
//		}
//	}
//	
//	/**
//	 * Simple method that sets the farm's maintenance attribute to true
//	 */
//	void tendToFarmLand() {
//		this.farm.setMaintained(true);
//	}
//	
//	/**
//	 * Plays one day, with 2 or more actions
//	 */
//	private void runDay() {
//		boolean exitLoop = false;
//		int numActions = this.getNumActions();		
//		while ((numActions >= 0) && (exitLoop != true)){
//			UI UI = new UI();
//			int chosenAction;
//			if (numActions > 0) {
//				chosenAction = UI.inputChooseAction(this, true);
//			} else {
//				chosenAction = UI.inputChooseAction(this, false);
//			}
//			switch(chosenAction) {
//				case 1:
//					// View your farm's crops and animals
//					viewFarm();
//					break;
//				case 2: 
//					// View farm money (status)
//					viewFarmMoney();
//					break;
//				case 3:
//					// Visit tool market
//					visitToolMarket();
//					break;
//				case 4:
//					// Visit crop market
//					visitCropMarket();
//					break;
//				case 5:
//					// Visit animal market
//					visitAnimalMarket();
//					break;
//				case 6:
//					// Move onto next day
//					this.farm.setMaintained(false);
//					exitLoop = true;
//					break;
//				case 7:
//					// Tend to crops, speed up growth, remember watering can
//					tendToCrops();
//					numActions -= 1;
//					break;
//				case 8:
//					// Feed animals to make healthier and happier
//					feedAnimals();
//					numActions -= 1;
//					break;
//				case 9:
//					// Play with animals to make happier
//					playWithAnimals();
//					numActions -= 1;
//					break;
//				case 10:
//					// Harvest fully grown crops for cash
//					harvestCrops();
//					numActions -= 1;
//					break;
//				case 11:
//					// Tend to your farm land to keep animals happy
//					tendToFarmLand();
//					numActions -= 1;
//					break;
//
//					
//			}
//		}
//	}
//	
//	/**
//	 * Returns total money based on animal happiness/healthiness
//	 * @return int total money
//	 */
//	int getTotalMoney() {
//		int totalMoney = 0;
//		int happinessSum = 0;
//		int healthinessSum = 0;
//		for (Animal animal: this.farm.animalList) {
//			happinessSum += animal.getHappiness();
//			healthinessSum += animal.getHealth();
//		}
//		int aLSize = this.farm.animalList.size();
//		if (aLSize > 0) {
//			int happinessAv = Math.round(happinessSum / aLSize);
//			int healthinessAv = Math.round(healthinessSum / aLSize);
//			totalMoney = Math.round((happinessAv + healthinessAv) / 2);
//		}
//		return totalMoney;
//	}
//	
//	/**
//	 * Does end of day calculations to add money, harvest if necessary etc
//	 */
//	void endDay() {
//		// Add money (Milk Master; Shear Master; Harvester) TO DO: Normal
//		if (this.farm.itemList.contains("Milk Master")) {
//			for (Animal animal: this.farm.animalList) {
//				if (animal instanceof Cow) {
//					((Cow) animal).milk(this); // Adds milking money
//				}
//			}
//		}
//		if (this.farm.itemList.contains("Shear Master")) {
//			for (Animal animal: this.farm.animalList) {
//				if (animal instanceof Sheep) {
//					((Sheep) animal).shear(this); // Adds shearing money
//				}
//			}
//		}
//		if (this.farm.itemList.contains("Harvester")) {
//			if (this.farm.cropList.size() > 0) {
//				Random rnd = new Random();
//				int rand = rnd.nextInt(this.farm.cropList.size());
//				this.farm.cropList.get(rand).harvest(this); // Adds harvester money
//			}
//		}
//		// Adds animal money
//		int moneyToAdd = getTotalMoney();
//		this.farm.farmMoney += moneyToAdd;
//		// Decrease all days till harvest by 1 
//		for (Crop crop : this.farm.cropList) {
//			if (crop.getDaysTillHarvest() > this.farm.getGrowthRate()) {
//				crop.daysTillHarvest -= this.farm.getGrowthRate();
//			}
//		}
//		// Decrease animal happiness if farm is not maintained and doesn't have animal statue
//		boolean containsStatue = this.farm.itemList.contains("Animal Statue");
//		boolean maintained = this.farm.isMaintained();
//		if ((!containsStatue && !maintained)) {
//			for (int i=0; i < this.farm.animalList.size(); i++) {
//				this.farm.animalList.get(i).decreaseHappiness();
//				
//			}
//		}
//		// Decrease animal healthiness per day
//		for (Animal animal: farm.animalList) {
//			animal.decreaseHealth();
//		}
//	}
//	
//	/**
//	 * Calculates final score: (money * happinessAv * healthinessAv) / duration
//	 * @return score game score
//	 */
//	int calculateScore() {
//		int money = this.farm.getFarmMoney();
//		int duration = this.gameDuration;
//		int score = 0;
//		
//		int happinessSum = 0;
//		int healthinessSum = 0;
//		int happinessAv = 0;
//		int healthinessAv = 0;
//		for (Animal animal: this.farm.animalList) {
//			happinessSum += animal.getHappiness();
//			healthinessSum += animal.getHealth();
//		}
//		int aLSize = this.farm.animalList.size();
//		if (aLSize > 0) {
//			happinessAv = Math.round(happinessSum / aLSize);
//			healthinessAv = Math.round(healthinessSum / aLSize);
//		}
//		score = Math.round(((money + 1) * (happinessAv + 1) * (healthinessAv + 1)) / duration);
//		
//		return score;
//
//	}
//	
//	/**
//	 * End the adventure as days have run out
//	 */
//	private void endAdventure() {
//		// Display farm's name, game's duration, profit
//		UI UI = new UI();
//		UI.displayEndAdventure(this);
//		int score = calculateScore();
//		// Print Score
//		System.out.println("------------------------------------------");
//		System.out.println("Your score was");
//		System.out.println(score);
//		System.out.println("------------------------------------------");
//
//		
//	}
//	
//	/**
//	 * Start the adventure as set up is done
//	 */
//	private void startAdventure() {
//		UI startInput = new UI();
//		startInput.inputStartAdventure(this);
//		while (this.getNumDays() > 0) {
//			runDay();
//			// Happens at the end of the day
//			endDay();
//			this.numDays--;
//			this.gameDuration++;
//		}
//	}
//	
//	/**
//	 * Get farmer name and age
//	 */
//	private void getFarmerStats() {
//		UI UI = new UI();
//		String farmerName = UI.inputFarmerName(this);
//		int farmerAge = UI.inputFarmerAge(this);
//		farmer = new Farmer(farmerName, farmerAge);
//	}
//	
//	/**
//	 * Checks if a given name is valid according to requirements (3-15 chars, alphabetic only)
//	 * @param name, name to check
//	 * @return boolean if valid (true) or not (false)
//	 */
//	boolean farmerNameChecker(String name) {
//		// Checks between 3-15 chars
//		boolean acceptableLength = false;
//		if ((name.length() >= 3) && (name.length() <= 15)) {
//			acceptableLength = true;
//		}
//		// Checks if only alphabetic if it is acceptable length
//		boolean successful = true;
//		if (acceptableLength) {
//			for (int i = 0; i < name.length(); i++) {
//				String tempChar = String.valueOf(name.charAt(i));
//			    if (alphabet.contains(tempChar) == false) {
//			    	successful = false;
//			    }
//			}
//		}
//		if ((acceptableLength) && (successful)) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	/**
//	 * Lunch main screen
//	 */
//	public void launchMainsScreen() {
//		MainScreen mainWindow = new MainScreen(this);
//	}
//	
//	public void closeMainScreen(MainScreen mainWindow) {
//		mainWindow.closeWindow();
//	}
//	
//	
//	/**
//	 * Main method; used to start and end game
//	 * @param args no args needed
//	 */
//	public static void main(String[] args) {
//
//		GameEnvironment game = new GameEnvironment();
//		UI UI = new UI();
//		game.getFarmerStats();
//		UI.inputNumDays(game);
//		UI.inputChooseFarm(game);
//		UI.inputFarmName(game);
//		game.startAdventure();
//		game.endAdventure();
//
//	}
//
///**
// * @return the num of days
// */
//public int getNumDays() {
//	return numDays;
//}
//
///**
// * @param numDays the numDays to set
// */
//public void setNumDays(int numDays) {
//	this.numDays = numDays;
//}
//
///**
// * @return the farm
// */
//public Farm getFarm() {
//	return farm;
//}
//
///**
// * @param farm the farm to set
// */
//public void setFarm(Farm farm) {
//	this.farm = farm;
//}
//
//
///**
// * @return the numActions
// */
//public int getNumActions() {
//	return numActions;
//}
//
///**
// * @param numActions the numActions to set
// */
//public void setNumActions(int numActions) {
//	this.numActions = numActions;
//}
//
///**
// * @return the gameFinished
// */
//public boolean isGameFinished() {
//	return gameFinished;
//}
//
///**
// * @param gameFinished the gameFinished to set
// */
//public void setGameFinished(boolean gameFinished) {
//	this.gameFinished = gameFinished;
//}
//
///**
// * @return the farmer
// */
//public Farmer getFarmer() {
//	return farmer;
//}
//
///**
// * @param farmer the farmer to set
// */
//public void setFarmer(Farmer farmer) {
//	this.farmer = farmer;
//}
//
//}
