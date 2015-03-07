package feb09;

/*
Program: GenerateGuesses.java
Author: Us
Date: 2-9-2015
Purpose: This program will create a data file in which to store 200 random numbers
between 1 and 1000. This data file could be used in a number of games where a bank
of random numbers would facilitate play.
 */

import java.io.*;

public class GenerateGuesses 
{
	public static void main(String[] args)
	{
		int random = 0;
		String output = "";
		
		try
		{
			FileWriter outFile = new FileWriter("guess.dat");
			
			for(int count = 1; count < 201; count++)
			{
				random = 1+ (int)(Math.random() * 1000);
				output += random + " ";
			}

			outFile.append(output);
			outFile.flush();
		}
		
		catch (IOException ioe)
		{
			
		}
	}

}
