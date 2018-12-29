
public class CheckMultidimensionalNumber {

	public boolean checkNumber(int number) 
	{
		
	int inputElement[][]={{1,2,3},{4,5,6},{7,8,9}};
	for(int row=0; row<inputElement[row].length;row++)
	{
		for(int column=0; column<inputElement[row].length;column++)
		{
			if(number==inputElement[row][column])
				return true;
		}
	}
		return false;
	}

}
