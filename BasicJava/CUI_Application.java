import java.util.Scanner;
public class CUI_Application 
{
	public static int loginAttempts=0;
	public static final String User_ID="PUNAM";
	public static final String Password="Punamk@4500";
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String userId;
		String password;
			
		while(loginAttempts!=3)
		{
			System.out.println("Enter User Id");
			userId=s.nextLine();
			System.out.println("Enter Password");
			password=s.nextLine();

			
			if(checkLoginDetails(userId,password))
			{
				System.out.println("Welcome....");
				break;
			} 
			
		}

			if(loginAttempts==3)
			{
				System.out.println("Contact ADMIN");
			}
		
	}
	
	private static boolean checkLoginDetails(String userId, String password1) 
	{
		if(userId.equals(User_ID) && password1.equals(Password))
		{
			return true;
		}
		else
		{
			loginAttempts++;
			return false;
		}
	}

}