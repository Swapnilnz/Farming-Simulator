package gamePackage;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Farm {
	private String farmType;
	private int farmMoney = 100;
	int sheepCount = 0;
	int cowCount = 0;
	int pigCount = 0;
	int chickenCount = 0;
	private double growthRate;
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	/*
	 * Adds animal to list if instance of Class Animal
	 */
	public void addAnimal(Object o) {
		if (o instanceof Animal) {
			animalList.add((Animal) o);
		}
	}
	/*
	 * Removes the first animal in the list if there!
	 * 
	 */
	public void removeAnimal(Animal animal) {
		if (animalList.contains(animal)) {
			this.animalList.remove(animal);
		}
	}
	
	public void countUpdateAnimals() {
		this.sheepCount = 0;
		this.cowCount = 0;
		this.pigCount = 0;
		this.chickenCount = 0;
		for (Animal animal: animalList) {
			if (animal.getAnimalType() == "Sheep") {
				this.sheepCount += 1;
			} 
			else if (animal.getAnimalType() == "Cow") {
				this.cowCount += 1;
			}
			else if (animal.getAnimalType() == "Pig") {
				this.pigCount += 1;
			}
			else if (animal.getAnimalType() == "Chicken") {
				this.chickenCount += 1;
			}
				
		}
	}
	public void displayAnimalCounts() {
		countUpdateAnimals();
		System.out.printf("Number of Sheep on Farm %s\n", sheepCount);
		System.out.printf("Number of Cow on Farm %s\n", cowCount);
		System.out.printf("Number of Pig on Farm %s\n", pigCount);
		System.out.printf("Number of Chicken on Farm %s\n", chickenCount);
	}
	
	public Farm(String farmType, double growthRate) {
		this.farmType = farmType;
		this.growthRate = growthRate;
	}
	
	public void decreaseFarmMoney(int money) {
		this.farmMoney -= money;
	}
	
	public void increaseFarmMoney(int money) {
		this.farmMoney += money;
	}
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwampFarm farm = new SwampFarm();
		Chicken item = new Chicken();
		Cow item2 = new Cow();
		farm.addAnimal(item);
		farm.addAnimal(item);
		farm.addAnimal(item2);
		farm.addAnimal(item2);
		farm.removeAnimal(item2);
		farm.removeAnimal(item2);
		farm.removeAnimal(item2);
		farm.displayAnimalCounts();

	}

}
