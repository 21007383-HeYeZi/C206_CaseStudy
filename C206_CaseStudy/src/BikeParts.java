
public class BikeParts {
	private String assetTag;
	private String name;
	private String desciption;
	
	public BikeParts(String assetTag, String name, String desciption) {
		this.assetTag = assetTag;
		this.name = name;
		this.desciption = desciption;
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

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
	
	
}
