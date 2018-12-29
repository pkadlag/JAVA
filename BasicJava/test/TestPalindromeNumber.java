import static org.junit.Assert.*;

import org.junit.Test;


public class TestPalindromeNumber {

	@Test
	public void PalindromeTestForOddLengthNumber()
	{
		PalindromeNumber palindrome = new PalindromeNumber();
		boolean answer = (boolean) palindrome.isPalindrome(121);
		assertEquals(true,answer);
	}
	
	@Test
	public void PalindromeTestForEvenLengthNumber()
	{
		PalindromeNumber palindrome = new PalindromeNumber();
		boolean answer = (boolean) palindrome.isPalindrome(2552);
		assertEquals(true,answer);
	}

	@Test
	public void PalindromeTestForNonPalindromeNumber()
	{
		PalindromeNumber palindrome = new PalindromeNumber();
		boolean answer = (boolean) palindrome.isPalindrome(-121);
		assertEquals(false,answer);
	}
	
	@Test
	public void PalindromeTestForSingleNumber()
	{
		PalindromeNumber palindrome = new PalindromeNumber();
		boolean answer = (boolean) palindrome.isPalindrome(5);
		assertEquals(true,answer);
	}
	

}
