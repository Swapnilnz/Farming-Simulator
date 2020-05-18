package gamePackage;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Contains methods for adding/removing farm animals and money
 * Also contains the farm's animal list, and crop list
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class Farm {
	/**
	 * Type of farm (Desert, Mountain, Plains, Swamp)
	 */
	private String farmType;
	/**
	 * Contains farm money
	 */
	public int farmMoney;
	/**
	 * Number of sheep on the farm
	 */
	public int sheepCount = 0;
	/**
	 * Number of cow on the farm
	 */
	public int cowCount = 0;
	/**
	 * Number of pigs
	 */
	public int pigCount = 0;
	/**
	 * Number of chickens
	 */
	public int chickenCount = 0;
	/**
	 * Growthrate of the farm (usually 1)
	 */
	public int growthRate;
	/**
	 * Array list of animals
	 */
	public ArrayList<Animal> animalList;
	/**
	 * Array list of crops
	 */
	public ArrayList<Crop> cropList;
	/**
	 * Dictionary that holds count of each crop
	 */
	public HashMap<String, Integer> cropInventory;
	/**
	 * Array list of items on the farm
	 */
	public ArrayList<String> itemList;
	/**
	 * Number of animal feed available
	 */
	public int animalFeed;
	/**
	 * Simple boolean for if the farm is/is not maintained
	 */
	public boolean maintained = false;
	/**
	 * Holds the farm's name
	 */
	public String farmName;
	/**
	 * Money that the player starts with
	 */
	public int staticFarmMoney = 50;

	/**
	 * Constructer; initialises crop inventory, item list, crop list, animal feed, farm money
	 * @param farmType
	 * @param growthRate
	 */
	public Farm(String farmType, int growthRate) {
		this.farmType = farmType;
		this.growthRate = growthRate;
		farmMoney = staticFarmMoney;
		animalFeed= 0;
		animalList = new ArrayList<Animal>();
		cropList = new ArrayList<Crop>();
		cropInventory = new HashMap<String, Integer>();
		itemList = new ArrayList<String>();
		cropInventory.put("Avocado", 0); cropInventory.put("Corn", 0); cropInventory.put("Wheat", 0);
		cropInventory.put("Potato", 0); cropInventory.put("Carrot", 0); cropInventory.put("Apple", 0);
	}
	
	/**
	 * Add item to item list
	 * @param item
	 */
	public void addToItemList(String item) {
		itemList.add(item);
	}
	/**
	 * Adds chicken to farm	
	 */
	public void addChickenToFarm() {
		Chicken chick = new Chicken();
		this.animalList.add(chick);
		this.chickenCount++;
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
	
	/**
	 * Adds cow to farm	
	 */
	public void addCowToFarm() {
		Cow cow = new Cow();
		this.animalList.add(cow);
		this.cowCount++;
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
	
	/**
	 * Adds sheep to farm	
	 */
	public void addSheepToFarm() {
		Sheep sheep = new Sheep();
		this.animalList.add(sheep);
		this.sheepCount++;
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
	
	/**
	 * Adds pig to farm	
	 */
	public void addPigToFarm() {
		Pig pig = new Pig();
		this.animalList.add(pig);
		this.pigCount++;
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
	

	/**
	 * Display count of each animal 
	 */
	public void displayAnimalCounts() {
		System.out.printf("Number of Sheep on Farm %s\n", this.sheepCount);
		System.out.printf("Number of Cow on Farm %s\n", this.cowCount);
		System.out.printf("Number of Pig on Farm %s\n", this.pigCount);
		System.out.printf("Number of Chicken on Farm %s\n", this.chickenCount);
	}

	/**
	 * Decrease farm money
	 * @param money
	 */
	public void decreaseFarmMoney(int money) {
		this.farmMoney -= money;
	}
	
	/**
	 * Increase farm money
	 * @param money
	 */
	public void increaseFarmMoney(int money) {
		this.farmMoney += money;
	}


	
	/**
	 * @return the farmType
	 */
	public String getFarmType() {
		return farmType;
	}


	/**
	 * @param farmType the farmType to set
	 */
	public void setFarmType(String farmType) {
		this.farmType = farmType;
	}


	/**
	 * @return the farmMoney
	 */
	public int getFarmMoney() {
		return farmMoney;
	}


	/**
	 * @param farmMoney the farmMoney to set
	 */
	public void setFarmMoney(int farmMoney) {
		this.farmMoney = farmMoney;
	}


	/**
	 * @return the sheepCount
	 */
	public int getSheepCount() {
		return sheepCount;
	}


	/**
	 * @param sheepCount the sheepCount to set
	 */
	public void setSheepCount(int sheepCount) {
		this.sheepCount = sheepCount;
	}


	/**
	 * @return the cowCount
	 */
	public int getCowCount() {
		return cowCount;
	}


	/**
	 * @param cowCount the cowCount to set
	 */
	public void setCowCount(int cowCount) {
		this.cowCount = cowCount;
	}


	/**
	 * @return the pigCount
	 */
	public int getPigCount() {
		return pigCount;
	}


	/**
	 * @param pigCount the pigCount to set
	 */
	public void setPigCount(int pigCount) {
		this.pigCount = pigCount;
	}


	/**
	 * @return the chickenCount
	 */
	public int getChickenCount() {
		return chickenCount;
	}


	/**
	 * @param chickenCount the chickenCount to set
	 */
	public void setChickenCount(int chickenCount) {
		this.chickenCount = chickenCount;
	}


	/**
	 * @return the growthRate
	 */
	public int getGrowthRate() {
		return growthRate;
	}


	/**
	 * @param growthRate the growthRate to set
	 */
	public void setGrowthRate(int growthRate) {
		this.growthRate = growthRate;
	}


	/**
	 * @return the animalList
	 */
	public ArrayList<Animal> getAnimalList() {
		return animalList;
	}


	/**
	 * @param animalList the animalList to set
	 */
	public void setAnimalList(ArrayList<Animal> animalList) {
		this.animalList = animalList;
	}


	/**
	 * @return the cropList
	 */
	public ArrayList<Crop> getCropList() {
		return cropList;
	}


	/**
	 * @param cropList the cropList to set
	 */
	public void setCropList(ArrayList<Crop> cropList) {
		this.cropList = cropList;
	}


	/**
	 * @return the cropInventory
	 */
	public HashMap<String, Integer> getCropInventory() {
		return cropInventory;
	}


	/**
	 * @param cropInventory the cropInventory to set
	 */
	public void setCropInventory(HashMap<String, Integer> cropInventory) {
		this.cropInventory = cropInventory;
	}


	/**
	 * @return the itemList
	 */
	public ArrayList<String> getItemList() {
		return itemList;
	}


	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(ArrayList<String> itemList) {
		this.itemList = itemList;
	}


	/**
	 * @return the animalFeed
	 */
	public int getAnimalFeed() {
		return animalFeed;
	}


	/**
	 * @param animalFeed the animalFeed to set
	 */
	public void setAnimalFeed(int animalFeed) {
		this.animalFeed = animalFeed;
	}


	/**
	 * @return the maintained
	 */
	public boolean isMaintained() {
		return maintained;
	}


	/**
	 * @param maintained the maintained to set
	 */
	public void setMaintained(boolean maintained) {
		this.maintained = maintained;
	}


	/**
	 * @return the farmName
	 */
	public String getFarmName() {
		return farmName;
	}


	/**
	 * @param farmName the farmName to set
	 */
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}


	/**
	 * @return the staticFarmMoney
	 */
	public int getStaticFarmMoney() {
		return staticFarmMoney;
	}


	/**
	 * @param staticFarmMoney the staticFarmMoney to set
	 */
	public void setStaticFarmMoney(int staticFarmMoney) {
		this.staticFarmMoney = staticFarmMoney;
	}
	
	
}

