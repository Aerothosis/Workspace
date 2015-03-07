
import java.util.*;



public class DebugSix1
// Start with a penny
// Double it every day
// How much do you have in a month?
{
   public static void main(String[] args)
   {
     double money = 0.01;
     int day = 1;
     int counter = 1;
     Scanner console = new Scanner(System.in);
     
     System.out.println("Please enter total days.");
     day = console.nextInt();
     
     if (day >= 1)
     {
    	 while(counter <= day)
	     {
	      System.out.println("After day " + counter +
	         " you have " + money);
	      if (counter < day)
	    	  money = 2 * money;
	      counter++;
	     }
    	 System.out.println("After " + day + " days, you have " + money);
     }
     else
    	 System.out.println("Please enter an amount of days greater than 0.");
   }
}