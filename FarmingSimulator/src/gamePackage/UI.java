package gamePackage;

import java.util.Scanner;

public class UI {
	private GameEnvironment game;
	
	public UI(GameEnvironment inputGame) {
		game = inputGame;
	}
	
	/**
	 * Procedure that gets the farmers name through cmd input; follows given guidelines of 3-15 length alphabetic String
	 */
	public void inputFarmerName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello aspiring farmer! What is your name? ");
		String tempName = input.nextLine();
		boolean nameFound = false;
		while (nameFound == false) {
			boolean valid = game.farmerNameChecker(tempName);
			
			if (valid) {
				game.farmerName = tempName;
				nameFound = true;
				System.out.println("Hello farmer " + game.farmerName + ", welcome to Farming Simulator!");

			} else {
				System.out.println("Sorry, '" + tempName + "' is an invalid name!");
				System.out.println("(Hint: name has to be 3-15 characters long and contain only letters)\n");
				System.out.println("Try again:");
				tempName = input.nextLine();
			}
			    
			
		}
	}

	/**
	 * Procedure that gets the number of days the farmer would like to play (between 5 and 15)
	 */
	public void inputNumDays() {
		System.out.println("How long would you like your farming adventure to last?\nYou can choose between 5 and 15 days!");
		boolean numFound = false;
		while (numFound == false) {
			try {
				Scanner input = new Scanner(System.in);
				int tempNum = input.nextInt();
				if ((tempNum <= 10) && (tempNum >= 5)) {
					numFound = true;
					game.numDays = tempNum;
					
				} else {
					System.out.println("Please enter a number between 5 and 15!\nTry again:");
					tempNum = input.nextInt();

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
	public void inputChooseFarm() {
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
					DesertFarm dFarm = new DesertFarm(); game.farmType = dFarm.getFarmType(); game.farm = dFarm;
				} else if (newNum == 2) {
					valid = true;
					// Mountain Farm
					MountainFarm mFarm = new MountainFarm(); game.farmType = mFarm.getFarmType(); game.farm = mFarm;
				} else if (newNum == 3) {
					valid = true;
					// Plains Farm
					PlainsFarm pFarm = new PlainsFarm(); game.farmType = pFarm.getFarmType(); game.farm = pFarm;
				} else if (newNum == 4) {
					valid = true;
					// Swamp Farm
					SwampFarm sFarm = new SwampFarm(); game.farmType = sFarm.getFarmType(); game.farm = sFarm;
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
	public void inputFarmName() {
		System.out.println("You have chosen a " + game.farmType
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
				game.farmName = game.farmerName + "'s Farm";
				System.out.println("Okay! Your farm's name is " + game.farmName + "'.");
				nameFound = true;
			} else {
				System.out.println("Sorry! Your name is too long, please try to keep it within 20 characters.");
				tempName = input.nextLine();
			}
		}

	}

}
