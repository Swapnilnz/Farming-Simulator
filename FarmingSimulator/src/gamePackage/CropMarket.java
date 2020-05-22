package gamePackage;

import java.util.HashMap;

import javax.swing.JFrame;

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
	 * int animal feed price
	 */
	private int animalFeedPrice;
	
	/**
	 * Constructer; initialises the crop purchase dictionary
	 */
	public CropMarket() {
		animalFeedPrice = 5;
		cropPurchaseDic = new HashMap<String, Integer>();
		cropPurchaseDic.put("Avocado", 8); cropPurchaseDic.put("Corn", 5); cropPurchaseDic.put("Wheat", 4);
		cropPurchaseDic.put("Potato", 7); cropPurchaseDic.put("Carrot", 10); cropPurchaseDic.put("Apple", 6); cropPurchaseDic.put("Animal Feed", 5);
	}
	
	/**
	 * Buy avocado or error if not enough money
	 * @param game game
	 * @param amount amount to buy
	 */
	void buyAvocado(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Avocado");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Avocado");
			game.farm.cropInventory.put("Avocado", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Avocado", ogNum + i);
				game.farm.cropList.add(newCrop);
			}
		}

	}
	
	/**
	 * Buy corn or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyCorn(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Corn");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Corn");
			game.farm.cropInventory.put("Corn", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Corn", ogNum + i);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy wheat or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyWheat(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Wheat");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Wheat");
			game.farm.cropInventory.put("Wheat", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Wheat", ogNum + i);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy potato or error if not enough money
	 * @param game game
	 * @param amount amount to buy
	 */
	void buyPotato(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Potato");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Potato");
			game.farm.cropInventory.put("Potato", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Potato", ogNum + i);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy carrot or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyCarrot(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Carrot");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Carrot");
			game.farm.cropInventory.put("Carrot", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Carrot", ogNum + i);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy apple or error if not enough money
	 * @param game game 
	 * @param amount amount to buy
	 */
	void buyApple(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * cropPurchaseDic.get("Apple");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Apple");
			game.farm.cropInventory.put("Apple", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Apple", ogNum + i);
				game.farm.cropList.add(newCrop);
			}


		}
	}
	
	/**
	 * Buy animal feed; adds animal feed to farm's item list, removes money
	 * @param game game
	 */
	void buyAnimalFeed(GameEnvironment game, int amount, JFrame window) {
		// Add animal feed, remove money
		int totalPurchasePrice = amount * cropPurchaseDic.get("Animal Feed");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			NotEnoughMoney error = new NotEnoughMoney(window);
			error.setVisible(true);
		} else {
			game.farm.animalFeed += amount;
			game.farm.farmMoney -= totalPurchasePrice;
		}
	}
	
	/**
	 * Check if amount is greater than zero
	 * @param amount amount
	 * @return boolean
	 */
	boolean checkAmount(int amount) {
		if (amount >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @return the animalFeedPrice
	 */
	public int getAnimalFeedPrice() {
		return animalFeedPrice;
	}

	
	/**
	 * @param animalFeedPrice the animalFeedPrice to set
	 */
	public void setAnimalFeedPrice(int animalFeedPrice) {
		this.animalFeedPrice = animalFeedPrice;
	}

}
