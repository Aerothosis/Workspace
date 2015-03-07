package mar4;

/*
Write a program that reads from a data file the  last names  of five 
candidates in a local election and the number of votes each candidate 
received in a recent election (Use and array of strings to store the 
names. Store the votes received by each candidate in an array of whole 
numbers.)  Allow the user to search by candidate name and report the 
votes received along with the name and the percentage of the total 
votes received. The program should search through the array of votes 
and declare the winner of the election by name and number of votes. 
Modularize the major functionalities. 
 */

import java.io.*;
import java.util.*;


public class Election 
{
	public static void main(String[] args) 
	{
		String[] names = new String[5];
		int[] votes = new int[5];
		
		Scanner inFile = null;
		try
		{
			inFile = new Scanner(new FileReader("electionData.dat"));
			
			int count = 0;
			
			while(inFile.hasNext())
			{
				names[count] = inFile.next();
				votes[count] = inFile.nextInt();
				
				count++;
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found.");
		}
		
		displayArrays(names, votes);
	}
	
	public static void displayArrays(String[] noms, int[] tally)
	{
		for(int ct = 0; ct < noms.length; ct++)
			System.out.println(noms[ct] + " " + tally[ct]);
	}
}
