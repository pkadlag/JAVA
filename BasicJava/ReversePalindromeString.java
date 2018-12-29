import java.util.Arrays;
import java.util.Collections;


public class ReversePalindromeString {
	

	public String[] checkStringForPalindromAndSortArrayInDescendingOrder(String[] input) 
	{
		String[] inputWords = new String[6];
		int wordsCountInArray = 0;
		for (String word : input) {
			if (isPalindrome(word)) {
				inputWords[wordsCountInArray] = word;
				wordsCountInArray++;
			}
		}

		Arrays.sort(inputWords,Collections.reverseOrder());
		
		return inputWords;
	
	
	}
	
	public boolean isPalindrome(String word) {
		
		StringBuffer s = new StringBuffer();
		for (int i = word.length() - 1; i >= 0; i--) {
			s.append(word.charAt(i));
		}
		
		return word.equals(s.toString());
	}

}
