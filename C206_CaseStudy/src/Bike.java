
public class Bike {
	private String assetTag;
	private String name;
	private String description;
	
	public Bike(String assetTag, String name, String description) {
		this.assetTag = assetTag;
		this.name = name;
		this.description = description;
	}

	public String getAssetTag() {
		return assetTag;
	}

	public void setAssetTag(String assetTag) {
		this.assetTag = assetTag;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
