package feb02;
/*
Program: CountedGuess.java
Author: Us
Date: 2/2/2015
Purpose: Create a guessing game that asks the user to guess a randomly generated random number 
between 1 and 1000. Allow the user to guess as many times as they like until they guess 
correctly or decide to end the game by entering the word , quit.
*/

import javax.swing.*;

public class BooleanGuess
{
	public static void main(String[] args)
	{
		int random;
		int guess;
		
		String welcome = "This program is guessing game. You will be asked to " +  	
		"guess a random number between 1 and 1000. You can guess as many times " +
		"as you like, but when you want to quit, enter the word quit.";
		
		String winMessage = "Winner, winner, Chicken Dinner";
		
		String guessString = "";
		//final String SENTINEL = "quit"; 
		boolean flag = false;
		
		random = 1 + (int)(Math.random() * 1000);
		
		JOptionPane.showMessageDialog(null, welcome);
		
		
		while(!flag)
		{
		
			guessString = JOptionPane.showInputDialog("Guess a number between 1 and 1000 " +
					"or type quit or cancel to end the program.");
			
			if (guessString == null)
			{
				JOptionPane.showMessageDialog(null, "Good bye");
				System.exit(0);
			}
			
			if (guessString.equalsIgnoreCase("quit"))
			{
				JOptionPane.showMessageDialog(null, "Good bye");
				flag = true;
				continue;
			}
			
			try
			{
				guess = Integer.parseInt(guessString);
				
				if(guess == random)
				{
					JOptionPane.showMessageDialog(null, winMessage , "Winner", 
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				else
				{
					//JOptionPane.showMessageDialog(null, loseMessage);
					
					if (guess >= (random - 25) && guess <= (random + 25))
						JOptionPane.showMessageDialog(null, "You are VERY HOT!! +- 25");
					else if (guess >= (random - 100) && guess <= (random + 100))
						JOptionPane.showMessageDialog(null, "You are HOT! +- 100");
					else if (guess >= (random - 150) && guess <= (random + 150))
						JOptionPane.showMessageDialog(null, "You are warm. +- 150");
					else
						JOptionPane.showMessageDialog(null, "You are cold.");
				}
			}
			
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "That was an invalid input.");
			}
			
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null, "That was an invalid option.");
			}
		}
	}
}