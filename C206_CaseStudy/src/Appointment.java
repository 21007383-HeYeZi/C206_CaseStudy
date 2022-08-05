import java.sql.Time;
import java.sql.Date;

public class Appointment {

	public Appointment(String name, Date date, Time time, int mobileNumebr) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.mobileNumebr = mobileNumebr;
	}

	private String name;
	private Date date;
	private Time time;
	private int mobileNumebr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getMobileNumebr() {
		return mobileNumebr;
	}

	public void setMobileNumebr(int mobileNumebr) {
		this.mobileNumebr = mobileNumebr;
	}

}
