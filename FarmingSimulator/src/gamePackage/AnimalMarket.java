package gamePackage;

import javax.swing.JFrame;

/**
 * Animal Market; cows, chicken, sheep, and pig are bought here
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class AnimalMarket {
	/**
	 * Cow price
	 */
	private int cowPrice;
	/** 
	 * Pig price
	 */
	private int pigPrice;
	/** 
	 * Chicken price
	 */
	private int chickenPrice;
	/** 
	 * Sheep price
	 */
	private int sheepPrice;
	
	/**
	 * Constructer; sets animal prices
	 */
	public AnimalMarket() {
		cowPrice = 10;
		pigPrice = 8;
		chickenPrice = 5;
		sheepPrice = 9;
	}
	
	/**
	 * Buy cow or cause error if not enough money
	 * @param game game
	 * @param amount amount
	 */
	void buyCow(GameEnvironment game, int amount, JFrame window) {
		// Add cow, remove money
		int totalPurchasePrice = amount * cowPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addCowToFarm();
				
			}
		}
	}
	
	/**
	 * Buy pig or cause error if not enough money
	 * @param game game
	 * @param amount amount
	 */
	void buyPig(GameEnvironment game, int amount, JFrame window) {
		// Add pig, remove money
		int totalPurchasePrice = amount * pigPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addPigToFarm();
				
			}
		}
	}
	
	/**
	 * Buy chicken or cause error if not enough money
	 * @param game game
	 * @param amount amount
	 */
	void buyChicken(GameEnvironment game, int amount, JFrame window) {
		// Add chicken, remove money
		int totalPurchasePrice = amount * chickenPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addChickenToFarm();
				
			}
		}
	}
	
	/**
	 * Buy sheep or cause error if not enough money
	 * @param game game
	 * @param amount amount
	 */
	void buySheep(GameEnvironment game, int amount, JFrame window) {
		// Add sheep, remove money
		int totalPurchasePrice = amount * sheepPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addSheepToFarm();
				
			}
		}
	}
}
