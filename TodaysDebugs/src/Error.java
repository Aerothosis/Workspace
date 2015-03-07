

import java.util.*;

public class Error 
{
	public static void main(String[] args) 
	{
		int  a,  b, c;
		boolean  found;
		Scanner console = new Scanner(System.in);

		System.out.print("Enter  the  first  integer:  ");
		a  =  console.nextInt();
		
		System.out.println();
		
		System.out.print("Enter  the  second  integer:  ");
		b  =  console.nextInt();
		
		if  (a  >  a  *  b  &&  10  <  b)
			found  =  2  *  a  >  b;
			
		else
		{
			found  =  2  *  a  <  b;
		}
		
		if  (found)
		{
			a  =  3;
			c  =  15;
		}
			
		/*if  (b)
		{
			b  =  0;
			a  =  1;
		}*/
	}
}

