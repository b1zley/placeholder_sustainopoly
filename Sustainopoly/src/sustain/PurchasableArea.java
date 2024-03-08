package sustain;

import java.util.ArrayList;
import java.util.List;

public class PurchasableArea extends BoardArea {
	private int developmentLevel;
	private int purchasePrice;
	private List<Integer> rentDevLevel;
	private static final List<Integer> UPGRADE_COSTS = new ArrayList<Integer>(List.of(50, 100, 150, 200, 250));
	private Player owner;

	

	public PurchasableArea(String name, int developmentLevel, int purchasePrice, List<Integer> rentDevLevel,
			Player owner, Region region) {
		super(name, region);
		this.developmentLevel = developmentLevel;
		this.purchasePrice = purchasePrice;
		this.rentDevLevel = rentDevLevel;
		this.owner = owner;
	}


	

	public int getDevelopmentLevel() {
		return developmentLevel;
	}


	public void setDevelopmentLevel(int developmentLevel) {
		this.developmentLevel = developmentLevel;
	}


	public int getPurchasePrice() {
		return purchasePrice;
	}


	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}


	public List<Integer> getRentDevLevel() {
		return rentDevLevel;
	}


	public void setRentDevLevel(List<Integer> rentDevLevel) {
		this.rentDevLevel = rentDevLevel;
	}


	public Player getOwner() {
		return owner;
	}


	public void setOwner(Player owner) {
		this.owner = owner;
	}


	public static List<Integer> getUpgradeCosts() {
		return UPGRADE_COSTS;
	}




	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newLine = "\n";
		
		sb.append("area: " + this.getName());
		sb.append(newLine);
		
		sb.append("owner: " + this.getOwner());
		sb.append(newLine);
		
		sb.append("devlevel : " + this.developmentLevel);
		sb.append(newLine);
		
		sb.append("region : " + this.getRegion().getName());
		sb.append(newLine);
		
		
		
		
		return sb.toString();
	}




	
	
	
	
}
