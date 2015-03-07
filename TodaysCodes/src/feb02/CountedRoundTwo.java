package feb02;
/*
Program: CountedGuess.java
Author: Mike
Date: 2-2-2015
Purpose: . Create a guessing game that asks the user to guess a 
randomly generated random number between 1 and 10. Allow the user 
5 attempts before declaring they lost the game. If they guess the 
correct number in 5 or less guesses, congratulate them and end 
the game.
*/

import javax.swing.*;

public class CountedRoundTwo
{
	public static void main(String[] args) 
	{
		int random;
		int guess;
		
		String welcome = "This program is a guessing game. You will be asked to " + 
				"guess a random number between 1 and 10. You will be given 5 chances.";
		
		String winMessage = "Winner, winner, chicken dinner!";
		String loseMessage = "Sorry, not correct.";
		
		String guessString = "";
		
		random = 1+ (int)(Math.random() * 10);
		
		JOptionPane.showMessageDialog(null, welcome);
		
		for(int control = 1; control  <= 5; control++)
		{
			guessString = JOptionPane.showInputDialog("Guess a number between 1 and 10.");
			
			try
			{
				guess = Integer.parseInt(guessString);
				
				if (guess == random)
				{
					JOptionPane.showMessageDialog(null, winMessage, "Winner", 
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, loseMessage, "Loser",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "That was an invalid input.");
			}
		}
	}
}
