import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestAddition 
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
		int answer = calculator.addNumbers(50,50);
		assertEquals(100,answer);
		
	}

	@Test
	public void testForTwoNegativeNumbers() 
	{
		int answer = calculator.addNumbers(50,50);
		assertEquals(100,answer);
		
	}

	@Test
	public void testForOneNegativeNumber() 
	{
		int answer = calculator.addNumbers(-50,-50);
		assertEquals(-100,answer);
		
	}

	@Test
	public void testForOneZeroAndOnePositiveNumber() 
	{
		int answer = calculator.addNumbers(0,50);
		assertEquals(50,answer);
		
	}

	@Test
	public void testForOneZeroAndOneNegativeNumber() 
	{
		int answer = calculator.addNumbers(0,-50);
		assertEquals(-50,answer);
		
	}

	@Test
	public void testForTwoZeros() 
	{
		int answer = calculator.addNumbers(0,0);
		assertEquals(0,answer);
		
	}

}
