package mar2;

/*
Program: FindSmallest.java
Author: Mike
Date: 3-2-2015
Purpose:Write a Java method,  smallestIndex, that takes as its parameters an int
array and its size, and returns the index of the (first occurrence of the)
smallest element in the array. Also, write a program to test your method.
*/

public class FindSmallest 
{
	public static void main(String[] args) 
	{
		int[] local = new int[1000];
		
		for(int counter = 0; counter < local.length; counter++)
			local[counter]=(int)(Math.random() * 100);
		
		System.out.println("Index of smallest is: " + findSmallest(local, local.length));
	}

	public static int findSmallest(int[] array, int length)
	{
		int index = 0;
		
		int indexOfSmallest = 0;
		int smallest = array[0];
		
		for(;index < array.length; index++)
		{
			if(array[index] < smallest)
			{
				indexOfSmallest = index;
				smallest = array[index];
			}
		}
		return indexOfSmallest;
	}
}
