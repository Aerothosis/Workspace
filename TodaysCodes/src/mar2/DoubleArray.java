package mar2;

/*
Program: DoubleArray.java
Author: Mike
Date: 3-2-2015
Purpose: Write  a  Java  program  that  declares  an  array  alpha  of  50  elements  of
type double. Initialize the array so that the first 25 elements are equal to the square 
of the index variable, and the last 25 elements are equal to three times the index 
variable. Output the array so that 10 elements per line are printed.
*/



public class DoubleArray 
{
	public static void main(String[] args) 
	{
		double[] reals = new double[50];
		int lineCount = 1;
		
		for(int index = 0; index < reals.length; index++)
		{
			if(index < 25)
			{
				reals[index] = Math.pow(index, 2);
			}
			else
			{
				reals[index] = index * 3;
			}
		}
		
		for(int count = 0; count < reals.length; count++)
		{
			
			System.out.print(reals[count] + " ");
			
			if(lineCount % 10 == 0)
			{
				System.out.println();
			}
			lineCount++;
		}
	}
}
