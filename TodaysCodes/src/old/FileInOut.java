package old;

/*
Program: FileInOut.java
Author: Mike
Date: 1-19-2015
Purpose: This program writes a file using a PrintWriter object and reads the data
	back in using a Scanner object instantiated using the FileReader object.
	The data: January 19, 2015 Bi-Weekly 25 January 21, 2015 Prep3 10
*/


import java.io.*;
import java.util.*;


public class FileInOut
{
	public static void main(String[] args)
	{
		String output = "January 19, 2015  Bi-Weekly 25 January 21, 2015 Prep3" +
			" 10";
			
		PrintWriter outFile = null;
		Scanner inFile = null;
			
		try
		{
			outFile = new PrintWriter("data.dat");
			
			outFile.println(output);
			
			outFile.flush();
			
			
			//FileReader read = new FileReader("data.dat");
			
			inFile = new Scanner(new FileReader("data.dat"));
			
			String month = inFile.next();
			String date = inFile.next();
			String year = inFile.next();
			String name = inFile.next();
			int points = inFile.nextInt();
			
			
			System.out.println(month + " " + date + " " + year + " " +
				name + " " + points);
				
			month = inFile.next();
			date = inFile.next();
			year = inFile.next();
			name = inFile.next();
			points = inFile.nextInt();
			
			System.out.println(month + " " + date + " " + year + " " +
				name + " " + points);
			
		}
		
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Data file does not exist");
		}
		
		catch (InputMismatchException ime)
		{
			System.out.println("Token was not a number");
		}
		
		catch (NoSuchElementException nsee)
		{
			System.out.println("Problem with file");
		}
		
		finally
		{
			outFile.close();
			inFile.close();
		}
	}
}