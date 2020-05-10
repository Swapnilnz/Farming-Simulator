package gamePackage;

public class PlainsFarm extends Farm {
	
	public PlainsFarm(String farmType, int farmMoney, double growthRate) {
		super(farmType, farmMoney, growthRate);
	}
	
	public PlainsFarm() {
		super("Plains Farm", 200, 4.0);
	}

}
