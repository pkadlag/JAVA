
public class DifferenceAmongArrayElements 
{

	public int AbsoluteDifference(int[] numbers, int k) 
	{
		for(int i=0;i<numbers.length;i++)
		{
			
			for(int j=i;j<numbers.length;j++)
			{
				
				if(i!=j)
				{
					if(numbers[i]==numbers[j])
					{
						int diff=Math.abs(i-j);
						
						return diff;
					}


				}
				
			}
		}
		return -1;
		
	}

}
