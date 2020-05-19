package gamePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Temporary UI class for command line implementation
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class UI {
	
	public UI() {
	}
	
	/**
	 * Procedure that gets the farmers name through cmd input; follows given guidelines of 3-15 length alphabetic String
	 */
	String inputFarmerName(GameEnvironment game) {
		Scanner input = new Scanner(System.in);
		String finalName = "";
		System.out.println("Hello aspiring farmer! What is your name? ");
		String tempName = input.nextLine();
		boolean nameFound = false;
		while (nameFound == false) {
			boolean valid = game.farmerNameChecker(tempName);
			
			if (valid) {
				finalName = tempName;
				nameFound = true;
				System.out.println("Hello farmer " + finalName + ", welcome to Farming Simulator!");

			} else {
				System.out.println("Sorry, '" + tempName + "' is an invalid name!");
				System.out.println("(Hint: name has to be 3-15 characters long and contain only letters)\n");
				System.out.println("Try again:");
				tempName = input.nextLine();
			}
			    
			
		}
		return finalName;

	}

	/**
	 * Procedure that gets the farmers age through cmd input; follows given guidelines num between 0-100
	 */
	int inputFarmerAge(GameEnvironment game) {
		System.out.println("What is your age?");
		int finalAge = 21;
		boolean numFound = false;
		while (numFound == false) {
			try {
				Scanner input = new Scanner(System.in);
				int tempNum = input.nextInt();
				if ((tempNum <= 100) && (tempNum > 0)) {
					numFound = true;
					finalAge = tempNum;
					
				} else {
					System.out.println("Please enter a number between 0 and 100!\nTry again:");

				}
			} catch (Exception e) {
				System.out.println("Please enter a number between 0 and 100!\nTry again:");
			}
			

		}
		return finalAge;
	}
	
	/**
	 * Procedure that gets the number of days the farmer would like to play (between 5 and 15)
	 */
	void inputNumDays(GameEnvironment game) {
		System.out.println("How long would you like your farming adventure to last?\nYou can choose between 5 and 15 days!");
		boolean numFound = false;
		while (numFound == false) {
			try {
				Scanner input = new Scanner(System.in);
				int tempNum = input.nextInt();
				if ((tempNum <= 15) && (tempNum >= 5)) {
					numFound = true;
					game.numDays = tempNum;
					
				} else {
					System.out.println("Please enter a number between 5 and 15!\nTry again:");

				}
			} catch (Exception e) {
				System.out.println("Please enter a number between 5 and 15!\nTry again:");
			}
			

		}
	}
	
	/**
	 * Procedure that lets the farmer choose their farm out of the four: Desert, Mountain, Plains, or Swamp
	 * This is done through user cmd input of a number from 1 to 4.
	 */
	void inputChooseFarm(GameEnvironment game) {
		System.out.println("Awesome! Now, you have to make a big decision...\n"
				+ "Which type of farm would you like to begin your journey with?\n"
				+ "Each type has its own pros and cons...So choose carefully.\n"
				+ "Enter the number next to the type of farm you would like.\n"
				+ "1. Desert Farm\n"
				+ "2. Mountain Farm\n"
				+ "3. Plains Farm\n"
				+ "4. Swamp Farm");
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		boolean valid = false;

		while (valid == false) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if (newNum == 1) {
					valid = true;
					// Desert Farm
					DesertFarm dFarm = new DesertFarm(); game.farm = dFarm;
				} else if (newNum == 2) {
					valid = true;
					// Mountain Farm
					MountainFarm mFarm = new MountainFarm(); game.farm = mFarm;
				} else if (newNum == 3) {
					valid = true;
					// Plains Farm
					PlainsFarm pFarm = new PlainsFarm(); game.farm = pFarm;
				} else if (newNum == 4) {
					valid = true;
					// Swamp Farm
					SwampFarm sFarm = new SwampFarm(); game.farm = sFarm;
				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 4");
					tempNum = input.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 4");
				tempNum = input.nextLine();
			}


		}
	}

	/**
	 * Gets farm name by input from user and updates class attribute farmName.
	 * Given name must be <= 20 characters long.
	 */
	void inputFarmName(GameEnvironment game) {
		System.out.println("You have chosen a " + game.getFarm().getFarmType()
				+ "\nIt is time to choose a name for your farm.\n"
				+ "Type below:");
		Scanner input = new Scanner(System.in);
		String tempName = input.nextLine();
		boolean nameFound = false;
		while (nameFound == false) {
			if ((tempName.length() <= 20) && (tempName.length() > 0)) {
				game.farm.farmName = tempName;
				System.out.println("Good choice! Your farm's name is now '" + game.farm.farmName + "'.");
				nameFound = true;
			} else if (tempName.length() == 0) {
				game.farm.farmName = game.farmer.name + "'s Farm";
				System.out.println("Okay! Your farm's name is " + game.farm.farmName + "'.");
				nameFound = true;
			} else {
				System.out.println("Sorry! Your name is too long, please try to keep it within 20 characters.");
				tempName = input.nextLine();
			}
		}

	}

	/**
	 * Asks if user wants to start playing
	 */
	void inputStartAdventure(GameEnvironment game) {
		System.out.println("Awesome! Would you like to start your adventure? (Y/N)");
		Scanner input = new Scanner(System.in);
		String[] choices = new String[]{"Yes", "y", "Y", "yes"};
		List<String> list = Arrays.asList(choices);
		boolean valid = false;
		String tempAns = input.nextLine();
		while (valid == false) {

			if (list.contains(tempAns)) {
				valid = true;
				
			} else {
				System.out.println("Okay, I'll wait until you're ready!\n"
						+ "Try again whenever you are ready.");
				tempAns = input.nextLine();
			}
				
		}
	}
	
	/**
	 * Choose an action for the day
	 * @param withActions
	 * @return int of action chosen
	 */
	int inputChooseAction(GameEnvironment game, boolean withActions) {
		System.out.println("Welcome to Farming Simulator");
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
				+ "8. Feed farm animals to make them healthier\n"
				+ "9. Play with farm animal to make them happier\n"
				+ "10. Harvest your fully grown crops for some extra cash\n"
				+ "11. Tend to your farm land to keep your animals happy\n";
		System.out.println(nonActions);
		if (withActions) {
			System.out.println(actions);
		}
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		int finalNum = 0;
		boolean valid = false;

		while (valid == false) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if ((newNum <= 11) && (newNum >= 1)) {
					if (withActions) {
						valid = true;
						finalNum = newNum;
					} else {
						if (newNum <= 6) {
							valid = true;
							finalNum = newNum;
						} else {
							System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 6");
							tempNum = input.nextLine();
						}
					}

				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 11");
					tempNum = input.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 11");
				tempNum = input.nextLine();
			}


		}
		return finalNum;
		
	}

	/**
	 * Print cropList stats
	 */
	void showCrops(Farm farm) {
		ArrayList<Crop> cropList = farm.cropList;
		System.out.println("-------------------------------");
		for (int i = 0; i < cropList.size(); i++) {
			Crop curCrop = cropList.get(i);
			System.out.println(curCrop.getCropType() + ": " + String.valueOf(curCrop.getDaysTillHarvest()) +
					" days till harvest\n");
		}
		System.out.println("-------------------------------");

	
	}
	
	/**
	 * Print animalList stats
	 */
	void showAnimals(Farm farm) {
		ArrayList<Animal> animalList = farm.animalList;
		System.out.println("-------------------------------");

		for (int i = 0; i < animalList.size(); i++) {
			Animal curAnimal = animalList.get(i);
			System.out.println(curAnimal.getAnimalType() + ": " + "has happiness level " + 
			String.valueOf((int)curAnimal.getHappiness()) + "%, and healthiness level "
					+ String.valueOf((int)curAnimal.getHealth()) + "%");
		}
		System.out.println("-------------------------------");


	}
	
	/**
	 * Shows the farm's money
	 */
	public void showFarmMoney(Farm farm) {
		System.out.println("-------------------------------");
		System.out.println("Your farm currently has $" + farm.getFarmMoney());
		System.out.println("-------------------------------");

	}

	/** 
	 * visit tool market, choose buy option
	 * @return buy option
	 */
	public int toolMarket(Farm farm, ToolMarket toolMarket) {
		System.out.println("--------------------------------");
		System.out.println("  Welcome to Tom's Tool Market");
		System.out.println("--------------------------------");
		System.out.println("You have $" + Integer.toString(farm.getFarmMoney()));
		System.out.println("What would you like to purchase?\n"
				+ "1. Harvester $" + (toolMarket.getHarvesterPrice()) +  " - Automates one crop harvesting at the end of the day\n"
				+ "2. Animal Statue $" + (toolMarket.getAnimalStatuePrice()) +  " - Animals don't lose happiness overnight\n"
				+ "3. Milk Master $" + (toolMarket.getMilkMasterPrice()) +  " - Automates milking of cows\n"
				+ "4. Shear Master $" + (toolMarket.getShearMasterPrice()) +  " - Automates shearing of sheep\n"
				+ "5. Watering Can $" + (toolMarket.getWateringCanPrice()) +  " - Reduces time till harvest of all crops further when tending to crops\n"
				+ "6. Teleportation Pad $" + (toolMarket.getTeleportationPadPrice()) +  " - Increase number of actions per day by 1\n"
				+ "7. Animal Feed $" + (toolMarket.getAnimalFeedPrice()) +  " - Used to feed animals to increase their happiness\n"
				+ "------ Or press 8 to exit ------");
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		int finalNum = 0;
		boolean valid = false;

		while (valid == false) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if ((newNum <= 8) && (newNum >= 1)) {
						valid = true;
						finalNum = newNum;

				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 8");
					tempNum = input.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 8");
				tempNum = input.nextLine();
			}


		}
		
		return finalNum;
	}
	
	/**
	 * visit crop market, choose buy option
	 * @return buy option
	 */
	public int cropMarket(Farm farm, CropMarket cropMarket) {
		System.out.println("--------------------------------");
		System.out.println("  Welcome to Cassie's Crop Market");
		System.out.println("--------------------------------");
		System.out.println("You have $" + Integer.toString(farm.getFarmMoney()));
		System.out.println("What would you like to purchase?\n"
				+ "1. Avocado ($8 Each)\n"
				+ "2. Corn ($5 Each)\n"
				+ "3. Wheat ($4 Each)\n"
				+ "4. Potato ($7 Each)\n"
				+ "5. Carrot ($10 Each)\n"
				+ "6. Apple ($6 Each)\n"
				+ "------ Or press 7 to exit ------");
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		int finalNum = 0;
		boolean valid = false;

		while (!valid) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if ((newNum <= 7) && (newNum >= 1)) {
						valid = true;
						finalNum = newNum;

				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 7");
					tempNum = input.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 7");
				tempNum = input.nextLine();
			}


		}
		
		return finalNum;
	}

	/**
	 * Visit animal market, choose buy option
	 * @return buy option
	 */
	public int animalMarket(Farm farm, AnimalMarket animalMarket) {
		System.out.println("--------------------------------");
		System.out.println("  Welcome to Andy's Animal Market");
		System.out.println("--------------------------------");
		System.out.println("You have $" + Integer.toString(farm.getFarmMoney()));
		System.out.println("What would you like to purchase?\n"
				+ "1. Cow ($10 Each)\n"
				+ "2. Pig ($8 Each)\n"
				+ "3. Chicken ($5 Each)\n"
				+ "4. Sheep ($9 Each)\n"
				+ "------ Or press 5 to exit ------");
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		int finalNum = 0;
		boolean valid = false;

		while (!valid) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if ((newNum <= 5) && (newNum >= 1)) {
						valid = true;
						finalNum = newNum;

				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 5");
					tempNum = input.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number between 1 and 5");
				tempNum = input.nextLine();
			}


		}
		
		return finalNum;
	}
	
	/**
	 * Choose buy amount for animals and crops
	 * @return buy amount
	 */
	public int buyAmount(GameEnvironment game) {
		System.out.println("How many would you like to buy?");
		System.out.println("You have $" + Integer.toString(game.farm.getFarmMoney()));
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		int finalNum = 0;
		boolean valid = false;

		while (!valid) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if (newNum >= 0) {
						valid = true;
						finalNum = newNum;

				} else {
					System.out.println("Sorry, that is not a valid choice, please enter a number above,\n"
							+ "Or you can enter 0 to exit");
					tempNum = input.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("Sorry, that is not a valid choice, please enter a number above,\n"
						+ "Or you can enter 0 to exit");
				tempNum = input.nextLine();
			}


		}
		
		return finalNum;
	}

	/**
	 * Choose which crop to tend to, or exit
	 * @return crop
	 */
	public String chooseTendToCrop(GameEnvironment game) {
		HashMap<String, Integer> inventory = game.farm.cropInventory;
		System.out.println("Which crop would you like to tend to?\n"
				+ "Avocado (You have: " + inventory.get("Avocado") + ")\n"
				+ "Corn (You have: " + inventory.get("Corn") + ")\n"
				+ "Wheat (You have: " + inventory.get("Wheat") + ")\n"
				+ "Potato (You have: " + inventory.get("Potato") + ")\n"
				+ "Carrot (You have: " + inventory.get("Carrot") + ")\n"
				+ "Apple (You have: " + inventory.get("Apple") + ")\n"
				+ "------ Or type 'exit' to exit ------");
		
		Scanner input = new Scanner(System.in);
		String finalInput = "";
		boolean valid = false;
		String tempInput = input.nextLine();
		while (!valid) {
			if (tempInput.equals("exit")) {
				valid = true;
				finalInput = "exit";
			}
			else if (inventory.containsKey(tempInput)) {
					valid = true;
					finalInput = tempInput;

			} else {
				System.out.println("Sorry, that is not a valid choice, please enter a crop or 'exit'");
				tempInput = input.nextLine();
			}
				
		}
		
		return finalInput;
	}

	/**
	 * Displays how long the game lasted and money made
	 */
	public void displayEndAdventure(GameEnvironment game) {
		System.out.println("-------- " + game.farm.getFarmName() + " Farm --------");
		System.out.println("Your game lasted " + game.gameDuration + " days...");
		System.out.println("Over this time, you made $" + (game.farm.farmMoney - game.farm.staticFarmMoney));
	}
	
}







