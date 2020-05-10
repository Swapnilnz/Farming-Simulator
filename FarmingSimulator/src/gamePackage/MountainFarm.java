package gamePackage;

public class MountainFarm extends Farm {
	
	public MountainFarm(String farmType, int farmMoney, double growthRate) {
		super(farmType, farmMoney, growthRate);
	}
	
	public MountainFarm() {
		super("Mountain Farm", 200, 1.0);
	}

}
