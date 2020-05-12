package gamePackage;

public class Farm {
	private String farmType;
	private int farmMoney = 100;
	private double growthRate;
	
	public Farm(String farmType, double growthRate) {
		this.farmType = farmType;
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

	}

}
