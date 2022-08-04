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
		bpList = new ArrayList<BikeParts>();
	}

	
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
		assertEquals("Check that Feedback arrayList size is 1?", 0, fbList.size());
		
		boolean exists = false;
		for (Feedback fb : fbList) {
			if (fb.equals(fb1)) {
				exists = true;
			}
		}
		
		assertFalse(exists);

	}
	
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
	}

}
