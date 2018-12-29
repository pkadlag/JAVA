public class SequentialSort 
{
	public static void main(String[] args) 
	{
		int inputElements[]={5,	12,	14,	6,	78,	19,	1,	23,	26,	35,	37,	7,	52,	86,	47};
		int length=inputElements.length-1;
		int number =length;
		int smallerNumber;

		for(int j=0;j<number;j++)
		{
			for(int i=0;i<length;i++)
			{
				if(inputElements[i]>inputElements[i+1])
				{
					smallerNumber=inputElements[i];
					inputElements[i]=inputElements[i+1];
					inputElements[i+1]=smallerNumber;
				}
			}
		}
		
		System.out.println("Output Elements of given array : ");
		
		for(int outputElements:inputElements)
		{
			System.out.print(outputElements+" ");
		}
	}

}