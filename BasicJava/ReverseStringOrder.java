/************************************************************************************************************/
public class ReverseStringOrder {

	public static void main(String[] args) {
		String givenstring="Let's take LeetCode contest";
		
		for(String s:givenstring.split(" "))
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
/************************************************************************************************************/