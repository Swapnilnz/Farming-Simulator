package gamePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JFrame;

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
	 * (Integer) Static number of actions the player has
	 */
	private static int numActions = 2;
	/**
	 * Mutable number of actions a player has
	 */
	private int actions;
	/**
	 * (Boolean) Simple true/false value on whether the game is finished or not
	 */
	private boolean gameFinished = false;
	/**
	 * Main Screen GUI
	 */
	private MainScreen mainScreen;
	/**
	 * Setup screen GUI
	 */
	private StartGameScreen setupScreen;
	
	/**
	 * Constructer; sets starting number of actions
	 */
	public GameEnvironment() {
		numActions = 2;
	}
	
	/**
	 * View time left until crop harvest, animal happiness
	 */
	void viewFarm(JFrame window) {
		// Using GUI
		ViewFarm viewFarm = new ViewFarm(this, window);
		viewFarm.setVisible(true);

	}
    /**
     * View the farm's money
     */
	void viewFarmMoney(JFrame window) {
		ViewFarmMoney viewFarmMoney = new ViewFarmMoney(this, window);
		viewFarmMoney.setVisible(true);

	}
	
	/**
	 * Visit Tom's Tool Market and purches various utility items
	 */
	void visitToolMarket(JFrame window) {
		ToolMarket toolMarket = new ToolMarket();
		ViewToolMarket viewToolMarket = new ViewToolMarket(this, window, toolMarket);
		viewToolMarket.setVisible(true);
	}
	
	/**
	 * Visit crop market to buy crops
	 */
	void visitCropMarket(JFrame window) {
		CropMarket cropMarket = new CropMarket();
		ViewCropMarket viewCropMarket = new ViewCropMarket(this, window, cropMarket);
		viewCropMarket.setVisible(true);
	}
	
	/** 
	 * Visit Andy's animal market to buy animals
	 */
	void visitAnimalMarket(JFrame window) {
		AnimalMarket animalMarket = new AnimalMarket();
		ViewAnimalMarket viewAnimalMarket = new ViewAnimalMarket(this, window, animalMarket);
		viewAnimalMarket.setVisible(true);
	}
	
	/**
	 * Move on to next day
	 */
	void nextDay(JFrame window, boolean yes) {

		if ((this.getNumActions() > 0) && !(yes)) {
			PopUp error = new PopUp(this, window, "You still have actions left, are you sure?");
			error.setVisible(true);
		} else {
			endDay();
			numDays--;
			gameDuration++;
			if (numDays > 0) {

				runDay();
			} else {
				// IMPLEMENT END GAME
				this.closeMainScreen(mainScreen);
				EndGameScreen endGameScreen = new EndGameScreen(this);
				endGameScreen.setVisible(true);
			}
		}
	}
	
	/**
	 * Tend to one type of crop on the farm, has window and crop parameters
	 * Used only by the Error class
	 */
	void tendToCrops(JFrame window, String crop) {
		if (farm.cropInventory.get(crop) > 0) {

			for (Crop tempCrop : this.farm.cropList) {
				String comparedCrop = tempCrop.getCropType();

				if (comparedCrop.equals(crop)) {

					boolean contains = this.farm.itemList.contains("Watering Can");
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
			this.setNumActions(this.getNumActions() - 1);
			PopUp popup = new PopUp(this, window, "You tended to your farm, making them grow faster!");
			popup.setVisible(true);
		} else {
			// Error
			PopUp error = new PopUp(this, window, "Sorry, you can't tend to a crop you don't have!");
			error.setVisible(true);

		}
	}
	
	/**
	 * Tend to one type of crop on the farm, has only window parameter
	 */
	void tendToCrops(JFrame window) {
		ViewTendToCrops view = new ViewTendToCrops(this, window);
		view.setVisible(true);

	}
	
	/**
	 * Feed animals to make them healthier
	 */
	void feedAnimals(JFrame window) {
		if (this.getNumActions() > 0) {
			if (this.farm.animalFeed > 0) {
				for (Animal animal : this.farm.animalList) {
					animal.increaseHealth();
				}
				this.farm.animalFeed -= 1;
				this.setNumActions(this.getNumActions() - 1);
				PopUp popup = new PopUp(this, window, "You fed your animals, making them healthier!");
				popup.setVisible(true);


			} else {
				PopUp error = new PopUp(this, window, "Sorry, you don't have any animal feed to do this!");
				error.setVisible(true);
			}
		} else {
			// No actions left
			PopUp error = new PopUp(this, window, "Sorry, you don't have any actions left!");
			error.setVisible(true);		
			}

	}
	
	/**
	 * Play with animals to make them happier, or error if no animals
	 */
	void playWithAnimals(JFrame window) {
		if (this.getNumActions() > 0) {
			if (this.farm.animalList.size() > 0) {
				for (Animal animal : this.farm.animalList) {
					animal.increaseHappiness();
				}
				this.setNumActions(this.getNumActions() - 1);
				PopUp popup = new PopUp(this, window, "You played with your animals, making them happier!");
				popup.setVisible(true);
				
			} else {
				// Error
				PopUp error = new PopUp(this, window, "Sorry, you don't have any animals to play with!");
				error.setVisible(true);		
			}
		} else {
			// No actions left
			PopUp error = new PopUp(this, window, "Sorry, you don't have any actions left!");
			error.setVisible(true);		
		}

	}
	
	/**
	 * Harvest harvestable crops (days till harvest == 0) and remove them from cropList
	 * Adds required money
	 */
	void harvestCrops(JFrame window) {
		if (this.getNumActions() > 0) {
			ArrayList<Crop> tempCropList = new ArrayList<Crop>();
			for (Crop crop : this.farm.cropList) {
				if (crop.getDaysTillHarvest() == 0) {
					this.farm.farmMoney += crop.getSellPrice();
				} else {
					tempCropList.add(crop);
				}
			}
			if (tempCropList.size() == this.farm.cropList.size()) {
				// Error, no crops harvestable
				PopUp error = new PopUp(this, window, "Sorry, you don't have any harvestable crops!");
				error.setVisible(true);	
			} else {
				this.farm.cropList = tempCropList;
				this.setNumActions(this.getNumActions() - 1);
				PopUp popup = new PopUp(this, window, "Payday! You harvested your crops!");
				popup.setVisible(true);
			}

		} else {
			// No actions left
			PopUp error = new PopUp(this, window, "Sorry, you don't have any actions left!");
			error.setVisible(true);		
		}

		
	}
	
	/**
	 * Simple method that sets the farm's maintenance attribute to true
	 */
	void tendToFarmLand(JFrame window) {
		if (this.getNumActions() > 0) {
			this.farm.setMaintained(true);
			this.setNumActions(this.getNumActions() - 1);
			PopUp popup = new PopUp(this, window, "You tended to your farm land! Your animals are happier!");
			popup.setVisible(true);
		} else {
			// No actions left
			PopUp error = new PopUp(this, window, "Sorry, you don't have any actions left!");
			error.setVisible(true);	
		}

		
	}
	
	/**
	 * Plays one day, with 2 or more actions
	 */
	private void runDay() {
		this.actions = 2 + farm.getTelePadCount();		
		this.setNumActions(actions);
	}
	
	/**
	 * Returns total money based on animal happiness/healthiness
	 * @return int total money
	 */
	int getTotalMoney() {
		int totalMoney = 0;
		int happinessSum = 0;
		int healthinessSum = 0;
		for (Animal animal: this.farm.animalList) {
			happinessSum += animal.getHappiness();
			healthinessSum += animal.getHealth();
		}
		int aLSize = this.farm.animalList.size();
		if (aLSize > 0) {
			int happinessAv = Math.round(happinessSum / aLSize);
			int healthinessAv = Math.round(healthinessSum / aLSize);
			totalMoney = Math.round((happinessAv + healthinessAv) / 2);
		}
		return totalMoney;
	}
	
	
	/**
	 * Does end of day calculations to add money, harvest if necessary 
	 */
	void endDay() {
		// Add money (Milk Master; Shear Master; Harvester)
		if (this.farm.itemList.contains("Milk Master")) {
			for (Animal animal: this.farm.animalList) {
				if (animal instanceof Cow) {
					((Cow) animal).milk(this); // Adds milking money
				}
			}
		}
		if (this.farm.itemList.contains("Shear Master")) {
			for (Animal animal: this.farm.animalList) {
				if (animal instanceof Sheep) {
					((Sheep) animal).shear(this); // Adds shearing money
				}
			}
		}
		if (this.farm.itemList.contains("Harvester")) {
			if (this.farm.cropList.size() > 0) {
				Random rnd = new Random();
				int rand = rnd.nextInt(this.farm.cropList.size());
				this.farm.cropList.get(rand).harvest(this); // Adds harvester money
			}
		}
		// Adds animal money
		int moneyToAdd = getTotalMoney();
		this.farm.farmMoney += moneyToAdd;
		// Decrease all days till harvest by 1 
		for (Crop crop : this.farm.cropList) {
			if (crop.getDaysTillHarvest() > this.farm.getGrowthRate()) {
				crop.daysTillHarvest -= this.farm.getGrowthRate();
			}
		}
		// Decrease animal happiness if farm is not maintained and doesn't have animal statue
		boolean containsStatue = this.farm.itemList.contains("Animal Statue");
		boolean maintained = this.farm.isMaintained();
		if ((!containsStatue && !maintained)) {
			for (int i=0; i < this.farm.animalList.size(); i++) {
				this.farm.animalList.get(i).decreaseHappiness();
				
			}
		}
		farm.setMaintained(false);
		// Decrease animal healthiness per day
		for (Animal animal: farm.animalList) {
			animal.decreaseHealth();
		}
	}
	
	/**
	 * Calculates final score: (money * happinessAv * healthinessAv) / duration
	 * @return score game score
	 */
	int calculateScore() {
		int money = this.farm.getFarmMoney();
		int duration = this.gameDuration;
		int score = 0;
		
		int happinessSum = 0;
		int healthinessSum = 0;
		int happinessAv = 0;
		int healthinessAv = 0;
		for (Animal animal: this.farm.animalList) {
			happinessSum += animal.getHappiness();
			healthinessSum += animal.getHealth();
		}
		int aLSize = this.farm.animalList.size();
		if (aLSize > 0) {
			happinessAv = Math.round(happinessSum / aLSize);
			healthinessAv = Math.round(healthinessSum / aLSize);
		}
		score = Math.round(((money + 1) * (happinessAv + 1) * (healthinessAv + 1)) / duration);
		
		return score;

	}
		
	/**
	 * Start the adventure as set up is done
	 */
	private void startAdventure() {
		launchSetupScreen();
	}
	
	/**
	 * Get farmer name and age
	 */
	void getFarmerStats(String farmerName, int farmerAge) {
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
	 * Launch main screen
	 */
	public void launchMainScreen() {
		mainScreen = new MainScreen(this);
	}
	
	/**
	 * Close the main screen
	 * @param mainWindow
	 */
	public void closeMainScreen(MainScreen mainWindow) {
		mainWindow.closeWindow();
	}
	
	/** 
	 * Launch set up screen
	 */
	public void launchSetupScreen() {
		setupScreen = new StartGameScreen(this);
	}
	
	/**
	 * Close set up screen
	 */
	
	public void closeSetupScreen(StartGameScreen setupWindow) {
		setupWindow.closeWindow();
		this.launchMainScreen();

	}
	/**
	 * Main method; used to start and end game
	 * @param args no args needed
	 */
	public static void main(String[] args) {

		GameEnvironment game = new GameEnvironment();
		game.startAdventure();

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return the num of days
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

	/**
	 * @return the gameDuration
	 */
	public int getGameDuration() {
		return gameDuration;
	}

	/**
	 * @param gameDuration the gameDuration to set
	 */
	public void setGameDuration(int gameDuration) {
		this.gameDuration = gameDuration;
	}

}
