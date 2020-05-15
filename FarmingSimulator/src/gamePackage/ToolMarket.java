package gamePackage;

public class ToolMarket {
	private int harvesterPrice;
	private int wateringCanPrice;
	private int animalStatuePrice;
	private int milkMasterPrice;
	private int shearMasterPrice;
	private int quadBikePrice;
	
	public ToolMarket() {
		harvesterPrice = 30;
		wateringCanPrice = 30;
		animalStatuePrice = 40;
		milkMasterPrice = 40;
		shearMasterPrice = 40;
		quadBikePrice = 50;
		
	}
	

	public void buyHarvester(GameEnvironment game) {
		// Add harvester, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= harvesterPrice) {
			game.farm.addToItemList("Harvester");
		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyWateringCan(GameEnvironment game) {
		// Add watering can, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= wateringCanPrice) {
			game.farm.addToItemList("Watering Can");
			System.out.println("Tom says: \nThanks for the purcahse pal");
		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyAnimalStatue(GameEnvironment game) {
		// Add animalStatue, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= animalStatuePrice) {
			game.farm.addToItemList("Animal Statue");
			System.out.println("Tom says: \nThanks for the purcahse pal");

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}	
	}
	
	public void buyMilkMaster(GameEnvironment game) {
		// Add milk master, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= milkMasterPrice) {
			game.farm.addToItemList("Milk Master");
			System.out.println("Tom says: \nThanks for the purcahse pal");

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyShearMaster(GameEnvironment game) {
		// Add shear master, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= shearMasterPrice) {
			game.farm.addToItemList("Shear Master");
			System.out.println("Tom says: \nThanks for the purcahse pal");

		} else {
			System.out.println("Tom says:\nSorry, you can't afford that, come back when you're not poor.");
		}
	}
	
	public void buyQuadBike(GameEnvironment game) {
		// Add quad bike, remove money
		int farmMoney = game.farm.getFarmMoney();
		if (farmMoney >= quadBikePrice) {
			game.farm.addToItemList("Quad Bike");
			System.out.println("Tom says: \nThanks for the purcahse pal");

			game.setNumActions(3);
			game.hasAnimalStatue = true;
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
	
	public int getQuadBikePrice() {
		return quadBikePrice;
	}
	
	public void setQuadBikePrice(int newPrice) {
		quadBikePrice = newPrice;
	}
}
