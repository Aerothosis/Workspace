package feb25;

/* Write the definition  of  method  one  so  that  it  returns the sum  of
x and  y if  x is greater than  y; otherwise, it should return  x minus  2
times y.
b.  Write the definition of method two as follows:
	i.  Read a number and store it in z.
	ii.  Update the value of z by adding the value of a to its previous value.
	iii.  Assign the variable first the value returned by method one with
		the parameters 6 and 8.
	iv.  Update the value of  first by adding the value of  x to its previous
		value.
	v.  If the value of z is more than twice the value of first, return z;
		otherwise, return 2 times first minus z.
c.  Write a Java program that tests parts a and b. (Declare additional vari-
ables in the method main, if necessary.)
*/

import java.util.*;

public  class  Ch7_PrExercise4
{
	static Scanner console = new Scanner(System.in);
	
	public  static  void  main(String[]  args)
	{
		int	 num;
		double  dec;
		
		endProgram:
		for(;;)
		{
			for(;;)
			{
				try
				{
					System.out.println("Please enter a whole number or -999 to quit");
					num = console.nextInt();
					if(num == -999)
					{
						break endProgram;
					}
					else
					{
						break;
					}
				}
				catch(InputMismatchException ime)
				{
					System.out.println("That was not a whole number, try again.");
				}
			}
			
			for(;;)
			{
				try
				{
					System.out.println("Please enter another number or -999 to quit");
					dec = console.nextDouble();
					if(dec == -999)
					{
						break endProgram;
					}
					else
					{
						break;
					}
				}
				catch(InputMismatchException ime)
				{
					System.out.println("That was not a double number, try again.");
				}
			}
			
			System.out.println("Results is: " + two(num, dec));
		}
		
	}
	
	public  static  int  one(int  x,  int  y)
	{
		if(x > y)
		{
			return x + y;
		}
		else
		{
			return x - (2 * y);
		}
	}
	
	public  static  double  two(int  x,  double  a)
	{
		int  first = 0;
		double  z = 0;
		try
		{
			System.out.println("Please enter a number.");
			z = console.nextDouble();
			z += a;
			first = one(6, 8);
			first += x;
		}
		catch(InputMismatchException ime)
		{
			System.out.println("That was not a good number.");
			System.exit(0);
		}
		
		if(z > (2*first))
		{
			return z;
		}
		else
		{
			return (2 * first) - z;
		}
	}
}






