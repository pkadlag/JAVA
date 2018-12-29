import java.util.Scanner;
 
class LinearSearch
{
  public static void main(String args[])
  {
    int c, number, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    number = in.nextInt();
    array = new int[number];
 
    System.out.println("Enter " + number + " integers");
 
    for (c = 0; c < number; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
   
    for (c = 0; c < number; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == number)  /* Element to search isn't present */
      System.out.println(search + " isn't present in array.");
  }
}