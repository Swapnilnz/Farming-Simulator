package gamePackage;

public class CropMarket {
	
	public int playerMoney;
	private int potatoSellPrice = 5;
	private int potatoPurchasePrice = 7;
	private int carrotSellPrice = 7;
	private int carrotPurchasePrice = 10;
	private int appleSellPrice = 4;
	private int applePurchasePrice = 6;
	
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
