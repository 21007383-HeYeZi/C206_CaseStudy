
public class Registration {
	public String mobileNumber;
	public String name;
	
	public Registration(String mobileNumber, String name) {
		this.mobileNumber = mobileNumber;
		this.name = name;
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
