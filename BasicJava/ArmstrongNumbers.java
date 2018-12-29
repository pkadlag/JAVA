//********************************************************************************************************************
public class ArmstrongNumbers               // Armstrong class
{ 
	public static void main (String [] args)    // main method 
	{ 
		//Program to find armstrong number from 100 to 999 
		int originalNumber, number, sum, reminder;

		for (originalNumber = 100 ; originalNumber <= 1000 ; originalNumber++) 
		{ 
			number = originalNumber; 
			sum = 0; 
			reminder = 0;

			while (number > 0) 
			{ 
				reminder = number % 10; 
				sum = sum + (reminder * reminder * reminder); 
				number = number / 10; 
			} 

			if (originalNumber == sum) 
			{ 
				System.out.println (originalNumber + " is Armstrong number"); 
			} 
		} 
	}
} 
//********************************************************************************************************************

