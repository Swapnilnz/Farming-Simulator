package gamePackage;

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

	
	public Crop(String crop) {

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
	
	
	
	public void water() {
		//TBI
	}
	
	public void harvest() {
		//TBI
	}
	
}
