
public class Feedback {
	private String username;
	private String comment;
	
	public Feedback(String username, String comment) {
		this.username = username;
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}

	public String getUsername() {
		return username;
	}
}
