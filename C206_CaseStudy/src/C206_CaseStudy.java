import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Feedback> fbList = new ArrayList<Feedback>();
		
		fbList.add(new Feedback("@lice" , "Good customer service"));
		fbList.add(new Feedback("$ally", "Satisfied with purchase"));
		fbList.add(new Feedback("Bensoon", "Laggy website"));
		
		int option = 0;
		
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				C206_CaseStudy.setHeader("REGISTRATION");
//				Registration new = inputSignup();
//				C206_CaseStudy.addSignup(memberList, new);
//				System.out.println("Registration is successful!");
				
			} else if (option == 2) {
				C206_CaseStudy.setHeader("BIKE LISTINGS");
//				bikeMenu(); - 1.View, 2.Add, 3.Remove Menu
//				int bikeOp = Helper.readInt("Enter option to select function > ");
				
//				if (bikeOp == 1) {
					// View bike 
//					C206_CaseStudy.viewAllBike(bikeList);
//				
//				} else if (bikeOp == 2) { 
//					// Add bike 
//					Bike newBike = inputBike();
//					C206_CaseStudy.addBike(bikeList, newBike);
//					System.out.println("Bike added");
//				
//				} else if (bikeOp == 3) { 
//					// Delete bike
//					
//				} else {
//					System.out.println("Invalid option!");
//				
			
			} else if (option == 3) {
				C206_CaseStudy.setHeader("BIKE PARTS LISTINGS");
//				bikePartsmenu(); - 1.View, 2.Add, 3.Remove Menu
//				int bikeptOp = Helper.readInt("Enter option to select function > ");
				
//				if (bikeptOp == 1) {
					// View bike parts
//					C206_CaseStudy.viewAllBikept(bikeptList);
//				
//				} else if (bikeptOp == 2) { 
//					// Add bike parts
//					bikeParts newBikept = inputBikept();
//					C206_CaseStudy.addBikept(bikeptList, newBikept);
//					System.out.println("Bike Parts added");
//				
//				} else if (bikeptOp == 3) { 
//					// Delete bike parts
//					
//				} else {
//					System.out.println("Invalid option!");
//				

			} else if (option == 4) {
				C206_CaseStudy.setHeader("APPOINTMENT");
//				ApptMenu(); - 1.View, 2.Add, 3.Remove Menu
//				int apptOp = Helper.readInt("Enter option to select function > ");
				
//				if (apptOp == 1) {
					// View appointment
//					C206_CaseStudy.viewAllAppt(apptList);
//				
//				} else if (apptOp == 2) { 
//					// Add appointment
//					Appointment newAppt = inputAppt();
//					C206_CaseStudy.addAppt(apptList, newAppt);
//					System.out.println("Appointment added");
//				
//				} else if (apptOp == 3) { 
//					// Delete appointment
//					
//				} else {
//					System.out.println("Invalid option!");
//	
			} else if (option == 5) {
				C206_CaseStudy.setHeader("FEEDBACK");
				C206_CaseStudy.fbmenu(); 
				int fbOp = Helper.readInt("Enter option to select function > ");
				
				if (fbOp == 1) {
					// View feedback
					C206_CaseStudy.viewAllFb(fbList);
				
				} else if (fbOp == 2) { 
					// Add feedback
					Feedback newFb = inputFeedback();
					C206_CaseStudy.addFeedback(fbList, newFb);
					System.out.println("Feedback added");
				
				} else if (fbOp == 3) { 
					// Delete feedback
					Feedback newFb = inputFeedback();
					C206_CaseStudy.deleteFeedback(fbList, newFb);
				} else {
					System.out.println("Invalid option!");
				}
	

			} else if (option == 6) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		Helper.line(80, "=");
		System.out.println("BIKE LOVER'S COMMUNITY APP");
		Helper.line(80, "-");
		System.out.println("1. Registration");
		System.out.println("2. Bike Listings");
		System.out.println("3. Bike Part Listings");
		System.out.println("4. Appointment");
		System.out.println("5. Feedback");
		System.out.println("6. Quit");
		

	}

//	OPTION 1 : REGISTRATION
	
	
//	OPTION 2 : BIKE 
	
	
//	OPTION 3 : BIKE PARTS
	
	
//	OPTION 4 : APPOINTMENT
	
	
//	OPTION 5 : FEEDBACK
//	============================= VIEW FEEDBACK =============================
	private static void fbmenu() {
		Helper.line(80, "=");
		System.out.println("MENU");
		Helper.line(80, "-");
		System.out.println("1. View Feedbacks");
		System.out.println("2. Add Feedback");
		System.out.println("3. Delete Feedback");

	}
	
	
	
//	============================= VIEW FEEDBACK =============================
	public static String retrieveAllFb (ArrayList<Feedback> fbList) {
		String output = "";

		for (int i = 0; i < fbList.size(); i++) {

			output += String.format("%-10s %-30s\n", fbList.get(i).getUsername(),
					fbList.get(i).getComment());
		}
		return output;

	}
	
	public static void viewAllFb(ArrayList<Feedback> fbList) {

		String output = retrieveAllFb(fbList);
		System.out.println(output);
	}
	
//	============================= ADD FEEDBACK =============================
	public static Feedback inputFeedback() {
		String username = Helper.readString("Enter username > ");
		String comment = Helper.readString("Enter Feedback > ");

		Feedback newFb = new Feedback(username, comment);
		return newFb;

	}

	public static void addFeedback(ArrayList<Feedback> fbList, Feedback newFb) {

		fbList.add(newFb);

	}
	
// ============================= DELETE FEEDBACK =============================

	public static void deleteFeedback(ArrayList<Feedback> fbList, Feedback newFb) {
		
		String userName = Helper.readString("Enter username to delete > ");
		int a = 0;
		
		for (int i = 0; i < fbList.size(); i++) {
			if (fbList.get(i).getUsername().equals(userName)) {
				fbList.remove(i);
				a++;

			} else {
				a = 0;
			}
		}
		if (a == 1) {
			System.out.println("Feedback Deleted!");
		} else {
			System.out.println("Username not found!");
		}


	}
	
	
	

}
