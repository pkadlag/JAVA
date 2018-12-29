import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringForPalindromeTest 
{

	ReversePalindromeString reversePalindromeString;
	@Before
	public void setUp()
	{
		reversePalindromeString = new ReversePalindromeString();
	}
	
	@Test
	public void checkStringForPalindromeTest() 
	{
		String[]input={
				       		"WOW",
				       		"PUNAM",
				       		"KADLAG",
				       		"RACECAR",
				       		"ABBA",
				       		"PUNE",
				       		"ANA",
				       		"SKY",
				       		"NAAN",
				       		"NAYAN"
			 		   };
		String[]actual = reversePalindromeString.checkStringForPalindromAndSortArrayInDescendingOrder(input);
		String expected[]={"WOW", "RACECAR", "NAYAN" , "NAAN" , "ANA" , "ABBA"};
		assertArrayEquals(expected, actual);
	}
     
}
