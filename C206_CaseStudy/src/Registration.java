
public class Registration {
	public String mobileNumber;
	public String name;
	
	public Registration(String name, String mobileNumber) {
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
