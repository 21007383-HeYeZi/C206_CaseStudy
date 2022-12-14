
import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int DELETE_FEEDBACK = 3;
	private static final int ADD_FEEDBACK = 2;
	private static final int VIEW_FEEDBACK = 1;
	private static final int FEEDBACK_OPTION = 5;
	private static final int DELETE_APPOINTMENT = 3;
	private static final int ADD_APPOINTMENT = 2;
	private static final int VIEW_APPOINTMENT = 1;
	private static final int APPOINTMENT_OPTION = 4;
	private static final int DELETE_BIKEPARTS = 3;
	private static final int ADD_BIKEPARTS = 2;
	private static final int VIEW_BIKEPARTS = 1;
	private static final int BIKEPARTS_OPTION = 3;
	private static final int DELETE_BIKE = 3;
	private static final int ADD_BIKE = 2;
	private static final int VIEW_BIKE = 1;
	private static final int BIKE_OPTION = 2;
	private static final int DELETE_REGESTRATION = 3;
	private static final int ADD_REGISTRATION = 2;
	private static final int VIEW_REGISTRATION = 1;
	private static final int REGISTRATION_OPTION = 1;
	private static final int OPTION_QUIT = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Feedback> fbList = new ArrayList<Feedback>();
		
		fbList.add(new Feedback("@lice" , "Good customer service", 5.0));
		fbList.add(new Feedback("$ally", "Satisfied with purchase", 4.0));
		fbList.add(new Feedback("Bensoon", "Laggy website", 1.0));
		
		ArrayList<Bike> bList = new ArrayList<Bike>();
		
		bList.add(new Bike("A1", "Fuji", "Mountain Bike"));
		bList.add(new Bike("A2", "YETI", "Road Bike"));
		bList.add(new Bike("A3", "Gazelle", "Hybrid Bike"));
		
		ArrayList<BikeParts> bpList = new ArrayList<BikeParts>();
		
		bpList.add(new BikeParts("B1", "Mavic", "Wheel"));
		bpList.add(new BikeParts("B2", "Giant", "Frame"));
		bpList.add(new BikeParts("B3", "Zipp", "Handlebar"));
		

		ArrayList<Appointment> apptList = new ArrayList<Appointment>();
		apptList.add(new Appointment("John", "5 Aug", "12pm", "91234567"));
		apptList.add(new Appointment("Mary", "6 Oct", "2pm", "87654321"));
		apptList.add(new Appointment("Tom", "12 Sept", "3pm", "92468101"));
			

		ArrayList<Registration> rList = new ArrayList<Registration>();
		
		rList.add(new Registration("James", "92837842"));
		rList.add(new Registration("Jason", "83726471"));
		rList.add(new Registration("Jonathan", "82737482"));
		
		int option = 0;
		
		while (option != OPTION_QUIT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == REGISTRATION_OPTION) {
				C206_CaseStudy.setHeader("REGISTRATION");
				C206_CaseStudy.rmenu(); 
				int rOp = Helper.readInt("Enter option to select function > ");
				
				if (rOp == VIEW_REGISTRATION) {
					// View registration
					C206_CaseStudy.viewAllR(rList);
				
				} else if (rOp == ADD_REGISTRATION) { 
					// Add registration
					Registration newr = inputRegistration();
					C206_CaseStudy.addRegistration(rList, newr);
					System.out.println("Registration added");

				} else if (rOp == DELETE_REGESTRATION) { 
					// Delete registration
					String mobile = Helper.readString("Enter mobile number to delete > ");
					C206_CaseStudy.deleteRegistration(rList, mobile);
				} else {
					System.out.println("Invalid option!");
				}
				
			} else if (option == BIKE_OPTION) {
				C206_CaseStudy.setHeader("BIKE LISTINGS");
				C206_CaseStudy.bmenu();
				int bikeOp = Helper.readInt("Enter option to select function > ");
				
				if (bikeOp == VIEW_BIKE) {
					// View bike 
					C206_CaseStudy.viewAllb(bList);
				
				} else if (bikeOp == ADD_BIKE) { 
					// Add bike 
					Bike newb = inputBike();
					C206_CaseStudy.addBike(bList, newb);
					System.out.println("Bike added");
				
				} else if (bikeOp == DELETE_BIKE) { 
					// Delete bike
					Bike newb = inputBike();
					C206_CaseStudy.deleteBike(bList,  newb);
				} else {
					System.out.println("Invalid option!");
				}
				
				
			} else if (option == BIKEPARTS_OPTION) {
				C206_CaseStudy.setHeader("BIKE PARTS LISTINGS");
				C206_CaseStudy.bpmenu();
				int bikeptOp = Helper.readInt("Enter option to select function > ");
				
				if (bikeptOp == VIEW_BIKEPARTS) {
					// View bike parts
					C206_CaseStudy.viewAllbp(bpList);
				
				} else if (bikeptOp == ADD_BIKEPARTS) { 
					// Add bike parts
					BikeParts newbp = inputBikeParts();
					C206_CaseStudy.addBikeParts(bpList, newbp);
					System.out.println("Bike Parts added");
				
				} else if (bikeptOp == DELETE_BIKEPARTS) { 
					// Delete bike parts
					BikeParts newbp = inputBikeParts();
					C206_CaseStudy.deleteBikeParts(bpList,  newbp);
				} else {
					System.out.println("Invalid option!");
				}

			} else if (option == APPOINTMENT_OPTION) {
				C206_CaseStudy.setHeader("APPOINTMENT");
				apptMenu(); //- 1.View, 2.Add, 3.Remove Menu
				int apptOp = Helper.readInt("Enter option to select function > ");
				
				if (apptOp == VIEW_APPOINTMENT) {
					// View appointment
					C206_CaseStudy.viewAllAppt(apptList);
				
				} else if (apptOp == ADD_APPOINTMENT) { 
					// Add appointment
					Appointment newAppt = inputAppt();
					C206_CaseStudy.addAppt(apptList, newAppt);
					System.out.println("Appointment added");
				
				} else if (apptOp == DELETE_APPOINTMENT) { 
					// Delete appointment
					Appointment newAppt = inputAppt();
					C206_CaseStudy.removeAppt(apptList,  newAppt);
				} else {
					System.out.println("Invalid option!");
				}
	
			} else if (option == FEEDBACK_OPTION) {
				C206_CaseStudy.setHeader("FEEDBACK");
				C206_CaseStudy.fbmenu(); 
				int fbOp = Helper.readInt("Enter option to select function > ");
				
				if (fbOp == VIEW_FEEDBACK) {
					// View feedback
					C206_CaseStudy.viewAllFb(fbList);
				
				} else if (fbOp == ADD_FEEDBACK) { 
					// Add feedback
					Feedback newFb = inputFeedback();
					C206_CaseStudy.addFeedback(fbList, newFb);
					System.out.println("Feedback added");
				
				} else if (fbOp == DELETE_FEEDBACK) { 
					// Delete feedback
					String username = Helper.readString("Enter username > ");
					C206_CaseStudy.deleteFeedback(fbList, username);
				} else {
					System.out.println("Invalid option!");
				}
	

			} else if (option == 6) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option!");
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
//	============================= MENU REGISTRATION =============================
	private static void rmenu() {
		Helper.line(80, "=");
		System.out.println("Registration");
		Helper.line(80, "-");
		System.out.println("1. View Registration");
		System.out.println("2. Add Registration");
		System.out.println("3. Delete Registration");

	}

//	============================= VIEW REGISTRATION =============================
	public static String retrieveAllR(ArrayList<Registration> rList) {
		String output = "";

		for (int i = 0; i < rList.size(); i++) {

			output += String.format("%-10s %-30s\n", rList.get(i).getName(),
					rList.get(i).getMobileNumber());
		}
		return output;

	}
	
	public static void viewAllR(ArrayList<Registration> rList) {

		String output = retrieveAllR(rList);
		System.out.println(output);
	}
	
//	============================= ADD REGISTRATION =============================
	public static Registration inputRegistration() {
		String name = Helper.readString("Enter Name > ");
		String mobileNumber = Helper.readString("Enter Mobile Number > ");
		
		Registration newR = new Registration(name, mobileNumber);
		return newR;

	}

	public static void addRegistration(ArrayList<Registration> rList, Registration newR) {

		rList.add(newR);

	}
	
// ============================= DELETE REGISTRATION =============================

	public static boolean doDeleteRegistration(ArrayList<Registration> rList, String mobileNumber) {
		
		boolean isDeleted = false;
		
		for (int i = 0; i < rList.size(); i++) {
			if (rList.get(i).getMobileNumber().equals(mobileNumber)) {
				rList.remove(i);
				isDeleted = true;
			}
		}
		return isDeleted;
	}
	
	public static String deleteRegistration(ArrayList<Registration> rList, String mobileNumber) {
		C206_CaseStudy.retrieveAllR(rList);
		String output = "Invalid mobile number entered!";
		Boolean isDeleted = doDeleteRegistration(rList, mobileNumber);
		if (isDeleted == true) {
			output = "Registration Deleted";
		}
		System.out.println(output);
		return output;
	}
	
//	OPTION 2 : BIKE 
//	============================= MENU BIKE =============================
	private static void bmenu() {
		System.out.println("1. View Bikes");
		System.out.println("2. Add Bike");
		System.out.println("3. Delete Bike");

	}

	
//	============================= VIEW BIKE =============================
	public static String retrieveAllb (ArrayList<Bike> bList) {
		String output = "";

		for (int i = 0; i < bList.size(); i++) {

			output += String.format("%-10s %-10s %-30s\n", bList.get(i).getAssetTag(),
					bList.get(i).getBrand(), bList.get(i).getDescription());
		}
		return output;

	}
	
	public static void viewAllb(ArrayList<Bike> bList) {

		String output = retrieveAllb(bList);
		System.out.println(output);
	}
	
//	============================= ADD BIKE =============================
	public static Bike inputBike() {
		String assetTag = Helper.readString("Enter assetTag > ");
		String brand = Helper.readString("Enter brand > ");
		String description = Helper.readString("Enter description > ");

		Bike newb = new Bike(assetTag, brand, description);
		return newb;

	}

	public static void addBike(ArrayList<Bike> bList, Bike newb) {

		bList.add(newb);

	}
	
// ============================= DELETE BIKE =============================

	public static void deleteBike(ArrayList<Bike> bList, Bike newb) {
			
		String assetTag = Helper.readString("Enter asset tag of bike to delete > ");
		int a = 0;
			
		for (int i = 0; i < bList.size(); i++) {
			if (bList.get(i).getAssetTag().equals(assetTag)) {
				bList.remove(i);
				a++;

			} else {
				a = 0;
			}
		}
		if (a == 1) {
			System.out.println("Bike Deleted!");
		} else {
			System.out.println("Bike not found!");
		}


	}
	
//	OPTION 3 : BIKE PARTS
//	============================= MENU BIKE PARTS =============================
	private static void bpmenu() {
		System.out.println("1. View Bike Parts");
		System.out.println("2. Add Bike Part");
		System.out.println("3. Delete Bike Part");

	}
	
//	============================= VIEW BIKE PARTS =============================
	public static String retrieveAllbp (ArrayList<BikeParts> bpList) {
		String output = "";

		for (int i = 0; i < bpList.size(); i++) {

			output += String.format("%-10s %-10s %-30s\n", bpList.get(i).getAssetTag(),
					bpList.get(i).getBrand(), bpList.get(i).getDescription());
		}
		return output;

	}
	
	public static void viewAllbp(ArrayList<BikeParts> bpList) {

		String output = retrieveAllbp(bpList);
		System.out.println(output);
	}
	
//	============================= ADD BIKE PARTS =============================
	public static BikeParts inputBikeParts() {
		String assetTag = Helper.readString("Enter assetTag > ");
		String brand = Helper.readString("Enter brand > ");
		String description = Helper.readString("Enter description > ");

		BikeParts newbp = new BikeParts(assetTag, brand, description);
		return newbp;

	}

	public static void addBikeParts(ArrayList<BikeParts> bpList, BikeParts newbp) {

		bpList.add(newbp);

	}
	
// ============================= DELETE BIKE PARTS =============================

	public static void deleteBikeParts(ArrayList<BikeParts> bpList, BikeParts newbp) {
			
		String assetTag = Helper.readString("Enter asset tag of bike part to delete > ");
		int a = 0;
			
		for (int i = 0; i < bpList.size(); i++) {
			if (bpList.get(i).getAssetTag().equals(assetTag)) {
				bpList.remove(i);
				a++;

			} else {
				a = 0;
			}
		}
		if (a == 1) {
			System.out.println("Bike Part Deleted!");
		} else {
			System.out.println("Bike Part not found!");
		}


	}
	
//	OPTION 4 : APPOINTMENT
//	============================= MENU APPOINTMENT =============================
	private static void apptMenu() {
		System.out.println("1. View Appointment");
		System.out.println("2. Add Appointment");
		System.out.println("3. Delete Appointment");

	}
	
//	============================= VIEW APPOINTMENT =============================
	public static String retrieveAllAppt (ArrayList<Appointment> apptList) {
		String output = "";

		for (int i = 0; i < apptList.size(); i++) {

			output += String.format("%-10s %-10s %-10s %-10s\n", apptList.get(i).getName(),
					apptList.get(i).getDate(), apptList.get(i).getTime(), apptList.get(i).getMobileNumber());
		}
		return output;

	}
	
	public static void viewAllAppt(ArrayList<Appointment> apptList) {

		String output = retrieveAllAppt(apptList);
		System.out.println(output);
	}
	
//	============================= ADD APPOINTMENT =============================
	public static Appointment inputAppt() {
		String name = Helper.readString("Enter name > ");
		String date = Helper.readString("Enter date > ");
		String time = Helper.readString("Enter time > ");
		String mobileNumber = Helper.readString("Enter mobile number > ");

		Appointment newApp = new Appointment(name, date, time, mobileNumber);
		return newApp;

	}

	public static void addAppt(ArrayList<Appointment> apptList, Appointment newApp) {

		apptList.add(newApp);

	}
	
// ============================= DELETE APPOINTMENT =============================

	public static boolean removeAppt(ArrayList<Appointment> apptList, Appointment newApp) {
			
		String mobileNumber = Helper.readString("Enter Mobile Number to delete appointment > ");
		int a = 0;
		
		for (int i = 0; i < apptList.size(); i++) {
			if (apptList.get(i).getMobileNumber().equals(mobileNumber)) {
				apptList.remove(i);
				a++;

			} else {
				a = 0;
			}
		}
		if (a == 1) {
			System.out.println("Registration Deleted!");
		} else {
			System.out.println("Registration not found!");
		}
		return false;
	}	
		
	
//	OPTION 5 : FEEDBACK
//	============================= MENU FEEDBACK =============================
	private static void fbmenu() {
		System.out.println("1. View Feedbacks");
		System.out.println("2. Add Feedback");
		System.out.println("3. Delete Feedback");

	}
	
//	============================= VIEW FEEDBACK =============================
	public static String retrieveAllFb (ArrayList<Feedback> fbList) {
		String output = "";

		for (int i = 0; i < fbList.size(); i++) {

			output += String.format("%-10s %-30s %-30.1f\n", fbList.get(i).getUsername(),
					fbList.get(i).getComment(), fbList.get(i).getRating());
		}
		return output;

	}
	
	public static void viewAllFb(ArrayList<Feedback> fbList) {

		String output = String.format("%-10s %-30s %-30s\n", "USERNAME", "FEEDBACK", "RATING"); 
		output += retrieveAllFb(fbList);
		System.out.println(output);
	}
	
//	============================= ADD FEEDBACK =============================
	public static Feedback inputFeedback() {
		String username = Helper.readString("Enter username > ");
		String comment = Helper.readString("Enter Feedback > ");
		double rating = Helper.readDouble("Enter Rating (1.0-5.0) > ");

		Feedback newFb = new Feedback(username, comment, rating);
		return newFb;

	}

	public static void addFeedback(ArrayList<Feedback> fbList, Feedback newFb) {

		fbList.add(newFb);

	}
	
	// ============================= DELETE FEEDBACK =============================

	public static boolean removeFeedback(ArrayList<Feedback> fbList, String userName){
		
		boolean isDeleted = false;
		
		for (int i = 0; i < fbList.size(); i++) {
			if (fbList.get(i).getUsername().equals(userName)) {
				fbList.remove(i);
				isDeleted = true;
			}
		}
		return isDeleted;

	} 
	
	public static String deleteFeedback(ArrayList<Feedback> fbList, String searchFeedback) {
		C206_CaseStudy.retrieveAllFb(fbList);
		String output = "";
		Boolean isDeleted = removeFeedback(fbList, searchFeedback);
		
		if (isDeleted == true) {
			output = "Feedback for " + searchFeedback + " deleted";
		} else {
			output = "Invalid username entered";
		}
		System.out.println(output);
		return output;
	}	
	
}
