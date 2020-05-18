package gamePackage;

public class Farmer {
	/**
	 * Farmer name
	 */
	protected String name;
	/**
	 * farmer age
	 */
	protected int age;
	// Avatar?
	
	/**
	 * Constructer, initialises farmer age and name
	 * @param inputName
	 * @param farmerAge
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
