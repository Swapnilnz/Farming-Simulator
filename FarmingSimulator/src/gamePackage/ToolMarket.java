package gamePackage;
import java.util.Random;

public class ToolMarket {
	private int harvesterPrice;
	private int wateringCanPrice;
	private int animalStatuePrice;
	private int milkMasterPrice;
	private int shearMasterPrice;
	private int teleportationPadPrice;
	
	public ToolMarket() {
		harvesterPrice = 30;
		wateringCanPrice = 30;
		animalStatuePrice = 40;
		milkMasterPrice = 40;
		shearMasterPrice = 40;
		teleportationPadPrice = 100;
		
	}
	

	public void buyHarvester(GameEnvironment game) {
		// Add harvester, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= harvesterPrice) {
			game.farm.addToItemList("Harvester");
			game.farm.farmMoney -= harvesterPrice;
			System.out.println("Tom says: \nThanks for the purchase pal");

			if (game.farm.cropList.size() > 0) {
				Random rnd = new Random();
				int rand = rnd.nextInt(game.farm.cropList.size());
				game.farm.cropList.get(rand).harvest(game);
			}
					
			
		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyWateringCan(GameEnvironment game) {
		// Add watering can, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= wateringCanPrice) {
			game.farm.addToItemList("Watering Can");
			game.farm.farmMoney -= wateringCanPrice;

			System.out.println("Tom says: \nThanks for the purchase pal");
		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyAnimalStatue(GameEnvironment game) {
		// Add animalStatue, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= animalStatuePrice) {
			game.farm.addToItemList("Animal Statue");
			game.farm.farmMoney -= animalStatuePrice;

			System.out.println("Tom says: \nThanks for the purchase pal");
			

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}	
	}
	
	public void buyMilkMaster(GameEnvironment game) {
		// Add milk master, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= milkMasterPrice) {
			game.farm.addToItemList("Milk Master");
			game.farm.farmMoney -= milkMasterPrice;

			System.out.println("Tom says: \nThanks for the purchase pal");
			

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyShearMaster(GameEnvironment game) {
		// Add shear master, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= shearMasterPrice) {
			game.farm.addToItemList("Shear Master");
			game.farm.farmMoney -= shearMasterPrice;

			System.out.println("Tom says: \nThanks for the purchase pal");

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyTeleportationPad(GameEnvironment game) {
		// Add teleportation pad, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= teleportationPadPrice) {
			game.farm.addToItemList("Teleportation Pad");
			game.farm.farmMoney -= teleportationPadPrice;
			System.out.println("Tom says: \nThanks for the purchase pal\nYou now have $");
			game.setNumActions(game.getNumActions() + 1);
		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}

	
	public int getHarvesterPrice() {
		return harvesterPrice;
	}
	
	public void setHarvesterPrice(int newPrice) {
		harvesterPrice = newPrice;
	}
	
	public int getWateringCanPrice() {
		return wateringCanPrice;
	}
	
	public void setWateringCanPrice(int newPrice) {
		wateringCanPrice = newPrice;
	}
	
	public int getAnimalStatuePrice() {
		return animalStatuePrice;
	}
	
	public void setAnimalStatuePrice(int newPrice) {
		animalStatuePrice = newPrice;
	}
	
	public int getMilkMasterPrice() {
		return milkMasterPrice;
	}
	
	public void setMilkMasterPrice(int newPrice) {
		milkMasterPrice = newPrice;
	}
	
	public int getShearMasterPrice() {
		return shearMasterPrice;
	}
	
	public void setShearMasterPrice(int newPrice) {
		shearMasterPrice = newPrice;
	}
	
	public int getTeleportationPadPrice() {
		return teleportationPadPrice;
	}
	
	public void setTeleportationPadPrice(int newPrice) {
		teleportationPadPrice = newPrice;
	}
}
