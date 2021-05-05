package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private String description;
	private float discount;
	
	public Campaign(int id, String campaignName, String description, float discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.description = description;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	

}
