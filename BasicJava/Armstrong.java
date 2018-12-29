//********************************************************************************************************************

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int number;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the number:");
		number= s.nextInt();
		int originalNumber, reminder, result=0;
		originalNumber = number;

		while(originalNumber != 0)
		{
			reminder = originalNumber % 10;
			result +=Math.pow(reminder, 3);
			originalNumber /= 10;
		}

		if(result == number)
		System.out.println(number + " is an Armstrong number.");
		else
		System.out.println(number + " is not an Armstrong number.");
	}
}

//********************************************************************************************************************

