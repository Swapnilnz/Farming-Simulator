package gamePackage;

import java.util.HashMap;

import javax.swing.JFrame;

import gamePackage.GUI.PopUp;

/**
 * Crop Market; where crops (Avocado, Corn, Wheat, Potato, Apple, Carrot) are bought
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class CropMarket {
	
	/**
	 * Dictionary of crops to their purchase price
	 */
	private HashMap<String, Integer> cropPurchaseDic;
	/**
	 * Variable for testing purposes
	 */
	public boolean test;
	/**
	 * Error popup
	 */
	public PopUp error;
	
	/**
	 * Constructer; initialises the crop purchase dictionary
	 */
	public CropMarket() {
		setCropPurchaseDic(new HashMap<String, Integer>());
		getCropPurchaseDic().put("Avocado", 8); getCropPurchaseDic().put("Corn", 5); getCropPurchaseDic().put("Wheat", 4);
		getCropPurchaseDic().put("Potato", 7); getCropPurchaseDic().put("Carrot", 10); getCropPurchaseDic().put("Apple", 6); getCropPurchaseDic().put("Animal Feed", 5);
	}
	
	/**
	 * Buy avocado or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyAvocado(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Avocado");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;
		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Avocado");
			game.farm.cropInventory.put("Avocado", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Avocado", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}
		}

	}
	
	/**
	 * Buy corn or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyCorn(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Corn");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;

		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Corn");
			game.farm.cropInventory.put("Corn", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Corn", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy wheat or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyWheat(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Wheat");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;

		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Wheat");
			game.farm.cropInventory.put("Wheat", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Wheat", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy potato or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyPotato(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Potato");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;

		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Potato");
			game.farm.cropInventory.put("Potato", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Potato", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy carrot or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyCarrot(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Carrot");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;

		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Carrot");
			game.farm.cropInventory.put("Carrot", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Carrot", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}
		}
	}
	
	/**
	 * Buy apple or error if not enough money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyApple(GameEnvironment game, int amount, JFrame window) {
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Apple");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;

		} else {
			game.farm.farmMoney -= totalPurchasePrice;
			int ogNum = game.farm.cropInventory.get("Apple");
			game.farm.cropInventory.put("Apple", ogNum + amount);
			for (int i = 0; i < amount; i++) {
				Crop newCrop = new Crop("Apple", ogNum + i + 1);
				game.farm.cropList.add(newCrop);
			}


		}
	}
	
	/**
	 * Buy animal feed; adds animal feed to farm's item list, removes money
	 * @param game main game; class GameEnvironment
	 * @param amount amount to buy
	 * @param window main screen window
	 */
	public void buyAnimalFeed(GameEnvironment game, int amount, JFrame window) {
		// Add animal feed, remove money
		int totalPurchasePrice = amount * getCropPurchaseDic().get("Animal Feed");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			// Error
			error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
			test = true;
		} else {
			game.farm.animalFeed += amount;
			game.farm.farmMoney -= totalPurchasePrice;
		}
	}

	/**
	 * @return the cropPurchaseDic
	 */
	public HashMap<String, Integer> getCropPurchaseDic() {
		return cropPurchaseDic;
	}

	/**
	 * @param cropPurchaseDic the cropPurchaseDic to set
	 */
	public void setCropPurchaseDic(HashMap<String, Integer> cropPurchaseDic) {
		this.cropPurchaseDic = cropPurchaseDic;
	}
	
	
}
