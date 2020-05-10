package gamePackage;

public class SwampFarm extends Farm {
	
	public SwampFarm(String farmType, int farmMoney, int growthRate) {
		super(farmType, farmMoney, growthRate);
	}
	
	public SwampFarm() {
		super("Swamp Farm", 200, 2.0);
	}

}
