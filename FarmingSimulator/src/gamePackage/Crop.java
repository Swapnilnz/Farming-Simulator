package gamePackage;

import java.util.HashMap;

/**
 * @author Swapnil Bhagat, Reed Earl
 * Class Crop takes a String "crop" (e.g. "grass") that specified the crop to be created.
 * Thus crop attributes are initialised through "crop". Has usual getters and setters for attributes
 * purchasePrice, sellPrice, daysTillHarvest, cropAmount, cropType.
 */
public class Crop {
	
	/**
	 * Crop purchase price
	 */
	private int purchasePrice;
	/**
	 * Crop sell price
	 */
	private int sellPrice;
	/**
	 * Days till the crop can be harvested
	 */
	int daysTillHarvest;

	/**
	 * Type of crop
	 */
	private String cropType;
	
	/**
	 * Reference dictionary for some crop og days till harvest
	 */
	private HashMap<String, Integer> cropDic;
	
	/**
	 * Specific version of the crop e.g. Avocado 2
	 */
	private int cropNumber;

	/**
	 * Constructer; uses switch statement to set the type of crop and its respective attributes
	 * @param crop input crop
	 * @param incomingCropNumber crop's allocated number
	 */
	public Crop(String crop, int incomingCropNumber) {
		cropNumber = incomingCropNumber;
		cropDic = new HashMap<String, Integer>();
		cropDic.put("Avocado", 8); cropDic.put("Corn", 6); cropDic.put("Wheat", 4); 
		cropDic.put("Potato", 4); cropDic.put("Carrot", 3); cropDic.put("Apple", 2); 
		cropType = crop;
		switch (cropType) {
			case "Avocado":
				purchasePrice = 8; sellPrice = 64;
				daysTillHarvest = 8;
				break;
			
			case "Corn":
				purchasePrice = 5; sellPrice = 30;
				daysTillHarvest = 6;
				break;
				
			case "Wheat":
				purchasePrice = 4; sellPrice = 16;
				daysTillHarvest = 4;
				break;
				
			case "Potato":
				purchasePrice = 7; sellPrice = 28;
				daysTillHarvest = 4;
				break;
				
			case "Carrot":
				purchasePrice = 10; sellPrice = 30;
				daysTillHarvest = 3;
				break;
				
			case "Apple":
				purchasePrice = 6; sellPrice = 12;
				daysTillHarvest = 2;
				break;

		}
	}
	
	/**
	 * overrides java's toString, as to not return a memory location but rather the crop type + crop num
	 * @return crop type + crop num
	 */
	public String toString() {
		String toReturn = cropType + " " + cropNumber;
		return toReturn;
	}
	
	/**
	 * Harvest this crop object by simply adding money required
	 * Deletion of crop is done in GameEnvironment class
	 * @param game main game; class GameEnvironment
	 */
	public void harvest(GameEnvironment game) {
		int farmMoney = game.farm.getFarmMoney();
		game.farm.setFarmMoney(farmMoney + this.sellPrice);
		
	}

	/**
	 * @return the purchasePrice
	 */
	public int getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the sellPrice
	 */
	public int getSellPrice() {
		return sellPrice;
	}

	/**
	 * @param sellPrice the sellPrice to set
	 */
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * @return the daysTillHarvest
	 */
	public int getDaysTillHarvest() {
		return daysTillHarvest;
	}

	/**
	 * @param daysTillHarvest the daysTillHarvest to set
	 */
	public void setDaysTillHarvest(int daysTillHarvest) {
		this.daysTillHarvest = daysTillHarvest;
	}

	/**
	 * @return the cropType
	 */
	public String getCropType() {
		return cropType;
	}

	/**
	 * @param cropType the cropType to set
	 */
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	/**
	 * @return the cropDic
	 */
	public HashMap<String, Integer> getCropDic() {
		return cropDic;
	}

	/**
	 * @param cropDic the cropDic to set
	 */
	public void setCropDic(HashMap<String, Integer> cropDic) {
		this.cropDic = cropDic;
	}
	
}
