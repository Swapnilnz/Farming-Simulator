package gamePackage;

public class AnimalMarket {
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
	 * Construcer; sets animal prices
	 */
	public AnimalMarket() {
		cowPrice = 10;
		pigPrice = 8;
		chickenPrice = 5;
		sheepPrice = 9;
	}
	
	/**
	 * Buy cow or cause error if not enough money
	 * @param game
	 */
	public void buyCow(GameEnvironment game, int amount) {
		// Add cow, remove money
		int totalPurchasePrice = amount * cowPrice;
		
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry mate, you don't have enough cash for that.");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				game.farm.addCowToFarm();
				
			}
		}
	}
	
	/**
	 * Buy pig or cause error if not enough money
	 * @param game
	 * @param amount
	 */
	public void buyPig(GameEnvironment game, int amount) {
		// Add pig, remove money
		int totalPurchasePrice = amount * pigPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry mate, you don't have enough cash for that.");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				game.farm.addPigToFarm();
				
			}
		}
	}
	
	/**
	 * Buy chicken or cause error if not enough money
	 * @param game
	 * @param amount
	 */
	public void buyChicken(GameEnvironment game, int amount) {
		// Add chicken, remove money
		int totalPurchasePrice = amount * chickenPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry mate, you don't have enough cash for that.");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				game.farm.addChickenToFarm();
				
			}
		}
	}
	
	/**
	 * Buy sheep or cause error if not enough money
	 * @param game
	 * @param amount
	 */
	public void buySheep(GameEnvironment game, int amount) {
		// Add sheep, remove money
		int totalPurchasePrice = amount * sheepPrice;
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry mate, you don't have enough cash for that.");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				game.farm.addSheepToFarm();
				
			}
		}
	}
}
