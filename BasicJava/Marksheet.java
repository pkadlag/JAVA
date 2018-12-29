//*********************************************************************************************
import java.util.Scanner;

public class Marksheet
{
	public static void main(String arg[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter marks of first subject:");
		int subject1=s.nextInt();
		System.out.println("Enter marks of Second subject:");
		int subject2=s.nextInt();
		System.out.println("Enter marks of Third subject:");
		int subject3=s.nextInt();

		if(subject1>60 && subject2>60 && subject3>60)
		System.out.println("You are Passed");

		else if(subject1>60 && subject2>60 && subject3<60 ||
			subject1>60 && subject2<60 && subject3>60 || 
			subject1<60 && subject2>60 && subject3>60)
		System.out.println("You are Promoted");

		else if(subject1>60 && subject2<60 && subject3<60 || 
        		subject1<60 && subject2>60 && subject3<60 || 
        		subject1<60 && subject2<60 && subject3>60 ||
        		subject1<60 && subject2<60 && subject3<60)
		System.out.println("Unfortunately....You are failed");
	}
}
//*********************************************************************************************