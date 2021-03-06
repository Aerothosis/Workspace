package main;

/*
Purpose: Organizes data in a file alphabetically or chronologically.
 */

import java.util.*;
import javax.swing.*;
import java.io.*;

public class DataOrganizer 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		Scanner inFile = null;
		PrintWriter outFile = null;
		
		String prev = "ZZZZZZZ";
		char prevC = 'Z';
		String current = "";
		char currC = 'Z';
		String newPrev = "";
		int count = 0;
		int counter = 0;
		int spot = 0;
		
		try
		{
			inFile = new Scanner(new FileReader("data.dat"));
			outFile = new PrintWriter("dataNew.dat");
			
			
			forever:
			while(true)
			{
				current = inFile.nextLine().toUpperCase();
				currC = current.charAt(0);
				prevC = prev.charAt(0);
				
				if(currC < prevC)
				{
					newPrev = current;
					current = prev;
					prev = newPrev;
				}
				else if(currC > prevC)
				{
					newPrev = current;
				}
				else if(currC == prevC)
				{
					counter = 0;
					while(currC == prevC)
					{
						counter++;
						currC = current.charAt(counter);
						prevC = prev.charAt(counter);
						if(currC != prevC)
							break;
					}
					
					currC = current.charAt(counter);
					prevC = prev.charAt(counter);
					
					if(currC < prevC)
					{
						newPrev = current;
						current = prev;
						prev = newPrev;
					}
					else if(currC > prevC)
					{
						newPrev = current;
					}
				}
				
				
				
			}
		}
		catch(FileNotFoundException fnfe)
		{
			
		}
	}
}
