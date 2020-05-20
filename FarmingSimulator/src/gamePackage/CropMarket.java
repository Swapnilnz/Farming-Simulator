package gamePackage;

import java.util.HashMap;

/**
 * Crop Market; where crops (Avocado, Corn, Wheat, Potato, Apple, Carrot) are bought
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class CropMarket {
	
	/**
	 * Dictionary of crops to their purchase price
	 */
	private HashMap<String, Integer> cropPurchaseDic;
	
	/**
	 * Constructer; initialises the crop purchase dictionary
	 */
	public CropMarket() {
		cropPurchaseDic = new HashMap<String, Integer>();
		cropPurchaseDic.put("Avocado", 8); cropPurchaseDic.put("Corn", 5); cropPurchaseDic.put("Wheat", 4);
		cropPurchaseDic.put("Potato", 7); cropPurchaseDic.put("Carrot", 10); cropPurchaseDic.put("Apple", 6);
	}
	
	/**
	 * Buy avocado or error if not enough money
	 * @param game game
	 * @param amount amount to buy
	 */
	void buyAvocado(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Avocado");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Avocado");
			game.farm.cropInventory.put("Avocado", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Avocado");
				game.farm.cropList.add(newCrop);
			}
		}

	}
	
	/**
	 * Buy corn or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyCorn(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Corn");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Corn");
			game.farm.cropInventory.put("Corn", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Corn");
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy wheat or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyWheat(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Wheat");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Wheat");
			game.farm.cropInventory.put("Wheat", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Wheat");
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy potato or error if not enough money
	 * @param game game
	 * @param amount amount to buy
	 */
	void buyPotato(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Potato");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Potato");
			game.farm.cropInventory.put("Potato", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Potato");
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy carrot or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyCarrot(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Carrot");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Carrot");
			game.farm.cropInventory.put("Carrot", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Carrot");
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy apple or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyApple(GameEnvironment game, int amount) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Apple");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			System.out.println("Sorry, you don't have enough money to buy these...");
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Apple");
			game.farm.cropInventory.put("Apple", ogNum + amount);
			System.out.println("Thanks for your purchase");
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Apple");
				game.farm.cropList.add(newCrop);
			}
		}
	}
	

}
