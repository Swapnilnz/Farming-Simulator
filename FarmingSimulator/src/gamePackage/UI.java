package gamePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UI {
	
	public UI() {
	}
	
	/**
	 * Procedure that gets the farmers name through cmd input; follows given guidelines of 3-15 length alphabetic String
	 */
	public String inputFarmerName(GameEnvironment game) {
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
	public int inputFarmerAge(GameEnvironment game) {
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
	public void inputNumDays(GameEnvironment game) {
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
	public void inputChooseFarm(GameEnvironment game) {
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
	public void inputFarmName(GameEnvironment game) {
		System.out.println("You have chosen a " + game.getFarm().getFarmType()
				+ "\nIt is time to choose a name for your farm.\n"
				+ "Type below:");
		Scanner input = new Scanner(System.in);
		String tempName = input.nextLine();
		boolean nameFound = false;
		while (nameFound == false) {
			if ((tempName.length() <= 20) && (tempName.length() > 0)) {
				game.farmName = tempName;
				System.out.println("Good choice! Your farm's name is now '" + game.farmName + "'.");
				nameFound = true;
			} else if (tempName.length() == 0) {
				game.farmName = game.farmer.name + "'s Farm";
				System.out.println("Okay! Your farm's name is " + game.farmName + "'.");
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
	public void inputStartAdventure(GameEnvironment game) {
		System.out.println("Awesome! Would you like to start your adventure? (Y/N)");
		Scanner input = new Scanner(System.in);
		String[] choices = new String[]{"Yes", "y", "Y", "yes"};
		List<String> list = Arrays.asList(choices);
		boolean valid = false;
		String tempAns = input.nextLine();
		while (valid == false) {

			if (list.contains(tempAns)) {
				valid = true;
				game.adventureRunning = true;
				
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
	public int inputChooseAction(GameEnvironment game, boolean withActions) {
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
				+ "8. Feed farm animals to make them healthier and happier\n"
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
	 * @param farm
	 */
	public void showCrops(Farm farm) {
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
	 * @param farm
	 */
	public void showAnimals(Farm farm) {
		ArrayList<Animal> animalList = farm.animalList;
		System.out.println("-------------------------------");

		for (int i = 0; i < animalList.size(); i++) {
			Animal curAnimal = animalList.get(i);
			System.out.println(curAnimal.getAnimalType() + ": " + "has happiness level " + 
			String.valueOf(curAnimal.getHappiness()) + "\n");
		}
		System.out.println("-------------------------------");


	}
	
	public void showFarmMoney(Farm farm) {
		System.out.println("-------------------------------");
		System.out.println("Your farm currently has $" + farm.getFarmMoney());
		System.out.println("-------------------------------");

	}
}
