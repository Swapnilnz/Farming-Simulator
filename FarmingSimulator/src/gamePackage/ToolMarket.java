package gamePackage;

public class ToolMarket {
	private int harvesterPrice = 15;
	private int wateringCanPrice = 15;
	private int animalStatuePrice = 18;
	private int milkMasterPrice = 20;
	private int shearMasterPrice = 20;
	private int quadBikePrice = 20;
	
	public ToolMarket() {
		harvesterPrice = 30;
		wateringCanPrice = 30;
		animalStatuePrice = 40;
		milkMasterPrice = 40;
		shearMasterPrice = 40;
		quadBikePrice = 50;
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

	public void buyHarvester() {
		// Add harvester, remove money
	}
	
	public void buyWateringCan() {
		// Add watering can, remove money
	}
	
	public void buyAnimalStatue() {
		// Add animalStatue, remove money
	}
	
	public void buyMilkMaster() {
		// Add milk master, remove money
	}
	
	public void buyShearMaster() {
		// Add shear master, remove money
	}
	
	public void buyQuadBike() {
		// Add quad bike, remove money
	}
	
}
