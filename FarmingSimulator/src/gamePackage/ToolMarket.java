package gamePackage;

import javax.swing.JFrame;

/**
 * Contains all methods associated with buying items from the tool market
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class ToolMarket {
	/**
	 * Int harvester price
	 */
	private int harvesterPrice;
	/**
	 * Int watering can price
	 */
	private int wateringCanPrice;
	/**
	 * int animal statue price
	 */
	private int animalStatuePrice;
	/**
	 * int milk master price
	 */
	private int milkMasterPrice;
	/**
	 * int shear master price
	 */
	private int shearMasterPrice;
	/**
	 * int tele pad price
	 */
	private int teleportationPadPrice;

	
	/**
	 * Constructer; initialises all item prices
	 */
	public ToolMarket() {
		harvesterPrice = 50;
		wateringCanPrice = 50;
		animalStatuePrice = 60;
		milkMasterPrice = 60;
		shearMasterPrice = 60;
		teleportationPadPrice = 100;
		
	}
	
	/**
	 * Buy harvester; adds harvester to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyHarvester(GameEnvironment game, JFrame window) {
		// Add harvester, remove money
		if (game.farm.itemList.contains("Harvester")) {
			// Error, already have one
			PopUp error = new PopUp(game, window, "You already have a Harvester!");
			error.setVisible(true);
		} else {
			int farmMoney = game.farm.getFarmMoney();
			if (farmMoney >= harvesterPrice) {
				game.farm.addToItemList("Harvester");
				game.farm.farmMoney -= harvesterPrice;
			} else {
				PopUp error = new PopUp(game, window, "You don't have enough money for that!");
				error.setVisible(true);
			}
		}
		
	}
	
	/**
	 * Buy watering can; adds watering can to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyWateringCan(GameEnvironment game, JFrame window) {
		// Add watering can, remove money
		if (game.farm.itemList.contains("Watering Can")) {
			// Error, already have one
			PopUp error = new PopUp(game, window, "You already have an Ultimate Watering Can!");
			error.setVisible(true);
		} else {
			int farmMoney = game.farm.getFarmMoney();
			if (farmMoney >= wateringCanPrice) {
				game.farm.addToItemList("Watering Can");
				game.farm.farmMoney -= wateringCanPrice;
			} else {
				PopUp error = new PopUp(game, window, "You don't have enough money for that!");
				error.setVisible(true);
			}
		}
	}
	
	/**
	 * Buy animal statue; adds animal statue to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyAnimalStatue(GameEnvironment game, JFrame window) {
		// Add animalStatue, remove money
		if (game.farm.itemList.contains("Animal Statue")) {
			// Error, already have one
			PopUp error = new PopUp(game, window, "You already have an Animal Statue!");
			error.setVisible(true);
		} else {
			int farmMoney = game.farm.getFarmMoney();
			if (farmMoney >= animalStatuePrice) {
				game.farm.addToItemList("Animal Statue");
				game.farm.farmMoney -= animalStatuePrice;
			} else {
				PopUp error = new PopUp(game, window, "You don't have enough money for that!");
				error.setVisible(true);
			}
		}
		
	}
	
	/**
	 * Buy milk master; adds milk master to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyMilkMaster(GameEnvironment game, JFrame window) {
		// Add milk master, remove money
		if (game.farm.itemList.contains("Milk Master")) {
			// Error, already have one
			PopUp error = new PopUp(game, window, "You already have a Milk Master!");
			error.setVisible(true);
		} else {
			int farmMoney = game.farm.getFarmMoney();
			if (farmMoney >= milkMasterPrice) {
				game.farm.addToItemList("Milk Master");
				game.farm.farmMoney -= milkMasterPrice;
			} else {
				PopUp error = new PopUp(game, window, "You don't have enough money for that!");
				error.setVisible(true);
			}
		}
	}
	
	/**
	 * Buy shear master; adds shear master to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyShearMaster(GameEnvironment game, JFrame window) {
		// Add shear master, remove money
		if (game.farm.itemList.contains("Shear Master")) {
			// Error, already have one
			PopUp error = new PopUp(game, window, "You already have an Shear Master!");
			error.setVisible(true);
		} else {
			int farmMoney = game.farm.getFarmMoney();
			if (farmMoney >= shearMasterPrice) {
				game.farm.addToItemList("Shear Master");
				game.farm.farmMoney -= shearMasterPrice;
			} else {
				PopUp error = new PopUp(game, window, "You don't have enough money for that!");
				error.setVisible(true);
			}
		}
	}
	
	/**
	 * Buy tele pad; adds tele pad to farm's item list, removes money
	 * @param game main game
	 * @param window main screen window
	 */
	public void buyTeleportationPad(GameEnvironment game, JFrame window) {
		// Add teleportation pad, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= teleportationPadPrice) {
			game.farm.addToItemList("Teleportation Pad");
			game.farm.farmMoney -= teleportationPadPrice;
			game.farm.telePadCount += 1;
		} else {
			PopUp error = new PopUp(game, window, "You don't have enough money for that!");
			error.setVisible(true);
		}
	}


	/**
	 * @return the harvesterPrice
	 */
	public int getHarvesterPrice() {
		return harvesterPrice;
	}

	
	/**
	 * @param harvesterPrice the harvesterPrice to set
	 */
	public void setHarvesterPrice(int harvesterPrice) {
		this.harvesterPrice = harvesterPrice;
	}

	
	/**
	 * @return the wateringCanPrice
	 */
	public int getWateringCanPrice() {
		return wateringCanPrice;
	}

	
	/**
	 * @param wateringCanPrice the wateringCanPrice to set
	 */
	public void setWateringCanPrice(int wateringCanPrice) {
		this.wateringCanPrice = wateringCanPrice;
	}

	
	/**
	 * @return the animalStatuePrice
	 */
	public int getAnimalStatuePrice() {
		return animalStatuePrice;
	}

	
	/**
	 * @param animalStatuePrice the animalStatuePrice to set
	 */
	public void setAnimalStatuePrice(int animalStatuePrice) {
		this.animalStatuePrice = animalStatuePrice;
	}

	
	/**
	 * @return the milkMasterPrice
	 */
	public int getMilkMasterPrice() {
		return milkMasterPrice;
	}

	
	/**
	 * @param milkMasterPrice the milkMasterPrice to set
	 */
	public void setMilkMasterPrice(int milkMasterPrice) {
		this.milkMasterPrice = milkMasterPrice;
	}

	
	/**
	 * @return the shearMasterPrice
	 */
	public int getShearMasterPrice() {
		return shearMasterPrice;
	}

	
	/**
	 * @param shearMasterPrice the shearMasterPrice to set
	 */
	public void setShearMasterPrice(int shearMasterPrice) {
		this.shearMasterPrice = shearMasterPrice;
	}

	
	/**
	 * @return the teleportationPadPrice
	 */
	public int getTeleportationPadPrice() {
		return teleportationPadPrice;
	}

	
	/**
	 * @param teleportationPadPrice the teleportationPadPrice to set
	 */
	public void setTeleportationPadPrice(int teleportationPadPrice) {
		this.teleportationPadPrice = teleportationPadPrice;
	}

	

	
	
}
