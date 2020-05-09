package gamePackage;
import java.util.Scanner;


public class GameEnvironment {
	private int numDays;
	private String farmerName;
	// Need farmtype
	private String farmName;
	private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	private void introduction() {

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
				System.out.println("Hello " + farmerName);
				clearScreen();
			} else {
				System.out.println("Sorry, invalid name! (Hint: name has to be 3-15 characters long and contain only letters)");
				clearScreen();
				System.out.println("Try again:");
				tempName = input.nextLine();
			}
			    
			
		}
	}
	public static void clearScreen() {  
	    System.out.flush();  
	}  
//	private int getNumDays() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameEnvironment game = new GameEnvironment();
		game.introduction();
	}

}
