package gamePackage;

import javax.swing.JFrame;

/**
 * Animal Market; cows, chicken, sheep, and pig are bought here
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class AnimalMarket {
	/**
	 * Cow price
	 */
	int cowPrice;
	/** 
	 * Pig price
	 */
	int pigPrice;
	/** 
	 * Chicken price
	 */
	int chickenPrice;
	/** 
	 * Sheep price
	 */
	int sheepPrice;
	
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
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyCow(GameEnvironment game, int amount, JFrame window) {
		// Add cow, remove money
		int totalPurchasePrice = amount * cowPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			PopUp error = new PopUp(game, window, "You don't have enough money for that!");
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
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyPig(GameEnvironment game, int amount, JFrame window) {
		// Add pig, remove money
		int totalPurchasePrice = amount * pigPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			PopUp error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addPigToFarm();
				
			}
		}
	}
	
	/**
	 * Buy chicken or cause error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyChicken(GameEnvironment game, int amount, JFrame window) {
		// Add chicken, remove money
		int totalPurchasePrice = amount * chickenPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			PopUp error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addChickenToFarm();
				
			}
		}
	}
	
	/**
	 * Buy sheep or cause error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buySheep(GameEnvironment game, int amount, JFrame window) {
		// Add sheep, remove money
		int totalPurchasePrice = amount * sheepPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			PopUp error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			for (int i = 0; i < amount; i++) {
				game.farm.addSheepToFarm();
				
			}
		}
	}

	/**
	 * @return the cowPrice
	 */
	public int getCowPrice() {
		return cowPrice;
	}

	/**
	 * @param cowPrice the cowPrice to set
	 */
	public void setCowPrice(int cowPrice) {
		this.cowPrice = cowPrice;
	}

	/**
	 * @return the pigPrice
	 */
	public int getPigPrice() {
		return pigPrice;
	}

	/**
	 * @param pigPrice the pigPrice to set
	 */
	public void setPigPrice(int pigPrice) {
		this.pigPrice = pigPrice;
	}

	/**
	 * @return the chickenPrice
	 */
	public int getChickenPrice() {
		return chickenPrice;
	}

	/**
	 * @param chickenPrice the chickenPrice to set
	 */
	public void setChickenPrice(int chickenPrice) {
		this.chickenPrice = chickenPrice;
	}

	/**
	 * @return the sheepPrice
	 */
	public int getSheepPrice() {
		return sheepPrice;
	}

	/**
	 * @param sheepPrice the sheepPrice to set
	 */
	public void setSheepPrice(int sheepPrice) {
		this.sheepPrice = sheepPrice;
	}
}
