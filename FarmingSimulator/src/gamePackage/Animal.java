package gamePackage;

/**
 * 
 * @author Swapnil Bhagat, Reed Earl
 *
 */

public class Animal {
	private String animalType;
	private int weight;
	private double happiness;
	
	public Animal(String animalType, int weight, double happiness) {
		this.animalType = animalType;
		this.weight = weight;
		this.happiness= happiness;
	
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

	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}

	public String getAnimalType() {
		return this.animalType;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
