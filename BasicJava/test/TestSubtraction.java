import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSubtraction 
{

	private Calculator calculator;
	
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void testForTwoPositiveNumbers1() 
	{
		int answer = calculator.subtractNumbers(50,10);
		assertEquals(40,answer);
	}
	
	@Test
	public void testForTwoNegativeNumbers() 
	{
		int answer = calculator.subtractNumbers(-60,-10);
		assertEquals(-50,answer);
	}
	
	@Test
	public void testForOneNegativeNumber() 
	{
		int answer = calculator.subtractNumbers(50,-10);
		assertEquals(60,answer);
	}
	
	@Test
	public void testForOneZeroAndOnePositiveNumber() 
	{
		int answer = calculator.subtractNumbers(0,10);
		assertEquals(-10,answer);
	}
	
	@Test
	public void testForOneZeroAndOneNegativeNumber() 
	{
		int answer = calculator.subtractNumbers(0,-10);
		assertEquals(10,answer);
	}
	
	@Test
	public void testForTwoZeros() 
	{
		int answer = calculator.subtractNumbers(0,0);
		assertEquals(0,answer);
	}
	
}
