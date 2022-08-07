
public class Feedback {
	private String username;
	private String comment;
	private double rating;
	
	public Feedback(String username, String comment, double rating) {
		this.username = username;
		this.comment = comment;
		this.rating = rating;
	}
	
	public String getComment() {
		return comment;
	}

	public String getUsername() {
		return username;
	}
	
	public double getRating() {
		return rating;
	}

}
