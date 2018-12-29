import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date
{
public static void main(String[] args)
{
	

Scanner s= new Scanner(System.in);
System.out.print("Enter Date of Birth(DD/MM/YYYY) :");
java.util.Date DateFormat = null;
try{
DateFormat = new SimpleDateFormat("ddMMyyyy").parse(s.nextLine().replaceAll("/" , ""));

}
catch (ParseException e)

{
e.printStackTrace();
}
System.out.println(DateFormat);
s.close();
}
}