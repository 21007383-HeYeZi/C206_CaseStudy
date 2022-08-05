public class Appointment {

	public Appointment(String name, String date, String time, int mobileNumber) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.mobileNumber = mobileNumber;
	}

	private String name;
	private String date;
	private String time;
	private int mobileNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


}
