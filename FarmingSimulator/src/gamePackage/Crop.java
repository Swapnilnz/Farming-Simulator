package gamePackage;

/**
 * 
 * @author Swapnil B, Reed E
 * Class Crop takes a String "crop" (e.g. "grass") that specified the crop to be created.
 * Thus crop attributes are initialised through "crop"
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
			case "grass":
				purchasePrice = -1; sellPrice = -1;
				daysTillHarvest = 1; cropAmount = 0;
				break;
			
			case "maize":
				purchasePrice = -1; sellPrice = -1;
				daysTillHarvest = 2; cropAmount = 0;
				break;
				
			case "fodderBeet":
				purchasePrice = -1; sellPrice = -1;
				daysTillHarvest = 3; cropAmount = 0;
				break;
				
			case "potato":
				purchasePrice = 7; sellPrice = 5;
				daysTillHarvest = 4; cropAmount = 0;
				break;
				
			case "carrot":
				purchasePrice = 10; sellPrice = 7;
				daysTillHarvest = 3; cropAmount = 0;
				break;
				
			case "apple":
				purchasePrice = 6; sellPrice = 4;
				daysTillHarvest = 2; cropAmount = 0;
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
		
	}
	
	public void harvest() {
		
	}
	
	public static void main(String[] args) {
		Crop crops = new Crop("apple");
		System.out.println(crops.daysTillHarvest);

	}
}
