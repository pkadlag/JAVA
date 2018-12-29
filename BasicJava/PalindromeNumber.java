import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check : ");
		int givenNumber=s.nextInt();
		System.out.println(isPalindrome(givenNumber));
	}

	private static boolean isPalindrome(int givenNumber) 
	{

		int result=0;
		
		int number=givenNumber;
		int reminder=0;
		while(number>0)
		{
			reminder=number%10;
			number=number/10;
			result=result*10+reminder;
			
		}
		
		if(result==givenNumber)
		{
			return true;
		}
		else
		{
			return false;
		}


	}

}