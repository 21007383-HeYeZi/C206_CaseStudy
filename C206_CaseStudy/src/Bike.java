
public class Bike {
	private String assetTag;
	private String brand;
	private String description;
	
	public Bike(String assetTag, String brand, String description) {
		this.assetTag = assetTag;
		this.brand = brand;
		this.description = description;
	}

	public String getAssetTag() {
		return assetTag;
	}

	public void setAssetTag(String assetTag) {
		this.assetTag = assetTag;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
