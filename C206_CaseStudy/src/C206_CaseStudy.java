
import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Feedback> fbList = new ArrayList<Feedback>();
		
		fbList.add(new Feedback("@lice" , "Good customer service"));
		fbList.add(new Feedback("$ally", "Satisfied with purchase"));
		fbList.add(new Feedback("Bensoon", "Laggy website"));
		
		ArrayList<Bike> bList = new ArrayList<Bike>();
		
		bList.add(new Bike("A1", "Fuji", "Mountain Bike"));
		bList.add(new Bike("A2", "YETI", "Road Bike"));
		bList.add(new Bike("A3", "Gazelle", "Hybrid Bike"));
		
		ArrayList<BikeParts> bpList = new ArrayList<BikeParts>();
		
		bList.add(new Bike("B1", "Mavic", "Wheel"));
		bList.add(new Bike("B2", "Giant", "Frame"));
		bList.add(new Bike("B3", "Zipp", "Handlebar"));
		

		ArrayList<Appointment> apptList = new ArrayList<Appointment>();
		apptList.add(new Appointment("John", "5 Aug", "12pm", 91234567));
		apptList.add(new Appointment("Mary", "6 Oct", "2pm", 87654321));
		apptList.add(new Appointment("Tom", "12 Sept", "3pm", 92468101));
			

		ArrayList<Registration> rList = new ArrayList<Registration>();
		
		rList.add(new Registration("92837842", "James"));
		rList.add(new Registration("83726471", "John"));
		rList.add(new Registration("82737482", "Jonathan"));
		
		int option = 0;
		
		while (option != 6) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				C206_CaseStudy.setHeader("REGISTRATION");
				C206_CaseStudy.rmenu(); 
				int rOp = Helper.readInt("Enter option to select function > ");
				
				if (rOp == 1) {
					// View registration
					C206_CaseStudy.viewAllR(rList);
				
				} else if (rOp == 2) { 
					// Add registration
					Registration newr = inputRegistration();
					C206_CaseStudy.addRegistration(rList, newr);
					System.out.println("Registration added");
				
				} else if (rOp == 3) { 
					// Delete registration
					Registration newr = inputRegistration();
					C206_CaseStudy.deleteRegistration(rList, newr);
				} else {
					System.out.println("Invalid option!");
				}
				
			} else if (option == 2) {
				C206_CaseStudy.setHeader("BIKE LISTINGS");
				C206_CaseStudy.bmenu();
				int bikeOp = Helper.readInt("Enter option to select function > ");
				
				if (bikeOp == 1) {
					// View bike 
					C206_CaseStudy.viewAllb(bList);
				
				} else if (bikeOp == 2) { 
					// Add bike 
					Bike newb = inputBike();
					C206_CaseStudy.addBike(bList, newb);
					System.out.println("Bike added");
				
				} else if (bikeOp == 3) { 
					// Delete bike
					Bike newb = inputBike();
					C206_CaseStudy.deleteBike(bList,  newb);
				} else {
					System.out.println("Invalid option!");
				}
				
				
			} else if (option == 3) {
				C206_CaseStudy.setHeader("BIKE PARTS LISTINGS");
				C206_CaseStudy.bpmenu();
				int bikeptOp = Helper.readInt("Enter option to select function > ");
				
				if (bikeptOp == 1) {
					// View bike parts
					C206_CaseStudy.viewAllbp(bpList);
				
				} else if (bikeptOp == 2) { 
					// Add bike parts
					BikeParts newbp = inputBikeParts();
					C206_CaseStudy.addBikeParts(bpList, newbp);
					System.out.println("Bike Parts added");
				
				} else if (bikeptOp == 3) { 
					// Delete bike parts
					BikeParts newbp = inputBikeParts();
					C206_CaseStudy.deleteBikeParts(bpList,  newbp);
				} else {
					System.out.println("Invalid option!");
				}

			} else if (option == 4) {
				C206_CaseStudy.setHeader("APPOINTMENT");
				apptMenu(); //- 1.View, 2.Add, 3.Remove Menu
				int apptOp = Helper.readInt("Enter option to select function > ");
				
				if (apptOp == 1) {
					// View appointment
					C206_CaseStudy.viewAllAppt(apptList);
				
				} else if (apptOp == 2) { 
					// Add appointment
					Appointment newAppt = inputAppt();
					C206_CaseStudy.addAppt(apptList, newAppt);
					System.out.println("Appointment added");
				
				} else if (apptOp == 3) { 
					// Delete appointment
					Appointment newAppt = inputAppt();
					C206_CaseStudy.deleteAppt(bpList,  newAppt);
				} else {
					System.out.println("Invalid option!");
				}
	
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
					String username = Helper.readString("Enter username > ");
					C206_CaseStudy.deleteFeedback(fbList, username);
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
	public static String retrieveAllR (ArrayList<Registration> rList) {
		String output = "";

		for (int i = 0; i < rList.size(); i++) {

			output += String.format("%-10s %-30s\n", rList.get(i).getMobileNumber(),
					rList.get(i).getName());
		}
		return output;

	}
	
	public static void viewAllR(ArrayList<Registration> rList) {

		String output = retrieveAllR(rList);
		System.out.println(output);
	}
	
//	============================= ADD REGISTRATION =============================
	public static Registration inputRegistration() {
		String mobileNumber = Helper.readString("Enter Mobile Number > ");
		String name = Helper.readString("Enter Name > ");

		Registration newR = new Registration(mobileNumber, name);
		return newR;

	}

	public static void addRegistration(ArrayList<Registration> rList, Registration newR) {

		rList.add(newR);

	}
	
// ============================= DELETE REGISTRATION =============================

	public static void deleteRegistration(ArrayList<Registration> rList, Registration newR) {
		
		String mobileNumber = Helper.readString("Enter Mobile Number to delete > ");
		int a = 0;
		
		for (int i = 0; i < rList.size(); i++) {
			if (rList.get(i).getMobileNumber().equals(mobileNumber)) {
				rList.remove(i);
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


	}
	
//	OPTION 2 : BIKE 
//	============================= MENU BIKE =============================
	private static void bmenu() {
		Helper.line(80, "=");
		System.out.println("MENU");
		Helper.line(80, "-");
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
		Helper.line(80, "=");
		System.out.println("MENU");
		Helper.line(80, "-");
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
		Helper.line(80, "=");
		System.out.println("MENU");
		Helper.line(80, "-");
		System.out.println("1. View Appointment");
		System.out.println("2. Add Appointment");
		System.out.println("3. Delete Appointment");

	}
	
//	============================= VIEW APPOINTMENT =============================
	public static String retrieveAllAppt (ArrayList<Appointment> apptList) {
		String output = "";

		for (int i = 0; i < apptList.size(); i++) {

			output += String.format("%-10s %-10s %-30s %-10d\n", apptList.get(i).getName(),
					apptList.get(i).getDate(), apptList.get(i).getTime(), apptList.get(i).getMobileNumber());
		}
		return output;

	}
	
	public static void viewAllAppt(ArrayList<Appointment> apptList) {

		String output = viewAllAppt(apptList);
		System.out.println(output);
	}
	
//	============================= ADD APPOINTMENT =============================
	public static Appointment inputAppt() {
		String name = Helper.readString("Enter name > ");
		String date = Helper.readString("Enter date > ");
		String time = Helper.readString("Enter time > ");
		int mobileNumber = Helper.readInt("Enter mobile number > ");

		Appointment newApp = new Appointment(name, date, time, mobileNumber);
		return newApp;

	}

	public static void addAppt(ArrayList<Appointment> apptList, Appointment newApp) {

		apptList.add(newApp);

	}
	
// ============================= DELETE APPOINTMENT =============================

	public static void deleteAppt(ArrayList<Appointment> apptList, Appointment newApp) {
			
		String mobileNumber = Helper.readString("Enter mobile number for appointment to delete > ");
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
			System.out.println("Appointment Deleted!");
		} else {
			System.out.println("Appointment not found!");
		}
	}
	
	
//	OPTION 5 : FEEDBACK
//	============================= MENU FEEDBACK =============================
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

		public static boolean removeFeedback(ArrayList<Feedback> fbList, String userName){
			
			boolean isDeleted = false;
			
			for (int i = 0; i < fbList.size(); i++) {
				if (fbList.get(i).getUsername().equals(userName)) {
					fbList.remove(i);
					isDeleted = true;

				} else {
					isDeleted = false;
				}
			}
			return isDeleted;

		} 
		
		public static String deleteFeedback(ArrayList<Feedback> fbList, String searchFeedback) {
			C206_CaseStudy.retrieveAllFb(fbList);
			String output = "Invalid username entered";
			Boolean isDeleted = removeFeedback(fbList, searchFeedback);
			
			if (isDeleted == true) {
				output = "Appointmnet for " + searchFeedback + "deleted";
			}
			return output;
		}	
	
	

}
