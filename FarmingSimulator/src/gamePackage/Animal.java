package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Animal {
	public String animalType;
	public int weight;
	public int happiness;
	public int health;
	
	public Animal(String animalType, int weight, int happiness, int health) {
		this.animalType = animalType;
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
	
	}
	
	public void increaseHealth() {
		if (this.health < 75) {
			this.health += 25;
		} else {
			this.setHealth(100);
		}
	}


	public void decreaseHealth() {
		if (this.health > 20) {
			this.health -= 20;
		} else {
			this.setHealth(0);
		}
	}

	public void increaseHappiness() {
		if (this.happiness < 80) {
			this.happiness += 20;
		} else {
			this.setHappiness(100);
		}
	}
	
	public void decreaseHappiness() {
		if (this.happiness > 20) {
			this.happiness -= 20;
		} else {
			this.setHappiness(0);
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
	
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
}
