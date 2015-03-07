package mar04;

import java.util.*;

public class DebugEight1
// program accepts shipping codes
// and determines validity
// only one message should be display
{

	public static void main(String args[]) throws Exception
	{
		Scanner input = new Scanner(System.in);
		char letter;
		char[] okayCodes = {'A','C','T','H'};
		System.out.println("Enter shipping code");
		System.out.println("A - air");
		System.out.println("C - car");
		System.out.println("T - truck");
		System.out.println("H - hand deliver");
		
		boolean found = false;

		letter = input.next().toUpperCase().charAt(0);
        
		for(int i = 0; i < okayCodes.length; ++i)
		{
			if(letter == okayCodes[i])
			{
				found = true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("Good code");
		}
		else
		{
			System.out.println("Code not found");
		}
	}
}