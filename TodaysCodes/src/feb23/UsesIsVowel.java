package feb23;

/*
Write a program that prompts the user to input a sequence of characters
and outputs the number of vowels. (Use the method isVowel written in
Programming Exercise 1).
*/

import javax.swing.*;

public class UsesIsVowel 
{
	public static void main(String[] args) 
	{
		String sentenance = JOptionPane.showInputDialog("Enter a sentance.");
		
		/*To call a method in a different class, we have to name the class in
		which it exists. 		
		*/
		
		int vowelCount = 0;
		int count = 0;
		
		while(count < sentenance.length())
		{
			if (VowelDetection.isVowel(sentenance.charAt(count)))
			{
				vowelCount++;
			}
			
			count++;
		}
		
		JOptionPane.showMessageDialog(null, "You had " + vowelCount + " vowels.");
	}
}
