package gamePackage;

public class AnimalMarket {
	private int cowPrice;
	private int pigPrice;
	private int chickenPrice;
	private int sheepPrice;
	
	public AnimalMarket() {
		cowPrice = 10;
		pigPrice = 8;
		chickenPrice = 5;
		sheepPrice = 9;
	}
	
	public void buyCow(GameEnvironment game) {
		// Add cow, remove money
		UI UI = new UI();
		int amount = UI.buyAmount(game);
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
	
	public void buyPig(GameEnvironment game) {
		// Add pig, remove money
		UI UI = new UI();
		int amount = UI.buyAmount(game);
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
	
	public void buyChicken(GameEnvironment game) {
		// Add chicken, remove money
		UI UI = new UI();
		int amount = UI.buyAmount(game);
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
	
	public void buySheep(GameEnvironment game) {
		// Add sheep, remove money
		UI UI = new UI();
		int amount = UI.buyAmount(game);
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
