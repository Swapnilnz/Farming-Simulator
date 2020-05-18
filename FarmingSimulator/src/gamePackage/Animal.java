package gamePackage;

/**
 * Parent class of cow, pig, chicken, sheep; 
 * contains methods for general actions like increasing/decreasing health/happiness
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Animal {
	/**
	 * Type of animal
	 */
	public String animalType;
	/**
	 * int animal weight
	 */
	public int weight;
	/**
	 * int animal happiness
	 */
	public int happiness;
	/**
	 * int animal health
	 */
	public int health;
	
	/**
	 * Constructer, used for initialising class attributes
	 * @param animalType
	 * @param weight
	 * @param happiness
	 * @param health
	 */
	public Animal(String animalType, int weight, int happiness, int health) {
		this.animalType = animalType;
		this.weight = weight;
		this.happiness = happiness;
		this.health = health;
	
	}
	
	/**
	 * Increase health by a set amount (25)
	 */
	public void increaseHealth() {
		if (this.health < 75) {
			this.health += 25;
		} else {
			this.setHealth(100);
		}
	}

	/**
	 * Decrease health by 20
	 */
	public void decreaseHealth() {
		if (this.health > 20) {
			this.health -= 20;
		} else {
			this.setHealth(0);
		}
	}

	/**
	 * Increase happiness by 30
	 */
	public void increaseHappiness() {
		if (this.happiness < 80) {
			this.happiness += 30;
		} else {
			this.setHappiness(100);
		}
	}
	
	/**
	 * Decrease happiness by 20
	 */
	public void decreaseHappiness() {
		if (this.happiness > 20) {
			this.happiness -= 20;
		} else {
			this.setHappiness(0);
		}
	}

	
	/**
	 * @return the animalType
	 */
	public String getAnimalType() {
		return animalType;
	}

	
	/**
	 * @param animalType the animalType to set
	 */
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	/**
	 * @return the happiness
	 */
	public int getHappiness() {
		return happiness;
	}

	
	/**
	 * @param happiness the happiness to set
	 */
	public void setHappiness(int happiness) {
		this.happiness = happiness;
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
