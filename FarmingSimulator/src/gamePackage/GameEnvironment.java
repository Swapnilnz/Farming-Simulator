package gamePackage;
import java.io.IOException;
import java.util.Scanner;



public class GameEnvironment {
	private int numDays;
	private String farmerName;
	// Need farmtype
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
				System.out.println("Hello farmer " + farmerName + "!");
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
				if ((newNum <= 15) && (newNum >= 5)) {
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

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		GameEnvironment game = new GameEnvironment();
		game.introduction();
		game.inputNumDays();
	}

}
