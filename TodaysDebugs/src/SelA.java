
import java.util.*;

public class SelA
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String usersChoice;
		double bill = 0.0;
		
		System.out.println("Do you want a burger?");
		System.out.println("Enter y or n.");
		usersChoice= input.next();
		
		if(usersChoice.equalsIgnoreCase("y"))
			bill += 2.59;
		
		System.out.println("Fries with that?");
        usersChoice = input.next();
        
        if (usersChoice.equalsIgnoreCase("y"))
        	bill += .89;
        
        System.out.println("Bill is " + bill);
        
        input.close();
	}

}
