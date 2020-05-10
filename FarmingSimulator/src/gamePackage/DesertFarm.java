package gamePackage;

public class DesertFarm extends Farm{
	
	public DesertFarm(String farmType, int farmMoney, double growthRate) {
		super(farmType, farmMoney, growthRate);
	}
	
	public DesertFarm() {
		super("Desert Farm", 200, 0.5);
	}

}
