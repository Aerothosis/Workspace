package old;

/*
Program: CountedGuess.java
Author: Us
Date: 2/2/2015

Create a guessing game that asks the user to guess a randomly generated random number between 1 and 1000. 
Allow the user to guess as many times as they like until they guess correctly or decide to end the game by entering the word , quit.
*/
import javax.swing.*;

public class SentinelGuess
{
	public static void main(String[] args)
	{
		int random;
		int guess;
		
		String welcome = "This program is guessing game. You will be asked to " +  	"guess a random number between 1 and 10. You will be given 5 chances.";
		
		
		String winMessage = "Winner, winner, Chicken Dinner";
		String loseMessage = "Sorry, not correct!";
		
		String guessString = "";
		
		random = 1 + (int)(Math.random() * 10);
		
		JOptionPane.showMessageDialog(null, welcome);
		
		int control = 1;
		
		while(control <= 5)
		{
		
			guessString = JOptionPane.showInputDialog("Guess a number between 1 and " + "10");
			
			try
			{
				guess = Integer.parseInt(guessString);
				
				if(guess == random)
				{
					JOptionPane.showMessageDialog(null, winMessage , "Winner", JOptionPane.INFORMATION_MESSAGE);

					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null, loseMessage);
				}
			}
			
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "That was an invalid input.");
			}
			control++;
		}
	}
}