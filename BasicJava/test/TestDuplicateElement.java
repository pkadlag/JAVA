import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestDuplicateElement {

	ListOfNames listOfNames;
	@Before
	public void setUp() throws Exception {
		listOfNames=new ListOfNames();
	}

	@Test
	public void testToCheckNameIsPresentArray() {
		String names[]={"Dave", "Ann", "Aniket", "Sam",
						"Ted", "Gag", "Saj", "Agati", "Mary",
						"Sam", "Ayan", "Dev", "Kity", "Meery",
						"Smith", "Johnson", "Bill", "Williams",
						"Jones", "Brown", "Akshay", "Miller",
						"Wilson", "Moore", "Taylor", "Anderson",
						"Thomas", "Jackson", "Sam", "Ted"};
		
		int actual =listOfNames.countOfOccurrence(names,"Aniket");
		int expected=2;
		
		assertEquals(expected, actual);
		}

	@Test
	public void testToCheckNameIsNotPresentArray() {
		String names[]={"Dave", "Ann", "George", "Sam",
				"Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		
		int actual =listOfNames.countOfOccurrence(names,"Punam");
		int expected=0;
		
		assertEquals(expected, actual);
		}

	

}
