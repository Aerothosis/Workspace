/*This application should accept the input of 10 numbers, sum them and
display the total to the screen */

import java.util.*;

public class DBNew5One
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		int num = 0;
		
		while(count < 10)
		{
			System.out.println("Enter a number.");
			num = console.nextInt();
			sum = sum + num;
			count++;
		}
			
		System.out.println("The sum is " + sum);
		
	}
}