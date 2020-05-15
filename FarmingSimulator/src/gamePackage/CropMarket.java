package gamePackage;

public class CropMarket {
	
	public int playerMoney;
	private int potatoSellPrice;
	private int potatoPurchasePrice;
	private int carrotSellPrice;
	private int carrotPurchasePrice;
	private int appleSellPrice;
	private int applePurchasePrice;
	
	public CropMarket(GameEnvironment game) {
		potatoSellPrice = 5;
		potatoPurchasePrice = 7;
		carrotSellPrice = 7;
		carrotPurchasePrice = 10;
		appleSellPrice = 4;
		applePurchasePrice = 6;
	}
	public void buyPotato(int amount) {
		int totalPurchasePrice = amount * potatoPurchasePrice;
		// Subtract from player money, add potatoes to farm
	}
	
	public void sellPotato(int amount) {
		int totalSellPrice = amount * potatoSellPrice;
		// Add to player money, remove potatoes from farm
		
	}
	
	public void buyCarrot(int amount) {
		int totalPurchasePrice = amount * carrotPurchasePrice;
		// Subtract from player money, add carrots to farm
	}
	
	public void sellCarrot(int amount) {
		int totalSellPrice = amount * carrotSellPrice;
		// Add to player money, remove carrots from farm
		
	}
	 
	public void buyApple(int amount) {
		int totalPurchasePrice = amount * applePurchasePrice;
		// Subtract from player money, add apples to farm
	}
	
	public void sellApple(int amount) {
		int totalSellPrice = amount * appleSellPrice;
		// Add to player money, remove carrots from farm
		
	}
}
