package gamePackage;

import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
	private String farmType;
	public int farmMoney = 100;
	public int sheepCount = 0;
	public int cowCount = 0;
	public int pigCount = 0;
	public int chickenCount = 0;
	public double growthRate;
	public ArrayList<Animal> animalList;
	public ArrayList<Crop> cropList;
	public HashMap<String, Integer> cropInventory;
	
	public Farm(String farmType, double growthRate) {
		this.farmType = farmType;
		this.growthRate = growthRate;
		animalList = new ArrayList<Animal>();
		cropList = new ArrayList<Crop>();
		cropInventory = new HashMap<String, Integer>();
		cropInventory.put("Avocado", 0); cropInventory.put("Corn", 0); cropInventory.put("Wheat", 0);
		cropInventory.put("Potato", 0); cropInventory.put("Carrot", 0); cropInventory.put("Apple", 0);
	}
	
	/*
	 * Adds animal to list if instance of Class Animal
	 */
	public boolean chickenOnFarm() {
		for (Animal animal: animalList) {
			if (animal instanceof Chicken) {
				return true;
			} 
		} 
		return false;
	}
	
	public boolean cowOnFarm() {
		for (Animal animal: animalList) {
			if (animal instanceof Cow) {
				return true;
			} 
		} 
		return false;
	}
	
	public boolean pigOnFarm() {
		for (Animal animal: animalList) {
			if (animal instanceof Pig) {
				return true;
			} 
		} 
		return false;
	}
		
	public boolean sheepOnFarm() {
		for (Animal animal: animalList) {
			if (animal instanceof Sheep) {
				return true;
			} 
		} 
		return false;
	}
		
	public void addChickenToFarm() {
		Chicken chick = new Chicken();
		this.animalList.add(chick);
		this.chickenCount++;
	}
	
	public void addCowToFarm() {
		Cow cow = new Cow();
		this.animalList.add(cow);
		this.cowCount++;
	}
	
	public void addSheepToFarm() {
		Sheep sheep = new Sheep();
		this.animalList.add(sheep);
		this.sheepCount++;
	}
	
	public void addPigToFarm() {
		Pig pig = new Pig();
		this.animalList.add(pig);
		this.pigCount++;
	}
	/*
	 * remove sheep if sheep is on farm.
	 */
	public void removeSheep() {
		for (Animal animal: animalList) {
			if (animal instanceof Sheep) {
				this.animalList.remove(animal);
				this.sheepCount--;
				break;
			}
		}
	}
	/*
	 * remove cow if cow is on farm.
	 */
	public void removeCow() {
		for (Animal animal: animalList) {
			if (animal instanceof Cow) {
				this.animalList.remove(animal);
				this.cowCount--;
				break;
			}
		}
	}
	/*
	 * remove pig if pig is on farm.
	 */
	public void removePig() {
		for (Animal animal: animalList) {
			if (animal instanceof Pig) {
				this.animalList.remove(animal);
				this.pigCount--;
				break;
			}
		}
	}
	/*
	 * remove chicken if chicken is on farm.
	 */
	public void removeChicken() {
		for (Animal animal: animalList) {
			if (animal instanceof Chicken) {
				this.animalList.remove(animal);
				this.chickenCount--;
				break;
			}
		}
	}

	public void displayAnimalCounts() {
		System.out.printf("Number of Sheep on Farm %s\n", this.sheepCount);
		System.out.printf("Number of Cow on Farm %s\n", this.cowCount);
		System.out.printf("Number of Pig on Farm %s\n", this.pigCount);
		System.out.printf("Number of Chicken on Farm %s\n", this.chickenCount);
	}

	public void decreaseFarmMoney(int money) {
		this.farmMoney -= money;
	}
	
	public void increaseFarmMoney(int money) {
		this.farmMoney += money;
	}
	
	/*
	 * Getter and Setters below
	 */
	public void setFarmType(String farmType) {
		this.farmType = farmType;
	}

	public void setFarmMoney(int farmMoney) {
		this.farmMoney = farmMoney;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}

	public String getFarmType() {
		return this.farmType;
	}
	
	public int getFarmMoney() {
		return this.farmMoney;
	}
	
	public double getGrowthRate() {
		return this.growthRate;
	}

	public void addToCropList(Crop newCrop) {
		cropList.add(newCrop);
	}
	
	public boolean hasMoney() {
		return this.getFarmMoney() > 0;
	}
	
}

