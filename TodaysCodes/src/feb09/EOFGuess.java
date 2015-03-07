package feb09;

import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;


public class EOFGuess 
{
	public static void main(String[] args)
	{
		int random = 1+ (int)(Math.random() * 1000);
		int guess = 0;
		boolean winner = false;
		Scanner inFile = null;
		
		try
		{
			inFile = new Scanner(new FileReader("guess.dat"));
			
			String welcome = "This program is guessing game. I will read from a file of " +
					"200 guesses and you can sit back and see if you win.";
			String winMessage = "Winner, winner, Chicken Dinner on the guess of ";
			String looseMessage = "You have lost.";
			//String guessString = "";
			
			//System.out.println(welcome);
			JOptionPane.showMessageDialog(null, welcome);
			
			while(inFile.hasNext())
			{
				try
				{
					guess = inFile.nextInt();
					if(guess == random)
					{
						winner = true;
						break;
					}
				}
				
				catch (NoSuchElementException nsee)
				{
					JOptionPane.showMessageDialog(null, nsee.toString());
				}
				
				catch (IllegalStateException ise)
				{
					JOptionPane.showMessageDialog(null, ise.toString());
				}
			}
			
			if(winner)
				JOptionPane.showMessageDialog(null, winMessage + guess);
			else
				JOptionPane.showMessageDialog(null, looseMessage);
			JOptionPane.showMessageDialog(null, "The number to guess was " + random);
		}
		
		catch (FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, fnfe.toString());
		}
		
		finally
		{
			inFile.close();
		}
	}
}
