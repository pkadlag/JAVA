import static org.junit.Assert.*;

import java.util.Arrays;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestMissingArrayElement 
{

	private int[] expectedOutput;
	private int[] input;
	private MissingArrayElement missingArrayElement;


	
	public TestMissingArrayElement(int[] input,int[] expectedOutput)
	{
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Object data()
	{
	
		return Arrays.asList(new int[][][]{
				{{0,1,3,2,5},{4}},
				{{0,3,1},{2}},
				{{0,1,3,5,6,2,4},{7}},
				{{0,1,2,3,5,4,6,9,7},{8}},
				{{0,1,3,5,6,2},{4}},
				{{2,0,1},{3}},
		});
	}

	@Before
	public void setUp(){
		missingArrayElement = new MissingArrayElement();
	}
	
	@Test
	public void testFindMissingElement() 
	{
		assertEquals("Missing element found is wrong ",(int)expectedOutput[0], missingArrayElement.getMissingElement(input));
	}
	
}