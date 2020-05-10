package gamePackage;
import java.io.IOException;
import java.util.Scanner;



public class GameEnvironment {
	private int numDays;
	private String farmerName;
	private String farmType;
	private String farmName;
	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	private void introduction() throws InterruptedException, IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Hello aspiring farmer! What is your name? ");
		String tempName = input.nextLine();
		boolean nameFound = false;
		while (nameFound == false) {
			
			int stringLength = tempName.length();
			boolean acceptableLength = false;
			if ((stringLength >= 3) && (stringLength <= 15)) {
				acceptableLength = true;
			}
			
			boolean successful = true;

			if (acceptableLength) {
				for (int i = 0; i < tempName.length(); i++) {
					String tempChar = String.valueOf(tempName.charAt(i));
				    if (alphabet.contains(tempChar) == false) {
				    	successful = false;
				    }
				}
			}

			if ((acceptableLength) && (successful)) {
				farmerName = tempName;
				nameFound = true;
		        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

				System.out.println("Hello farmer " + farmerName + ", welcome to Farming Simulator!");

			} else {
		        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("Sorry, '" + tempName + "' is an invalid name!");
				System.out.println("(Hint: name has to be 3-15 characters long and contain only letters)\n");
				System.out.println("Try again:");
				tempName = input.nextLine();
			}
			    
			
		}
	}
	
	private void inputNumDays() {
		System.out.println("How long would you like your farming adventure to last?\nYou can choose between 5 and 15 days!");
		Scanner input = new Scanner(System.in);
		String tempNum = input.nextLine();
		boolean numFound = false;
		while (numFound == false) {
			try {
				int newNum = Integer.parseInt(tempNum);
				if ((newNum <= 10) && (newNum >= 5)) {
					numFound = true;
					numDays = newNum;
					
				} else {
					System.out.println("Please enter a number between 5 and 15!\nTry again:");
					tempNum = input.nextLine();

				}
			} catch (Exception e) {
				System.out.println("Please enter a number between 5 and 15!\nTry again:");
				tempNum = input.nextLine();
			}
			

		}
	}

	private void chooseFarm() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
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
					DesertFarm farm = new DesertFarm(); farmType = farm.getFarmType();
				} else if (newNum == 2) {
					valid = true;
					// Mountain Farm
					MountainFarm farm = new MountainFarm(); farmType = farm.getFarmType();
				} else if (newNum == 3) {
					valid = true;
					// Plains Farm
					PlainsFarm farm = new PlainsFarm(); farmType = farm.getFarmType();
				} else if (newNum == 4) {
					valid = true;
					// Swamp Farm
					SwampFarm farm = new SwampFarm(); farmType = farm.getFarmType();
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
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		GameEnvironment game = new GameEnvironment();
		game.introduction();
		game.inputNumDays();
		game.chooseFarm();
	}

}
