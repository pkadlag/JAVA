import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class TestDivision 
{
	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void testForTwoPositiveNumbers() 
	{
		int answer = calculator.divideNumbers(50,10);
		assertEquals(5,answer);
		
	}

	@Test
	public void testForTwoNegativeNumbers() 
	{
		int answer = calculator.divideNumbers(-10,-5);
		assertEquals(2,answer);
		
	}

	@Test
	public void testForOneNegativeNumber() 
	{
		int answer = calculator.divideNumbers(-50,2);
		assertEquals(-25,answer);
		
	}

	@Test
	public void testForOneZeroAndOnePositiveNumber() 
	{
		int answer = calculator.divideNumbers(0,50);
		assertEquals(0,answer);
		
	}

	@Test
	public void testForOneZeroAndOneNegativeNumber() 
	{
		int answer = calculator.divideNumbers(0,-50);
		assertEquals(0,answer);
		
	}

	
}
