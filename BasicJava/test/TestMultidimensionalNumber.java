import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMultidimensionalNumber {
    
	CheckMultidimensionalNumber checkMultidimensionalNumber;
	@Before
	public void setUp()
	{
		checkMultidimensionalNumber = new CheckMultidimensionalNumber();
	}
	@Test
	public void testForFindNumber() 
	{
		boolean answer = checkMultidimensionalNumber.checkNumber(6);
		assertEquals(true,answer);
	}
	}
