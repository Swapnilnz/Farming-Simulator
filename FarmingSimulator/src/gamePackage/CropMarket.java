package gamePackage;

import java.util.HashMap;

public class CropMarket {
	
	HashMap<String, Integer> cropPurchaseDic;
	
	public CropMarket() {
		cropPurchaseDic = new HashMap<String, Integer>();
		cropPurchaseDic.put("Avocado", 8); cropPurchaseDic.put("Corn", 5); cropPurchaseDic.put("Wheat", 4);
		cropPurchaseDic.put("Potato", 7); cropPurchaseDic.put("Carrot", 10); cropPurchaseDic.put("Apple", 6);
	}
	
	public void buyAvocado(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Avocado");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
	
	public void buyCorn(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Corn");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
	
	public void buyWheat(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Wheat");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
	
	public void buyPotato(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Potato");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
	
	public void buyCarrot(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Carrot");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
	
	public void buyApple(GameEnvironment game) {
		UI UI = new UI();
		int amount = UI.buyAmount(game);
		int totalPurchasePrice = amount * cropPurchaseDic.get("Apple");
		int curMoney = game.farm.getFarmMoney();
		if (totalPurchasePrice > curMoney) {
			System.out.println("Sorry, you don't have enough money to buy these honey...");
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
