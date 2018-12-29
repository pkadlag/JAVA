//******************************************************************************************************
import java.util.Scanner;

public class IncomeTax
{
	public static void main(String arg[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter CTC:");
		double CTC =s.nextDouble();
		double incomeTax;
		if(CTC>0 && CTC<=180000)
		{
			incomeTax=0;
			System.out.println("Income Tax Amount for Slab A is"+incomeTax);
		}

		else if(CTC>=181001 && CTC<=300000)
		{
			incomeTax=0.1*CTC;
			System.out.println("Income Tax Amount for Slab B is"+incomeTax);
		}

		else if(CTC>=300001 && CTC<=500000)      
		{
			incomeTax=0.2*CTC;
			System.out.println("Income Tax Amount for Slab C is"+incomeTax);
		}

		else if(CTC>=500001 && CTC<=1000000)                 
		{
			incomeTax=0.3*CTC;
			System.out.println("Income Tax Amount for Slab D is"+incomeTax);
		}
	}
}
//***************************************************************************************************