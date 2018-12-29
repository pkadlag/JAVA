import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMultiplication 
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
		int answer = calculator.multiplyNumbers(50,10);
		assertEquals(500,answer);
	}
	
	@Test
	public void testForTwoNegativeNumbers() 
	{
		int answer = calculator.multiplyNumbers(-60,-10);
		assertEquals(600,answer);
	}
	
	@Test
	public void testForOneNegativeNumber() 
	{
		int answer = calculator.multiplyNumbers(5,-10);
		assertEquals(-50,answer);
	}
	
	@Test
	public void testForOneZeroAndOnePositiveNumber() 
	{
		int answer = calculator.multiplyNumbers(0,10);
		assertEquals(0,answer);
	}
	
	@Test
	public void testForOneZeroAndOneNegativeNumber() 
	{
		int answer = calculator.multiplyNumbers(0,-10);
		assertEquals(0,answer);
	}
	
	@Test
	public void testForTwoZeros() 
	{
		int answer = calculator.multiplyNumbers(0,0);
		assertEquals(0,answer);
	}
	

}
