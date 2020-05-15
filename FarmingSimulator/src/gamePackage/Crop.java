package gamePackage;

import java.util.HashMap;

/**
 * 
 * @author Swapnil B, Reed E
 * Class Crop takes a String "crop" (e.g. "grass") that specified the crop to be created.
 * Thus crop attributes are initialised through "crop". Has usual getters and setters for attributes
 * purchasePrice, sellPrice, daysTillHarvest, cropAmount, cropType.
 */

public class Crop {
	
	protected int purchasePrice;
	protected int sellPrice;
	protected int daysTillHarvest;
	protected int cropAmount;
	protected String cropType;
	public HashMap<String, Integer> cropDic;

	
	public Crop(String crop) {
		cropDic = new HashMap<String, Integer>();
		cropDic.put("Avocado", 8); cropDic.put("Corn", 6); cropDic.put("Wheat", 4); 
		cropDic.put("Potato", 4); cropDic.put("Carrot", 3); cropDic.put("Apple", 2); 
		cropType = crop;
		switch (cropType) {
			case "Avocado":
				purchasePrice = 8; sellPrice = 64;
				daysTillHarvest = 8; cropAmount = 1;
				break;
			
			case "Corn":
				purchasePrice = 5; sellPrice = 30;
				daysTillHarvest = 6; cropAmount = 1;
				break;
				
			case "Wheat":
				purchasePrice = 4; sellPrice = 16;
				daysTillHarvest = 4; cropAmount = 1;
				break;
				
			case "Potato":
				purchasePrice = 7; sellPrice = 28;
				daysTillHarvest = 4; cropAmount = 1;
				break;
				
			case "Carrot":
				purchasePrice = 10; sellPrice = 7;
				daysTillHarvest = 3; cropAmount = 1;
				break;
				
			case "Apple":
				purchasePrice = 6; sellPrice = 4;
				daysTillHarvest = 2; cropAmount = 1;
				break;

		}
	}
	
	public int getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(int newPrice) {
		purchasePrice = newPrice;
	}
	
	public int getSellPrice() {
		return sellPrice;
	}
	
	public void setSellPrice(int newPrice) {
		sellPrice = newPrice;
	}
	
	public int getDaysTillHarvest() {
		return daysTillHarvest;
	}
	
	public void setDaysTillHarvest(int newDays) {
		daysTillHarvest = newDays;
	}
	
	public int getCropAmount() {
		return cropAmount;
	}
	
	public void setCropAmount(int newCropAmount) {
		cropAmount = newCropAmount;
	}
	
	public String getCropType() {
		return cropType;
	}
	
	public void setCropType(String newCropType) {
		cropType = newCropType;
	}
	
	
	public void tendTo(GameEnvironment game) {
		// Decrease timeTillHarvest by 2, or 4 if user bought watering can
		boolean contains = game.farm.itemList.contains("Watering Can");
		if (contains) {
			if (this.daysTillHarvest >= 4) {
				this.daysTillHarvest -= 4;
			} else {
				this.daysTillHarvest = 0;
			}
		} else {
			if (this.daysTillHarvest >= 2) {
				this.daysTillHarvest -= 2;
			} else {
				this.daysTillHarvest = 0;
			}
		}
	}
	
	public void harvest(GameEnvironment game) {
		// Refresh days till harvest, add money
		this.daysTillHarvest = cropDic.get(this.cropType);
		int farmMoney = game.farm.getFarmMoney();
		game.farm.setFarmMoney(farmMoney + this.sellPrice);
		
	}
	
}
