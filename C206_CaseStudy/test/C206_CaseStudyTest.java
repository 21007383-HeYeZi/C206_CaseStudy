import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Feedback fb1;
	private Feedback fb2;
	private Feedback fb3;
	
	private ArrayList<Feedback> fbList;
	
	private Bike b1;
	private Bike b2;
	private Bike b3;
	
	private ArrayList<Bike> bList;
	
	private BikeParts bp1;
	private BikeParts bp2;
	private BikeParts bp3;
	
	private ArrayList<BikeParts> bpList;
	
	private Registration r1;
	private Registration r2;
	private Registration r3;
	
	private ArrayList<Registration> rList;
	
	@Before
	public void setUp() throws Exception {
		fb1 = new Feedback("@lice" , "Good customer service");
		fb2 = new Feedback("$ally", "Satisfied with purchase");
		fb3 = new Feedback("Bensoon", "Laggy website");
		
		fbList = new ArrayList<Feedback>();
		
		b1 = new Bike("A1", "Fuji", "Mountain Bike");
		b2 = new Bike("A2", "YETI", "Road Bike");
		b3 = new Bike("A3", "Gazelle", "Hybrid Bike");
		
		bList = new ArrayList<Bike>();
		
		bp1 = new BikeParts("B1", "Mavic", "Wheel");
		bp2 = new BikeParts("B2", "Giant", "Frame");
		bp3 = new BikeParts("B3", "Zipp", "Handlebar");
		
		bpList = new ArrayList<BikeParts>();
		
		r1 = new Registration("92837842", "James");
		r2 = new Registration("83726471", "John");
		r3 = new Registration("82737482", "Jonathan");
		
		rList = new ArrayList<Registration>();
	}

// ============================= TEST FEEDBACK =============================
	
	@Test
	public void testAddFeedback() {
		// Feedback list is not null, so that can add a new feedback
		assertNotNull("Test if there is valid Feedback arraylist to add to", fbList);
		
		//Given an empty list, after adding 1 feedback, the size of the list is 1
		C206_CaseStudy.addFeedback(fbList, fb1);		
		assertEquals("Test if that Feedback arraylist size is 1?", 1, fbList.size());
		
		
		//The feedback just added is as same as the first feedback of the list
		assertSame("Test that Feedback is added same as 1st item of the list?", fb1, fbList.get(0));
		
		//Add another feedback. test The size of the list is 2?
		C206_CaseStudy.addFeedback(fbList, fb2);
		C206_CaseStudy.addFeedback(fbList, fb3);
		assertEquals("Test that Feedback arraylist size is 3?", 3, fbList.size());
		assertSame("Test that Feedback is added same as 3rd item of the list?", fb3, fbList.get(2));
	}
	
	@Test
	public void testRetrieveAllFb() {
		// Test if Feedback list is not null but empty, so that can add a new feedback
		assertNotNull("Test if there is valid Feedback arraylist to add to", fbList);
		
		//test if the list of feedback retrieved from the C206_CaseStudy is empty
		String allFeedback = C206_CaseStudy.retrieveAllFb(fbList);
		String testOutput = "";
		assertEquals("Check that viewAllFeedback", testOutput, allFeedback);
				
		//Given an empty list, after adding 2 feedbacks, test if the size of the list is 2
		C206_CaseStudy.addFeedback(fbList, fb1);
		C206_CaseStudy.addFeedback(fbList, fb2);
		assertEquals("Test if that Feedback arraylist size is 2?", 2, fbList.size());
		
	}
	
	@Test
	public void testDeleteFeedback() {
		// Test if Feedback list is not null but empty, so that can add a new feedback
		assertNotNull("Test if there is valid Feedback arraylist to add to", fbList);
		
		// One Feedback added
		C206_CaseStudy.addFeedback(fbList, fb1);
		assertEquals("Check that Feedback arrayList size is 1?", 1, fbList.size());
		
		// One Feedback removed
		C206_CaseStudy.deleteFeedback(fbList, fb1);
		assertEquals("Check that Feedback arrayList size is 0?", 0, fbList.size());
		
		boolean exists = false;
		for (Feedback fb : fbList) {
			if (fb.equals(fb1)) {
				exists = true;
			}
		}
		
		assertFalse(exists);

	}
	
// ============================= TEST BIKE =============================	
	
	@Test
	public void testAddBike() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Bike arraylist to add to", bList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addBike(bList, b1);		
		assertEquals("Test if that Bike arraylist size is 1?", 1, bList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Bike is added same as 1st item of the list?", b1, bList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addBike(bList, b2);
		C206_CaseStudy.addBike(bList, b3);
		assertEquals("Test that Bike arraylist size is 3?", 3, bList.size());
		assertSame("Test that Bike is added same as 3rd item of the list?", b3, bList.get(2));
	}
	
	@Test
	public void testRetrieveAllb() {
		// Test if Bike list is not null but empty, so that can add a new bike
		assertNotNull("Test if there is valid Bike arraylist to add to", bList);
		
		//test if the list of bikes retrieved from the C206_CaseStudy is empty
		String allBikes = C206_CaseStudy.retrieveAllb(bList);
		String testOutput = "";
		assertEquals("Check that viewAllBikes", testOutput, allBikes);
				
		//Given an empty list, after adding 2 bikes, test if the size of the list is 2
		C206_CaseStudy.addBike(bList, b1);
		C206_CaseStudy.addBike(bList, b2);
		assertEquals("Test if that Bike arraylist size is 2?", 2, bList.size());
		
	}
	
	@Test
	public void testDeleteBike() {
		// Test if Bike list is not null but empty, so that can add a new bike
		assertNotNull("Test if there is valid Bike arraylist to add to", bList);
		
		// One Bike added
		C206_CaseStudy.addBike(bList, b1);
		assertEquals("Check that Bike arrayList size is 1?", 1, bList.size());
		
		// One Bike removed
		C206_CaseStudy.deleteBike(bList, b1);
		assertEquals("Check that Bike arrayList size is 0?", 0, bList.size());
		
		boolean exists = false;
		for (Bike b : bList) {
			if (b.equals(b1)) {
				exists = true;
			}
		}
		
		assertFalse(exists);

	}
	
// ============================= TEST BIKE PARTS =============================
	
	@Test
	public void testAddBikeParts() {
		// BikeParts list is not null, so that can add a new bike parts
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bpList);
		
		//Given an empty list, after adding 1 bike part, the size of the list is 1
		C206_CaseStudy.addBikeParts(bpList, bp1);		
		assertEquals("Test if that BikeParts arraylist size is 1?", 1, bpList.size());
		
		
		//The bike part just added is as same as the first bike part of the list
		assertSame("Test that Bike part is added same as 1st item of the list?", bp1, bpList.get(0));
		
		//Add another bike part. test The size of the list is 2?
		C206_CaseStudy.addBikeParts(bpList, bp2);
		C206_CaseStudy.addBikeParts(bpList, bp3);
		assertEquals("Test that BikeParts arraylist size is 3?", 3, bpList.size());
		assertSame("Test that Bike part is added same as 3rd item of the list?", bp3, bpList.get(2));
	}
	
	@Test
	public void testRetrieveAllbp() {
		// Test if BikeParts list is not null but empty, so that can add a new bike part
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bpList);
		
		//test if the list of bike parts retrieved from the C206_CaseStudy is empty
		String allBikeParts = C206_CaseStudy.retrieveAllbp(bpList);
		String testOutput = "";
		assertEquals("Check that viewAllBikeParts", testOutput, allBikeParts);
				
		//Given an empty list, after adding 2 bike parts, test if the size of the list is 2
		C206_CaseStudy.addBikeParts(bpList, bp1);
		C206_CaseStudy.addBikeParts(bpList, bp2);
		assertEquals("Test if that BikeParts arraylist size is 2?", 2, bpList.size());
		
	}
	
	@Test
	public void testDeleteBikeParts() {
		// Test if BikeParts list is not null but empty, so that can add a new bike part
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bpList);
		
		// One bike part added
		C206_CaseStudy.addBikeParts(bpList, bp1);
		assertEquals("Check that BikeParts arrayList size is 1?", 1, bpList.size());
		
		// One bike part removed
		C206_CaseStudy.deleteBikeParts(bpList, bp1);
		assertEquals("Check that BikePart arrayList size is 1?", 0, bpList.size());
		
		boolean exists = false;
		for (BikeParts bp : bpList) {
			if (bp.equals(bp1)) {
				exists = true;
			}
		}
		
		assertFalse(exists);

	}
	
	
// ============================= TEST REGISTRATION =============================
	
	@Test
	public void testAddRegistration() {
		// Test that Registration List is not null, so that Registration can be added
		assertNotNull("Test if there is valid Registration arraylist to add to", rList);
				
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addRegistration(rList, r1);		
		assertEquals("Test if that Registration arraylist size is 1", 1, rList.size());
				
		//The item just added is as same as the first item of the list
		assertSame("Test that registration added is same as 1st item of the list", r1, rList.get(0));
				
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addRegistration(rList, r2);
		C206_CaseStudy.addRegistration(rList, r3);
		assertEquals("Test that Registration arraylist size is 3", 3, rList.size());
		assertSame("Test that Registration added is same as 3rd item of the list", r3, rList.get(2));
	}
	
	@Test
	public void testRetrieveAllr() {
		// Test that Registration list is not null but empty, so that Registration can be added
		assertNotNull("Test if there is valid Registration arraylist to add to", rList);
		
		//test if the list of bike parts retrieved from the C206_CaseStudy is empty
		String allRegistration = C206_CaseStudy.retrieveAllR(rList);
		String testOutput = "";
		assertEquals("Check that viewAllRegistration", testOutput, allRegistration);
				
		//Given an empty list, after adding 2 Registrations, test if the size of the list is 2
		C206_CaseStudy.addRegistration(rList, r1);
		C206_CaseStudy.addRegistration(rList, r2);
		assertEquals("Test that the Registration arraylist size is 2", 2, rList.size());
	}
	
	@Test 
	public void testDeleteRegistration() {
		// Test that Registration list is not null but empty, so that Registration can be added
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bpList);
			
		// One registration added
		C206_CaseStudy.addRegistration(rList, r1);
		assertEquals("Check that Registration arrayList size is 1", 1, rList.size());
			
		// One registration removed
		C206_CaseStudy.deleteRegistration(rList, r1);
		assertEquals("Check that Registration arrayList size is 0", 0, rList.size());
			
		boolean exists = false;
		for (Registration r : rList) {
			if (r.equals(r1)) {
				exists = true;
			}
		}
		assertFalse(exists);
	}
			
			

// ============================= TEST APPOINTMENT =============================
	
	@After
	public void tearDown() throws Exception {
		fb1 = null;
		fb2 = null;
		fb3 = null;
		fbList = null;
		
		b1 = null;
		b2 = null;
		b3 = null;
		bList = null;
		
		bp1 = null;
		bp2 = null;
		bp3 = null;
		bpList = null;
		
		r1 = null;
		r2 = null;
		r3 = null;
		rList = null;
	}

}
