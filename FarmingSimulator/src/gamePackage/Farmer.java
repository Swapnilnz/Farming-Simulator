package gamePackage;

/**
 * Farmer object, simple as it contains only farmer name and age
 * @author Swapnil Bhagat, Reed Earl
 *
 */
public class Farmer {
	/**
	 * Farmer name
	 */
	String name;
	/**
	 * farmer age
	 */
	private int age;
	
	/**
	 * Constructer, initialises farmer age and name
	 * @param inputName farmer name
	 * @param farmerAge farmer age
	 */
	public Farmer(String inputName, int farmerAge) {
		name = inputName;
		age = farmerAge;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
