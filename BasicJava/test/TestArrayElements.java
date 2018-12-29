import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestArrayElements {

		DifferenceAmongArrayElements differenceAmongArrayElements;
		
		@Before
		public void setUp() throws Exception {
			differenceAmongArrayElements = new DifferenceAmongArrayElements();
		}

		@Test
		public void testForCheckDifferenceBetweenArrayElementsLessOrEqualToK() {
			int[] numbers={20,23,19,18,22,20};
			int k=3;
			
			int actualOutput=differenceAmongArrayElements.AbsoluteDifference(numbers,k);
			assertEquals(5, actualOutput);
		}
	}


