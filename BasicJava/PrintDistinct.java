import java.util.HashMap;

public class PrintDistinct 
{
	public static void main(String[] args) 
	{
		int inputElements[]={10,20,15,30,25,10,10,15,20,40,45,22,22};
		HashMap<Integer,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<inputElements.length;i++)
		{
			if(hmap.containsKey(inputElements[i]))
			{
				hmap.put(inputElements[i], hmap.get(inputElements[i]));
			}
			else
			{
				hmap.put(inputElements[i], 1);
			}	
		}
		System.out.println("After Removing all duplicates elements from an array:");
		System.out.println(hmap.keySet());
		
	}

	
}