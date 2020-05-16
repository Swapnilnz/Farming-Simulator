package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Animal {
	private String animalType;
	private int weight;
	private int happiness;
	
	public Animal(String animalType, int weight, int happiness) {
		this.animalType = animalType;
		this.weight = weight;
		this.happiness = happiness;
	
	}
	
	public void increaseHappiness() {
		if (this.happiness < 80) {
			this.happiness += 20;
		} else {
			this.happiness = 100;
		}
	}
	
	public void decreaseHappiness() {
		if (this.happiness > 20) {
			this.happiness -= 20;
		} else {
			this.happiness = 0;
		}
	}
	
	public double getHappiness() {
		return this.happiness;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public String getAnimalType() {
		return this.animalType;
	}
	
	
}
